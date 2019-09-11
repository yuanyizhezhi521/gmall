package com.mbp.gmall.service;

import com.mbp.gmall.bean.PmsBaseCatalog3;
import com.mbp.gmall.bean.PmsBaseCatalog1;
import com.mbp.gmall.bean.PmsBaseCatalog2;

import java.util.List;

public interface CatalogService {

    public List<PmsBaseCatalog1> getCatalog1();

    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id);

}
