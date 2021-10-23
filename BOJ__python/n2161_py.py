a = int(input())

input = [i for i in range(1, a + 1)]
output = []
while 1:
    if len(input) == 1:
        output.append(input.pop())
        break

    output.append(input.pop(0))
    input.append(input.pop(0))

for i in output:
    print(i, end=' ')
