# Это репозиторий для сдачи домашних заданий по курсу ООП 

## Директория Seminar1
Содержит в себе директорию Tree которая содержит в себе классы:
* Program - Пользовательский файл с точкой входа;
* Relationship - Перечисление, включающее в себя роли родственников;
* Person - Класс отдельного человека;
* Node - Класс, определяющий роли двух людей;
* GeoTree - Класс хранилище всех данных о ролях в генеологическом дереве;
* Reserch - Класс, оперирующий данными класса GeoTree для поиска конкретных людей, связанных конкретными ролями.  

## Директория Seminar2
Содержит в себе директорию tree которая содержит в себе классы и интерфейс:
* Program - Пользовательский файл с точкой входа;
* Relationship - Перечисление, включающее в себя роли родственников;
* Person - Класс отдельного человека;
* Node - Класс, определяющий роли двух людей;
* GeoTree - Класс наследник от GeoTreeable;
* GeoTreeable - интерфейс генеологического древа;
* Reserch - Класс, оперирующий данными класса GeoTree для поиска конкретных людей, связанных конкретными ролями. 

Содержит в себе директорию simulationMage которая содержит в себе классы:
* Mage - абстрактный класс, который содержит в себе характеристики обычного волшебника, со шкалой здоровья, маны, уровня и реализующий обычный действия вроде отдыха, дефолтного каста маны (будет применяться для более сложных заклинаний), поднятия уровня, получения информации о персонаже.
* Warlock - класс наследник от Mage, реализующий чернокнижника, по задумке данный класс будет владеть магией хаоса и своеобразными баффами при развитии;
* Druid - класс наследни к от Mage, реализующий друида, по задумке данный класс будет владеть магией природы и своеобразными баффами при развитии;
* All - класс всех начал, предметов и магов;
* TargetStone - наследник класса All, предназначен для тренировки дэмэджа.

### Недостатки
* Класс All слишком общее название;
* У классов нет указания пакетов;
## Директория Seminar3

Содержит улучшеную версию прошлого проекта, лежащего в директории Seminar 2

### Недостатки
* Класс baseLogic.AllObject - поле name публичное, нарушение принципа инкапсуляции.

## Директория Seminar4

* Можно ещё много дорабатывать, но основная архитектура построена, поэтому добавление новых фичей не потребует пересборку всего проекта
### Недостатки 
* Класс по добавлению id задачи можно сделать отдельным сервисом, который при вызове метода каждый раз возвращает инкремент предыдущего значения и последнее значение всегда хранит в этом сервисе;
* Стоит также добавить логику по поиску задач по приоритету;
* Стоит обработать некоторые условия, запуская программу, вылетает ошибка (java.util.NoSuchElementException) и программа сразу закрывается.

## Директория Seminar5
Содержит в себе реализацию мессенджера. Присутствуют следующие классы:
* Chat - интерфейс для последующей реализации логики чата;
* ICQ - класс имплементирующий интерфейс Chat, конкретный вид чата;
* User - абстрактный класс для дальнейшей реализации конкретных видов пользователей;
* Client - наследуется от абстрактного класса User, реализация конкретного вида клиента; 
* ICQStorage - класс имплементирующий интерфейс Storage реализующий хранение информации о пользователях;
* Program - пользовательский класс;
* Storage - интерфейс для последующей реализации логики чата.

### Недостатки 
*  Нет должного разделения по директориям

## Директория Seminar6
Содержит в себе игру в конфеты (кто последний сделает ход тот и выйграл), имеет классы
* Game - отвечает за логику игры;
* Program - пользовательский файл;
* StorageSave - отвечает засохранение последнего хода и хранение его.

### Недостатки 
* Не клиентоприспособленно, трудно понимать что делать, когда запущен код.
