# List Comprehension in Python

# List comprehension provides a concise way to create lists.
# It consists of brackets containing an expression followed by a for clause,
# then zero or more for or if clauses. The expressions can be anything,
# meaning you can put in all kinds of objects in lists.

# Example: Create a list of squares
squares = [x**2 for x in range(10)]
print(squares)  # Output: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

# Example: Create a list of even numbers
evens = [x for x in range(20) if x % 2 == 0]
print(evens)  # Output: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

# Example: Create a list of tuples (number, square of number)
tuples = [(x, x**2) for x in range(10)]
print(tuples)  # Output: [(0, 0), (1, 1), (2, 4), (3, 9), (4, 16), (5, 25), (6, 36), (7, 49), (8, 64), (9, 81)]

# Example: Flatten a list of lists
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
flat_list = [num for row in matrix for num in row]
print(flat_list)  # Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

# Example: Create a list of strings with conditional logic
words = ["hello", "world", "python", "is", "awesome"]
short_words = [word for word in words if len(word) < 5]
print(short_words)  # Output: ['is']