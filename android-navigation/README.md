# Android Navigation codelab

Content: https://codelabs.developers.google.com/codelabs/android-navigation/

License
-------

Copyright 2018 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.


## 학습 목록
```
You're familiar with the basic concepts behind the Navigation component! In this codelab you learned about:

Navigation graph structure
NavHostFragment and NavController
How to navigate to specific destinations
How to navigate by action
How to pass arguments between destinations, including using the new safeargs plugin
Navigating using menus, bottom navs, and navigation drawers
Navigating via deep link
```

## 학습 Review

- NavHostFragment :
>  탐색 구성요소의 핵심 부분 중 하나는 NavHost. NavHost는 빈 컨테이너로, 사용자가 앱을 탐색할 때 대상을 넣었다 뺐다 합니다.
 탐색 구성요소의 기본 NavHost 구현인 NavHostFragment는 프래그먼트 대상의 교환을 처리합니다.

- NavController : 
> 대상으로 이동하는 것은 NavController 객체를 사용하여 실행되며 이 객체는 NavHost 내에서 앱 탐색을 관리

- actions : 
> actions 대상 간의 논리적 연결입니다. actions 탐색 그래프에서 화살표로 표시됩니다. 일반적으로 actions 한 대상을 다른 대상에 연결하지만, 전역 작업을 만들어서 앱의 어디에서나 특정 대상으로 이동
대상으로 이동하는 것은 NavController 객체를 사용하여 실행되며 이 객체는 NavHost 내에서 앱 탐색을 관리합니다. 각 NavHost에는 그에 대응하는 NavController가 있습니다.

- safe-args : 

> 탐색 구성요소에는 Safe Args라는 Gradle 플러그인이 있어서 모든 연결된 인수에 대해 유형 안전성을 갖춘 탐색 및 액세스를 하기 위한 간단한 객체 및 빌더 클래스를 생성합니다. Safe Args는 유형 안전성을 보장하므로 데이터를 탐색하고 전달할 때는 Safe Args를 사용하는 것이 좋습니다. Gradle을 사용하지 않는 등의 일부 경우에서는 Safe Args 플러그인을 사용할 수 없습니다. 이럴 때는 번들을 사용하여 직접 데이터를 전달하면 됩니다.

- deep link :
> 딥 링크는 사용자를 앱의 특정 콘텐츠로 바로 연결하는 URL입니다. Android에서는 인텐트 필터를 추가하고 수신 인텐트에서 사용자를 올바른 활동으로 연결하기 위한 데이터를 추출하여 딥 링크를 설정합니다.

## Memo

### 1. @+id, @id 차이

@+id : 새로 추가되는 리소스 아이디
@id : 이미 추가된 리소스 아이디

### 2. pendingIntent

> PendingIntent는 Intent를 가지고 있는 클래스로, 기본 목적은 다른 애플리케이션(다른 프로세스)의 권한을 허가하여 가지고 있는 Intent를 마치 본인 앱의 프로세스에서 실행하는 것처럼 사용하게 하는 것입니다. 
> (출처: [찰스의 안드로이드](https://www.charlezz.com/?p=861))


