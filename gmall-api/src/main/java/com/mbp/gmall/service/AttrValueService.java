package com.mbp.gmall.service;

import com.mbp.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrValueService {
    public List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
