# 3장 함수 정의와 호출
- - -
## 3.1 코틀린에서 컬렉션 만들기, 3.2 함수를 호출하기 쉽게 만들기
자바와의 차이를 예제로 작성<br>
Kotlin 예제 : CollectionKotlin.kt <br>
Java 예제 : CollectionJava.java

## 3.3 메서드를 다른 클래스에 추가: 확장 함수와 확장 프로퍼티
- 확장함수: 어떤 클래스의 멤버 메서드인 것 처럼 호출할 수 있는 함수
  - 확장함수를 사용하기 위해서는 임포트를 해야함
  - 자바에서 확장함수 호출 가능
  - 확장 함수는 오버라이드 불가능
  - 확장 프로퍼티 문법으로 짧은 코드 사용 가능
  - Kotlin 예제 : ExtensionFunctionKotlin.kt
  - Java 예제 : ExtensionFunctionjava.java

## 3.4 컬렉션 처리: 가변 길이 인자, 중위 함수 호출, 라이브러리 지원
- vararg 키워드 : 가변 길이 인자
```
  Java
  private void args(String...args){
    for(String arg: args) {
    }
  }
  
  Kotlin
  fun main(vararg args: String){
    val list = listOf(*args)
  }
```
- 중위 호출 : 수신 객체와 유일한 메서드 인자 사이에 메서드 이름을 넣어서 사용
```
  1.to("one") -> 일반 방식 
  1 to "one" -> 중위 호출 방식
  
  infix 변경자를 함수 선언 앞에 추가해야 중위 호출 가능
  infix fun Any.to(other:Any) = Pair(this, other)
```

