from flask import Flask, request, redirect, url_for
app = Flask(__name__)

@app.route('/admin/<admin>')
def hello_admin(admin):
    return 'Hello, admin %s!' % admin.upper()

@app.route('/guest/<guest>')
def hello_guest(guest):
    return 'Hello, guest %s!' % guest.capitalize()

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['nm']
    else:
        username = request.args.get('nm')
    if username == 'admin':
        return redirect(url_for('hello_admin', admin=username))
    else:
        return redirect(url_for('hello_guest', guest=username))

if __name__ == '__main__':
    app.run(debug=True)