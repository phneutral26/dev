import time as t
import random
userNames = ["muh", "Phil", "Max", "Dani", "Nico"]
passwords = ["muh", "0612", "Wikinger09", "1212", "difficult"]
loggedInUser = "test"
trueLogin = False
def newUser():
    newName = input("Neuer Name: ")
    newPassword = input("Neues Passwort: ")
    userNames.append(newName)
    passwords.append(newPassword)


        

def login():
    global trueLogin
    loginName = input("Gebe deinen Benutzername ein.: ")
    if loginName == "new":
        newUser()
    elif loginName == "Phil":
        loginPassword = input("Gib Dein Passwort ein: ")
        if loginPassword == passwords[1]:
            print("Succesful Login!")
            global loggedInUser
            loggedInUser = "Phil"
            trueLogin = True
        else:
            print("Bad...")
            
    elif loginName == "Max":
        loginPassword = input("Gib dein Passwort ein: ")
        if loginPassword == passwords[2]:
            print("Succesful Login!")
            loggedInUser = "Max"
            trueLogin = True
        else:
            print("Bad...")
    elif loginName == "Dani":
        loginPassword = input("Gib dein Passwort ein: ")
        if loginPassword == passwords[3]:
            print("Succesful Login!")
            loggedInUser = "Dani"
            trueLogin = True
        else:
            print("Bad...")
    elif loginName == "Nico":
        loginPassword = input("Gib dein Passwort ein: ")
        if loginPassword == passwords[4]:
            print("Succesful Login!")
            loggedInUser = "Nico"
            trueLogin = True
        else:
            print("Bad...")
    else:
        print("No User Named like that...")
        print("Creating New One")
        t.sleep(5)
        print("Getting there...")
        print(".")
        print(".")
        print(".")
        t.sleep(0.5)
        newUser()
    
def calc():
    number1 = int(input("First Number: "))
    number2 = int(input("Second Number: "))
    sum = number1 + number2
    sub = number1 - number2
    dif = number1 / number2
    mul = number1 * number2
    choice = int(input("Add, Sub, Div, or Mul? 1,2,3,4: "))
    if choice == 1:
        print(sum)
    elif choice == 2:
        print(sub)
    elif choice == 3:
        print(dif)
    elif choice == 4:
        print(mul)
    else:
        print("Incorrect Input. try again.")
        calc()

def guesserHard():
    print("Welcome to the Guessing Game!")
    print("Here you guess a number from 1 - 1000!")
    print("It might sound hard, but with the hints that i added, it will be easy!")
    t.sleep(3)
    n = random.randint(1, 999)
    guess = int(input("Enter an integer from 1 to 999: "))
    while n != "guess":
        print
        if guess < n:
            print("guess is low")
            guess = int(input("Enter an integer from 1 to 99: "))
        elif guess > n:
            print("guess is high")
            guess = int(input("Enter an integer from 1 to 99: "))
        else:
            print("you guessed it!")
            break
        print

def guesserEasy():
    print("Welcome to the Guessing Game!")
    print("Here you guess a number from 1 - 100!")
    print("It might sound hard, but with the hints that i added, it will be easy!")
    t.sleep(3)
    n = random.randint(1, 100)
    guess = int(input("Enter an integer from 1 to 100: "))
    while n != "guess":
        print
        if guess < n:
            print("guess is low")
            guess = int(input("Enter an integer from 1 to 99: "))
        elif guess > n:
            print("guess is high")
            guess = int(input("Enter an integer from 1 to 99: "))
        else:
            print("you guessed it!")
            break
        print

def games():
    print("1. Guessing Game (easy)")
    print("2. Guessing Game (HARD)")
    game_Choice = int(input("1 or 2: "))
    if game_Choice == 1:
        guesserEasy()
    elif game_Choice == 2:
        guesserHard()
def adminTools():
    print("Nothing to see here!")
    t.sleep(1)
    print("At least for now ;)")
def console():
    print("1. Calculator")
    print("2. Games")
    print("3. Admin Tools")
    admin_Choice = int(input("1, 2 or 3: "))
    if admin_Choice == 1:
        calc()
        console()
    elif admin_Choice == 2:
        games()
        console()
    elif admin_Choice == 3:
        adminTools()
        console()


login()    
if trueLogin == True:
    console()
