
 # SpringFrameworkGBsem3HWServer

#1.
Создать сервис "DataProcessingService". Этот сервис должен принимать
на вход список объектов типа User (с полями "name", "age", "email"),
и выполнять следующие операции: сортировка списка пользователей по
возрасту, фильтрация списка по заданному критерию (например, возраст
больше 18), рассчет среднего возраста пользователей.


##
[{"name":"Ivan", "age":32, "email":"Ivan@mail.ru"},{"name":"Oleg", "age":23, "email":"Oleg@mail.ru"},
{"name":"Max", "age":29, "email":"Max@mail.ru"},{"name":"Olya", "age":25, "email":"Olya@mail.ru"}]



#2.
Создать два сервиса - "UserService" и "NotificationService".
UserService должен содержать метод createUser(String name, int age, String email),
который создает пользователя и возвращает его. NotificationService должен иметь
метод notifyUser(User user), который просто печатает сообщение о том, что
пользователь был создан. Ваша задача - использовать @Autowired в UserService для
внедрения NotificationService и вызвать метод notifyUser после создания
нового пользователя.


#ДЗ
Создать сервис "RegistrationService", который принимает на вход данные
о пользователе (имя, возраст, email), создает пользователя с помощью
UserService, затем использует DataProcessingService для добавления
пользователя в список и выполнения операций над этим списком.
После выполнения каждой операции, использовать NotificationService
для вывода информации о выполненной операции.

#комментарий к дз
