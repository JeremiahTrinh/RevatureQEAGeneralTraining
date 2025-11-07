# Originally created: 11/06/2025
# Version: 1.0.0

# 6. Write a Python program to check whether a given key already exists in a dictionary.
# Sample Output
# {'Name' : 'Ram', 'Age' : 23,}
# Key = Name
# Key is Available in the Dictionary

dict6 = {'Name' : 'Ram', 'Age' : 23,}
target_key = 'Name'

is_key_in_dict = target_key in dict6
print(is_key_in_dict)