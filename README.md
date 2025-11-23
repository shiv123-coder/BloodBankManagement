# 🩸 Blood Bank Management System  
A complete **JavaFX-based Blood Bank Management System** designed to manage donors, blood inventory, receivers, doctors, and volunteers with a secure **MySQL backend**.  
This project features a modular structure, clean UI, and scalable design suitable for academic and real-world organizations.

---

## 🚀 Features

### 🔴 Donor Management
- Add, update, search, and delete donor records  
- Track age, weight, blood group, gender, and last donation date  

### 🩸 Blood Request / Receiver Management
- Manage blood request records  
- Check availability & update request status automatically  

### 🧑‍⚕️ Doctor Management
- Add and maintain doctor profiles  
- Assign responsibilities and roles  

### 🙋 Volunteer / Employee Management
- Add and manage volunteers or staff members  

### 🧪 Blood Inventory Module
- View available blood units by blood group  
- Auto-update inventory after donation or blood issue  

### 🎨 Modern JavaFX UI
- Smooth navigation  
- Dark-theme based UI with CSS  

### 🔗 MySQL Integration
- Secure & fast JDBC-based operations  
- Clean and optimized database schema  

---

## 🧰 Technologies Used

| Component | Version |
|----------|---------|
| **Java** | 22 |
| **JavaFX** | 24 |
| **MySQL** | 8+ |
| **MySQL JDBC Driver** | 9.2.0 |
| **IDE** | VS Code |

---

## 🗂️ Project Structure

Blood Management/
│── src/
│ ├── DB/ # Database handling classes
│ └── blood/management/ # Controllers & JavaFX logic
│
│── Images/ # UI images/icons
│── lib/ # MySQL JDBC Connector
│── out/ # Compiled class files
│── build/ # Optional build folder
│── DarkTheme.css # JavaFX UI styling
│── bloodmanagement.sql # Database schema
│── blood_SQL.txt # Optional SQL dump
│── compile.bat # Script to compile project
│── run.bat # Script to run project
└── README.md # Documentation

yaml
Copy code

---

## 🛠️ Setup Instructions (Windows)

### ✔️ Requirements
- Install **JDK 22+**
- Install **JavaFX SDK 24+**
- Install **MySQL Server + Workbench**
- Add Java & JavaFX to **system PATH** (recommended)

---

## 📥 Step 1: Import the Database

1. Open **MySQL Workbench**  
2. Go to **File → Open SQL Script**
3. Select:  
bloodmanagement.sql

yaml
Copy code
4. Run the script to generate all required tables.

---

## ▶️ Step 2: Run the Application

### **Option A — Using run.bat (Recommended)**
Simply double-click:
run.bat

yaml
Copy code

This auto-runs JavaFX with the correct modules.

---

## 📸 Screenshots  
(Add your PNG/JPG files here)

- 🧪 Available Blood  
- 🩸 Blood Receiver Management  
- 🧑‍⚕️ Doctor Details  
- 🧑‍💉 Donor Module  
- 🙋 Volunteer / Employee Module  

---

## 👨‍💻 Author
**Shivshankar Mali**  
_Blood Bank Management System — JavaFX + MySQL Project_

---
