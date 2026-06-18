# Viva / Interview Questions

##  Basic

- What is Spring Boot?
It's a Java framework that makes building web apps easy. No manual setup needed — just write your code and run.

- What is MVC?
It splits app into 3 parts:
- **Model** → data (User, SkillPack)
- **View** → UI (JSP pages)
- **Controller** → handles requests


---

##  Intermediate

- What is Service layer?
It's where business logic goes. Controller calls it, it calls Repository.
```
Controller → Service → Repository → DB
```

- What is Repository in Spring Data JPA?

Interface that talks to database. No SQL needed — JPA handles it.
```java
userRepo.save(user);
userRepo.findAll();
```


- Difference between GET and POST?

- GET → fetch data, URL visible
- POST → send data, URL hidden

--- 

 ## Advance

**How does subscription flow work?**
User clicks Subscribe → Controller calls Service → Service fetches User + Pack → creates Subscription with 30 day validity → saves to DB.

**How User and SkillPack are linked?**
Through Subscription entity. It holds both User and SkillPack inside it.

**Why Service Layer?**
To keep logic separate from Controller. One job per layer.

**How JSP gets data from Controller?**
Controller puts data in Model → JSP reads it using `${}`.




