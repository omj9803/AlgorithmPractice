def solution(v,a,b):
    time = 0
    while True:
        v.sort(reverse=True)
        if v[0] < a or v[-1] < b:
            break
        time += 1
        for i in range(len(v)):
            if i == 0:
                v[i] -= a
            else:
                v[i] -= b
    return time