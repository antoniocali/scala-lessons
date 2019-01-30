# Scala Lessons
Scala Lessons Exercises
Lesson 01

# Info
Lessons 01 is about simple functions.
You have to write your own code in Lesson01.scala class

When you think you've done a single function, you can test via `sbt test`

To have properly Solutions, you can move to Lesson01S branch

`git checkout Lesson01S`

## Exercises

1. Factorial: write a function that calculates a factorial of a number. Function is defined like f(n) = 1\*2\*3\*..\*n. Remeber case bases: 1! = 1 and 0! = 1

2. GCD: Write a function that calculates the Greatest Common Divisor. To do this, apply the Euclidean Method: 
    2. Given two number `a` and `b`, if `b` equals to `0` then return `a`
    3. Otherwise call recursively the function with `b` and `a mod b`
    
3. Fibonacci: write a function that return the n-th element of Fibonacci Series. Remember any element of fibonacci series is calculated like the sum of n-1 and n-2. For the exercise write just the `loop` function 

4. sqrtNewton: write a function that calculates the square root of a number following the Newton method.
    4. To do it, use the function `isGoodEnough` and `improve`.
    4. The `improve` function must be written as well.
    4. The function start with a given _guess_, if the given guess `isGoodEnough` then it finishes
    4. Otherwise, it must `improve`: to do so, he must apply a function that improve the guess. In this case it's the mean between the guess and num/guess
    
    | Estimation        | Quotient            | Mean   |
    |-------------------|---------------------|--------|
    | 1                 | 2 / 1 = 2           | 1.5    |
    | 1.5               | 2 / 1.5 = 1.333     | 1.4167 |
    | 1.4167            | 2 / 1.4167 = 1.4118 | 1.4142 |
    | 1.4142            | ...                 | ...    |
    
## Run Test
To run test
1. Open terminal
2. Move to Project Directory
3. run `sbt test`