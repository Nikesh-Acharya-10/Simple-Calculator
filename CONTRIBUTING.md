# Contributing to Simple Calculator

Thank you for considering contributing to Simple Calculator! We're excited to have you join our community. This document provides guidelines and instructions for contributing.

## 🎯 Code of Conduct

This project and everyone participating in it is governed by our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code.

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Git
- GitHub account

### Development Setup

```bash
# 1. Fork the repository on GitHub
# 2. Clone your fork
git clone https://github.com/YOUR_USERNAME/Simple-Calculator.git
cd Simple-Calculator

# 3. Create a new branch
git checkout -b feature/your-feature-name
# or for bug fixes:
git checkout -b bugfix/your-bug-fix

# 4. Make your changes and test them
# 5. Commit and push
git commit -m "feat: description of your changes"
git push origin feature/your-feature-name

# 6. Create a Pull Request on GitHub
```

## 📝 Commit Message Guidelines

We follow the [Conventional Commits](https://www.conventionalcommits.org/) specification:

```
type(scope): subject

body (optional)

footer (optional)
```

### Types
- **feat**: A new feature
- **fix**: A bug fix
- **docs**: Documentation changes
- **style**: Code style changes (formatting, semicolons, etc.)
- **refactor**: Code refactoring without feature changes
- **perf**: Performance improvements
- **test**: Adding or updating tests
- **chore**: Build process, dependencies, tooling

### Examples
```
feat(calculator): add scientific mode
fix(ui): correct button alignment issue
docs(readme): update installation instructions
test(calculator): add unit tests for division
```

## 🔄 Pull Request Process

1. **Before Creating a PR:**
   - Fork the repository
   - Create a feature branch from `main`
   - Make your changes
   - Write or update tests
   - Ensure all tests pass
   - Update documentation if needed

2. **Creating a PR:**
   - Fill out the provided PR template completely
   - Link related issues using `Closes #123`
   - Provide a clear description of your changes
   - Include before/after screenshots for UI changes

3. **PR Review Process:**
   - At least one maintainer review required
   - CI/CD checks must pass
   - Code style must follow guidelines
   - All conversations must be resolved

4. **After Approval:**
   - A maintainer will merge your PR
   - Your contribution will be acknowledged in CHANGELOG.md
   - Your code will be part of the next release

## 🎨 Code Style Guidelines

### Java Code Style

```java
// Use meaningful variable names
double calculationResult = num1 + num2;

// Add comments for complex logic
// Calculate the factorial of the number
int factorial = calculateFactorial(n);

// Follow Java naming conventions
public class MyClass { }
public void myMethod() { }
private int myVariable;

// Proper indentation (4 spaces)
if (condition) {
    doSomething();
} else {
    doSomethingElse();
}

// Use try-catch for error handling
try {
    result = parseDouble(input);
} catch (NumberFormatException e) {
    displayError("Invalid number format");
}
```

### File Organization

```java
// 1. Package declaration
package com.calculator;

// 2. Import statements (grouped and sorted)
import java.util.*;
import javax.swing.*;

// 3. Class/Interface declaration
public class Calculator {
    
    // 4. Static variables
    private static final int DEFAULT_SIZE = 300;
    
    // 5. Instance variables
    private JTextField display;
    
    // 6. Constructors
    public Calculator() { }
    
    // 7. Public methods
    public void calculate() { }
    
    // 8. Private methods
    private void setupUI() { }
}
```

## ✅ Testing Guidelines

All new features must include tests:

```java
// Example test structure
@Test
public void testAddition() {
    // Arrange
    Calculator calc = new Calculator();
    
    // Act
    double result = calc.add(5, 3);
    
    // Assert
    assertEquals(8, result);
}
```

### Running Tests

```bash
# Compile with test dependencies
javac -cp bin:lib/* src/test/java/*.java -d bin

# Run all tests
java -cp bin org.junit.platform.console.ConsoleLauncher --scan-classpath

# Run specific test
java -cp bin org.junit.platform.console.ConsoleLauncher --select-class CalculatorTest
```

## 📚 Documentation Guidelines

When contributing documentation:

1. **README.md changes:** Update if adding new features
2. **docs/FEATURES.md:** Document all new features
3. **docs/ARCHITECTURE.md:** Explain structural changes
4. **CHANGELOG.md:** Add your changes to the unreleased section
5. **Code comments:** Add comments for complex logic

### Documentation Format

```markdown
# Feature Title

## Description
Clear description of what this does.

## Usage
```code example
```

## Related Issues
- Closes #123
```

## 🐛 Reporting Bugs

When reporting bugs, please use the [bug report template](.github/ISSUE_TEMPLATE/bug_report.md) and include:

1. **Environment:** OS, Java version, etc.
2. **Steps to reproduce:** Clear step-by-step instructions
3. **Expected behavior:** What should happen
4. **Actual behavior:** What actually happened
5. **Screenshots:** If applicable
6. **Error logs:** Any error messages

## 💡 Suggesting Features

When suggesting features, use the [feature request template](.github/ISSUE_TEMPLATE/feature_request.md) and include:

1. **Description:** Clear feature description
2. **Use case:** Why you need this
3. **Proposed solution:** How it should work
4. **Alternatives considered:** Other approaches
5. **Screenshots/mockups:** Visual references if applicable

## 📋 Checklist Before Submitting

- [ ] I have read the CONTRIBUTING.md file
- [ ] I have read the CODE_OF_CONDUCT.md
- [ ] My code follows the style guidelines
- [ ] I have added/updated tests
- [ ] All tests pass
- [ ] I have updated documentation
- [ ] My commits follow the conventional commits format
- [ ] I have linked related issues in the PR description
- [ ] I have not introduced new warnings

## 🏆 Recognition

Contributors will be recognized in:
- CHANGELOG.md
- README.md acknowledgments section
- GitHub contributors page

## ❓ Questions?

- Check [existing issues](https://github.com/Nikesh-Acharya-10/Simple-Calculator/issues)
- Read the [documentation](docs/)
- Start a [discussion](https://github.com/Nikesh-Acharya-10/Simple-Calculator/discussions)

## 📜 License

By contributing to Simple Calculator, you agree that your contributions will be licensed under its MIT License.