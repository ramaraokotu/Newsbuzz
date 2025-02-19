# NewsBuzz App 📱
The NewsBuzz app is a modern Android application built with a focus on maintainability, testability, scalability, simplicity, and performance. By leveraging Clean Architecture and MVVM principles, the project ensures a well-structured and modular codebase that enhances code reusability and separation of concerns.

## Key Features

- **Multi-Module Architecture:** Designed with a modular project structure for better separation of responsibilities, improved build times, and scalability.
- **Jetpack Compose:** Utilizes the latest declarative UI toolkit for Android to build responsive, beautiful, and fast UIs.
- **Kotlin:** Programming language used.
- **Paging3:** Seamless data loading with efficient pagination for better performance in handling large datasets.
- **Retrofit & Dagger Hilt:** Retrofit for networking and Dagger Hilt for dependency injection, ensuring a clean, testable, and maintainable codebase.
- **Coroutines:** Asynchronous operations powered by Kotlin Coroutines, promoting simplicity and optimal performance.
- **Unit Tests:** Ensures robust code coverage.
- **Navigation:** Allows smooth transitions between screens.

## Features Implemented

- Display news articles in a list format.
- View detailed news articles in a WebView.
- Handle various states including network errors, no data available, and unknown errors.

### Project Structure

#### [`Data Module `](/data)

Manages application data, including remote sources, and relies on the domain layer for contracts. Tests for the PagingSource are implemented here.

#### [`Domain Module `](/domain)

Contains business logic, including repositories, models, and use cases. Tests for use cases are conducted in this layer.

#### [`Presentation Module `](/presentation)

Includes screens and their ViewModels, following the MVVM pattern. Uses separate data models for the presentation layer, distinct from domain models.

Here's a breakdown of the module dependencies:
- `app` depends on `data`, `domain`, `presentation`.
- `presentation` depends on `domain`,`data`.
- `data` depends on `domain`.

### Testing
- Tested the PagingSource in the data layer.
- Validated the use cases in the domain layer.
- Conducted tests on the view models in the presentation layer.
- Performed UI tests in the presentation layer.
- Implemented tests for navigation.

### Dependency Use
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - A modern toolkit for building native user interfaces.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) -  A dependency injection library that simplifies the process of manual dependency injection.
- [Coil](https://coil-kt.github.io/coil/) - An image loading library for Android that uses Kotlin Coroutines.
- [Type Safe Navigation](https://developer.android.com/guide/navigation/design/type-safety) -  Ensures type safety in Kotlin DSL and Navigation Compose.
- [Coroutines](https://developer.android.com/kotlin/coroutines) - Manages background threads with simplified code and minimizes the need for callbacks.
- [Flow](https://kotlinlang.org/docs/flow.html) - An asynchronous data stream that emits values sequentially and completes normally or with an exception.
- [Paging](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) -  A library for loading and displaying data from larger datasets, either locally or from the network.
- [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization) - A multiplatform serialization library for Kotlin.
- [Truth](https://truth.dev/) - A library for fluent assertions in Java and Android testing.
- [Turbine](https://github.com/cashapp/turbine) - A small testing library for Kotlin Coroutines Flow.

## How to Run the Project

- Clone the Repository:
```
git clone https://github.com/ramaraokotu/NewsBuzz
cd NewsBuzz
```
- Build and run the NewsBuzz.

### Screenshots
<p>
  <img alt="screenshot1" src="https://github.com/ramaraokotu/NewsBuzz/blob/main/news_list_screen.png?raw=true" width="300"> 
  <img alt="screenshot2" src="https://github.com/ramaraokotu/NewsBuzz/blob/main/news_item_webview.png?raw=true" width="300"><br>
  <img alt="screenshot3" src="https://github.com/ramaraokotu/NewsBuzz/blob/main/no_network.png?raw=true" width="300">
  <img alt="screenshot4" src="https://github.com/ramaraokotu/NewsBuzz/blob/main/no_news.png?raw=true" width="300">
</p> 

---
## License

```
Copyright 2024 Ramarao Kotu

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

