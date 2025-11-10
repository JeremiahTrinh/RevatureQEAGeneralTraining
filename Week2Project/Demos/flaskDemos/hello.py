from flask import Flask
import math

app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello, World!'

@app.route('/hello')
def hello_again():
    return 'Hello, World again!'

@app.route('/hello/<name>')
def hi_name(name):
    return "Hi, %s!" % name.upper()

# DONE: Write a method that takes an int in the url and displays the square of that number
@app.route('/int/square/<int:num>')
def square(num):
    return str(num**2)

# DONE: Write a method that calculates the area of a circle
@app.route('/circle/area/<float:num>')
def area_circle(num):
    return f"Area of circle: {math.pi * num ** 2}"

# DONE: Write a method to display the sum of two numbers
@app.route('/sum/<int:num1>/<int:num2>')
def sum_numbers(num1, num2):
    return f"{num1} + {num2} = {num1 + num2}"

def hithere():
    return 'hi there!'

app.add_url_rule('/hi', 'hi', hithere)

if __name__ == '__main__':
    app.run(debug=True)