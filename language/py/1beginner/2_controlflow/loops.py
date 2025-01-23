# Notes on Looping in Python

# For Loop
# The for loop in Python is used to iterate over a sequence (such as a list, tuple, dictionary, set, or string).
# Example:
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)

# While Loop
# The while loop in Python is used to execute a block of code as long as a condition is true.
# Example:
count = 0
while count < 5:
    print(count)
    count += 1  # Note: Python does not have i++ or ++ method, use += 1 instead

# Python does not support the increment (++) operator like in some other languages (e.g., C, C++).
# Instead, you can use the += operator to increment a variable.
# Example:
i = 0
i += 1  # This is equivalent to i = i + 1
print(i)  # Output: 1


# For Loop with range
# The range() function generates a sequence of numbers, which is used to iterate over with for loop.
# Example:
for number in range(5):
    print(f"Now is number : {number}")