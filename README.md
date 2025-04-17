# StudentApp 🎓

A simple Spring Boot web application for managing student registrations. Admin can view all registered students and send exam links via email.

---

## 🚀 Features

- Add new students via a form (HTML frontend)
- View all registered students (Admin dashboard)
- Send exam link to student emails
- Spring Boot REST API
- Connected to database via Spring Data JPA
- Email integration using JavaMailSender
- Simple front-end with HTML & internal CSS

---

## 🛠 Tech Stack

- **Backend**: Java, Spring Boot, Spring Data JPA, Spring Web, Java Mail
- **Frontend**: HTML, CSS, JavaScript (Vanilla)
- **Database**: H2 / MySQL (as configured)
- **Build Tool**: Maven
- **IDE**: Spring Tool Suite (STS)

---

## 📂 API Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| POST   | `/studentApp/register` | Register a new student       |
| GET    | `/studentApp/students` | Get all students (Admin)     |
| POST   | `/studentApp/sendMail` | Send exam link to student(s) |

---

## 📋 How to Run

1. Clone this repo  
   ```bash
   git clone https://github.com/yourusername/StudentApp.git
