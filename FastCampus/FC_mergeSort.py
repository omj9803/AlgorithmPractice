def mergesplit(data):
    if len(data) <= 1:
        return data
    medium = int(len(data) / 2)
    left = mergesplit(data[:medium])  # medium 포함 X
    right = mergesplit(data[medium:])
    return merge(left, right)


def merge(left, right):
    left_index, right_index = 0, 0
    sorted_list = list()

    # case1 : left, right 모두 남아있을 때
    while len(left) > left_index and len(right) > right_index:
        if left[left_index] < right[right_index]:
            sorted_list.append(left[left_index])
            left_index += 1
        else:
            sorted_list.append(right[right_index])
            right_index += 1

    # case2 : left만 남아있을 때
    while len(left) > left_index:
        sorted_list.append(left[left_index])
        left_index += 1

    # case3 : right만 남아있을 때
    while len(right) > right_index:
        sorted_list.append(right[right_index])
        right_index += 1

    return sorted_list


import random

data_list = random.sample(range(100), 10)
print(mergesplit(data_list))

# 단계별 시간 복잡도 : O(n log n)