package com.mbp.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mbp.gmall.bean.PmsBaseCatalog3;
import com.mbp.gmall.bean.PmsBaseCatalog1;
import com.mbp.gmall.bean.PmsBaseCatalog2;
import com.mbp.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.mbp.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.mbp.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.mbp.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1;


    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2;

    @Autowired
    PmsBaseCatalog3Mapper catalog3Mapper;




    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalog1.selectAll();
        return pmsBaseCatalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog21 =new PmsBaseCatalog2();
        pmsBaseCatalog21.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> select = pmsBaseCatalog2.select(pmsBaseCatalog21);
        return select;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 =new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catalog3Mapper.select(pmsBaseCatalog3);
        return pmsBaseCatalog3s;
    }


}
