from flask import Flask, redirect, url_for

app = Flask(__name__)

@app.route('/admin/<admin>')
def hello_admin(admin):
    return 'Hello, admin %s!' % admin.upper()

@app.route('/guest/<guest>')
def hello_guest(guest):
    return 'Hello, guest %s!' % guest.capitalize()

@app.route('/user/<name>')
def hello_user(name):
    if name == 'admin':
        return redirect(url_for('hello_admin', admin=name))
    else:
        return redirect(url_for('hello_guest', guest=name))

if __name__ == '__main__':
    app.run(debug=True)