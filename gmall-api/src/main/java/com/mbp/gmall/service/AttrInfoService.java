package com.mbp.gmall.service;

import com.mbp.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrInfoService {
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
    public int saveAttrInfo(PmsBaseAttrInfo info);
}
