package com.mbp.gmall.service;

import com.mbp.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    public List<PmsProductInfo> spuList(String catalog3Id);
    public Integer saveSpuInfo(PmsProductInfo pmsProductInfo);
}
