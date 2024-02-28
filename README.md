# Проект по автоматизации тестирования мобильного приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia/)
<p align="center">
<img alt="litres" src="src/media/screenshots/mainPageMobile.JPG">
</p>

## :scroll: Содержание:
* <a href="#tools">Используемый стек</a>
* <a href="#cases">Примеры автоматизированных тест-кейсов</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>
* <a href="#telegram">Уведомление в Telegram при помощи бота</a>
* <a href="#video">Примеры видео выполнения тестов на BrowserStack</a>


<a id="tools"></a>
## :computer:<a name="Используемый стек">**Используемый стек:**</a>

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="src/media/logo/Java.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="src/media/logo/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="src/media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="src/media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="src/media/logo/GitHub.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="src/media/logo/Selenoid.svg"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="src/media/logo/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="src/media/logo/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="src/media/logo/Jenkins.svg"></a>
<a href="https://web.telegram.org/a/"><img width="6%" title="Telegram" src="src/media/logo/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img width="5%" title="Jira" src="src/media/logo/Jira.svg"></a>
<a href="https://appium.io/docs/en/2.4/"><img width="6%" title="Appium" src="src/media/logo/Appium.svg"></a>
<a href="https://www.browserstack.com/"><img width="6%" title="BrowserStack" src="src/media/logo/Browserstack.svg"></a>
  
</p>


<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов для запуска на локальном эмуляторе">**Примеры автоматизированных тест-кейсов для запуска на локальном эмуляторе:**</a>

- ✓ *Проверка поиска*
- ✓ *Проверка открытия статьи*
- ✓ *Проверка описание статьи*

- ## <a name="Примеры автоматизированных тест-кейсов для запуска на BrowserStack">**Примеры автоматизированных тест-кейсов для запуска на BrowserStack:**</a>

- ✓ *Проверка поиска*
- ✓ *Проверка открытия статьи*


<a id="console"></a>
## :keyboard: Запуск автотестов

***Локальный запуск тестов:***

Из корневой директории проекта выполнить:
```
gradle clean remote_test -DdeviceHost=remote  - запуск тестов на BrowserStack
gradle clean local_test -DdeviceHost=local    - запуск тестов на локальном эмуляторе

```
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="src/media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Удаленный запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/student-dchizhova68-qa_guru23_jenkins_mobile_test/)</a>

Для запуска сборки необходимо нажать кнопку <code>Build Now</code>.

<a id="allure"></a>
## <img width="4%" style="vertical-align:middle" title="Allure Report" src="src/media/logo/Allure.svg"> </a> Пример  [Allure-отчета](https://jenkins.autotests.cloud/job/student-dchizhova68-qa_guru23_jenkins_mobile_test/10/allure/) </a>  
Дождаться выполнения сборки. нажать на кнопку "Allure Report"

![jenkins](src/media/screenshots/AllureReport1Mobile.png "Отчет")

Пример Allure Report: 
![jenkins](src/media/screenshots/AllureReportMobile.JPG "Пример отчета")

<a id="allure-testops"></a>
## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="src/media/logo/Allure_TO.svg"> </a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4084/test-cases) </a> 

Реализована интеграция с <code>Allure TestOps</code>. Есть возможность просмотре результата выполнения автотестов и создания ручных тестов. 

<p align="center">
<img title="Allure TestOps DashBoard" src="src/media/screenshots/AllureTestOpsMobile.JPG">
</p>


<a id="jira"></a>
## <img width="4%" style="vertical-align:middle" title="Jira" src="src/media/logo/Jira.svg"> </a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1130) </a> 

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в задаче отображаются связные автотесты и результат их выполнения.

<p align="center">
<img title="Jira Task" src="src/media/screenshots/JiraTaskMobile.JPG">
</p>


<a id="telegram"></a>
## <img width="4%" style="vertical-align:middle" title="Telegram" src="src/media/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

Результаты выполнения автотестов отправляются в Telegram.

<p align="center">
<img width="70%" title="Telegram Notifications" src="src/media/screenshots/TelegramBoMobilet.JPG">
</p>


<a id="video"></a>
## <img width="4%" style="vertical-align:middle" title="Selenoid" src="src/media/logo/Selenoid.svg"> Видео примера запуска тестов на BrowserStack

В отчетах Allure для каждого теста прикреплено видео прохождения теста 
<p align="center">
  <img title="Selenoid Video" src="src/media/screenshots/test_videoMobile.gif">
</p>
