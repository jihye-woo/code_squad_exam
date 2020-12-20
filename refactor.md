

## 추가 혹은 수정할 사항

### 로직
   - U command
       - sign을 제거
       - 로직 일원화를 위해서 sequence 내부 order 변경 필요

### 설정
   - gitignore
        - IDE에 dependent한 파일
        - ex) .class
        
### 예외 및 안정성 처리
   - Exception 처리
        - try-catch에 조금 더 유의미한 에러 처리 필요
        - 로깅 유틸리티 활용
   - Scanner
        - BufferedReader 대신 안정적인 Scanner
### 출력
   - Command 목록 출력
        - ~~하드 코딩 대신 enum.values()~~
        - ✔ 가독성 문제로 보류
   - ~~StringBuilder 활용~~
   - ✔ 가독성을 위해 format 사용 [[StringBuilder와 format](https://stackoverflow.com/questions/44117788/performance-between-string-format-and-stringbuilder)]

### 클린 코드
   - package 분배
        - 적절하게 package로 나누어 관리
   - Util 클래스
        - private no-args constructor 설정
        - static 키워드 대신 접근 제어를 default 레벨로 수정하는 방향 고민
   - ✔ directionSwitcher() 가독성
        - 삼항 연산자
   - switch statement
        - 객체 지향적으로 전환
        - 조금 더 고민 필요
   - ✔ shifting() 책임 분리
        - print() 기능은 다른 곳에서
   - 변수명 N
        - 좀 더 유의미한 이름으로