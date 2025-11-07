# Originally created: 11/07/2025
# Version: 1.0.0

import pandas as pd

my_dataset = {
  'cars': ["BMW", "Volvo", "Ford"],
  'passings': [3, 7, 2]
}
my_var = pd.DataFrame(my_dataset)
print(my_var)
# OUTPUT
#     cars  passings
# 0    BMW         3
# 1  Volvo         7
# 2   Ford         2

a = [1, 7, 2]
my_var = pd.Series(a)
print(my_var)
print(my_var[0]) # Returns the first value of the Series
my_var = pd.Series(a, index=['x', 'y', 'z'])
print(my_var)

data = {
  "calories": [420, 380, 390],
  "duration": [50, 40, 45]
}
# Load data into a DataFrame object:
df = pd.DataFrame(data)
print(df)
# Refer to the row index:
print(df.loc[0])
df = pd.DataFrame(data, index = ["day1", "day2", "day3"])
print(df)
print(df.loc["day2"])

# Loading a Python Dictionary into a DataFrame
data = {
  "Duration":{
    "0":60,
    "1":60,
    "2":60,
    "3":45,
    "4":45,
    "5":60
  },
  "Pulse":{
    "0":110,
    "1":117,
    "2":103,
    "3":109,
    "4":117,
    "5":102
  },
  "Maxpulse":{
    "0":130,
    "1":145,
    "2":135,
    "3":175,
    "4":148,
    "5":127
  },
  "Calories":{
    "0":409,
    "1":479,
    "2":340,
    "3":282,
    "4":406,
    "5":300
  }
}

df = pd.DataFrame(data)

print(df)