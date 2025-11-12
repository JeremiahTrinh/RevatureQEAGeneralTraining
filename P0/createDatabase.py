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
            sql_script = """
                CREATE TABLE IF NOT EXISTS users (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    username TEXT UNIQUE NOT NULL,
                    password TEXT NOT NULL,
                    role TEXT NOT NULL
                );
                CREATE TABLE IF NOT EXISTS expenses (
                    id INTEGER PRIMARY KEY AUTOINCREMENT, 
                    user_id INTEGER NOT NULL, 
                    amount REAL NOT NULL,  
                    description TEXT NOT NULL,
                    date TEXT NOT NULL,
                    FOREIGN KEY (user_id) REFERENCES users (id)
                );
                CREATE TABLE IF NOT EXISTS approvals (
                    id INTEGER PRIMARY KEY AUTOINCREMENT, 
                    expense_id INTEGER NOT NULL,
                    status TEXT NOT NULL,
                    reviewer INTEGER,
                    comment TEXT,
                    review_date TEXT,
                    FOREIGN KEY (expense_id) REFERENCES expenses (id),
                    FOREIGN KEY (reviewer) REFERENCES users (id)
                );
            """
            cur.executescript(sql_script)
            conn.commit()
    except sql.Error as e:
        print(f"SQLite Error: {e}")

def insert_samples():
    sample_users = [
        ("Jeff", "password1", "Employee"),
        ("Jane", "password2", "Employee"),
        ("Smith", "password3", "Employee"),
        ("Abagail", "password4", "Manager"),
        ("Terry", "password5", "Manager"),
        ("Pablo", "password6", "Employee"),
        ("Walker", "password7", "Employee"),
        ("Muhammad", "password8", "Manager"),
        ("Bruce", "password9", "Employee"),
        ("Oscar", "password10", "Employee"),
        ("Larry", "password11", "Employee"),
        ("James", "password1", "Manager"),
        ("Susan", "password7", "Manager"),
        ("Adeline", "password123", "Employee"),
        ("Danielle", "password789", "Employee"),
        ("Patricia", "password643", "Employee"),
    ]
    sample_expenses = [
        (1, 19.99, "Lunch", "2024-12-01"),
        (2, 39.52, "Commuting expenses", "2025-01-31"),
        (2, 9.95, "Lunch", "2025-01-14"),
        (16, 109.72, "Brunches for the month", "2025-02-28"),
        (10, 5273.77, "Yearly travel expenses for 2024", "2025-01-10"),
        (13, 346, "Slushies", "2025-10-13"),
        (7, 178.85, "Staplers", "2024-11-30"),
        (9, 500, "Things", "2025-07-03"),
        (6, 213.24, "Miller lite", "2025-06-07"),
        (14, 64.43, "Covering tab for a manager", "2025-08-23"),
        (11, 76.32, "Business-related handkerchief", "2025-05-30")
    ]
    sample_approvals = [
        (6, "pending", 13, "Why are you work-expensing slushies", "2025-10-20"),
        (4, "approved", 4, "Brunches were work-related and professional in nature", "2025-03-14"),
        (3, "denied", 4, "No", "2025-01-14"),
        (5, "pending", None, None, None),
        (8, "approved", 5, "Sure, whatever", "2025-07-10"),
        (9, "denied", 5, "Recreational beer is not a work expense", "2025-06-10"),
        (11, "pending", None, None, None),
        (2, "approved", 12, "Proper documentation of commuting provided", "2025-02-20"),
        (10, "denied", 13, "The manager referenced in this expense does not exist", "2025-08-30"),
        (1, "pending", 8, None, None)
    ]
    try:
        with sql.connect(db) as conn:
            cur = conn.cursor()
    except sql.Error as e:
        print(f"SQLite Error: {e}")