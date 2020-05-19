package com.wang.controller;

import com.wang.pojo.Goods;
import com.wang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/selectAll")
    public ModelAndView selectAll() {
        List<Goods> list = goodsService.selectAll();
        ModelAndView mv = new ModelAndView("goods.jsp");
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/del")
    public String del(Goods goods) {
        int count = goodsService.del(goods);
        return "/selectAll";
    }
}
