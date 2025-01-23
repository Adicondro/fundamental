# String Concatenation
str1 = "Hello"
str2 = "World"
concatenated_str = str1 + " " + str2
print("Concatenated String:", concatenated_str)

# String Slicing
sample_str = "Hello, World!"
sliced_str = sample_str[0:5]  # Slicing the first 5 characters
print("Sliced String:", sliced_str)

# String Methods
# .upper() - Converts all characters to uppercase
upper_str = sample_str.upper()
print("Uppercase String:", upper_str)

# .lower() - Converts all characters to lowercase
lower_str = sample_str.lower()
print("Lowercase String:", lower_str)

# .replace() - Replaces a substring with another substring
replaced_str = sample_str.replace("World", "Python")
print("Replaced String:", replaced_str)

# .split() - Splits the string into a list based on a delimiter
split_str = sample_str.split(", ")
print("Split String:", split_str)