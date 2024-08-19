package com.lvchenglong.biz.mapper;

import com.lvchenglong.biz.domain.Member;
import com.lvchenglong.mybatis.help.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends CommonMapper<Member> {
}