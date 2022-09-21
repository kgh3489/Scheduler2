# Scheduler2
# Spring 으로 만들어 보았던 Scheduler 수강신청 사이트를 Springboot 로 리팩토링 해보기  
  
  2022년에 진행했던, 미니 프로젝트의 경험을 공유하고자 포스팅을 남깁니다.  
  이 프로젝트는 원혜민, 곽건호, 윤종현, 이규리 총 4명으로 진행했습니다.    
  
  프로젝트 기간: 2022년 9월 19일 ~ 2022년 9월 21일  
    
-------------------------------------------------------------------------------------------------------------------------------------------------- 
 # 프로젝트 제목
```
Scheduler2
```
## 프로젝트 소개 및 목적
```
Spirng 으로 만들어 보았던 수강신청 사이트를
Springboot 로 리팩토링해 수강신청 사이트를 만드는 것이 목적
```
## 동작과정

![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/103405475/191593356-81908273-ff44-44d5-a2ac-b3aec216798e.gif)

## 구동 OS
```
Window 10,11, MAC
```

## 주요기능
```
1. 회원가입
2. 로그인
3. 로그아웃
4. 수강신청
5. 나의 수강신청 목록 조회
```

## 사용 기술 
```
Java 11, SpringBoot 4.11.1, MySQL 8.0, Lombok 1.18.24, JavaScript Gradle, JPA, Entity, Session, RestAPI, jQuery, Validation, Cookie, Exception
```
![useskill_2](https://user-images.githubusercontent.com/103405475/191585788-ff5e1563-adfc-4203-8770-0357169bfd49.png)

## 사용 WAS
```
사용서버 
TOMCAT 9.0
```
## 파일구조
<hr>

```
파일구조
C:\
│  
│      
├─bin
│  ├─main
│  │  │  
│  │  ├─com
│  │  │  └─group2
│  │  │      └─scheduler
│  │  │          │ 
│  │  │          ├─config
│  │  │          │      InterceptorConfig.class       
│  │  │          │      
│  │  │          ├─controller
│  │  │          │      LectureController.class
│  │  │          │      RegisterController.class
│  │  │          │      UserController.class
│  │  │          │      
│  │  │          ├─entity
│  │  │          │      LectureEntity$LectureEntityBuilder.class
│  │  │          │      LectureEntity.class
│  │  │          │      RegisterEntity$RegisterEntityBuilder.class
│  │  │          │      RegisterEntity.class
│  │  │          │      UserEntity$Request$RequestBuilder.class
│  │  │          │      UserEntity$Request.class
│  │  │          │      UserEntity$UserEntityBuilder.class
│  │  │          │      UserEntity.class
│  │  │          │      
│  │  │          ├─service
│  │  │          │      LectureRepository.class
│  │  │          │      LectureService.class
│  │  │          │      LectureServiceImpl.class
│  │  │          │      RegisterRepository.class
│  │  │          │      RegisterService.class
│  │  │          │      RegisterServiceImpl.class
│  │  │          │      UserRepository.class
│  │  │          │      UserService.class
│  │  │          │      UserServiceImpl.class
│  │  │          │      
│  │  │          └─util
│  │  │                  LocaleInterceptor.class
│  │  │                  LoginSuccessHandler.class
│  │  │                  
│  │  ├─static
│  │  │  ├─css
│  │  │  │      bootstrap.css
│  │  │  │      detail.css
│  │  │  │      external.css
│  │  │  │      main.css
│  │  │  │      
│  │  │  └─js
│  │  │          jquery-1.12.1.min.js
│  │  │          
│  │  └─templates
│  │      ├─lecture
│  │      │      detail.html
│  │      │      mainlist.html
│  │      │      mypage.html
│  │      │      
│  │      └─user
│  │              main.html
│  │              
│  └─test
│      └─com
│          └─group2
│              └─scheduler
│                      CodeTest.class
│                      SchedulerApplicationTests.class
│                      
├─gradle
│  └─wrapper
│          gradle-wrapper.jar
│          gradle-wrapper.properties
│          
└─src
    ├─main
    │  ├─java
    │  │  │  table.txt
    │  │  │  
    │  │  └─com
    │  │      └─group2
    │  │          └─scheduler
    │  │              │  SchedulerApplication.java
    │  │              │  ServletInitializer.java
    │  │              │  
    │  │              ├─config
    │  │              │      InterceptorConfig.java
    │  │              │      
    │  │              ├─controller
    │  │              │      LectureController.java
    │  │              │      RegisterController.java
    │  │              │      UserController.java
    │  │              │      
    │  │              ├─entity
    │  │              │      LectureEntity.java
    │  │              │      RegisterEntity.java
    │  │              │      UserEntity.java
    │  │              │      
    │  │              ├─service
    │  │              │      LectureRepository.java
    │  │              │      LectureService.java
    │  │              │      LectureServiceImpl.java
    │  │              │      RegisterRepository.java
    │  │              │      RegisterService.java
    │  │              │      RegisterServiceImpl.java
    │  │              │      UserRepository.java
    │  │              │      UserService.java
    │  │              │      UserServiceImpl.java
    │  │              │      
    │  │              └─util
    │  │                      LocaleInterceptor.java
    │  │                      LoginSuccessHandler.java
    │  │                      
    │  └─resources
    │      │  application.properties
    │      │  
    │      ├─static
    │      │  ├─css
    │      │  │      bootstrap.css
    │      │  │      detail.css
    │      │  │      external.css
    │      │  │      main.css
    │      │  │      
    │      │  └─js
    │      │          jquery-1.12.1.min.js
    │      │          
    │      └─templates
    │          ├─lecture
    │          │      detail.html
    │          │      mainlist.html
    │          │      mypage.html
    │          │      
    │          └─user
    │                  main.html
    │                  
    └─test
        └─java
            └─com
                └─group2
                    └─scheduler
                            CodeTest.java
                            SchedulerApplicationTests.java
                            
```




<hr>

## 데이터베이스
데이터베이스관계
<hr>

![dbrelation_2](https://user-images.githubusercontent.com/103405475/191585930-11528533-71f2-4c32-9feb-87ed4a8f101c.png)

<hr>

<br>

user 테이블<br>
PK = uno <br>
|user|uno|id|name|pw|
|------|------|---|---|---|
|　　　|PK1|아이디1|홍길동|비밀번호|
|　　　|PK2|아이디2|홍길동|비밀번호|
|　　　|PK3|아이디3|홍길동|비밀번호|
<hr>
<br>

lecture 테이블<br>
PK = lno <br>
|lecture|lno|day|end_time|fixed_num|start_time|title|tutor
|------|------|---|---|---|---|---|---|
|　　　|PK1|요일|10|남은자리|9|강의명|강사명|
|　　　|PK2|요일|11|남은자리|10|강의명|강사명|
|　　　|PK3|요일|12|남은자리|11|강의명|강사명|
<hr>
<br>

register 테이블<br>
PK = id <br>
FK = lno <br>
FK = uno <br>
|register|id|lno|uno|
|------|------|---|---|
|　　　|아이디1|lecturePK1|userPK1|
|　　　|아이디2|lecturePK2|userPK2|
|　　　|아이디3|lecturePK3|userPK3|
<hr>
<br>





## 느낀점
원혜민
```
팀 프로젝트를 하면서 느낀 점은 협업을 하니 확실하게 책임감이 더해졌다.
```
곽건호
```
리팩토링을해 다시 만들어 보는것이 힘들었지만 좋은 경험이였다.
```
이규리
```
모든 분들이 열심히 참여해주시고 좋은 결과물을 함께 만들어서 좋았다.
```
윤종현
```
간단한 게시판 이라도 만드는게 쉽지 않았다. 팀원분들에게 피해를 끼치지 않으려면 
개인적인 공부를 정말 열심히 해야 할 것 같다!
```



