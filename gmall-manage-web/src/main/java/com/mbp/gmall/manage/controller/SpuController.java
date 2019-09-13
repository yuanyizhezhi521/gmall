package com.mbp.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mbp.gmall.bean.PmsBaseSaleAttr;
import com.mbp.gmall.bean.PmsProductInfo;
import com.mbp.gmall.service.BaseSaleAttrService;
import com.mbp.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@CrossOrigin
public class SpuController {
@Reference
    SpuService spuService;
@Reference
BaseSaleAttrService baseSaleAttrService;

    @RequestMapping(value = "spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);
        return pmsProductInfos;
    }

    @RequestMapping(value = "baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = baseSaleAttrService.baseSaleAttrList();
        return pmsBaseSaleAttrs;
    }
    @RequestMapping(value = "saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        Integer integer = spuService.saveSpuInfo(pmsProductInfo);
        return "success";
    }
    @RequestMapping(value = "fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file")MultipartFile multipartFile) throws IOException {


        return "success";
    }




}
