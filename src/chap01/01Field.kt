package chap01

fun main() {
    /*
    * 코틀린에서는 아래와 같은 구문으로 필드를 선언하고 초기화 할수 있다.
    * */

//    val name: String = "Frank 현석 Oh"

    /*
    * 자바와 다른 점을 살펴보자
    *
    * val 이라는 키워드가 맨 앞에 나온다. 이 키워드는 뒤에 오는 name이 불변임을 뜻한다.
    * 타입이 필드 이름 뒤에 온다. 이때 이름과 타입을 콜론으로 구분한다.
    * 한 문장이 끝나는 부분에 세미콜론이 없다.
    * */

    /*
    * 타입 생략하기
    * */

//    val name = "Frank 현석 Oh"

    /*
    * 그냥 kotlin 타입 추론
    * */

    /*
    * 변수 사용하기
    * */

//    var name = "Frank 현석 Oh"
//    name = "Joyce 계영 Lee"

    /*
    * 지연 초기화
    * */

//    방법 1
    var name1: String? = null
    name1 = "초기화"
//    방법 2
    val name2: String by lazy { getName() }
    println(name2)
//    방법 3
    val name3: String by lazy(::getName)
    println(name3)
}

fun getName(): String = "이름 얻기"