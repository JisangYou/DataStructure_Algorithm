WorkManager Codelab
===================================

This repository contains the code for the [WorkManager Codelab](https://codelabs.developers.google.com/codelabs/android-workmanager):

Kotlin version
--------------

The Kotlin version of this codelab is available under the `Kotlin` branch of
this repository.

Introduction
------------

At I/O 2018 Google annouced [Android Jetpack](https://developer.android.com//jetpack/),
a collection of libraries, tools and architectural guidance to accelerate and simplify the
development of great Android apps. One of those libraries is the
[WorkManager library](https://developer.android.com/topic/libraries/architecture/workmanager/).
The WorkManager library provides a unified API for deferrable one-off or recurring background tasks
that need guaranteed execution. You can learn more by reading the
[WorkManager Guide](https://developer.android.com/topic/libraries/architecture/workmanager/), the
[WorkManager Reference](https://developer.android.com/reference/androidx/work/package-summary)
or doing the
[WorkManager Codelab](https://codelabs.developers.google.com/codelabs/android-workmanager).

Pre-requisites
--------------

* Android Studio 3.1 or later and you know how to use it.

* Make sure Android Studio is updated, as well as your SDK and Gradle.
Otherwise, you may have to wait for a while until all the updates are done.

* A device or emulator that runs API level 16+

You need to be solidly familiar with the Java programming language,
object-oriented design concepts, and Android Development Fundamentals.
In particular:

* Basic layouts and widgets
* Some familiarity with Uris and File I/O
* Familiarity with [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
  and [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)

Getting Started
---------------

1. [Install Android Studio](https://developer.android.com/studio/install.html),
if you don't already have it.
2. Download the sample.
2. Import the sample into Android Studio.
3. Build and run the sample.

Notes
-----

On Android Studio 3.1, when opening the project, you may see the error:

> Configuration on demand is not supported by the current version of the Android
Gradle plugin since you are using Gradle version 4.6 or above. Suggestion:
disable configuration on demand by setting `org.gradle.configureondemand=false`
in your gradle.properties file or use a Gradle version less than 4.6.

This is a known issue with the Android Gradle Plugin 3.0.x and 3.1.x. [You can
follow this workaround to fix the
issue.](https://developer.android.com/studio/known-issues#known_issues_with_the_android_gradle_plugin)

License
-------

Copyright 2018 Google, Inc.

All image and audio files (including *.png, *.jpg, *.svg, *.mp3, *.wav
and *.ogg) are licensed under the CC BY 4.0 license. All other files are
licensed under the Apache 2 license.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the LICENSE file distributed with this work for
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


## Project Structure 요약

- WorkerUtils: This class contains the code for actually blurring, and a few convenience methods which you'll use later to display Notifications and slow down the app.
- BlurActivity*: The activity which shows the image and includes radio buttons for selecting blur level.
- BlurViewModel*: This view model stores all of the data needed to display the BlurActivity. It will also be the class where you start the background work using WorkManager.
- Constants: A static class with some constants you'll use during the codelab.
- SelectImageActivity: The first activity which allows you to select an image.
- res/activity_blur.xml and res/activity_select.xml: The layout files for each activity.

## 학습 목표

Adding WorkManager to your Project
Scheduling a OneOffWorkRequest
Input and Output parameters
Chaining work together WorkRequests
Naming Unique WorkRequest chains
Tagging WorkRequests
Displaying WorkInfo in the UI
Cancelling WorkRequests
Adding constraints to a WorkRequest


## 학습 review

- WorkManager는 앱이 종료되거나 기기가 다시 시작되는 경우에도 지연 가능(즉시 실행될 필요가 없음)하고 안정적으로 실행되어야 하는 작업을 대상으로 설계
(백엔드 서비스에 로그 또는 분석을 전송, 주기적으로 애플리케이션 데이터를 서버와 동기화) 

- WorkManager를 사용하면 정교한 작업 요청을 쉽게 설정하고 예약 
지정된 순서로 실행되는 체인으로 연결된 시퀀스 작업
앱이 이름이 동일한 두 시퀀스를 시작하는 경우의 상황과 관련된 규칙을 포함하는 고유 명명 시퀀스
값을 전달하고 반환하는 작업(각 작업이 체인 내의 다음 작업에 인수를 전달하는, 체인으로 연결된 작업 포함)

- OneTimeWorkRequest 개체 세 개(workA, workB, workC)가 있으며 이 순서로 작업을 실행해야 한다고 가정

```
  WorkManager.getInstance(myContext)
        .beginWith(workA)
            // Note: WorkManager.beginWith() returns a
            // WorkContinuation object; the following calls are
            // to WorkContinuation methods
        .then(workB)    // FYI, then() returns a new WorkContinuation instance
        .then(workC)
        .enqueue()
```

- WorkContinuation을 사용하여 복잡한 체인 연결 작업을 설정할 수 있음.

[workmanager-chain](./readmeResource/workmanager-chain.svg)

- beginWith(OneTimeWorkRequest) 대신 beginUniqueWork(String, ExistingWorkPolicy, OneTimeWorkRequest)를 호출하여 시퀀스를 만들기 시작하여 고유 작업 시퀀스를 만들 수 있습니다.
고유 작업 시퀀스마다 이름을 가지며, WorkManager는 한 번에 특정 이름의 작업 시퀀스 하나만 허용합니다. 
새 고유 작업 시퀀스를 만들 때는 같은 이름의 미완료 시퀀스가 이미 있는 경우 WorkManager에서 어떻게 처리할지 지정합니다.

REPLACE: 기존 시퀀스를 취소하고 새 시퀀스로 교체함
KEEP: 기존 시퀀스를 유지하고 새 요청을 무시함
APPEND: 새 시퀀스를 기존 시퀀스에 추가함(기존 시퀀스의 마지막 작업을 완료한 후에 새 시퀀스의 첫 번째 작업 실행)

