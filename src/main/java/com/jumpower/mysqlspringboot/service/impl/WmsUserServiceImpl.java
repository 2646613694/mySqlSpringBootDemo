package com.jumpower.mysqlspringboot.service.impl;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.mapper.WmsUserMapper;
import com.jumpower.mysqlspringboot.service.WmsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Consumer;

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


    /**
     * 通过流的方式往mybatis中添加新元素
     * @param list 将要添加的新元素
     * @return
     */
    @Override
    public int insertWmsUserMapperList(List<WmsUser> list) {
        list.stream().forEach(wmsUserMapper::insertWmsUserMapperList);
        return 1;
    }


}
