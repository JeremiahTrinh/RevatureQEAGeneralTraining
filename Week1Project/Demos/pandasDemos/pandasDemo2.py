import pandas as pd

df = pd.read_csv('data.csv')
print(df.head(10))

# Return a new Data Frame with no empty cells:
new_df = df.dropna()
print(new_df.to_string())

# Remove all rows with NULL values:
df.dropna(inplace = True)
print(df.to_string())

# Returns True for every row that is a duplicate, otherwise False:
print(df.duplicated())

# Remove all duplicates:
df.drop_duplicates(inplace = True)