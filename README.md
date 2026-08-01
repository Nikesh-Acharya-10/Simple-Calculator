# 🧮 Java Swing Calculator

A clean, lightweight, single-file desktop calculator application built in Java using **Swing** and **AWT**.

---

## ✨ Features

- **Basic Arithmetic:** Addition (`+`), Subtraction (`-`), Multiplication (`*`), and Division (`/`).
- **Additional Functions:**
  - `x²`: Instantly calculate the square of the current input.
  - `←`: Backspace functionality to delete the last entered digit.
  - `.`: Decimal point support with duplicate prevention.
  - `C`: Clear screen and reset operation states.
- **Error Handling:** Safe division-by-zero detection and string parsing guards.
- **Continuous Calculations:** Chain operations seamlessly using the previous result.
- **Zero Dependencies:** Uses native Java GUI toolkits (`javax.swing` and `java.awt`).

---

## 🛠️ Prerequisites

To run or compile this project locally, you will need:

- **Java Development Kit (JDK):** Version 8 or higher installed on your system.

Check if you have Java installed by running:

java -version
🚀 How to Set Up & Run
1. Clone the Repository
Bash

git clone [https://github.com/Nikesh-Acharya-10/Simple-Calculator.git](https://github.com/Nikesh-Acharya-10/Simple-Calculator.git)
cd Simple-Calculator

2. Compile the Code
Bash

javac Calculator.java

3. Run the Application
Bash

java Calculator
bash```
📂 Project Structure
Plaintext

Simple-Calculator/
├── docs/                      # Documentation files
├── src/                       # Source files directory
├── .gitignore                 # Files ignored by Git
├── Calculator.java            # Main application logic & GUI implementation
├── CONTRIBUTING.md            # Guidelines for contributing to this project
├── pull_request_template.md   # Template used for GitHub Pull Requests
└── README.md                  # Project overview and instructions

💻 Tech Stack

    Language: Java

    UI Framework: Java Swing (javax.swing)

    Event Handling: Java AWT (java.awt.event)

🤝 Contributing

Contributions are welcome! Please read through CONTRIBUTING.md for details on our code of conduct and the process for submitting pull requests using our Pull Request Template.
📝 License

This project is licensed under the MIT License - see the LICENSE file for details.
