
# Rover TDD Kata

Create an API that moves a rover around on a grid.

## Rules:

- [X] You are given the initial starting point (0,0,N) of rover.

- [X] 0,0 are X,Y coordinates on a grid of (10,10).

- [X] N is the direction it is facing (i.e. N,S,E,W)

- [X] L and R allow the rover to rotate left and right.

- [ ] M allows the rover to move one point in the current direction.

- [ ] The rover receives a char array of commands e.g. RMMLM and returns the finishing point after the moves e.g. 2:1:N

- [ ] The rover wraps around if it reaches the end of the grid.

- [ ] The grid may have obstacles. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle e.g. O:2:2:N.


## Thanks to

This awesome [video](https://youtu.be/24vzFAvOzo0) of [@sandromancuso](https://www.github.com/sandromancuso) 