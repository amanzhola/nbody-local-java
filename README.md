# 🌌 N-Body Simulation (Java)

<table>
  <tr>
    <td valign="top" width="50%">

## Project Goal

This project was created as part of learning:

- arrays
- loops
- file input
- basic physics
- Java graphics and animation

    </td>
    <td valign="top" width="50%">

## Overview

An educational Java project that simulates planetary motion under Newtonian gravity.

This project demonstrates:

- array-based data storage
- gravitational force calculation
- object motion updates
- 2D animation with images
- background audio playback

    </td>
  </tr>

  <tr>
    <td valign="top" width="50%">

## Project Structure

<pre>
nbody-local/
├─ src/
│  └─ NBodyLocal.java
├─ data/
│  ├─ 1body.txt
│  ├─ 3body.txt
│  ├─ 3body-zero-gravity.txt
│  ├─ 4body-zero-gravity.txt
│  ├─ 8star-rotation.txt
│  ├─ antimatter.txt
│  ├─ armageddon.txt
│  ├─ atom.txt
│  ├─ awesome.txt
│  ├─ binary.txt
│  ├─ binaryStars.txt
│  ├─ dance10.txt
│  ├─ entropy-universe.txt
│  ├─ galaxy.txt
│  ├─ kaleidoscope.txt
│  ├─ massive-squirrel-battle.txt
│  ├─ planets.txt
│  ├─ planets-elliptical.txt
│  ├─ planets-zero-gravity.txt
│  ├─ planetsparty.txt
│  └─ pluto.txt
├─ assets/
│  ├─ images/
│  │  ├─ starfield.jpg
│  │  └─ *.gif
│  └─ audio/
│     └─ 2001.wav
├─ lib/
│  └─ stdlib.jar
├─ docs/
├─ .gitignore
└─ README.md
</pre>

    </td>
    <td valign="top" width="50%">

## Features

- simulation of planetary motion
- animated space system
- planet rendering with image sprites
- background music playback
- multiple input scenarios (`planets.txt`, `galaxy.txt`, etc.)

    </td>
  </tr>
</table>

---

## Compilation

Compile the project from the repository root:

```bash
javac -cp ".;lib/stdlib.jar" -d out src/NBodyLocal.java
````

---

## Run

Example:

```bash
java -cp "out;lib/stdlib.jar" NBodyLocal 157788000.0 25000.0 < data/planets.txt
```

Another example:

```bash
java -cp "out;lib/stdlib.jar" NBodyLocal 157788000.0 25000.0 < data/galaxy.txt
```

---

## What the Program Demonstrates

* storing simulation data in arrays
* computing gravitational forces between bodies
* updating velocity and position over time
* rendering an animated 2D simulation
* using external assets such as images and audio

---

## File Update After Project Restructuring

After reorganizing the repository, resource paths in `NBodyLocal.java` were updated.

### Old paths

```java
File file = new File("2001.wav");
StdDraw.picture(0, 0, "starfield.jpg");
StdDraw.picture(px[i], py[i], image[i]);
```

### New paths

```java
File file = new File("assets/audio/2001.wav");
StdDraw.picture(0, 0, "assets/images/starfield.jpg");
StdDraw.picture(px[i], py[i], "assets/images/" + image[i]);
```

This keeps the repository clean and organized while preserving the original behavior of the program.

---

## Technologies

* Java
* StdDraw / StdIn (`stdlib.jar`)
* Java Sound API

---

## Author

**Amanzhol**

GitHub:
`https://github.com/amanzhola`

---

# 🌌 N-Body Simulation (Java) — Русская версия

Проект моделирует движение планет под действием гравитации по закону Ньютона.

Это учебная реализация **N-body simulation**, которая показывает:

* работу с массивами
* вычисление гравитационных сил
* анимацию движения объектов
* воспроизведение фоновой музыки

---

## 🎓 Цель проекта

Проект создан в процессе изучения:

* массивов
* циклов
* работы с файлами
* базовой физики
* графики в Java

---

## 🚀 Возможности программы

* моделирование движения планет
* анимация космической системы
* отображение планет через изображения
* фоновая музыка
* запуск разных сценариев из `.txt` файлов

---
## ⚙️ Компиляция

Запускать из корня проекта:

```bash
javac -cp ".;lib/stdlib.jar" -d out src/NBodyLocal.java
```

---

## ▶️ Запуск

Пример:

```bash
java -cp "out;lib/stdlib.jar" NBodyLocal 157788000.0 25000.0 < data/planets.txt
```

Ещё пример:

```bash
java -cp "out;lib/stdlib.jar" NBodyLocal 157788000.0 25000.0 < data/galaxy.txt
```

---

## 📚 Что демонстрирует программа

* использование массивов для хранения данных
* вычисление силы гравитации между телами
* обновление скорости и координат
* анимацию движения объектов
* работу с внешними ресурсами: изображениями и звуком

---
## 👨‍💻 Автор

**Amanzhol**

GitHub:
`https://github.com/amanzhola`

```
