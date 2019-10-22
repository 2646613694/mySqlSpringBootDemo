package com.jumpower.mysqlspringboot.service.impl;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.mapper.WmsUserMapper;
import com.jumpower.mysqlspringboot.service.WmsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WmsUserServiceImpl implements WmsUserService {

    @Resource
    private WmsUserMapper wmsUserMapper;


    /**
     * 查询用户信息
     * @param wmsUser
     * @return
     */
    @Override
    public List<WmsUser> queryWmsUserMapperList(WmsUser wmsUser) {
        List<WmsUser> wmsUsers = wmsUserMapper.queryWmsUserMapperList(wmsUser);
        return wmsUsers;
    }
}
