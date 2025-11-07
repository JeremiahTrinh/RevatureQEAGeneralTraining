import pandas as pd

df = pd.read_json('data.json')
print(df.to_string())
print(df)
print(df.head(8))
print(df.tail(15))