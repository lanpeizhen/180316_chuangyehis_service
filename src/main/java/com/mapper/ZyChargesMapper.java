package com.mapper;

import com.domain.HisChargeInterface;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/14.
 */
@Repository
public interface ZyChargesMapper {
    List<HisChargeInterface>  getChargeList();

    Integer editUpFlag(Integer id);
}
