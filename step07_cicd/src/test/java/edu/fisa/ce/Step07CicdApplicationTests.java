package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;  // JUnit 5

@SpringBootTest
public class Step07CicdApplicationTests {
	
 @Test  
 public void testAddition() {
     int result = 12 + 3;
     
     /*
      * 예시 - 서버 시작시에 특정 DataBase 로부터 검색
      * 그 데이터는 꼭 fisa여야 하는 상황
      * 그게 아니라면 서버 중지 혹은 다른 로직 실행
      * 
      * 개발 중에 데이터에 대한 test
      */
     
     System.out.println("비교 전**************");
     assertEquals(5, result);  // 성공: 5 == 5
     
     System.out.println("비교 후**************");
     
     
 }
}
