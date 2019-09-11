package com.mbp.gmall.user.mapper;

import com.mbp.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {


 public   List<UmsMember> getAllUser();


    int UserMapper();



}
