# assignment-5-java
This Java program is a **menu-driven application** that calculates the **area, perimeter, and volume** of various geometric shapes. It follows **object-oriented programming (OOP) principles** using **abstraction, inheritance, and interfaces**.  

### **Program Structure:**
1. **Abstract Class `Shape`**  
   - Contains a constructor to store the shape’s name.  
   - Defines two abstract methods:  
     - `calculateArea()` – Computes the shape’s area.  
     - `calculatePerimeter()` – Computes the shape’s perimeter.  
   - Implements a `displayResults()` method to print calculations.  

2. **Interface `Volume`**  
   - Declares `calculateVolume()` for 3D shapes.  

3. **Shape Classes Implementing `Shape` and `Volume`**  
   - **2D Shapes (`Circle`, `Rectangle`, `Square`)** implement only the `Shape` class and override `calculateArea()` and `calculatePerimeter()`.  
   - **3D Shapes (`Sphere`, `Cylinder`, `EquilateralPyramid`)** implement both `Shape` and `Volume`, adding `calculateVolume()`.  

### **Program Execution:**
- The `Main` class presents a **menu** allowing users to select a shape.  
- Users input **dimensions** (e.g., radius, length, height).  
- The program calculates and **displays area, perimeter, and volume** (if applicable).  
- It runs in a loop until the user exits.  
