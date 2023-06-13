package kr.co.ejyang.module_user_verification.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

public class UserVerificationDto {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Select {
        public long idx;
        public int mbIdx;
        public String type;
        public String code;
        public String confirmYn;
        public String failCnt;
        public String expireDate;
        public String regDate;
        public String modDate;
    }

    @Data
    @Builder
    @RequiredArgsConstructor
    public static class Insert {
        @NotBlank(message = "회원 IDX(mb_idx)가 누락되었습니다.")
        public int mbIdx;

        @NotBlank(message = "인증 유형(type)이 누락되었습니다.")
        public String type;

        @NotBlank(message = "인증 코드(code)가 누락되었습니다.")
        public String code;

        @NotBlank(message = "인증 만료시간(expire_date)이 누락되었습니다.")
        public String expireDate;
    }

}
