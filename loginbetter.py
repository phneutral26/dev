import hashlib
# Du Huahn
class User(): #User model
    def __init__(self, username, hash_password):
        self.username = username
        self.password = hash_password

def register(users): #registration function
    username = input("Username: ")
    password = input("Password: ")

    encoded_password = password.encode()
    password = hashlib.sha256(encoded_password).hexdigest()

    users += [User(username, password)]

    with open("users.txt", "w") as file:
        file.seek(0), file.truncate()
        for user in users:
            file.write("{}, {}\n".format(user.username, user.password))

    return users

def login(users): #login function
    username = input("Username: ")
    password = input("Password: ")

    encoded_password = password.encode()
    password = hashlib.sha256(encoded_password).hexdigest()

    for user in users:
        if username == user.username:
            if password == user.password:
                print("you're logged in")
                return user, True
            else:
                print("wrong password")
                return None, False
    print("user does not exist")
    return None, False


def logout():
    print("you're logged out")
    return None, False

def interface(users):
    logged_user = None
    trueLogin = False
    while True:
        if trueLogin:
            print(f"Hello {logged_user.username}! do you want to take action?\n [1] logout\n [exit] exit")
            action = input("action: ")
            if action == "1":
                logged_user, trueLogin = logout()
            elif action.lower() == "exit":
                return
            else:
                print("try again")
        else:
            print("which action do you want to take?\n [1] login\n [2] register\n [exit] exit")
            action = input("action: ")
            if action == "1":
                logged_user, trueLogin = login(users)
            elif action == "2":
                users = register(users)
            elif action.lower() == "exit":
                return
            else:
                print("try again")


def readUsersAndRegister():
    try:
        with open("users.txt", "r") as file: #read file with users if it exists
            data = file.read()
            data = data.split("\n")             #Every User has his own line, so every User will be

        users_data = []
        users = []

        for user in data:
            users_data += [user.split(",")]

        users_data = users_data[:-1]
        for user in users_data:
            users += [User(user[0], user[1])]
    except:
        users = []

    return users

interface(readUsersAndRegister())
