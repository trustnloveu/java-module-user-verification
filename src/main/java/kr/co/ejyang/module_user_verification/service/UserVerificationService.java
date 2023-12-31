package kr.co.ejyang.module_user_verification.service;

import kr.co.ejyang.module_user_verification.dto.UserVerificationDto;

public interface UserVerificationService {

    /*******************************************************************************************
     * 인증 내역 조회 - IDX, MB_IDX
     *******************************************************************************************/
    UserVerificationDto.Select selectUserVerificationDetail(long idx, int mbIdx);

    /*******************************************************************************************
     * 인증 요청
     *******************************************************************************************/
    void insertUserVerification(int mbIdx);

    /*******************************************************************************************
     * 인증 완료
     *******************************************************************************************/
    void updateUserVerificationBySuccess(long idx, int mbIdx);

    /*******************************************************************************************
     * 인증 실패
     *******************************************************************************************/
    void updateUserVerificationByFail(long idx, int mbIdx);

}
