package com.controller;

import com.charge.service.ChargeService;
import com.domain.HisChargeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@RestController
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @ResponseBody
    @RequestMapping(value="/charge")
    public String getChargeList() {
        List<HisChargeInterface> chargeList = chargeService.getChargeList();
        System.out.println(chargeList.size());
        return "charge";
    }

    @ResponseBody
    @RequestMapping(value="/handleCharge")
    public String handleCharge() {
        chargeService.handleCharggeInfo();
//        System.out.println(chargeList.size());
        return "charge";
    }

}
