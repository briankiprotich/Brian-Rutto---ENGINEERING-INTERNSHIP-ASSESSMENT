# Brian-Rutto---ENGINEERING-INTERNSHIP-ASSESSMENT

# TASK 1 : FibonacciGenerator

This is a Java program that generates the Fibonacci sequence up to a given number. The program uses memoization to optimize the performance of the Fibonacci function.
The program's main function first gets the user's input and validates it. If the user enters a valid positive integer, the program then generates and prints the Fibonacci sequence up to that number.
The program also limits the values that a user can input to 1000 to prevent overwhelming the computer.
It uses an array to store the Fibonacci numbers, rather than using recursion. This makes the program more efficient.

# Assessments Q2 LargestDifference.java
This Java function finds the largest difference between any two numbers in a list.

The function first checks if the list has less than two elements. If so, it returns 0 because there are not enough numbers to calculate a difference.

It initializes the minimum number as the first element in the list and the maximum difference as 0.

The function iterates through the list starting from the second element. For each element, it calculates the difference between the current number and the minimum number.

If the calculated difference is greater than the current maximum difference, it updates the maximum difference accordingly.

If the current number is smaller than the minimum number, it updates the minimum number.

After iterating through all the numbers, the function returns the maximum difference.

# Assessments Q3 employees_select_query.sql

query retrieves the rows from the employees table where the age is greater than 30 and the salary is greater than 50000. The result will include the id, name, age, and salary values for those rows that meet the specified conditions
