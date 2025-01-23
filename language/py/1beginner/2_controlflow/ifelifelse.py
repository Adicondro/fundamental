# Conditional statements in Python: if, elif, and else

# The 'if' statement is used to test a specific condition.
# If the condition evaluates to True, the block of code inside the 'if' statement is executed.

x = 10
if x > 5:
    print("x is greater than 5")

# The 'elif' statement stands for "else if".
# It allows you to check multiple expressions for True and execute a block of code as soon as one of the conditions is True.

y = 20
if y < 10:
    print("y is less than 10")
elif y == 20:
    print("y is equal to 20")

# The 'else' statement catches anything which isn't caught by the preceding conditions.
# It is executed if all the previous conditions are False.

z = 30
if z < 10:
    print("z is less than 10")
elif z == 20:
    print("z is equal to 20")
else:
    print("z is greater than 20")