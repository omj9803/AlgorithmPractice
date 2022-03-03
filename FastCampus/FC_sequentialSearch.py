def sequential(data, search):
    for index in range(len(data)):
        if data[index] == search:
            return index
    return -1


import random

data_list = [3, 4, 1, 8, 2, 40, 30]
data_list.sort()
print(data_list)
print(sequential(data_list, 8))
