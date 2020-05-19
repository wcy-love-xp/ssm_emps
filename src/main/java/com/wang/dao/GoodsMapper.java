package com.wang.dao;

import com.wang.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> selectAll();

    int del(Goods goods);
}

