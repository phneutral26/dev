rest = []


def dezinbin():
    dezNum = int(input("Give a decimal integer to the computer: "))
    checkInt = isinstance(dezNum, int)
    if checkInt is True:
        while dezNum > 0:
            rest.append(dezNum % 2)
            dezNum = dezNum // 2
        rest.reverse()
        print(*rest)
    else:
        print("Invalid Input, try again")
        dezinbin()


# dezinbin()

def dezinhexcom():
    dezNum = int(input("Give a decimal integer to the computer:  "))
    hex_values = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd', 'e', 'f']
    reversed_number = ""
    checkInt = isinstance(dezNum, int)
    if checkInt is True:
        while dezNum > 0:
            rest = dezNum % 16
            dezNum -= rest
            dezNum //= 16
            reversed_number += str(hex_values[rest])
        print(reversed_number[::-1])
    else:
        print("Invalid Input, try again.")
        dezinhexcom()

# dezinhex()


def dezinhex():
    number = int(input("Give decimal number:"))
    return hex(number)


def main():
    print("Starting...")
    print("================================")
    print("1. Decimal in Binary")
    print("================================")
    print("2. Decimal in Hexadecimal")
    print("================================")
    print("3. Binary in Decimal")
    print("================================")
    print("4. Binary in Hexadecimal")
    print("================================")
    print("5. Hexadecimal in Binary")
    print("================================")
    print("6. Hexadecimal in Decimal")
    print("================================")
    print("Which operation do you want to perform? ")
    choice = int(input(""))
    if choice == 1:
        dezinbin()
    elif choice == 2:
        # print(dezinhex())
        dezinhexcom()
    elif choice == 3:
        binzahl = input("Input Binary: ")
        print(int(binzahl, 2))
    elif choice == 4:
        binzahl = input("Input Binary: ")
        print(hex(int(binzahl, 2)))
    elif choice == 5:
        hexzahl = input("Input Hex: ")
        print(bin(int(hexzahl, 16))[2:])
    elif choice == 6:
        hexnumber = input("Input Hex: ")
        print(int(hexnumber, 16))
    else:
        return


main()
