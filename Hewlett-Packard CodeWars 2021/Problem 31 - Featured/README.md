# Problem 31 - Hardest Problem
Solution Author: Sean Cavalieri

# Overview
There were 31 problems in the 2021 HPE CodeWars competition. In general, the problems get more difficult as the problem number gets high. However, the last problem is an exception. According to CodeWars staff in 2020, the last problem is included to "make things interesting". That is, it is significantly more difficult than any other problem. I encourage you to read the provided problem statement.

# My thoughts
This was a timed 3 hour competition. Time is everything. My team was plowing through the easy problems and coasting through the mid-level ones. Half way through the competition, I wanted to look at the hardest problem merely to see how hard it looked. When I got there, I recognized a potential solution. The problem involves solving a puzzle. Moreover, I recognized similarities between this problem and the hardest problem in last year's CodeWars competition. The puzzle is created such that guesses for the puzzle blanks can be checked by the rules in many cases even when the puzzle is not complete. This is the requirment for backtracking to potentially be a successful solution. Solving the later problems earn more points, so I told my team that I think I can solve this problem so I am going for it. 45 minutes later, I submitted my solution. It had worked on all the student test cases, and when I got the result, it had passed the judges test data as well. 

# The Solution
To learn more about backtracking, learn more [here](https://en.wikipedia.org/wiki/Backtracking) or look in the Hewlett-Packard CodeWars 2021 directory for last year's problem. I explain the solution there. The problem is in the folder "High Level Problems and it is problem 30. In short, the method uses recursion to make a guess in a single blank. It proceeds to the next blank if no rules have yet been violated, and it tries again or goes back if a check did find a rule break. I implemented checker functions that checked for rule compliance even with blanks still in the puzzle, and I used that at each step of the recursion. When finished, the solution was always found in seconds. 
