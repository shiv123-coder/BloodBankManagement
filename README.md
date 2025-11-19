# 🩸 Blood Bank Management System

A complete JavaFX-based Blood Bank Management System that enables seamless management of donors, blood requests, doctors, and volunteers. This system connects with a MySQL database to handle real-time data securely and efficiently.

## 📌 Features

- Add and manage Donor information with:
  - Name, Age, Weight, Gender, Last Donated Date, etc.
- Blood Request (Receiver) management
- Doctor details management
- Volunteer (Employee) records
- Available Blood Inventory overview
- Clean and responsive JavaFX UI
- MySQL backend integration

---

## 🧰 Technologies Used

| Technology | Version     |
|------------|-------------|
| Java       | 22          |
| JavaFX     | 24          |
| MySQL      | 8+ (JDBC)   |
| IDE        | VS Code     |

---

## 🗂️ Project Structure

Blood Management/ │ ├── src/ # All Java source files │ └── blood/management/ # JavaFX controllers and views │ ├── Images/ # Blood drop images ├── lib/ # MySQL JDBC Connector ├── out/ # Compiled output (.class) ├── build/ # (Optional NetBeans artifacts) ├── bloodmanagement.sql # SQL schema for database ├── blood_SQL.txt # Optional SQL dump ├── DarkTheme.css # UI styling ├── compile.bat # Compile the project (Windows) ├── run.bat # Run the project (Windows) └── README.md # Project documentation

yaml
Copy
Edit

---

## 🛠️ Setup & Run (Windows)

### 1. ✅ Install Requirements

- Java JDK 22+
- JavaFX SDK 24+
- MySQL Server & Workbench
- VS Code with Java and JavaFX extensions

### 2. ✅ Import the Database

1. Open MySQL Workbench
2. Run the SQL file:  
   ```bash
   bloodmanagement.sql


  🤝 Contributors
Shivshankar Mali



## 📸 Screenshots

### 🧪 Available Blood  
![Available Blood](screenshots/available-blood.jpg)

### 🩸 Blood Receiver  
![Blood Receiver](screenshots/blood-receiver.jpg)

### 🧑‍⚕️ Doctor Details  
![Doctor Details](screenshots/doctor-details.jpg)

### 🧑‍💉 Donor  
![Donor](screenshots/donor.jpg)

### 🙋 Employee (Volunteer)  
![Employee](screenshots/employee.jpg)






