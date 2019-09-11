package com.mbp.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mbp.gmall.bean.PmsBaseAttrInfo;
import com.mbp.gmall.bean.PmsBaseAttrValue;
import com.mbp.gmall.service.AttrInfoService;
import com.mbp.gmall.service.AttrValueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AtrController {
    @Reference
    AttrInfoService attrInfoService;
    @Reference
    AttrValueService valueService;


    @ResponseBody
    @RequestMapping(value = "attrInfoList")
public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrInfoService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;


    }
    @ResponseBody
    @RequestMapping(value = "getAttrValueList")
public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> attrValueList = valueService.getAttrValueList(attrId);
        return attrValueList;
    }
    @ResponseBody
    @RequestMapping(value = "saveAttrInfo")
public String saveAttrInfo(@RequestBody PmsBaseAttrInfo info){
        int i = attrInfoService.saveAttrInfo(info);
        return "success";
    }

}
