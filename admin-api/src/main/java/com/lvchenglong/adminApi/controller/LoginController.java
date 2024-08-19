package com.lvchenglong.adminApi.controller;

import com.lvchenglong.biz.dto.form.GetBase64CodeForm;
import com.lvchenglong.biz.dto.form.GetSmsCodeForm;
import com.lvchenglong.biz.service.MemberLoginService;
import com.lvchenglong.common.dto.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户登录模块")
@RestController
@RequestMapping(value = "/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    final MemberLoginService memberLoginService;

    @ApiOperation(value = "获取客户端Id")
    @GetMapping(value = "/getClientId")
    public ApiResponse<String> getClientId(){
        String result = memberLoginService.getClientId();
        return ApiResponse.success(result);
    }

    @ApiOperation(value = "获取图形验证码")
    @GetMapping(value = "/getBase64Code")
    public ApiResponse<String> getBase64Code(@Validated @ModelAttribute GetBase64CodeForm form){
        String base64Code = memberLoginService.getBase64Code(form);
        return ApiResponse.success(base64Code);
    }

    @ApiOperation(value = "获取短信验证码")
    @GetMapping(value = "/sendSmsCode")
    public ApiResponse<Void> sendSmsCode(@Validated @ModelAttribute GetSmsCodeForm form) {
        memberLoginService.sendSmsCode(form);
        return ApiResponse.success();
    }
}
