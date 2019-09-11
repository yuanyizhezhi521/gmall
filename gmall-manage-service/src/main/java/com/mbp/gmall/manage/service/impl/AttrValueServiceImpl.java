package com.mbp.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mbp.gmall.bean.PmsBaseAttrValue;
import com.mbp.gmall.manage.mapper.AttrValueMapper;
import com.mbp.gmall.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrValueServiceImpl implements AttrValueService{
    @Autowired
    AttrValueMapper valueMapper;
    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue=new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        List<PmsBaseAttrValue> select = valueMapper.select(pmsBaseAttrValue);
        return select;
    }
}
