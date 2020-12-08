# 2021 마스터즈 코스 테스트
 
### 개요 및 주의 사항
 - 단계별(step1 - 3)로 루빅스 큐브 구현
 - 지정된 코딩 요구사항을 적용하되, 특별히 명시되지 않은 부분은 자유롭게 구현한다.
 
 
### 코딩 요구사항
 - [ ] 단계별로 구현한 코드의 동작 방식을 README.md에 정리
 - [ ] 단계별로 각각 step-1, step-2, step-3 라는 이름의 브랜치 작성
 - [ ] 커밋 시점과 단위, 커밋 메세지 고려하여 작성 [[참고](https://meetup.toast.com/posts/106)]

### 1단계: 단어 밀어내기 구현하기
1. 입력: 단어 하나, 정수 숫자 하나( -100 <= N < 100) , L 또는 R을 입력받는다. L 또는 R은 대소문자 모두 입력 가능하다.
    - INPUT : Char, Integer, 'L'/'l' OR 'R'/'r' 
    - Exception Handling
        * User Input Error
        * Integer Boundary Error
2. 주어진 단어를 L이면 주어진 숫자 갯수만큼 왼쪽으로, R이면 오른쪽으로 밀어낸다.
    - subString()
    - Exception Handling
        * IndexOutOfBoundsException
3. 밀려나간 단어는 반대쪽으로 채워진다.


### 1단계 : Pseudo Code
1. 사용자 입력(User Input)
    - Scanner로 사용자 입력 받기 ( word, N, direction )
    - Exception Handling
        * InputMismatchException, IOException, NullPointerException [[참고](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)]
             
2. N 정제(Purifying Integer input, N)
    - IF N == 0 
        * Doesn't shift
    - IF N < 0
        * 'R'/'r' ↔ 'L'/'l'
        * N = -N
    - IF N >= word.length
        * N = N % word.length

3. 방향에 따른 정제(Direction matters)
    - IF direction == 'R' or 'r'
        * N = word.length - N

4. String Shift
    -  word.substring(N) + word.substring(0, N)
    

