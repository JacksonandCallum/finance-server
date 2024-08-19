package com.lvchenglong.biz.service.impl;

import com.lvchenglong.biz.domain.MemberBindPhone;
import com.lvchenglong.biz.mapper.MemberBindPhoneMapper;
import com.lvchenglong.biz.service.MemberBindPhoneService;
import com.lvchenglong.mybatis.help.MyBatisWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.lvchenglong.biz.domain.MemberBindPhoneField.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberBindPhoneServiceImpl implements MemberBindPhoneService {
    final MemberBindPhoneMapper memberBindPhoneMapper;
    // final PasswordEncoder passwordEncoder;
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 根据手机号获取用户信息
     */
    @Override
    public MemberBindPhone getMemberByPhone(String phone) {
        MyBatisWrapper<MemberBindPhone> myBatisWrapper = new MyBatisWrapper<>();
        myBatisWrapper.select(MemberId,Phone,Password)
                .whereBuilder().andEq(setPhone(phone));
        return memberBindPhoneMapper.topOne(myBatisWrapper);
    }
}
