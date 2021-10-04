# Lab 7: Linked Lists and Halloween

## Background
You are trick-or-treating along a long street. Each house is giving out candy, but some hand out more than others. Unfortunately, you are limited by the number of houses you can go to. You want to maximize the amount of candy you recieve but there are some rules.
1) You cannot return to a house once you've passed it.
2) It's a one way street, and you can only go in one direction
3) You cannot visit more than n houses

Since this lab is about linked lists, we can think about modeling this as a linked list with the Nodes representing our houses.

## What we want to model
### House
Each house has the following
* The house that comes next 
* How much candy it is given out.



## Parts of the lab

## Part 1: Implement the House object
House should take in how much candy it gives out, and have another variable named nextHouse to track what house comes after it.

## Part 2: Create the street from an array
Implement modelStreet(int[]) in Main.java Given an array of integers that represent the amount of candy given out at each house, transform this array into a Linked List of houses giving out candy.
Return the first house in the street. 

For each integer value in the input array
1) Create a house object currentHouse with the amount of candy equivalent to the integer value
2) If there is a previous house, set that previous house's nextHouse to be currentHouse
3) Now, previous house is the currentHouse.

## Part 3: Given a starting House h, determine how much candy you can get in n houses
Implement the method int getCandy(House h, int n) in Main.java which returns the total amount of candy that can be gotten in n houses starting at House h. 
Hint: You can do this iteratively or recursively.

## Part 4: Given a street that starts at House h, determine which house you should start at to maximize your candy
Implement getMaxCandyOnStreet(House h, int n) in Main.java. This is a little different than the question above. You essentially need to try starting at each house on the street and figure out what

## Part 5: Tests
