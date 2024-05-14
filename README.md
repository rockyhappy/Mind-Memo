# Clean Notes App

Clean Notes App is an Android application built using clean architecture principles and MVVM architecture pattern in Jetpack Compose. It leverages Room database to persist notes locally on the device. The app allows users to create, edit, delete, and sort notes based on date, color, and alphabetical order.

## Features

- **CRUD Operations**: Clean Notes App supports Create, Read, Update, and Delete operations for managing notes efficiently. Users can easily create new notes, view existing notes, update their contents, and delete notes they no longer need.

- **Sorting**: The app provides powerful sorting options, allowing users to organize their notes according to different criteria:
  - **Date**: Users can sort notes by their creation or modification dates, helping them prioritize recently added or updated notes.
  - **Color**: Notes can be sorted based on their color, enabling users to group notes with similar themes or categories together.
  - **Alphabetical Order**: Clean Notes App supports sorting notes alphabetically in both increasing and decreasing order, facilitating quick access to specific notes based on their titles.

- **Clean Architecture**: The app is designed following the principles of clean architecture, promoting modularity, maintainability, and testability. It separates concerns into distinct layers, such as presentation, domain, and data, ensuring a clear separation of responsibilities and facilitating easier code maintenance and scalability.

- **MVVM Architecture**: Clean Notes App adopts the Model-View-ViewModel (MVVM) architecture pattern, which enhances the separation of concerns by isolating the user interface (View) from the business logic (ViewModel) and underlying data (Model). This architecture improves code organization, testability, and maintainability, making it easier to develop and evolve the application over time.

- **Jetpack Compose**: The app utilizes Jetpack Compose, a modern UI toolkit for building native Android apps with declarative components. Jetpack Compose simplifies UI development by enabling developers to describe the app's UI hierarchy and behavior using concise and intuitive Kotlin code, resulting in a more productive and enjoyable development experience.

- **Room Database**: Clean Notes App leverages Room database for local storage of notes, ensuring data persistence across app sessions and device reboots. Room provides an abstraction layer over SQLite, making it easier to work with relational databases in Android apps while offering robust support for data integrity and performance.

## Tech Stack

- Kotlin
- Android Jetpack (Compose, ViewModel, LiveData, Room)
- Clean Architecture
- Model-View-ViewModel (MVVM) architecture pattern

## Setup

To run the app locally, follow these steps:

1. Clone the repository:

```bash
git clone <repository_url>
```

## Usage
Once the app is running, you can perform the following actions:

- Create Note: Tap on the "Add" button to create a new note. Enter the note details and save it.
- Edit Note: Tap on a note to edit its contents. Make changes and save them.
- Delete Note: Swipe left or right on a note to delete it.
- Sort Notes: Use the sorting options provided to sort notes by date, color, or alphabetical order in increasing or decreasing order.


## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (git checkout -b feature/your-feature-name).
3. Make your changes.
4. Commit your changes (git commit -m 'Add some feature').
5. Push to the branch (git push origin feature/your-feature-name).
6. Create a new Pull Request.
