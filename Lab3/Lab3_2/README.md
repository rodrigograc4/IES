# Lab 3.2 Notes

## Docker

### Config mysql

```bash
docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1 -e MYSQL_DATABASE=demo -e MYSQL_USER=demo -e MYSQL_PASSWORD=secret2 -p 33060:3306 -d mysql/mysql-server:5.7
```

### Connect to mysql

```bash
docker exec -it mysql5 mysql -u root -p
```

## Test API with Postman

### Create employee

```bash
POST http://127.0.0.1:8080/api/v1/employees
```

![create employee](snapshots/add_employee.png)

### Create employee 2

```bash
POST http://127.0.0.1:8080/api/v1/employees
```

![create employee 2](snapshots/add_employee2.png)

### Get employee by id

```bash
GET http://127.0.0.1:8080/api/v1/employees/1
```

![get employee by id](snapshots/get_employee_id.png)

### Get employee by email

```bash
GET http://127.0.0.1:8080/api/v1/employees?email=
```

![get employee by email](snapshots/get_empl_email.png)

### Get all employees

```bash
GET http://127.0.0.1:8080/api/v1/employees
```

![get all employees](snapshots/get_employees.png)


### Update employee

```bash
PUT http://127.0.0.1:8080/api/v1/employees/2
```

![update employee](snapshots/edit_empl_id.png)

### Delete employee

```bash
DELETE http://127.0.0.1:8080/api/v1/employees/3
```

![delete employee](snapshots/dlt_empl_id.png)



Podemos realizar as demais operações mapeadas no controlador (atualização e exclusão de funcionários).

Dito isso, o POSTMAN é muito útil para testar nossa API REST.