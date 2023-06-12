# module-user-verification
- 유저 인증 관리 모듈
- 모바일, 이메일 인증 관리
- 조회 & 요청 & 확인 & 갱신


## 프로젝트 구성
```shell
module_user_verification
└── src
    └── main
        └── kr.co.ejyang
            ├── module_user_verification
            │   ├── config
            │   ├── dto
            │   ├── exception
            │   ├── mapper
            │   └── service
            └── resources
                └── sql
                    └── user_verification_SQL.xml
```


## 서비스 구현체

### UserVerificationImplMobile.java
* 모바일(Mobile) 본인인증 관련

```shell
-  : 
```

### UserVerificationImplEmail.java
* 이메일(E-mail) 본인인증 관련

```shell
-  : 
```



## 프로젝트 프로퍼티 ( VerificationConfig.java )
* 외부 인증 API 관련 프로퍼티
  
* `verification.*` : ...


## DB 테이블 DDL

```sql
CREATE TABLE `member_verification` (
    `idx` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `mb_idx` INT(11) NOT NULL,
    `type` VARCHAR(20) NOT NULL,
    `code` VARCHAR(10) NOT NULL,
    `confirm_yn` CHAR(1) NOT NULL DEFAULT 'N',
    `fail_cnt` INT(3) NOT NULL DEFAULT 0,
    `expire_date` DATETIME NOT NULL,
    `reg_date` DATETIME NOT NULL,
    `mod_date` DATETIME NULL,
    PRIMARY KEY (`idx`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
```