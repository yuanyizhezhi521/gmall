package com.mbp.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.mbp.gmall.bean.UmsMember;
import com.mbp.gmall.bean.UmsMemberReceiveAddress;
import com.mbp.gmall.service.UserService;
import com.mbp.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.mbp.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper addressMapper;


    @Override
    public List<UmsMember>  getAllUser() {
        List<UmsMember> UmsMember = userMapper.selectAll();
        return UmsMember;
    }

    @Override
    public List<UmsMemberReceiveAddress> getDtailAddressByUserId(String memberId) {

        Example example=new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = addressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }

    @Override
    public Integer delectUuserByid(Integer id){
        Example e=new Example(UmsMember.class);
        e.createCriteria().andEqualTo("id",id);
        int delete = userMapper.deleteByExample(e);
        return delete;
    }

    @Override
    public Integer updateUser(UmsMember user) {
        int i = userMapper.updateByPrimaryKey(user);
        return i;
    }
}
