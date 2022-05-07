def solution(rc, operations):
    row = len(rc)
    col = len(rc[0])
    for operation in operations:
        if operation == 'Rotate':
            for i in range(len(rc)-1):
                rc[i].insert(0, rc[i+1].pop(0))
            for i in range(len(rc) - 1, 0, -1):
                rc[i].append(rc[i - 1].pop(-1))

        else:
            rc.insert(0, rc.pop(-1))
    return rc

rc = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
operations = ["Rotate", "ShiftRow"]
print(solution(rc, operations))