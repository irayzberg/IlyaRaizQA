def multiply(num1, num2):

    num1 = num1[::-1]
    num2 = num2[::-1]

    res = [0] * (len(num1) + len(num2))

    for i in range(len(num1)):
        for j in range(len(num2)):
                res[i + j] += int(num1[i]) * int(num2[j])
                res[i + j + 1] += res[i + j] // 10
                res[i + j] %= 10

    res = res[::-1]

    for k in res:
        if res[0] == 0:
            res = res[1:len(res)]

    res = ''.join(map(str, res))
    return(res)


num1 = input("Введите первое число: ")
num2 = input("Введите второе число: ")
res = multiply(num1, num2)
print(num1, "*", num2, "=", res)