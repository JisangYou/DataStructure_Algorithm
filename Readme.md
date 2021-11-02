# about kotlin
- Kotlin Coding Convention

## var vs val

- var vs val
val : 변할 수 없는 상수
var : 일반적인 변수

- 변수타입 ? 의미

?의 의미는 languageName 변수를 String 으로 선언을 하는데,
String 의 값도 가질 수 있고, Null 값을 가질 수도 있다는 의미

출처: https://like-tomato.tistory.com/228 [토마토의 일상 얘기]


- 함수 사용방법
```
fun sum(a:Int, b:Int) : Int{
    return a+b
} 

혹은

fun sum(a:Int, b:Int) = a+b 

```

## lateinit, lazy
Late-Initialized Properties :
초기화 지연 프로퍼티(Late-initialized property)라고 하며 프로퍼티의 초기화를 나중에 하기 위해 사용하는 키워드다. 프로퍼티 선언에 사용되며 항상 사용 가능한 것은 아니다. 사용하기에 몇 가지 제약사항이 있다.
var(mutable) 프로퍼티만 사용 가능
non-null 프로퍼티만 사용 가능
커스텀 getter/setter가 없는 프로퍼티만 사용 가능
primitive type 프로퍼티는 사용 불가능
클래스 생성자에서 사용 불가능
로컬 변수로 사용 불가능

lazy :
lazy도 lateinit과 마찬가지로 초기화를 지연시킬 때 사용하며 lateinit은 Modifier 지만 lazy는 람다를 파라미터로 받고 Lazy<T> 인스턴스를 반환하는 함수다. lazy도 사용에 제약사항이 있는데 lateinit과 차이점이 있다.
val(immutable) 프로퍼티만 사용 가능
primitive type에도 사용 가능
커스텀 getter/setter가 없는 프로퍼티만 사용 가능
Non-null, Nullable 둘 다 사용 가능
클래스 생성자에서 사용 불가능
로컬 변수에서 사용 가능

lateinit과 제약사항에 있어서 몇 가지 차이점이 있는데 이를 간단히 정리하자면 다음과 같다.
lateinit은 var 타입만 가능하고 lazy는 val 타입만 가능
lateinit은 primitive type은 불가능하나 lazy는 가능
lateinit은 Non-null 타입만 가능하나 lazy는 둘 다 가능
lateinit은 로컬 변수에서는 불가능 하나 lazy는 가능

lazy 프로퍼티 연산은 기본적으로 동기화된다.

출처 : https://medium.com/@joongwon/kotlin-kotlin-lazy-initialization-901079296e43


## let(), apply()

let()은 함수를 호출하는 객체를 이어지는 블록의 인자로 넘기고, 블록의 결과값을 반환합니다.

예) 함수를 호출한 객체를 인자로 받으므로, 이를 사용하여 다른 메서드를 실행하거나 연산을 수행해야 하는 경우 사용

apply()는 함수를 호출하는 객체를 이어지는 블록의 리시버 로 전달하고, 객체 자체를 반환합니다.
리시버란, 바로 이어지는 블록 내에서 메서드 및 속성에 바로 접근할 수 있도록 할 객체를 의미

예) 특정 객체를 생성하면서 함께 호출해야 하는 초기화 코드가 있는 경우 사용

출처 : https://www.androidhuman.com/lecture/kotlin/2016/07/06/kotlin_let_apply_run_with/
