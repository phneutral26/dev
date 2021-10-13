def main():
    print("Hello to my first Application! \nP.S: Please start your Answers with an Uppercase...")
    print("What is your Name? I herewith want to know it: ")
    userName = str(input(""))
    print("Oh," + userName + ", what a wonderful Name! \nI suppose you must be popular in school. Are you? ")
    popular = str(input(""))
    popularTOF = False
    if popular == "Yes":
        popularTOF = True
    else:
        popularTOF = False
    print(popularTOF)
main()