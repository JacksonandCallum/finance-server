package com.lvchenglong.biz.service;

import com.lvchenglong.biz.dto.form.GetBase64CodeForm;

public interface MemberLoginService {
    /**
     * 获取客户端id
     */
    String getClientId();

    /**
     * 获取图形验证码
     */
    String getBase64Code(GetBase64CodeForm form);
}
