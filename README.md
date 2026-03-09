# 🌌 N-Body Simulation (Java)

An educational Java project that simulates planetary motion under Newtonian gravity.

This project demonstrates:

- array-based data storage
- gravitational force calculation
- object motion updates
- 2D animation with images
- background audio playback

---

## Project Goal

This project was created as part of learning:

- arrays
- loops
- file input
- basic physics
- Java graphics and animation

---

## Features

- simulation of planetary motion
- animated space system
- planet rendering with image sprites
- background music playback
- multiple input scenarios (`planets.txt`, `galaxy.txt`, etc.)

---

## Project Structure

```text
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
│  │  ├─ *.gif
│  └─ audio/
│     └─ 2001.wav
├─ lib/
│  └─ stdlib.jar
├─ docs/
├─ .gitignore
└─ README.md
---

# 🌌 N-Body Simulation (Java)

Проект моделирует движение планет под действием гравитации по закону Ньютона.

Это учебная реализация **N-body simulation**, которая показывает:

* работу с **массивами**
* вычисление **гравитационных сил**
* **анимацию** движения объектов
* воспроизведение **фоновой музыки**

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

---

## 📂 Структура проекта

```
NBodyLocal.java   — основной код симуляции  
planets.txt       — начальные данные системы  
starfield.jpg     — фон космоса  
*.gif             — изображения планет  
2001.wav          — фоновая музыка  
stdlib.jar        — библиотека для StdDraw и StdIn  
```
---

## Project Structure

```text
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
│  │  ├─ *.gif
│  └─ audio/
│     └─ 2001.wav
├─ lib/
│  └─ stdlib.jar
├─ docs/
├─ .gitignore
└─ README.md
---

## ⚙️ Компиляция

```bash
javac -cp ".;stdlib.jar" NBodyLocal.java
```

---

## ▶️ Запуск

```bash
java -cp ".;stdlib.jar" NBodyLocal 157788000.0 25000.0 < planets.txt
```

---

## 📚 Что демонстрирует программа

* использование **массивов для хранения данных**
* вычисление силы гравитации
* обновление скорости и координат
* анимацию движения

---

## 👨‍💻 Автор

Amanzhol

GitHub:
https://github.com/amanzhola
