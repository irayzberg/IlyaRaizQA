# 1. Проверить, является ли палиндромом фраза/слово

# import re

# pal = input("Введите фразу/слово: ").lower()
# pal0 = re.split('\W+', pal)
# pal1 = []
# for i in pal0:
#     t = i[-1::-1]
#     pal1.append(t)
# if ''.join(pal0) == ''.join(pal1[-1::-1]):
#     print("Фраза/слово - палиндром")
# else:
#     print("Фраза/слово не палиндром")
    
# 2. Удалите в строке 'a b c  d e f' все пробелы и выведите результат на экран

# import re

# a = 'a b c  d e f'
# b = re.split(' ', a)
# print(''.join(b))

# 3. Рассчитать стоимость покупки с учетом скидки в 35% при условии покупки от 20 шекелей.

# i = 0
# while i == 0:
#     price = input("Введите стоимость покупки: ")
#     try:
#         i = 1
#         if float(price) >= 20:
#             new_price = 0.65*float(price)
#             print("Сумма покупки:", new_price)
#         else:1
#             print("Сумма покупки:", price)
#     except ValueError:
#         print("Ошибка!")

# 4. Посчитать количество символов во фразе, введенной с клавиатуры, с помощью циклов

# import re 

# text = input("Введите текст: ")
# text1 = re.split("\W+",text)
# count = 0
# for i in ''.join(text1):
#     count += 1
# print("Количество символов:", count)

# 5. Проверка умножения однозначного числа на двузначное

import random

i = 1
p = 0
print("Попробуй решить примеры: ")
while i <= 5:
    try:
        a = random.randrange(2,9)
        b = random.randrange(10,99)
        c = a*b
        d = input(f'{a}*{b} = ')
        i += 1
        if c == int(d):
            print("Правильно! Молодец!")
        else:
            p += 1
            print("Неверно!")
        if p > 2:
            print("Не сдал") 
            break  
    except ValueError:
        print("Введите ответ в виде целого числа!") 
print(f'Оценка {5-p}')

