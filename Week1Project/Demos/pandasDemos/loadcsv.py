import pandas as pd

df = pd.read_csv('data.csv')
print(df)
print(df.to_string())
print(pd.options.display.max_rows)

pd.options.display.max_rows = 9999
df = pd.read_csv('data.csv')
print(df)