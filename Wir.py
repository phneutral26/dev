import time as t
import random
import pyautogui
import os
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
    loginName = input("Gebe deinen Benutzername ein: ")
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

def philLoggedIn():
    print("Phil ist eingeloggt")
def maxLoggedIn():
    print("Max ist eingeloggt")
def daniLoggedin():
    print("Dani ist eingeloggt")
def nicoLoggedIn():
    print("Nico ist eingeloggt")

def userManager():
    if loggedInUser == "Phil":
        philLoggedIn()
    elif loggedInUser == "Max":
        maxLoggedIn()
    elif loggedInUser == "Dani":
        daniLoggedin()
    elif loggedInUser == "Nico":
        nicoLoggedIn()

def calc():
    number1 = int(input("Erste Nummer: "))
    number2 = int(input("Zweite Nummer: "))
    sum = number1 + number2
    sub = number1 - number2
    dif = number1 / number2
    mul = number1 * number2
    choice = int(input("Plus, Minus, Durch, oder Mal? 1,2,3,4: "))
    if choice == 1:
        print(sum)
    elif choice == 2:
        print(sub)
    elif choice == 3:
        print(dif)
    elif choice == 4:
        print(mul)
    else:
        print("Inkorekkte Eingabe. Versuche es erneut...")
        calc()
def spammer(spammer_times):
    for i in range(spammer_times):
        t.sleep(0.06)
        pyautogui.click()
def guesserHard():
    print("Willkommen! Dies ist das Rate Spiel in Hart!")
    print("Hier rätst du Nummern von 1 - 1000!")
    print("Es klingt vielleicht scwierig, aber mit den Hinweisen die ich hinzugefügr habe, geht es ganz gut!")
    t.sleep(3)
    n = random.randint(1, 999)
    guess = int(input("Gib eine Zahl von 1 - 999 ein: "))
    while n != "guess":
        print
        if guess < n:
            print("Zu Niedrig")
            guess = int(input("Gib eine Zahl von 1 - 999 ein:: "))
        elif guess > n:
            print("Zu Hoch")
            guess = int(input("Gib eine Zahl von 1 - 999 ein: "))
        else:
            print("Erraten!")
            break
        print

def guesserEasy():
    print("Willkommen! Dies ist das Rate Spiel in Leicht")
    print("Hier rätst du Zahlen von 1 - 100!")
    print("Es klingt vielleicht scwierig, aber mit den Hinweisen die ich hinzugefügr habe, geht es ganz gut!")
    t.sleep(3)
    n = random.randint(1, 100)
    guess = int(input("Gib eine Zahl von 1 - 100 ein: "))
    while n != "guess":
        print
        if guess < n:
            print("Zu Niedrig")
            guess = int(input("EGib eine Zahl von 1 - 100 ein: "))
        elif guess > n:
            print("Zu Hoch")
            guess = int(input("Gib eine Zahl von 1 - 100 ein: "))
        else:
            print("Erraten!")
            break
        print

def games():
    print("1. Rate Spiel (leicht)")
    print("2. Rate Spiel (HART)")
    game_Choice = int(input("1 or 2: "))
    if game_Choice == 1:
        guesserEasy()
    elif game_Choice == 2:
        guesserHard()
def adminTools():
    print("Nothing here yet...")
    t.sleep(1)
    print("At least for now ;)")
def console():
    print("1. Rechner")
    print("2. Spiele")
    print("3. Auto Clicker")
    print("4. Admin Tools (nichts bis jetzt)")
    admin_Choice = (input("1, 2 or 3: "))
    if admin_Choice == 1:
        calc()
        console()
    elif admin_Choice == 2:
        games()
        console()
    elif admin_Choice == 3:
        spammer_count = int(input("Wie oft soll gespammt werden? "))
        print("Gehe schnell zum anclickbaren Punkt!")
        t.sleep(3)
        spammer(spammer_count)
        console()
    else:
        console()
    
    
def startup():
    print("Beep Boop...")
    print("Hochfahren...")
    t.sleep(2)
    print("Nur noch Kurz....")
    t.sleep(1.23)
startup()
login()    
if trueLogin == True:
    console()
