package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalApplication {

    /*
     우선순위
     1. 설정 데이터( application.properties )
     2. OS 환경변수
     3. 자바 시스템 속성
     4. 커맨드 라인 옵션 인수
     5. @TestPropertySource (테스트에서 사용)


     설정 데이터 우선순위
     1. jar 내부 application.properties
     2. jar 내부 프로필 적용 파일 application-{profile}.properties
     3. jar 외부 application.properties
     4. jar 외부 프로필 적용 파일 application-{profile}.properties

     우선순위는 아래로 갈 수록 더 높음

     - 더 유연한 것이 우선순위가 높음
       - 변경하기 어려운 application.properties 파일 보다 실행시 값을 줄 수 있는 자바 시스템 속성이 더 우선함
     - 범위가 넓은 것 보다 좁은 것이 우선함
       - 환경 변수 보다 자바 시스템 속성이 우선함
       - 자바 시스템 속성 보다 커맨드 라인 옵션 인수가 더 우선함
    */
    public static void main(String[] args) {
        SpringApplication.run(ExternalApplication.class, args);
        //JavaSystem.print();
    }

}
