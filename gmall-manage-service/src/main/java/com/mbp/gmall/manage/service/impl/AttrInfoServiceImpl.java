package com.mbp.gmall.manage.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.mbp.gmall.bean.PmsBaseAttrInfo;
import com.mbp.gmall.bean.PmsBaseAttrValue;
import com.mbp.gmall.manage.mapper.AttrInfoMapper;
import com.mbp.gmall.manage.mapper.AttrValueMapper;
import com.mbp.gmall.service.AttrInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class AttrInfoServiceImpl implements AttrInfoService {
    @Autowired
    AttrInfoMapper infoMapper;

    @Autowired
    AttrValueMapper valueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> select = infoMapper.select(pmsBaseAttrInfo);
        return select;
    }

    @Override
    public int saveAttrInfo(PmsBaseAttrInfo info) {
        String id=  info.getId();
        if (StringUtils.isBlank(id)){

            int insert = infoMapper.insertSelective(info);
            int s=0;
            List<PmsBaseAttrValue> attrValueList = info.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue:attrValueList
            ) {
                pmsBaseAttrValue.setAttrId(info.getId());
                System.out.println(pmsBaseAttrValue);
                s= valueMapper.insertSelective(pmsBaseAttrValue);
            }

            return s;
        }else {
            Example e =new Example(PmsBaseAttrInfo.class);
            e.createCriteria().andEqualTo("id",info.getId());
            int i = infoMapper.updateByExample(info, e);
            Example example =new Example(PmsBaseAttrValue.class);
            example.createCriteria().andEqualTo("attrId",info.getId());
            valueMapper.deleteByExample(example);
            int s=0;
            List<PmsBaseAttrValue> attrValueList = info.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue:attrValueList
            ) {
                pmsBaseAttrValue.setAttrId(info.getId());
                System.out.println(pmsBaseAttrValue);
                s= valueMapper.insertSelective(pmsBaseAttrValue);
            }
            return s;
        }
    }
}
