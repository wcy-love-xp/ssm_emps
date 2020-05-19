package com.wang.service;

import com.wang.dao.GoodsMapper;
import com.wang.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }

    public int del(Goods goods) {
        return goodsMapper.del(goods);
    }
}
