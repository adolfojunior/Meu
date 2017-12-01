# User RESTful API

### Running from Command line
```
$ ./mvnw clean spring-boot:run
```

or

Windows
```
$ ./mvnw.cmd clean spring-boot:run
```

### Build the JAR

```
$ ./mvnw clean package
```

or

Windows
```
$ ./mvnw.cmd clean package
```

The JAR will be located at `target/demo-0.0.1-SNAPSHOT.jar`

Running the JAR directly.

```
$ java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### REST API

- List all users: GET http://localhost:8080/user/all
- Create an user: POST http://localhost:8080/user `{ User data as JSON }`
- Update an user: PUT http://localhost:8080/user/{username} `{ User data as JSON }`
- Delete an user: DELETE http://localhost:8080/user/{username}

To debug:
- Trace requests: GET http://localhost:8080/trace

## TODO

- Implement the missing RESTful Endpoints
- Add a database repository
- Encrypt the User password
