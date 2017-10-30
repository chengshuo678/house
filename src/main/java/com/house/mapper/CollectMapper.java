package com.house.mapper;

import com.house.po.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer collectid);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer collectid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}