package com.jumpower.mysqlspringboot.service;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.mapper.WmsUserMapper;

import java.util.List;

public interface WmsUserService {

    /**
     * 查询全部用户信息
     * @param wmsUser
     * @return
     */
    public List<WmsUser> queryWmsUserMapperList(WmsUser wmsUser);
}
