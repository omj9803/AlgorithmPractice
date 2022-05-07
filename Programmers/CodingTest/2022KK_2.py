def solution(queue1, queue2):
    answer = 0
    add_list = queue1 + queue2
    if (sum(queue1) + sum(queue2)) % 2 != 0:
        answer = -1
    elif max(add_list) > int((sum(queue1) + sum(queue2)) / 2):
        answer = -1
    else:
        goal = int((sum(queue1) + sum(queue2)) / 2)
        while sum(queue1) != sum(queue2):
            if sum(queue1) > sum(queue2):
                temp = queue1.pop(0)
                queue2.append(temp)
                answer += 1
            else:
                temp = queue2.pop(0)
                queue1.append(temp)
                answer += 1
    return answer
