# Validate South African ID Number

This project validates South African ID numbers using **Test-Driven Development (TDD)** in **Java** with **JUnit 5** and **Gradle**.

A valid South African ID number must meet specific criteria, including correct date of birth formatting, gender identification digits, citizenship status, and a valid checksum digit using the Luhn algorithm.

---

## 📌 About This Project

The main goal is to:

- Write clean, testable Java code using TDD (Red-Green-Refactor cycle).
- Practice unit testing using **JUnit Jupiter 5**.
- Understand how to validate structured numeric data using logical conditions and algorithms (like the Luhn checksum).

---

## 🧪 What Makes an ID Number Valid?

A South African ID number is a 13-digit number in the format: `YYMMDDSSSSCAZ`

| Section     | Meaning                                  |
|-------------|------------------------------------------|
| YYMMDD      | Date of birth (e.g. `920220` = 20 Feb 1992) |
| SSSS        | Gender identifier (0000-4999 = Female, 5000-9999 = Male) |
| C           | Citizenship (0 = SA citizen, 1 = permanent resident) |
| A           | Usually 8 or 9 (not validated here)       |
| Z           | Luhn checksum digit                      |

---

## 🛠️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/validate_sa_id.git
cd validate_sa_id
```

### 2. Run the Tests

Make sure you have Gradle installed. Then run:

```bash
./gradlew test
```

All tests should pass if everything is working correctly.

---

## ✅ Features

- ✅ Validates length and numeric format
- ✅ Validates date of birth (YYMMDD)
- ✅ Validates gender digit
- ✅ Validates citizenship digit
- ✅ Validates checksum using Luhn algorithm
- ✅ Fully tested with JUnit 5
- ✅ Built using Gradle

---

## By Mpho I. 💖
