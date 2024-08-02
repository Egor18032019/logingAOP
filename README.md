# Запуск

1. Сделать БД
```shell
docker run -it --name demo -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=demo -d postgres:11-alpine
```
2. Сделать запросы к апи
```shell
curl -i -X POST http://127.0.0.1:8080/users -H 'Content-Type: application/json' -d '{"name":"All done !","email":"email@mail.ru"}'
```

 ```shell
curl -i -X GET http://localhost:8080/users/100000
```

```shell
curl -i -X POST http://127.0.0.1:8080/order -H 'Content-Type: application/json' -d '{"userName":"All done !","description":"3","status":"1"}'
```
 ```shell
curl -i -X GET http://localhost:8080/order/100000
```

3. Проверить есть ли логи в файле [application.log](/logs/application.log) 
