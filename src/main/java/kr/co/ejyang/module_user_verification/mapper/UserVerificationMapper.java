package kr.co.ejyang.module_user_verification.mapper;

import kr.co.ejyang.module_user_verification.dto.UserVerificationDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserVerificationMapper {

    /*******************************************************************************************
     * 인증 내역 조회 - IDX, MB_IDX
     *******************************************************************************************/
    UserVerificationDto.Select selectUserVerificationDetail(long idx, int mbIdx);

    /*******************************************************************************************
     * 인증 요청
     *******************************************************************************************/
    void insertUserVerification(UserVerificationDto.Insert dto);

    /*******************************************************************************************
     * 인증 완료
     *******************************************************************************************/
    void updateUserVerificationBySuccess(long idx, int mbIdx);

    /*******************************************************************************************
     * 인증 실패
     *******************************************************************************************/
    void updateUserVerificationByFail(long idx, int mbIdx);

}
