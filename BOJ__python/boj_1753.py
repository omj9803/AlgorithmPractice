import heapq
import sys

V, E = map(int, sys.stdin.readline().split(' '))
K = int(sys.stdin.readline())

mygraph = [[] for _ in range(V+1)]
for i in range(E):
    u, v, w = map(int, sys.stdin.readline().split(' '))
    mygraph[u].append((v,w))

def dijkstra(graph, start):
    # 초기화
    distances = {node: float('inf') for node in range(1, len(graph))}
    distances[start] = 0
    queue = []
    heapq.heappush(queue, [distances[start], start])

    while queue:
        current_distance, current_node = heapq.heappop(queue)

        if distances[current_node] < current_distance:
            continue

        for adjacent, weight in graph[current_node]:
            distance = current_distance + weight

            if distance < distances[adjacent]:
                distances[adjacent] = distance
                heapq.heappush(queue, [distance, adjacent])

    return distances


answer = dijkstra(mygraph, K)
for i in range(1, len(answer)+1):
    if answer[i] == float('inf'):
        print("INF")
    else:
        print(answer[i])
