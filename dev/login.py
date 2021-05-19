#| |           (_)      
#| | ___   __ _ _ _ __  
#| |/ _ \ / _` | | '_ \ 
#| | (_) | (_| | | | | |
#|_|\___/ \__, |_|_| |_|
#          __/ |        
#         |___/


from getpass import getpass #imports a lib


valid_username = "phil" #creates a variable valid_username with the value of "user"
correct_password = "phil" #creates a variable correct_password with the value of "passwd"

def login(username, password): #defines a function "login" with 2 arguments that gets passed on call
    if username != valid_username: #checks if username is not equals to the valid username variable, "!=" means "not equals"
        print("User doesen't exist :(") #prints a nice error message
    elif password == correct_password: #runs if username was equals to the valid username, "elif" means else if
        loggedin() #calls the function "loggedin"
    else: #runs if not any of the above happend
        print("Incorrect password") #nice message

def loggedin(): #defines function loggedin
    print("You are logged in") #prints that you are logged in


username = input("Username: ") #gets user input and stores it into a variable called "username"
password = getpass("Password: ") #gets user input by a function "getpass" which is from the lib we imported and stores it into the password variable
login(username, password) #runs the login function with the given username and password as arguments
