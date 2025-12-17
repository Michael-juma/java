# .Getting Started with Java – Building a Simple Backend Application

# Objective

The objective of this project is to learn the basics of Java by building a simple backend application. This project focuses on understanding how Java runs on the JVM, how backend logic is written, and how Java can be used to serve responses through a web server.

# Technology Chosen

Java (JDK 17+)

# Why I Chose Java

Java is widely used in enterprise and backend development

It is strongly typed, which helps in writing reliable code

It powers real-world systems such as banking platforms and large-scale APIs

It integrates well with frameworks like Spring Boot

End Goal

# The end goal is to successfully run a Java application locally that:

Compiles and runs on the JVM

Outputs data to the console or browser

Demonstrates basic backend logic

Runs correctly using a local Java setup

# Quick Summary of the Technology

Java is a high-level, object-oriented programming language used to build scalable and secure applications.

What is Java?

Java code is compiled into bytecode and executed by the Java Virtual Machine (JVM). This allows Java programs to run on different operating systems without modification.

Where is Java Used?

Backend web applications

Enterprise systems

Android development

APIs and microservices

Desktop applications

Real-World Example

Major platforms such as Netflix, Amazon, and LinkedIn use Java extensively in their backend systems.

# System Requirements
   Operating System

Linux (Ubuntu 22.04 recommended)

macOS or Windows

Tools & Editors

Java Development Kit (JDK 17+)

Terminal / Command Line

IntelliJ IDEA or VS Code

Web Browser (Chrome, Firefox, etc.)

Git

Packages

Java JDK

Maven (for dependency management)

# Installation & Setup Instructions
   Step 1: Update the System
   sudo apt update
   sudo apt upgrade -y

Step 2: Install Java (JDK 17)
sudo apt install openjdk-17-jdk -y

Step 3: Verify Installation
java -version
javac -version

You should see output showing Java 17 or higher.

Step 4: Create a Test Project
mkdir java-beginner-toolkit
cd java-beginner-toolkit
nano HelloWorld.java

# Add this code:

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello from Java!");
}
}

Step 5: Compile and Run
javac HelloWorld.java
java HelloWorld

# Minimal Working Example
   What the Example Does

Compiles Java source code

Runs the program using the JVM

Displays output in the terminal

Demonstrates basic Java execution

# Example Code (HelloWorld.java)

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello from Java!");
}
}

# Expected Output

When you run the program, you should see:

Hello from Java!

## AI Prompt Journal
   Prompt Used

“Give me step-by-step instructions to install Java on Ubuntu 22.04.”

Curriculum Link

Java Installation – https://docs.oracle.com/en/java/javase/17/install/

# AI Response Summary

The AI provided clear terminal commands for installing the JDK, verifying the installation, and compiling and running a Java program.

Helpful Response Excerpt

“Java programs are compiled using javac and executed using the java command.”

Evaluation

The AI was helpful in breaking down Java installation and explaining the difference between compiling and running Java programs.

## Common Issues & Fixes
   Issue 1: java: command not found

Cause: Java is not installed
Fix:

sudo apt install openjdk-17-jdk

Issue 2: Compilation error

Cause: Syntax error in Java code
Fix:
Check for missing semicolons or incorrect class names.

Issue 3: Class not found error

Cause: Incorrect file or class name
Fix:
Ensure the class name matches the file name exactly.

Helpful Links

https://stackoverflow.com

https://docs.oracle.com/javase/

## References

Java Official Documentation: https://docs.oracle.com/javase/

Oracle Java Tutorials: https://docs.oracle.com/javase/tutorial/

Stack Overflow: https://stackoverflow.com

moringaschool.com – AI-assisted learning
