package kr.co.ejyang.module_user_verification.Util;

import kr.co.ejyang.module_user_verification.config.EmailVerificationConfig;
import kr.co.ejyang.module_user_verification.config.MobileVerificationConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserVerificationUtil {

    private MobileVerificationConfig mobileConfig;
    private EmailVerificationConfig emailConfig;

    /*******************************************************************************************
     * 모바일 인증번호 발급
     *******************************************************************************************/
    public String generateMobileVerficiationCode() {
        return RandomStringUtils.randomNumeric(mobileConfig.getLength());
    }

    /*******************************************************************************************
     * 이메일 인증번호 발급
     *******************************************************************************************/
    public String generateEmailVerficiationCode() {
        return RandomStringUtils.randomNumeric(emailConfig.getLength());
    }

    /*******************************************************************************************
     * 만료시간 설정
     *******************************************************************************************/
    public String setExpireDate() {
        return null;
    }

}
