# Часть 2. Spring User Service
------
##В компании «А» возникла потребность в хранении и управлении учетными записями пользователей. Задача по реализации данных потребностей выпала Вам. Необходимо реализовать REST сервис отвечающий следующим требованиям:
-	данные пользователя, которые будут хранится: Фамилия, Имя, Дата рождения, email и пароль;
-	пароль пользователя должен храниться в безопасной форме;
-	функции, которые должен предоставлять сервис: добавление пользователя, удаление пользователя, поиск пользователя по email;
-	использовать InMemory реализацию базы данных (т.е. хранить данные в памяти);
-	приложение необходимо реализовать на одном из языков Java 8, Groovy или Kotlin c использованием стека технологий Spring не ниже версии 4.

------
### Запуск 
- Зайдите в корневую папку проекта
- В консоли напишите :
- mvn install
- mvn spring-boot:run

###
- POST = localhost:8080/api/users = добавление пользователя
- DELETE = localhost:8080/api/users/{userId} = удаление пользователя 
- GET = localhost:8080/api/users/{email} = поиск пользователя по email


