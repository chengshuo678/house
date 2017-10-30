package com.house.mapper;

import com.house.po.Pub;

public interface PubMapper {
    int deleteByPrimaryKey(Integer pubid);

    int insert(Pub record);

    Pub selectByPrimaryKey(Integer pubid);

    int updateByPrimaryKey(Pub record);
}