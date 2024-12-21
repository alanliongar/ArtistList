# Artist List
This project is a native Android application developed using the Kotlin programming language. Initially designed to learn the basic principles of Jetpack Compose, the app now features enhanced functionality, a detailed UI, and an organized structure inspired by the MVVM architecture.

## ✨ Features
 - Artist Listing: Displays a list of artists with their names, descriptions, last seen online status, and associated artwork.
 - Detail Screen: Explore detailed information about each artist, including their description and full artwork.
 - Interactive UI: Clickable artist entries to navigate or trigger callbacks.
 - Dynamic Design: Beautiful and responsive design inspired by modern art, featuring custom fonts and a unique color palette.

## :camera_flash: Screenshots

<p float="left"> 
<img src="https://github.com/alanliongar/ArtistList/blob/master/Screen01.png" width=260/>
<img src="https://github.com/alanliongar/ArtistList/blob/master/Screen02.png" width=260/>
</p>

## 🛠 Technologies
 - Kotlin
- Jetpack Compose
- Column
- Row
- Image
- Modifier
- Spacer
- LazyColumn
- ComposePreview

## Architecture
 - MVVM-inspired structure: Organized codebase for better readability and maintainability.


## Testing
 - UI Testing with Jetpack Compose:
 - Custom testTag for identifying UI components.
 - Test cases for title display, artist list rendering, and click callbacks.
 - Assertions for UI correctness using assertTextEquals and isDisplayed.


## Design
 - Custom Fonts and Colors: Inspired by modern art to match the app's artistic theme.
 - Customizable Themes: Adjusted through Color.kt, Theme.kt, and Type.kt for dynamic UI styling.


## 🚀 Getting Started
## Prerequisites
1. Android Studio Flamingo or later.
2. Basic understanding of Kotlin and Jetpack Compose.


## How to Build
1. Clone the repository.
2. Open the project in Android Studio.
3. Sync Gradle files and run the app on an emulator or device.

## 🧪 Testing
Run the following command in Android Studio to execute the tests:
1. Navigate to ArtistListTest.kt.
2. Right-click on the file and select Run Tests.
3. Observe the results for UI validations and callback assertions.

## License
```
The MIT License (MIT)

Copyright (c) 2024 Alan Lucindo Gomes

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
