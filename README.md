🩸 Blood Bank Management System

A complete JavaFX-based Blood Bank Management System designed to manage donors, blood inventory, receivers, doctors, and volunteers with a secure MySQL backend.
This project features a modular structure, clean UI, and scalable design suitable for academic and real-world use.

🚀 Features
🔴 Donor Management

Add, update, search, delete donors

Track age, weight, blood group, gender, last donation date

🩸 Blood Request / Receiver Management

Manage patients requesting blood

Track request status & blood availability

🧑‍⚕️ Doctor Management

Maintain doctor records with assigned roles

🙋 Volunteer / Employee Management

Add and manage staff/volunteers

🧪 Blood Inventory

View available blood units by type

Auto-update inventory on donation/request

🎨 JavaFX UI

Smooth navigation

Dark-themed modern interface

🔗 MySQL Integration

JDBC-based secure and fast data operations

Well-structured database schema

🧰 Technologies Used
Component	Version
Java	22
JavaFX	24
MySQL	8+
JDBC Driver	9.2.0
IDE	VS Code
🗂️ Project Structure
Blood Management/
│── src/
│   ├── DB/                         # Database handling classes
│   └── blood/management/           # Controllers, scenes, JavaFX logic
│
│── Images/                         # UI images (blood drop icons, etc.)
│── lib/                            # MySQL JDBC Connector
│── out/                            # Compiled .class files
│── build/                          # NetBeans or optional build folder
│── DarkTheme.css                   # JavaFX UI styling
│── bloodmanagement.sql             # Main database schema
│── blood_SQL.txt                   # Optional SQL dump
│── compile.bat                     # Windows compile script
│── run.bat                         # Windows run script
└── README.md                       # Documentation

🛠️ Setup Instructions (Windows)
✔️ Requirements

Install JDK 22+

Install JavaFX SDK 24+

Install MySQL Server + Workbench

Add Java & JavaFX to system PATH (recommended)

📥 Step 1: Import the Database

Open MySQL Workbench

Go to File → Open SQL Script

Load the file:

bloodmanagement.sql


Run the script to generate all required tables.

▶️ Step 2: Run the App

You can run the app using either:

Option A: run.bat (recommended)

Just double-click:

run.bat
📸 Screenshots
🧪 Available Blood

🩸 Blood Receiver

🧑‍⚕️ Doctor Details

🧑‍💉 Donor

🙋 Employee (Volunteer)

👨‍💻 Author

Shivshankar Mali
Blood Bank Management System — JavaFX + MySQL Project
