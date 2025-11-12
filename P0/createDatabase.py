# Originally created: 11/12/2025
# Version: 1.0.0
# The purpose of this script is to create the database for this project
# if it does not yet exist and then create the corresponding tables,
# as specified by P0.md. Some sample values shall also be created and
# inserted into the database.

import sqlite3 as sql
import pandas as pd

db = 'expenses_database.db'

def create_tables():
    try:
        # Creates the file if it does not exist.
        with sql.connect(db) as conn:
            cur = conn.cursor()
            cur.execute('''
                            CREATE TABLE IF NOT EXISTS expenses (
                                EXPENSE_ID INTEGER PRIMARY KEY AUTOINCREMENT, 
                                EXPENSE_DATE DATE NOT NULL, 
                                AMOUNT DOUBLE NOT NULL, 
                                CATEGORY VARCHAR(100) NOT NULL, 
                                DESCRIPTION VARCHAR(100)
                            );
                ''')
            conn.commit()
    except sql.Error as e:
        print(f"SQLite Error: {e}")