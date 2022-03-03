def binary_search(data, search):
    if len(data) == 1 and data[0] == search:
        return True
    if len(data) == 1 and data[0] != search:
        return False

    medium = len(data) // 2
    if data[medium] == search:
        return True
    else:
        if data[medium] > search:
            return binary_search(data[:medium], search)
        else:
            return binary_search(data[medium:], search)

# 시간 복잡도 : O(log n)


import random

data_list = random.sample(range(100), 10)
data_list.sort()
print(data_list)
print(binary_search(data_list, 55))
