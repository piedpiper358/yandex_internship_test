
# Задача B. Числа в ряд

Петя решил написать очень простую игру, где игрок выписывает в ряд натуральные числа. Если в последовательности выписанных чисел встречается 3 и более одинаковых подряд идущих числа, то эта подпоследовательность из одинаковых чисел удаляется. После удаления чисел оставшиеся числа образуют новую последовательность, и в ней также может произойти удаление одинаковых чисел(если их 3 и более).

Напишите программу, которая по выписанной последовательности чисел определяет сколько чисел в итоге будет стерто. Естественно, непрерывных последовательностей из трех и более одинаковых чисел в начальный момент может быть не более одной.

### Формат ввода
Единственная строка с последовательностью натуральных чисел разделенных пробелами. Каждое число не превосходит 106. Гарантируется, что количество чисел не превышает 2 ⋅ 10^5.

### Формат вывода
Требуется вывести количество чисел, которое будет удалено.


### Пример 1
#### Ввод
    5 1 3 3 3 2
#### Вывод
    3
#### Примечания


Здесь 3 подряд идущих тройки удалились, осталась последовательность ***5 1 2*** и она уже не может схлопнуться по правилам игры.

### Пример 2
#### Ввод
    10 3 3 2 1 1 1 2 2 3 3
#### Вывод
    10
####Примечания
Сначала удаляется 3 единицы, после чего остается последовательность ***10 3 3 2 2 2 3 3***. Затем удаляются 3 двойки и остается ***10 3 3 3 3***. Оставшиеся 4 тройки тоже удаляются, таким образом всего удалено 3 единицы, 3 двойки, 4 тройки - всего 10 чисел.
