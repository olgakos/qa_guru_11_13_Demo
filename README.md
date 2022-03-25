# Проект по автоматизации тестирования сайта: ХХХХ
:earth_americas: https://itigris.com

# Содержание:
- [x]	Технологии и инструменты
- [x]	Реализованные проверки
- [x]	Сборка в Jenkins
- [x]	Запуск из терминала
- [x]	Allure отчет
- []	Отчет в Telegram
- [x]	Видео примеры прохождения тестов

- [Технологии и инструменты](#watermelon-технологии-и-инструменты)
- [Реализованные проверки](#watermelon-Реализованные-проверки)
- [Сборка в Jenkins](#watermelon-Jenkins-job)
- [Запуск из терминала](#watermelon-Запуск-тестов-из-терминала)
- [Allure отчет](#watermelon-Allure-отчет)
- [Отчет в Telegram](#watermelon-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#watermelon-Примеры-видео-о-прохождении-тестов)

## :watermelon: Технологии и инструменты

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

Перечень технологий и инструментом, использованных при реализации этого проекта:

- автотесты написаны на языке Java
- для UI-тестов используется тестовый фреймворк Selenide
- Для сборки проекта используется Gradle.
- Библиотека для модульного тестирования: JUnit 5 
- Selenoid демонстрирует пример запуска браузеров в контейнерах Docker (и записывает видео).
- Jenkins выполняет удаленный запуск тестов в визуальном-онлайн интерфейсе. Установки дополнительных приложений на компьютер пользователя не требуется. 
- Allure Report формирует наглядный графический отчет о результатах  запуска тестов.
- После завершения прогона тестов, специальный Telegram Bot отправляются в Telegram краткий вариант Allure Report 

## :watermelon: Реализованные проверки (Примеры UI тестов)
- провекрка текста 
- ✓ запоелнре формы обратной связи
- поиск товара в каталоге

## :japanese_ogre: Запуск тестов из терминала

Для запуска тестов из терминала (встроенного в среду разработки или вашегой компьютра): 
Локальный запуск:
```
gradle clean test
```

Удаленный запуск: (расшифровку пареметров см. ниже)
```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-Dsize=${BROWSER_SIZE}
-Durl=${REMOTE_URL}
```

## :watermelon: Сборка в Jenkins с параметрами

1. Перейдите на страницу сборки тестового проекта по ссылке:  ХХХ
2. Перечисленне ниже параметы можно менять в графическом интервейсе Jenkins.
3. Запустите выполение тестов кнопкой "Собрать с параметрами" 

- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 91.0)
- size (размер окна браузера, по умолчанию 1920x1080)
- remoteUrl (логин, пароль и адрес удаленного сервера selenoid)

 ## :watermelon: Allure отчет
 
После того, как тесты запущены на выполение и были завершены, можно получить визуальный Allure отчет. Это можно сделать разными способами:
1. Найти ссылку в настройках среды разработки IDEA
2. После выполнения сборки в Jenkins нажать иконку Allure: 


Главная страница Allure-отчета содержит следующие информационные блоки:

* ALLURE REPORT отображает: Дату и время прохождения теста. Общее количество пройденных кейсов. Диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов
•	  TREND - отображает тренд прохождения тестов от сборки к сборке
•	  SUITES - отображает распределение результатов тестов по тестовым наборам
•	  ENVIRONMENT - отображает тестовое окружение, на котором запускались тесты (в данном случае информация не задана)
•	  CATEGORIES - отображает распределение неуспешно прошедших тестов по видам дефектов
•	  FEATURES BY STORIES - отображает распределение тестов по функционалу, который они проверяют
•	  EXECUTORS - отображает исполнителя текущей сборки (ссылка на сборку в Jenkins)

<p align="center">
<img title="Allure Graphics" src="images/screens/Screenshot_ХХХ.png">
</p>

## :watermelon:  Видео прохождения тестов на Selenoid
К каждому тесту в отчете прилагается автоматически сгенерирвоанное видео. Пример видео:

<p align="center">
<img title="Видео прохождения тестов на Selenoid" src="images/screens/Screenshot_ХХХ.png">
</p>

## :bellhop_bell: <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/></a> Уведомление в Telegram при помощи бота
После завершения сборки специальный Telegram-бот, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.
Чтобы после запуска тестов получть уведомление, встепите в групп ***

<p align="center">
<img title="Telegram Bot" src="images/screens/Screenshot_ХХХ.png">
</p>

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
