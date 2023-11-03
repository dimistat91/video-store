# Video Store

This exercise is based on the first refactoring example from the book *Refactoring - Improving the Design of Existing Code* by Martin Fowler.

The provided program is very simple, but you could imagine it as part of a much larger system. It is used to calculate and print a statement of a
customer's charges at a video store. It is told which movies a customer rented and for how long. It then calculates the charges and the 
frequent renter points.

It is obvious that the program is not well designed. Imagine, for example, you were asked to add features such as new categories of movies 
or the capability to print the statement in HTML format as well. It's going to be hard to figure out where to make the changes and harder 
to make them without mistakes.

The goal of this exercise is to refactor the code. However, you first need a solid automated test suite 
so that you are able to refactor in small steps without breaking the existing functionality. Such a test suite is already provided in 
the **1-tests** branch and it can be used as a starting point.