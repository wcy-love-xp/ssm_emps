package com.wang.controller;

import com.wang.pojo.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
        @RequestMapping(value = "/findAll" ,produces = "application/json;charset=utf-8")
        public ModelAndView findAll(){
            //新建时加页面
            ModelAndView mv=new ModelAndView("redirect:/index.jsp");
            List<User> list=userService.findAll();
            //在mv中存list带到页面去
            mv.addObject("list",list);
            return mv;
    }
    @RequestMapping("/findByName")
    public ModelAndView findByName(User user){
            ModelAndView mv=new ModelAndView("redirect:main.jsp");
            List<User> users=userService.findByName(user);//得到数据
            mv.addObject("list",users);
            return mv;
    }
    @RequestMapping("/delById")
    public ModelAndView delById(@RequestParam("id") String id){
       int count= userService.delById(Integer.parseInt(id));
       if(count>0) return new ModelAndView("redirect:/findByName");
       else return new ModelAndView("redirect:/main.jsp");
    }
    @RequestMapping("/findByNames")
    public ModelAndView findByNames(User user){
            ModelAndView mv = new ModelAndView("redirect:main2.jsp");
            List<User> list = userService.findByNames(user);
            mv.addObject("list",list);
            return mv;
    }
    @RequestMapping("/insertUser")
    public ModelAndView insertUser(User user){
            ModelAndView mv = new ModelAndView();
            int count = userService.insertUser(user);
            if (count>0) return new ModelAndView("redirect:/findByNames");
            else return new ModelAndView("redirect:add.jsp");
    }
    @RequestMapping("/selectByID")
    public ModelAndView selectByID(User user){
            ModelAndView mv = new ModelAndView("redirect:add.jsp");
           User user1 =  userService.selectByID(user);
            mv.addObject("user",user1);
            return mv;
    }
    @RequestMapping("/addOrUpdate")
    public String addOrUpdate(@RequestParam("sid") String sid,User user){
            if (sid.equals("")){
                int count = userService.insertUser(user);
                if (count>0) return "redirect:/findByNames";
                else return "redirect:add.jsp";
            }else {
                user.setId(Integer.parseInt(sid));
                int count = userService.updateById(user);
                if (count>0) return "redirect:/findByNames";
                else return "redirect:add.jsp";
            }
    }
}
