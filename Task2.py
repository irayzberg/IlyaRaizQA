#100 90 70 40 0
try:
    a = input("Введите число: \n")
    b = 10
    i = 1
    while int(a) > 0:
        a = int(a) - b*i
        i += 1
        if a < 0:
            break
        print(a)
except ValueError:
        print("Ошибка! Введите число!")
        a = input("Введите число: \n")
        while int(a) > 0:
            a = int(a) - b*i
            i += 1
            if a < 0:
                break
            print(a) 
