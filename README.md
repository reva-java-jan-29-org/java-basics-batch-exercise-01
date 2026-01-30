Java Basics – Batch Exercises (Git + GitHub Workflow)
📘 Repository Overview

This repository is part of the Java Basics Training Program (Days 1–2).
It is designed to help you practice both Java fundamentals and professional Git/GitHub workflows.

You will practice:

Core Java Fundamentals

Variables and data types

Operators

if–else conditions

Loops

Arrays

Methods

Git Fundamentals

Branching

Committing

Pushing changes

Creating Pull Requests (PRs)

Team-Based Collaboration

Working on shared repositories

Isolated development using branches

Code review via Pull Requests

👥 What Each Participant Will Do

Each participant will:

Work on one assigned exercise

Create a separate Git branch

Add one Java class

Push the solution to GitHub

Raise a Pull Request (PR) to main

After PRs are merged, everyone will pull from main to get all solutions from the batch.

🧠 Learning Objectives

By completing this exercise, you will learn to:

Write clean, readable Java code with proper comments

Structure Java classes correctly

Use Git branches for isolated development

Push changes to GitHub

Create and review Pull Requests

Sync your local code with the team using git pull

✅ This mirrors real-world professional workflows used in software teams.

📂 Project Structure
java-basics-batch-exercises/
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── batch/
                    └── exercises/


👉 All Java exercise classes must be created inside:

src/main/java/com/batch/exercises/

🧩 Assignment Rules (IMPORTANT)

✅ One participant = one exercise

✅ One exercise = one Java class

❌ Do NOT modify other students’ files

❌ Do NOT modify pom.xml or project structure

❌ Do NOT push directly to main

✅ All work must be done in your own branch

✅ Code must compile

⚠️ Violating these rules may result in PR rejection.

🏷️ Branch Naming Convention

Create your branch using:

<firstname>-ex<NN>

Examples
vishal-ex03
anita-ex11
rahul-ex07

📝 Java Class Naming Convention

Each exercise must be implemented as a new Java class.

Format
ExerciseNN_ProblemName.java

Examples
Exercise03_FizzBuzzPlus.java
Exercise10_RotateArray.java
Exercise17_GradeClassification.java

📌 Mandatory Code Comment Structure

Every Java class must start with a header comment:

/**
 * Exercise NN: <Exercise Title>
 *
 * Problem Statement:
 * Clearly describe the problem here.
 *
 * Approach:
 * Brief explanation of the logic used.
 */

Additional Guidelines

Use inline comments only where logic is non-obvious

Avoid unnecessary comments like “this is a loop”

▶️ Program Execution

Each class should include a main method:

public static void main(String[] args) {
    // demonstrate the solution with sample input/output
}


You may:

Use hardcoded inputs (preferred for now)

Use Scanner only if required by the problem

🔁 Step-by-Step Student Workflow
1️⃣ Clone the Repository
git clone <repo-url>
cd java-basics-batch-exercises

2️⃣ Create Your Branch
git switch -c <firstname>-ex<NN>

3️⃣ Always Sync with main Before Coding
git switch main
git pull
git switch <your-branch>

4️⃣ Create Your Java Class

Navigate to:

src/main/java/com/batch/exercises/


Create only one Java file for your exercise

Follow naming and comment rules strictly

5️⃣ Check, Add, and Commit
git status
git add .
git commit -m "Add solution for Exercise NN: <Problem Name>"

6️⃣ Push Your Branch
git push -u origin <your-branch>

7️⃣ Create a Pull Request (PR)

On GitHub:

Base branch: main

Compare branch: <your-branch>

PR Title format:

Exercise NN – <Your Name>


PR Description must include:

Brief explanation of your approach

Sample output (copy-paste from console)

8️⃣ After PR Is Merged

Everyone must sync:

git switch main
git pull


This ensures you have all solutions from the batch.

🔍 Review & Feedback

PRs will be reviewed for:

Correctness

Code clarity

Proper comments

Git discipline

Feedback may be added directly to PRs.
Treat PR reviews as learning opportunities, not evaluations.

🚫 Common Mistakes to Avoid

Pushing directly to main

Solving multiple exercises in one branch

Poor or missing comments

Breaking the build

Forgetting to pull before coding

📚 Assignments

⬇️ The list of exercises is provided below.
(Each participant will be assigned exactly one exercise.)