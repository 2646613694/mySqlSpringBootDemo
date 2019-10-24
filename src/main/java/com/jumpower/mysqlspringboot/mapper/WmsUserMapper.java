package com.jumpower.mysqlspringboot.mapper;

import com.jumpower.mysqlspringboot.entity.WmsUser;

import java.util.List;

public interface WmsUserMapper {

    /**
     * 查询全部用户信息
     * @param wmsUser
     * @return
     */
    public List<WmsUser> queryWmsUserMapperList(WmsUser wmsUser);


    /**
     * 添加用户信息
     * @param wmsUser
     */
    void insertWmsUserMapperList(WmsUser wmsUser);
}
