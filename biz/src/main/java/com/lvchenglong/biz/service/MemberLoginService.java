package com.lvchenglong.biz.service;

import com.lvchenglong.biz.dto.form.GetBase64CodeForm;
import com.lvchenglong.biz.dto.form.GetSmsCodeForm;

public interface MemberLoginService {
    /**
     * 获取客户端id
     */
    String getClientId();

    /**
     * 获取图形验证码
     */
    String getBase64Code(GetBase64CodeForm form);

    /**
     * 获取短信验证码
     */
    void sendSmsCode(GetSmsCodeForm form);

    /**
     * 校验图形验证码
     */
    boolean checkBase64Code(String clientId, String code);
}
