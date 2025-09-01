# 🎨 Design Patterns in Java

This repository contains **hands-on implementations** of popular **Design Patterns** in Java.  
Each pattern includes:
- 📘 Explanation of the pattern  
- 🏗️ UML Diagram (via Mermaid/ASCII)  
- 💻 Java implementation  
- ▶️ Demo class with sample output  

---

## 📂 Repository Structure
```
design-patterns/
│── structural/
│   ├── facade/
│   │   ├── Shape.java
│   │   ├── Circle.java
│   │   ├── Square.java
│   │   ├── Rectangle.java
│   │   ├── ShapeMaker.java
│   │   ├── FacadePatternDemo.java
│   │   └── README.md
│   ├── flyweight/
│   │   ├── Shape.java
│   │   ├── Circle.java
│   │   ├── ShapeFactory.java
│   │   ├── FlyweightPatternDemo.java
│   │   └── README.md
│   ├── proxy/
│   │   ├── Image.java
│   │   ├── RealImage.java
│   │   ├── ProxyImage.java
│   │   ├── ProxyPatternDemo.java
│   │   └── README.md
│── creational/
│── behavioral/
└── README.md
```

---

## ✅ Implemented Patterns
### 🔹 Structural Patterns
- [x] **Facade Pattern** → Simplifies complex subsystems  
- [x] **Flyweight Pattern** → Reduces memory usage via object reuse  
- [x] **Proxy Pattern** → Provides a placeholder to control access to another object  

### 🔹 Creational Patterns
- [ ] Singleton Pattern  
- [ ] Factory Method Pattern  
- [ ] Abstract Factory Pattern  
- [ ] Builder Pattern  
- [ ] Prototype Pattern  

### 🔹 Behavioral Patterns
- [ ] Strategy Pattern  
- [ ] Observer Pattern  
- [ ] Template Method Pattern  
- [ ] Command Pattern  
- [ ] State Pattern  

---

## 🛠️ How to Run
1. Clone the repository  
   ```bash
   git clone https://github.com/<your-username>/design-patterns.git
   cd design-patterns
   ```
2. Compile and run any demo class. Example:  
   ```bash
   cd structural/facade
   javac *.java
   java FacadePatternDemo
   ```

---

## 📖 Resources
- *Design Patterns: Elements of Reusable Object-Oriented Software* (Gang of Four)  
- [Refactoring Guru](https://refactoring.guru/design-patterns)  
- [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/index.htm)  

---

## 🤝 Contributing
Contributions are welcome!  
- Open issues for discussions or enhancements.  
- Submit PRs with new pattern implementations.  

---

## 📜 License
This project is licensed under the **MIT License** – feel free to use and modify for learning purposes.
