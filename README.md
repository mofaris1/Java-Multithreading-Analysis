# Multithreaded Performance Analysis in Java

## Overview
This project investigates the impact of multithreading on execution time for computational tasks. It implements a parallelized summation algorithm in Java, dividing the workload across multiple threads to calculate the sum of integers up to a large target number.

## Key Features
- **Parallel Computing:** Implements the `Runnable` interface to distribute calculations across a variable number of threads.
- **Dynamic Workload Chunking:** Automatically divides the total range into equal segments based on the specified thread count.
- **Performance Benchmarking:** Includes logic to measure and report execution time in milliseconds, allowing for an analysis of overhead versus parallel speedup.

## Benchmarking Results
The implementation was tested with varying thread counts to observe the efficiency gains and the impact of context switching:
- **1 Thread:** Baseline performance.
- **2, 5, 10, 20 Threads:** Comparative analysis of execution time.

## Technologies Used
- **Language:** Java (JDK)
- **Concepts:** Multithreading, Concurrency, Performance Optimization.

## How to Run
1. Compile the program:
   ```bash
   javac a.java
