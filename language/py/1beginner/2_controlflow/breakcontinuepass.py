# Example of break
print("Example of break:")
for i in range(10):
    if i == 5:
        break
    print(i)

# Example of continue
print("\nExample of continue:")
for i in range(10):
    if i % 2 == 0:
        continue
    print(i)

# Example of pass
print("\nExample of pass:")
for i in range(10):
    if i % 2 == 0:
        pass  # Placeholder for future code
    else:
        print(i)