package kr.co.ejyang.module_user_verification.service;

import kr.co.ejyang.module_user_verification.dto.UserVerificationDto;
import kr.co.ejyang.module_user_verification.mapper.UserVerificationMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserVerificationServiceImpl implements UserVerificationService {

    private final UserVerificationMapper userVerificationMapper;

    /*******************************************************************************************
     * 인증 내역 조회 - IDX, MB_IDX
     *******************************************************************************************/
    @Override
    public UserVerificationDto.Select selectUserVerificationDetail(long idx, int mbIdx) {
        return userVerificationMapper.selectUserVerificationDetail(idx, mbIdx);
    }

    /*******************************************************************************************
     * 인증 요청
     *******************************************************************************************/
    @Override
    public void insertUserVerification(int mbIdx) {

        // 인증번호 생성

        // 만료시간 생성

        // Insert 객체 생성
        UserVerificationDto.Insert dto = UserVerificationDto.Insert.builder()
                .mbIdx(mbIdx)
                .type("TEMP")
                .code("123456")
                .expireDate(new Date().toString())
                .build();

        userVerificationMapper.insertUserVerification(dto);
    }

    /*******************************************************************************************
     * 인증 완료
     *******************************************************************************************/
    @Override
    public void updateUserVerificationBySuccess(long idx, int mbIdx) {
        userVerificationMapper.updateUserVerificationBySuccess(idx, mbIdx);
    }

    /*******************************************************************************************
     * 인증 실패
     *******************************************************************************************/
    @Override
    public void updateUserVerificationByFail(long idx, int mbIdx) {
        userVerificationMapper.updateUserVerificationByFail(idx, mbIdx);
    }

}
