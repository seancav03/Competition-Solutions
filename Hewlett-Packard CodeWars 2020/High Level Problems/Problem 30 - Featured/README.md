# Problem 30 - Hardest Problem
Solution Author: Sean Cavalieri

# Overview
There were 30 problems in the 2020 HPE CodeWars competition. In general, the problems get more difficult as the problem number gets high. However, problem 30 is an exception. According to CodeWars staff, problem 30 is included to "make things interesting". That is, it is significantly more difficult than any other problem. I encourage you to read the provided problem statement, but the general idea of the problem is similar to that of solving a sudoku. 

# My Thoughts and Solution
I tried to solve the test cases by hand as if I were solving a puzzle. This worked for the smaller tests, but not the larger ones. I was lost in finding a procedural method of solving the puzzles. That led me to the obvious next thought: Can I brute force it? Short answer: No. Not in a million years. 
However, there is an optimization that makes a version of brute force feasible. [Backtracking](https://en.wikipedia.org/wiki/Backtracking) is a brute force style algorithm that is able to solve Sudoku puzzles due to its clever optimization. Instead of brute forcing by filling the entire puzzle with guesses and then checking, this method fills a single square with a guess and checks to see if the puzzle is still potentially solvable within the given rules. 
For example: If a sudoku board already has a 1 in the top left 3x3 square when the algorithm tries to fill in the first blank in that region with a 1, the rules check can determine that this solution is already invalid. No permutation of guesses in the other squares could yield a valid solution. So, the algorithm tries a new guess. If this new guess is valid so far, a guess is made for the next unknown. If the current position is still valid, the algorithm proceeds in this manner. If not, the algorithm makes a new guess. If every possible value has tried in the latest unknown spot and none are valid, the algorithm backtracks. It clears that unknown, goes to the previous unknown, and tries a new value there. In many cases backtracking will undo much of the current solution. However, eventually the right solution will be reached. Because the vast majority of possible permutations were not attempted, this algorithm is far superior to brute force.
While brute force may take a million years, backtracking may only take seconds in the average case.

# The Solution
Once I had the method down, I implemented it for this problem. Because this problem contains rules which allow checking for feasibility without completeing the puzzle, backtracking works very well. I used a recursive method to iterate through the unknowns, and I wrote checkers for viability at each step. This solution enabled our team to pull away from the rest of the competition to finish in 1st place internationally.

