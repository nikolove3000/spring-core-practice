# 🌱 spring-core-practice

A hands-on learning project for mastering **Spring Core** from the ground up — no Spring Boot, no shortcuts.

---

## 📚 Lessons

### ✅ Lesson 01 — Bean Lifecycle
> `@PostConstruct` · `@PreDestroy`

Understanding how Spring manages the lifecycle of a bean from initialization to destruction.

- Implemented `CacheManager` with `@PostConstruct` (init) and `@PreDestroy` (cleanup)
- Observed lifecycle hooks in action via `context.close()`

---

### ✅ Lesson 02 — @Configuration + @Bean
> `@Configuration` · `@Bean` · Manual bean wiring

Learning when and why to use `@Configuration + @Bean` instead of `@Component` — especially for third-party classes that cannot be annotated.

- Created `AppDatabase` bean with constructor injection via `@Bean`
- Wired `UserService` depending on `AppDatabase` inside `AppConfig`

---

### ✅ Lesson 03 — @Bean Practice
> Bean dependency · Constructor injection

Reinforcing `@Bean` patterns with a realistic notification system.

- `EmailSender` configured with SMTP host and port
- `NotificationService` depends on `EmailSender`, wired via `AppConfig`

---

### ✅ Lesson 04 — Bean Scope
> `Singleton` · `Prototype` · `@Scope`

Understanding how Spring controls object creation through scope.

- Verified Singleton behavior: same instance returned on every `getBean()` call
- Verified Prototype behavior: new instance created on every `getBean()` call

---

### ✅ Lesson 05 — @Import
> `@Import` · Multi-config architecture

Splitting configuration into focused, single-responsibility config classes and merging them via `@Import`.

- `DatabaseConfig` manages `DatabaseService` bean
- `EmailConfig` manages `EmailSender` bean
- `AppConfig` acts as the single entry point using `@Import`

---

### ✅ Lesson 06 — @Value + .properties
> `@Value` · `@PropertySource` · Externalized configuration

Removing hardcoded values from source code by reading configuration from an external `.properties` file.

- `application.properties` loaded via `@PropertySource("classpath:application.properties")`
- `db.url` and `db.username` injected into `AppConfig` using `@Value`
- `application.properties` excluded from version control via `.gitignore`

---

### ✅ Lesson 07 — Mini Project: Order Management System
> `@Profile` · `@Conditional` · `@Import` · `@Value` · `@PostConstruct` · `@PreDestroy`

A complete mini project combining all Spring Core concepts into a realistic order processing system.

- `DatabaseService` with `@PostConstruct` (init connection) and `@PreDestroy` (close connection)
- `PaymentService` interface with `DevPaymentService` (`@Profile("dev")`) and `ProdPaymentService` (`@Profile("prod")`)
- `DiscountService` created conditionally via custom `DiscountCondition` implementing `Condition`
- `OrderService` orchestrates the full order flow: save → payment → discount → email confirmation
- Config split into `DatabaseConfig`, `NotificationConfig`, `PaymentConfig`, `DiscountConfig` — merged via `@Import` in `AppConfig`


---


### ✅ Lesson 08 — AOP (Aspect-Oriented Programming)
> `@Aspect` · `@Before` · `@After` · `@Around` · `@EnableAspectJAutoProxy`

Understanding how to separate cross-cutting concerns from business logic using AOP.

- `LoggingAspect` logs method start and end for all service methods via `@Before` and `@After`
- `@Around` with `ProceedingJoinPoint` measures execution time of each method
- `OrderService` remains clean — no logging code inside business logic
## 🛠️ Tech Stack

| Tool | Version |
|---|---|
| Java | 21 |
| Spring Context | 7.0.5 |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |
 
---

## 📁 Project Structure

```
src/
└── main/
    ├── java/com/example/
    │   ├── lesson01_lifecycle/
    │   ├── lesson02_configuration/
    │   ├── lesson03_bean_practice/
    │   ├── lesson04_scope/
    │   ├── lesson05_import/
    │   └── lesson06_value/
    │   └── lesson07_mini_project/
    │   └── lesson08_aop/    
    └── resources/
        └── application.properties        ← excluded from Git
```
 
---

## 📌 Conventions Applied

- Javadoc on all public classes and methods (`@param`, `@return`, `@throws`)
- Single Responsibility Principle per class
- `camelCase` / `PascalCase` / `UPPER_SNAKE_CASE` used correctly
- Each lesson is self-contained with its own `Main.java`
- Sensitive config files excluded from version control

---

## 🗺️ Learning Roadmap

- [x] Spring Core — DI, IoC Container (custom `SimpleContainer`)
- [x] Spring Context — `@Component`, `@Autowired`, `@ComponentScan`
- [x] Servlet + Tomcat (traditional)
- [x] Spring MVC (pure — `DispatcherServlet`, `HandlerMapping`, `ViewResolver`)
- [x] Bean Lifecycle, `@Configuration`, `@Bean`, `@Scope`, `@Import`, `@Value`, `@Profile`, `@Conditional`
- [ ] Spring MVC — additional practice project
- [ ] Spring Boot
- [ ] Spring Data JPA + REST API
- [ ] Spring Security
 