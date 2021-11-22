from random import randint
x = randint(1,9)
guess = -1
print("Guess the number below 10:")
while guess != x:
    if(guess:=int(input("Guess:")) == x):
        print("Guessed Correctly")
        break
    
