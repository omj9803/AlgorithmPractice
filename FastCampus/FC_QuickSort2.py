def qsort(data):
    if len(data) <= 1:
        return data
    pivot = data[0]

    left = [item for item in data[1:] if data[item] < pivot]
    right = [item for item in data[1:] if data[item] >= pivot]

    return qsort(left) + [pivot] + qsort(right)

# 시간 복잡도
# 평균 - O(n log n)
# 최악 - O(n^2) pivot이 가장 작거나 큰 경우
