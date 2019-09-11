package com.mbp.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mbp.gmall.bean.UmsMember;
import com.mbp.gmall.bean.UmsMemberReceiveAddress;
import com.mbp.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;
@RequestMapping(value = "index")
@ResponseBody
    public  String index(){


    return "hello user";
    }


    @RequestMapping(value = "Address")
    @ResponseBody
    public List<UmsMemberReceiveAddress>     getDtailAddressByUserId(String memberId){
        List<UmsMemberReceiveAddress> dtailAddressByUserId = userService.getDtailAddressByUserId("1");
        return dtailAddressByUserId;
    }

    @RequestMapping(value = "getAllUser")
    @ResponseBody
    public List<UmsMember>     getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }
    @RequestMapping(value = "delect")
    @ResponseBody
    public Integer delectUuserByid(Integer id){
        Integer integer = userService.delectUuserByid(id);
        return integer;
    }

}
