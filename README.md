# Проект по автоматизации тестирования сайта: ХХХХ
https://itigris.com
# Содержание:
- [x]	Технологии и инструменты
- [x]	Реализованные проверки
- [x]	Сборка в Jenkins
- [x]	Запуск из терминала
- [x]	Allure отчет
- []	Отчет в Telegram
- [x]	Видео примеры прохождения тестов

## :bird: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

В данном проекте автотесты написаны на Java с использованием тестового фреймворка Selenide для UI-тестов.
Для сборки проекта используется Gradle.
Библиотека для модульного тестирования: JUnit 5 
Selenoid демонстрирует пример запуска браузеров в контейнерах Docker.
Jenkins выполняет удаленный запуск тестов без использование IDEA .
Allure Report формирует наглядный графический  отчет о результатах  запуска тестов.
После завершения прогона тестов, специальный Telegram Bot отправляются в Telegram краткий вариант Allure Report 


## :bird: Реализованные проверки (Примеры UI тестов)


## Параметры сборки в Jenkins:
----------------------------------
Here is a simple footnote[^1].

A footnote can also have multiple lines[^2].  

You can also use words, to fit your writing style more closely[^note].

[^1]: My reference.
[^2]: Every new line should be prefixed with 2 spaces.  
  This allows you to have a footnote with multiple lines.
[^note]:
    Named footnotes will still render with numbers instead of the text but allow easier identification and linking.  
    This footnote also has been made with a different syntax using 4 spaces for new lines.
