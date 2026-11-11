# Workshop 6 - Java Collections and OOP Concepts

This repository contains the Java solutions for Workshop 6.

## Requirements

- Java 21 or later
- A terminal or any Java IDE such as Visual Studio Code

## Compile

From the repository root:

```powershell
javac -encoding UTF-8 -d out src\*.java
```

## Run

Run each exercise separately:

```powershell
java -cp out Ex01FavoriteSongs
java -cp out Ex02FavoriteSongsSorted
java -cp out Ex03ReverseWords
java -cp out Ex04DecodeMessage
java -cp out Ex05SearchEngine
java -cp out Ex06IdentifyMyPartsApp
java -cp out Ex07BoxesDriver
```

On Windows, use `chcp 65001` before running Exercise 7 if the Unicode horizontal-line character is not displayed correctly.

## Exercise files

| Exercise | Entry point |
| --- | --- |
| 1 | `src/Ex01FavoriteSongs.java` |
| 2 | `src/Ex02FavoriteSongsSorted.java` |
| 3 | `src/Ex03ReverseWords.java` |
| 4 | `src/Ex04DecodeMessage.java` |
| 5 | `src/Ex05SearchEngine.java` |
| 6 | `src/Ex06IdentifyMyPartsApp.java` |
| 7 | `src/Ex07BoxesDriver.java` |

Exercises 6 and 7 also use the supporting classes `src/IdentifyMyParts.java` and `src/Boxes.java`.

## Notes

The `javac -Xlint:all` warnings in Exercise 6 are intentional. The worksheet
accesses the static variable `x` through object references to demonstrate that
all instances share the same class variable.
