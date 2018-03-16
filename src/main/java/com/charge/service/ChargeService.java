package com.charge.service;

import com.domain.HisChargeInterface;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@Mapper
public interface ChargeService {
    List<HisChargeInterface> getChargeList();

    void handleCharggeInfo();
}
