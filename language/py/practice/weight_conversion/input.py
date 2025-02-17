
weight = input("Weight? ")
weight_type = input("Kg or Lbs? ")


if weight_type.upper() == "L":
    weight = int(weight) * 0.45
    print(f"You are {weight} pounds")
elif weight_type.upper() == "K":
    weight = int(weight) / 0.45
    print(f"You are {weight} kilograms")
else:
    print("Please enter a valid weight type")

