package com.lvchenglong.biz.mapper;

import com.lvchenglong.biz.domain.Tenant;
import com.lvchenglong.mybatis.help.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TenantMapper extends CommonMapper<Tenant> {
}