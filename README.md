# CoffeeApp

A Simple Coffee Store Android Application which has been implemented using Clean Architecture alongside MVVM design to (send\store\retrieve) requestes to end from  backend.  
<br/>

### The App Scenario:

After ordering a coffee from your device, they will be saved in database and will be displayed in a cart. Besides when a menu item
is clicked, the coffee order will be appear and you can choose cub size and amount of sugar with increase in price.  
user can login or create new account authentication action is saved in Data Store .

<br/>

### The architecture which implemented:


<br>
<p align="center">
  <img alt="Light" src="https://user-images.githubusercontent.com/73083104/190846039-870e2f16-77c7-496b-a393-c060662aad74.png" width="45%">
&nbsp; &nbsp; &nbsp; &nbsp;
  <img alt="Dark" src="https://user-images.githubusercontent.com/73083104/190846037-5f832f19-66f2-4a69-b579-20683fb9ca64.png" width="45%">
</p>


## Built With
* [Kotlin](https://kotlinlang.org) - As a programming language.
* [Room Database ](https://developer.android.com/jetpack/androidx/releases/room) As a local database for saveing user orders .
* [Coroutines](https://developer.android.com/kotlin/coroutines) - For multithreading while handling requests to the server and local database.
* [Model-View-ViewModel(MVVM)](https://developer.android.com/topic/architecture) - Offers an implementation of observer design pattern.
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - notifies views of any database changes in an observer way.
* [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java
* [Glide](https://github.com/bumptech/glide) - It is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - It is arguably the most used Dependency Injection, or DI, framework for Android. Many Android projects use Dagger to simplify building and providing dependencies across the app. It gives you the ability to create specific scopes, modules, and components, where each forms a piece of a puzzle: The dependency graph.
* [Clean Architecture](https://www.raywenderlich.com/3595916-clean-architecture-tutorial-for-android-getting-started) - Applying Clean Architecture and Solid Principles to build a robust, maintainable, and testable application.

# Screens
 
|  **Splash**| **Welcome First** |**Welcome Second**|
|--|--|--|
| <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190842969-7995a848-5e84-48da-87bd-511d9c614a0b.png" width="60%"> </p> | <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843010-78c3da66-8e3c-4b8d-9486-e75e924a95ed.png" width="60%"> </p> |<p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843036-b3a12690-1777-47fa-a165-08090e323852.png" width="60%"> </p>|

   
|  **Cart**| **Menu** |**Settings**|
|--|--|--|
| <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843159-fc9caf88-5839-4be6-aadf-065177735246.png" width="60%"> </p> | <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843167-7760e923-f8c8-4fac-a64b-e009436c082f.png" width="60%"> </p> |<p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843169-4d25e29c-825b-4329-ba52-233d858dcb4c.png" width="60%"> </p>|


   
|  **Order**| **Navigation** | 
|--|--|
| <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843300-529d5cdd-e74d-4b8f-8f28-413346b770d2.png" width="60%"> </p> | <p align="center"> <img src="https://user-images.githubusercontent.com/73083104/190843303-438e01e8-d41b-4bd4-9292-1dd7535e9457.png" width="60%">
  
