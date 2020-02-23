# Kotlin Sample Project

## 목차

| <center>Subject</center> | <center>Summary</center> |
|:--------:|:--------:|
| <center>[AAC란?](#AAC)</center> | <center>AAC에 대한 개념적인 이해</center> |

## AAC 

- AAC

- Gradle이란?

- Android KTX란?

```
Android KTX는 Android Jetpack과 기타 Android 라이브러리에 포함된 Kotlin 확장 프로그램 세트입니다. KTX 확장 프로그램은 간결하고 직관적인 Kotlin을 Jetpack, Android 플랫폼, 기타 API에 제공합니다. 이렇게 하기 위해 이러한 확장 프로그램은 다음과 같은 여러 Kotlin 언어 기능을 활용합니다.

확장 함수
확장 프로그램 속성
람다
이름이 지정된 매개변수
매개변수 기본값
코루틴
```

-about ViewModel
```
- ViewModel은 액티비티와 프래그먼트에서 사용되는 UI 관련 데이터를 보관, 관리하기 위해 디자인
- 액티비티가 재생성 되는 상황에서도 ViewModel 인스턴스를 유지함으로써 데이터를 안전하게 다룰 수 있음
- 데이터의 소유권을 액티비티와 프래그먼트로부터 분리시킴으로써 관심사 분리, 즉 액티비티와 프래그먼트는 UI를 업데이트하는 역할에 집중시킨다는 의미에서 단일 책임 원칙을 따를 수 있는 발판이 마련덕분에 UI 로직에 대한 테스트도 수월
```
[출처](https://medium.com/@jungil.han/%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98-%EC%BB%B4%ED%8F%AC%EB%84%8C%ED%8A%B8-viewmodel-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-2e4d136d28d2)

- ViewModel vs AndroidViewModel

```
액티비티가 재생성 될 때, ViewModel은 액티비티 수명주기 외부에 존재하기 때문에 UI 컨텍스트를 ViewModel에 저장한다면 메모리 릭을 발생시키는 직접적인 원인이 될 수 있습니다. 
다만 Application 컨택스트를 저장하는 것은 문제가 되지 않습니다. Application 컨택스트는 전체 앱의 수명주기를 의미하기 때문에 메모리 릭에 영향을 주지 않으며 이런 용도를 위해 AndroidViewModel 클래스를 제공
```

- 코루틴
```
suspend는 모든 로컬 변수를 저장하여 현재 코루틴 실행을 정지합니다.
resume은 정지된 위치부터 정지된 코루틴을 계속 실행합니다.
```
    - Kotlin 코루틴은 디스패처를 사용하여 코루틴 실행에 사용되는 스레드를 결정
    - 코드를 기본 스레드 외부에서 실행하려면 기본 또는 IO 디스패처에서 작업을 실행하도록 Kotlin 코루틴에 지시하면 됩니다. Kotlin에서 모든 코루틴은 기본 스레드에서 실행 중인 경우에도 디스패처에서 실행되어야 합니다. 코루틴이 정지될 수 있으며 디스패처는 코루틴을 계속해야 합니다.

```
Dispatchers.Main - 이 디스패처를 사용하여 기본 Android 스레드에서 코루틴을 실행합니다. 이 디스패처는 UI와 상호 작용하고 빠른 작업을 수행하기 위해서만 사용해야 합니다. 예를 들어 suspend 함수를 호출하고, Android UI 프레임워크 작업을 실행하고, LiveData 객체를 업데이트합니다.
Dispatchers.IO - 이 디스패처는 기본 스레드 외부에서 디스크 또는 네트워크 I/O를 수행하도록 최적화되어 있습니다. 예를 들어 회의실 구성요소를 사용하고 파일을 읽거나 쓰고 네트워크 작업을 실행합니다.
Dispatchers.Default - 이 디스패처는 CPU를 많이 사용하는 작업을 기본 스레드 외부에서 수행하도록 최적화되어 있습니다. 예를 들어 목록을 정렬하고 JSON을 파싱합니다.
```

- MVVM 패턴

특징: 
view가 viewModel이 가진 데이터를 옵저빙하고 있다가 viewModel의 데이터가 변경되면 자동으로 view도 갱신되는 방법
view->viewModel의 의존성을 줄이기 위해 databinding을 사용

출처: https://umbum.dev/915

## Memo

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

- lateinit, lazy
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


- let(), apply()

let()은 함수를 호출하는 객체를 이어지는 블록의 인자로 넘기고, 블록의 결과값을 반환합니다.

예) 함수를 호출한 객체를 인자로 받으므로, 이를 사용하여 다른 메서드를 실행하거나 연산을 수행해야 하는 경우 사용

apply()는 함수를 호출하는 객체를 이어지는 블록의 리시버 로 전달하고, 객체 자체를 반환합니다.
리시버란, 바로 이어지는 블록 내에서 메서드 및 속성에 바로 접근할 수 있도록 할 객체를 의미

예) 특정 객체를 생성하면서 함께 호출해야 하는 초기화 코드가 있는 경우 사용

출처 : https://www.androidhuman.com/lecture/kotlin/2016/07/06/kotlin_let_apply_run_with/


- Thread & Coroutine
Thread, Coroutine 모두 Concurrency 동시성 (Interleaving) 를 보장하기 위한 기술입니다. 여러개의 작업을 동시에 수행할 때 Thread 는 각 작업에 해당하는 메모리 영역을 할당하는데, 여러 작업을 동시에 수행해야하기 때문에 OS 레벨에서 각 작업들을 얼만큼씩 분배하여 수행해야지 효율적일지 Preempting Scheduling 을 필요로 합니다. A 작업 조금 B 작업 조금을 통해 최종적으로 A 작업과 B 작업 모두를 이뤄내는 것입니다. Coroutine 은 Lightweight Thread 라고 불립니다. 이 또한 작업을 효율적으로 분배하여 조금씩 수행하여 완수하는 Concurrency 를 목표로하지만 각 작업에 대해 Thread 를 할당하는 것이 아니라 작은 Object 만을 할당해주고 이 Object 들을 자유자재로 스위칭함으로써 Switching 비용을 최대한 줄였습니다.

출처 : https://aaronryu.github.io/2019/05/27/coroutine-and-thread/

- 코루틴

기본 function에서 단순히 suspend만 붙임으로써 cortouine을 이용하여 background에서 동작하는 함수를 생성할 수 있습니다.

출처: https://tourspace.tistory.com/272 [투덜이의 리얼 블로그]

- 수명 주기 인식 코루틴 범위

ViewModelScope는 앱의 각 ViewModel에서 정의

```
class MyViewModel: ViewModel() {
        init {
            viewModelScope.launch {
                // Coroutine that will be canceled when the ViewModel is cleared.
            }
        }
    }
```


LifecycleScope는 각 Lifecycle 개체에서 정의됩니다. 이 범위에서 시작된 모든 코루틴은 Lifecycle이 끝날 때 취소

```
class MyFragment: Fragment() {
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            viewLifecycleOwner.lifecycleScope.launch {
                val params = TextViewCompat.getTextMetricsParams(textView)
                val precomputedText = withContext(Dispatchers.Default) {
                    PrecomputedTextCompat.create(longTextContent, params)
                }
                TextViewCompat.setPrecomputedText(textView, precomputedText)
            }
        }
    }
```


- CoroutineScope, viewModelScope


- withContext()
코루틴을 사용하면 세부적인 제어를 통해 스레드를 전달할 수 있습니다. withContext()를 사용하면 콜백을 도입하지 않고도 코드 줄의 스레드 풀을 제어할 수 있으므로 데이터베이스 읽기, 네트워크 요청 수행과 같은 매우 작은 함수에 이를 적용할 수 있습니다. withContext()를 사용하여 모든 함수가 기본적으로 안전한지, 즉 기본 스레드에서 함수를 호출할 수 있는지 확인하는 것이 좋습니다. 이 경우 호출자는 함수를 실행하는 데 사용할 스레드를 생각할 필요가 없습니다.