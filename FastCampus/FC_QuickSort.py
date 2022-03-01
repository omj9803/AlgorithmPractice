def qsort(data):
    if len(data) <= 1:
        return data
    pivot = data[0]
    left, right = [], []

    for n in range(1, len(list)):
        if pivot > data[n]:
            right.append(data[n])
        else:
            left.append(data[n])
    return qsort(left) + [pivot] + qsort(right)
