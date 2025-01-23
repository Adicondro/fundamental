# Arithmetic Operators
a = 10
b = 5

print("Addition:", a + b)        # Output: 15
print("Subtraction:", a - b)     # Output: 5
print("Multiplication:", a * b)  # Output: 50
print("Division:", a / b)        # Output: 2.0
print("Modulus:", a % b)         # Output: 0
print("Exponentiation:", a ** b) # Output: 100000
print("Floor Division:", a // b) # Output: 2

# Comparison Operators
print("Equal:", a == b)          # Output: False
print("Not Equal:", a != b)      # Output: True
print("Greater than:", a > b)    # Output: True
print("Less than:", a < b)       # Output: False
print("Greater than or equal to:", a >= b) # Output: True
print("Less than or equal to:", a <= b)    # Output: False

# Logical Operators
x = True
y = False

print("AND:", x and y)           # Output: False
print("OR:", x or y)             # Output: True
print("NOT:", not x)             # Output: False

# Bitwise Operators
c = 6  # 110 in binary
d = 2  # 010 in binary

print("Bitwise AND:", c & d)     # Output: 2 (010)
print("Bitwise OR:", c | d)      # Output: 6 (110)
print("Bitwise XOR:", c ^ d)     # Output: 4 (100)
print("Bitwise NOT:", ~c)        # Output: -7
print("Bitwise left shift:", c << 1)  # Output: 12 (1100)
print("Bitwise right shift:", c >> 1) # Output: 3 (011)

# Assignment Operators
e = 5
e += 3
print("e += 3:", e)              # Output: 8
e -= 2
print("e -= 2:", e)              # Output: 6
e *= 2
print("e *= 2:", e)              # Output: 12
e /= 4
print("e /= 4:", e)              # Output: 3.0
e %= 2
print("e %= 2:", e)              # Output: 1.0
e **= 3
print("e **= 3:", e)             # Output: 1.0
e //= 2
print("e //= 2:", e)             # Output: 0.0

# Identity Operators
f = [1, 2, 3]
g = [1, 2, 3]
h = f

print("f is g:", f is g)         # Output: False
print("f is h:", f is h)         # Output: True
print("f is not g:", f is not g) # Output: True

# Membership Operators
print("1 in f:", 1 in f)         # Output: True
print("4 not in f:", 4 not in f) # Output: True