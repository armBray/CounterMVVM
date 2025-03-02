# CounterMVVM

![License](https://img.shields.io/badge/license-MIT-blue)
![Platform](https://img.shields.io/badge/platform-Android-green)
![Kotlin](https://img.shields.io/badge/language-Kotlin-orange)

## Overview

The **CounterMVVM** is a simple Android application demonstrating the Model-View-ViewModel (MVVM) architectural pattern using Jetpack Compose. It features a basic counter that can be incremented or decremented, showcasing the separation of concerns and data-binding capabilities inherent in MVVM.

## Features

- **MVVM Architecture**: Implements the MVVM design pattern to separate the UI (View) from the business logic (ViewModel) and data (Model).
- **Jetpack Compose**: Utilizes Jetpack Compose for declarative UI development.
- **Counter Functionality**: Allows users to increment and decrement a counter value.

## Technologies Used

- **Kotlin**: The programming language used for Android development.
- **Jetpack Compose**: Android’s modern toolkit for building native UI.
- **MVVM**: Architectural pattern that enhances testability and maintainability.

## How It Works

1. **View (UI Layer)**: Displays the current counter value and provides buttons to increment or decrement the count.
2. **ViewModel**: Contains the logic for updating the counter and exposes the current count to the View.
3. **Model**: Represents the data layer, which in this simple app is just the counter value.

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/armBray/CounterMVVM.git
