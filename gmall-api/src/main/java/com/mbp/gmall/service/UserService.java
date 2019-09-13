package com.mbp.gmall.service;


import com.mbp.gmall.bean.UmsMember;
import com.mbp.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember>  getAllUser();

    public List<UmsMemberReceiveAddress>     getDtailAddressByUserId(String memberId);
    public Integer delectUuserByid(Integer id);
    public Integer updateUser(UmsMember user);

}
