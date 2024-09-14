# 🚨 Ensure Codespaces is Stopped After Use 🚨

### Guide

#### Creating a New Java Project

1. **Create the Project:**
   - Right-click in the explorer and select **"New Java Project."**

2. **Choose Project Type:**
   - Select **"No Build Tools"** as the project type, then click **"OK."**

3. **Name the Project:**
   - Enter the project name, and you're done! Your new Java project is ready for development.
  
---

#### Running a Specific Java Project:
1. **Open the Terminal:**
   - In the sidebar explorer, right-click on the project name.
   - Select **"Open in Integrated Terminal."**

2. **Run the Project:**
   - In the terminal, type the following command:
     ```bash
     java ./src/Main.java
     ```

Your project will now run.

---

#### Saving Changes (Commit and Push):
1. **Open Source Control:**
   - Click the **"Source Control"** icon in the sidebar.

2. **Write a Commit Message:**
   - Add a required commit message describing your changes.

3. **Commit and Push:**
   - Click **"Commit"** to save your changes.
   - Then, click **"Push"** to upload your changes to the repository.

### Known Errors
If you compile only one Java file and it depends on another, you'll get "class not found" errors. To fix this, compile all related files together:

```bash
javac Main.java BankAccount.java
```

This ensures that the compiler generates `.class` files for all necessary classes. Then you can run your program:

```bash
java Main
```
