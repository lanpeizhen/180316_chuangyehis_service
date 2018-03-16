package com.charge.service.impl;

import com.charge.service.ChargeService;
import com.config.CxfClientUtil;
import com.domain.HisChargeInterface;
import com.domain.RequestBean;
import com.domain.ReturnCode;
import com.mapper.ZyChargesMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@Service
@Transactional
public class ChargeServiceImpl implements ChargeService {
    private static final Logger log = LoggerFactory.getLogger(ChargeService.class);
    @Value("${service.url}")
    private String serviceUrl;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Autowired
    private ZyChargesMapper zyChargesMapper;

    @Override
    public List<HisChargeInterface> getChargeList() {
        return zyChargesMapper.getChargeList();
    }

    @Override
    public void handleCharggeInfo() {
        List<HisChargeInterface> chargeList = zyChargesMapper.getChargeList();

        if (chargeList != null && chargeList.size() > 0) {
            for (HisChargeInterface charge : chargeList
                    ) {
                RequestBean bean = charge;
                CxfClientUtil cxfClient = new CxfClientUtil();
                String resp = cxfClient.cl1(bean, serviceUrl);
                log.info("webservice's resp is : " + resp);
                ReturnCode returnCode = cxfClient.converyToJavaBean(resp, ReturnCode.class);
                if (returnCode != null && returnCode.getResultCode() == 1) {
                    Integer rs = zyChargesMapper.editUpFlag(charge.getId());
                }
            }
        }
    }


}

