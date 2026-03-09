# 🌌 N-Body Simulation (Java)

<table>
  <tr>
    <td valign="top" width="50%">
      <h2>Project Goal</h2>
      <p>This project was created as part of learning:</p>
      <ul>
        <li>arrays</li>
        <li>loops</li>
        <li>file input</li>
        <li>basic physics</li>
        <li>Java graphics and animation</li>
      </ul>
    </td>
    <td valign="top" width="50%">
      <h2>Overview</h2>
      <p>An educational Java project that simulates planetary motion under Newtonian gravity.</p>
      <p>This project demonstrates:</p>
      <ul>
        <li>array-based data storage</li>
        <li>gravitational force calculation</li>
        <li>object motion updates</li>
        <li>2D animation with images</li>
        <li>background audio playback</li>
      </ul>
    </td>
  </tr>

  <tr>
    <td valign="top" width="50%">
      <h2>Project Structure</h2>
      <pre>nbody-local/
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
└─ README.md</pre>
    </td>
    <td valign="top" width="50%">
      <h2>Features</h2>
      <ul>
        <li>simulation of planetary motion</li>
        <li>animated space system</li>
        <li>planet rendering with image sprites</li>
        <li>background music playback</li>
        <li>multiple input scenarios (<code>planets.txt</code>, <code>galaxy.txt</code>, etc.)</li>
      </ul>
    </td>
  </tr>
</table>

---

## Compilation

Compile the project from the repository root:

```bash
javac -cp ".;lib/stdlib.jar" -d out src/NBodyLocal.java
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

## Technologies

* Java
* StdDraw / StdIn (`stdlib.jar`)
* Java Sound API

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
`https://github.com/amanzhola
