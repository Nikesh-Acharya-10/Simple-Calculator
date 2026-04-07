## 📋 Description
This PR reorganizes the project structure to follow Java best practices and improve maintainability.

## ✨ Changes Made

### Directory Structure
- Moved `Calculator.java` to `src/main/java/` for proper source code organization
- Added `.gitignore` with Java-specific exclusions for compiled files and IDE files
- Created `docs/` directory for project documentation

### New Documentation
- **PROJECT_STRUCTURE.md**: Explains the directory layout and compilation instructions
- **FEATURES.md**: Comprehensive list of current and planned features

### Benefits
✅ Follows standard Java project layout
✅ Better code organization and scalability
✅ Cleaner Git history (compiled files won't be tracked)
✅ Easy to add tests in `src/test/java/` later
✅ Improved documentation structure

## 📝 Compilation Instructions

After this PR is merged, compile with:
```bash
mkdir -p bin
javac -d bin src/main/java/*.java
java -cp bin Calculator
```

## ✅ Checklist
- [x] Directory structure reorganized
- [x] .gitignore added
- [x] Documentation files created
- [x] Follows Java conventions
- [x] Ready for future expansion