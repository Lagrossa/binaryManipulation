# binaryManipulation
Testing binary manipulation and bitwise operators.

# Addition
The addition portion of this class takes two integer numbers as parameters and adds them by taking the 'and' of the two numbers, bitshifting it left once, and then taking the 'xor' of the two numbers, and then adding the 'and' which has already been bitshifted and the 'xor' together. It will repeat this 39 times, accounting for the addition of all numbers between 0 and 1.0995116e+12.

2^(x+1)-1 is the highest number that can be achieved with x being the amount of iterations (since it has to be bitshifted 1 to the left, when two numbers overlap (since it runs out of bitshifts) it takes the 'or' (which would always be 1 when it runs out of bitshifts), resulting in everything equal to 2^(x+1)-1 being displayed as 2^x. Everything between 2^x and 2^(x+1)-1 are completely fine though (or any number that requires less than x amount of bitshifts).

# Subtraction

# Multiplication

# Division
