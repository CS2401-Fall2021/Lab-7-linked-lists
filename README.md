# Lab 7: Linked Lists and Halloween

## Background
You are trick-or-treating along a long street. Each house is giving out candy, but some hand out more than others. Unfortunately, you are limited by the number of houses you can go to. You want to maximize the amount of candy you recieve but there are some rules.
1) You cannot return to a house once you've passed it.
2) It's a one way street, and you can only go in one direction
3) You cannot visit more than n houses
4) You cannot skip houses

Since this lab is about linked lists, we can think about modeling this as a linked list with the Nodes representing our houses.

## What we want to model
### House
Each house has the following
* The house that comes next 
* How much candy it is given out.



## Parts of the lab

## Part 1: Implement the House object (10 pts)
House should take in how much candy it gives out, and have another variable named nextHouse to track what house comes after it. 
NextHouse should be public so we can set its value later (i.e. not in the constructor). The fields must be named nextHouse and candy or you will fail the autograder.

## Part 2: Create the street from an array (20 pts: 10 code, 10 reflections)
Implement modelStreet(int[] model) in Main.java Given an array of integers that represent the amount of candy given out at each house, transform this array into a Linked List of houses giving out candy.
Return the first house in the street. If the array is empty, return null.  We can assume there is no one who will steal candy, so 
If you have negative values, set them to be 0.  

For each integer value in the input array
1) Create a house object currentHouse with the amount of candy equivalent to the integer value
2) If there is a previous house, set that previous house's nextHouse to be currentHouse
3) Now, previous house is the currentHouse.

## Part 3: Given a starting House h, determine how much candy you can get in n houses (30 pts: 10 code, 20 reflection)
Implement the *RECURSIVE* method int getCandy(House h, int n) in Main.java which returns the total amount of candy that can be gotten in n houses starting at House h. While you could do this iteratively, you must do it recursively to recieve full credit. If h is null of steps is negative return 0.

## Part 4: Given a street that starts at House h, determine which house you should start at to maximize your candy (20 pts: 10 code, 10 reflection)
Implement House getMaxCandyOnStreet(House h, int n) in Main.java. This is a little different than the question above. 
You essentially need to try starting at each house on the street and return the house you want to start at to maximize your candy.
If h is null, or there are negative steps return null.

## Part 5: Tests (30 pts)
Write 2 tests for each of your methods
* modelStreet(int[] model)
* getCandy(House h, int n)
* getMaxCandyOnStreet(House h, int n)
Include input,output and what you're testing

## Take it further
How would you implement a solution to part 4 that had O(n) runtime?
How would you solve this problem if you could skip houses, and needed to select n houses?
How would you solve this problem if you had negative candy?
