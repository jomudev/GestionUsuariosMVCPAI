# User Management System — MVC Pattern (Java + Maven)

![Java](https://img.shields.io/badge/Java-OOP-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Architecture](https://img.shields.io/badge/Pattern-MVC-10B981?style=flat-square)
![Maven](https://img.shields.io/badge/Build-Apache_Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)

## Executive Summary

A **Java & Apache Maven** application implementing strict **Model-View-Controller (MVC)** separation for user registration, retrieval, and lifecycle management.

---

## Architectural Breakdown

- **Model (`Usuario.java`):** Encapsulates user domain attributes and validation rules.
- **View (`UsuarioView.java`):** Handles user presentation and input capture without embedding business logic.
- **Controller (`UsuarioController.java`):** Mediates actions between `UsuarioView` and `Usuario` state transitions.
- **Entry Point (`Main.java`, `GestionUsuarioMVC.java`):** Wires MVC dependencies via clean dependency injection.

---

## Getting Started

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.gestionusuariosmvc.Main"
```

---

## Author & Contact

**Héctor Joann Murillo Mejía** — Mobile & Full-Stack Software Engineer (React Native · TypeScript · Node.js)

- **Email:** [joannmurillo@icloud.com](mailto:joannmurillo@icloud.com)
- **LinkedIn:** [linkedin.com/in/hector-joann-murillo-mejia](https://www.linkedin.com/in/hector-joann-murillo-mejia/)
- **GitHub:** [github.com/jomudev](https://github.com/jomudev)
- **Portfolio:** [joannmurillo.com](https://www.joannmurillo.com)
