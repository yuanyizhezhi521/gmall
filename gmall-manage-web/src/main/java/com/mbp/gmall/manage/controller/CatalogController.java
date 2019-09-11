package com.mbp.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mbp.gmall.bean.PmsBaseCatalog3;
import com.mbp.gmall.bean.PmsBaseCatalog1;
import com.mbp.gmall.bean.PmsBaseCatalog2;
import com.mbp.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@CrossOrigin
public class CatalogController {
    @Reference
    CatalogService catalogService;



@RequestMapping(value = "getCatalog1")
@ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
    List<PmsBaseCatalog1> catalogList1 = catalogService.getCatalog1();

    return catalogList1;
    }
//    getCatalog2?catalog1Id=1


    @RequestMapping(value = "getCatalog2")
@ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalogList2 = catalogService.getCatalog2(catalog1Id);

        return catalogList2;
    }


    @RequestMapping(value = "getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalogList3 = catalogService.getCatalog3(catalog2Id);
        return catalogList3;
    }



}
