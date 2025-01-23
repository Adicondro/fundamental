def switch(case):
    switcher = {
        1: "Case 1",
        2: "Case 2",
        3: "Case 3"
    }
    return switcher.get(case, "Default case")

# Example usage
case_number = 2
print(switch(case_number))  # Output: Case 2