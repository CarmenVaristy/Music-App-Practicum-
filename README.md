Music Playlist Manager App – README
 
1. Technologies Used
- Kotlin (programming language)
- Android Studio (IDE)
- XML (for layout design)
- YAML (not used in this app, but commonly found in configuration)
 
2. Definitions of Technologies
- Kotlin: A modern, expressive programming language used for Android app development.
- Android Studio: The official software tool used to build and test Android apps.
- XML (eXtensible Markup Language): Used for designing the user interface (UI) of Android apps.
- YAML (YAML Ain’t Markup Language): Often used in configuration files, but not used in this app.
 
3. Overview About the App
This is a simple two-screen Android app that helps users manage a playlist. Users can enter details about songs (title, artist, rating, comment), and the app saves up to 4 songs. Users can then view all saved songs and see the average rating.
 
4. Screen 1 – What It Does
**Purpose**: Allows users to input and add songs to a playlist.
 
**GUI Elements:**
- `EditText`: To enter song title, artist name, rating (1–5), and comments.
- `Button` 1: Adds the song to the playlist.
- `Button` 2: Navigates to the detail screen.
- `Button` 3: Exits the app.



<img width="240" alt="image" src="https://github.com/user-attachments/assets/b45ba989-1e1a-4eab-887f-4919904a9a31" />

 
**Code Summary**: The code checks if all fields are filled in, ensures rating is valid (1–5), and prevents adding more than 4 songs. Data is stored in parallel arrays.


<img width="254" alt="image" src="https://github.com/user-attachments/assets/84c48056-64ad-4906-9cf2-f511f919d7f6" />

<img width="318" alt="image" src="https://github.com/user-attachments/assets/4ace7502-e0d7-4217-a053-45676c39e199" />


 <img width="314" alt="image" src="https://github.com/user-attachments/assets/860dd58c-21bb-4d00-bcab-7eb7ff3bf2ce" />



5. Screen 2 – What It Does
Purpose: Displays playlist songs and calculates average rating.

GUI Elements:
- `TextView`: Displays results to the user.
- `Button` 1: Shows all song details using a loop.
- `Button` 2: Calculates and shows average rating.
- `Button` 3: Returns to the first screen.

  <img width="266" alt="image" src="https://github.com/user-attachments/assets/b02c50e4-52e9-49ed-a577-0be1b35213ad" />


 
**Code Summary**: Uses `for` loops to display song info and compute the average rating. Checks if the list is empty to avoid crashes.
 

<img width="282" alt="image" src="https://github.com/user-attachments/assets/65c64a6f-8b8f-4395-89b4-aefae0ab287e" />


<img width="265" alt="image" src="https://github.com/user-attachments/assets/80d33f22-1ce4-4587-8788-15fcc38282c5" />


<img width="263" alt="image" src="https://github.com/user-attachments/assets/1fe86791-b79a-49d3-adbf-d07be6fecfeb" />



6. Summary
App is running well on the emulator. 
This app uses basic Android concepts such as EditText, Buttons, screen navigation, and input validation. It practices using parallel arrays and loops to manage small data sets like song info. The structure is clean, easy to follow, and good for beginner developers.

<img width="334" alt="image" src="https://github.com/user-attachments/assets/50e61617-4bb1-4e7c-81bd-5e85938f4ccb" />

 
<img width="304" alt="image" src="https://github.com/user-attachments/assets/129733a0-0076-4583-b872-8142f259b28e" />

 
7. Harvard Style References 
- Google Developers. (n.d.). *Build your first app*. Available at: https://developer.android.com/training/basics/firstapp [Accessed 19 Jun. 2025].
- Android Developers. (n.d.). *Layouts*. Available at: https://developer.android.com/guide/topics/ui/declaring-layout [Accessed 19 Jun. 2025].
- Kotlin Documentation. (n.d.). *Collections Overview*. Available at: https://kotlinlang.org/docs/collections-overview.html [Accessed 19 Jun. 2025].
- Vogella. (n.d.). *Android Intents - Tutorial*. Available at: https://www.vogella.com/tutorials/AndroidIntent/article.html [Accessed 19 Jun. 2025].
