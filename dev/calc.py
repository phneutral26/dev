#Create ways to calculate (btw im german, so my english may not be so good)

# __________
#| ________ |
#||12345678||
#|""""""""""|
#|[M|#|C][-]|
#|[7|8|9][+]|
#|[4|5|6][x]|
#|[1|2|3][%]|
#|[.|O|:][=]|
#"----------"


def addition(x, y):
    return x + y
def subtraction(x, y):
    return x - y
def division(x, y):
    return x / y
def multiplication(x, y):
    return x * y

#testing
#print(multiplication(12, 5))
#thinkinng.... how to go on?
#q&a part
print("1. Add")
print("2. Subtract")
print("3. Multiply")
print("4. Divide")  
print("Choose operation: ")

while True:
    choice = input("Enter Choice: ")
    if choice in ('1', '2', '3', '4'):
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))

        if choice == '1':
            print(num1, "+", num2, "=", addition(num1, num2))

        elif choice == '2':
            print(num1, "-", num2, "=", subtraction(num1, num2))

        elif choice == '3':
            print(num1, "*", num2, "=", multiplication(num1, num2))

        elif choice == '4':
            print(num1, "/", num2, "=", division(num1, num2))
        break
    else:
        print("Invalid Input")

