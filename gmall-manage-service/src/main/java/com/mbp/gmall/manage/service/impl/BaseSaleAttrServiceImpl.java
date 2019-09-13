package com.mbp.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mbp.gmall.bean.PmsBaseSaleAttr;
import com.mbp.gmall.manage.mapper.BaseSaleAttrMapper;
import com.mbp.gmall.service.BaseSaleAttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BaseSaleAttrServiceImpl implements BaseSaleAttrService {
    @Autowired
    BaseSaleAttrMapper baseSaleAttrMapperp;

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = baseSaleAttrMapperp.selectAll();
        return pmsBaseSaleAttrs;
    }
}
