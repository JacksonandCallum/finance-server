package com.lvchenglong.biz.service;

import com.lvchenglong.biz.domain.MemberBindPhone;

public interface MemberBindPhoneService {
    /**
     * 根据手机号获取用户信息
     */
    MemberBindPhone getMemberByPhone(String phone);
}
