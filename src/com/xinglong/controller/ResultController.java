package com.xinglong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xinglong.pojo.Result;
import com.xinglong.service.ResultService;

@Controller

public class ResultController {
@Autowired
   ResultService resultService;           //1.实例化service接口
@RequestMapping("/listResult")             //2.视图定位
     public ModelAndView listResult() {   //3.返回modelandview
        ModelAndView mav = new ModelAndView();
        List<Result> rs = resultService.list();
        mav.addObject("rs",rs);
        mav.setViewName("listResult");
        return mav;
   }




}
