import math

T = int(input())

for i in range(T):
    N, M = map(int, input().split())
    K = math.factorial(M)//(math.factorial(N)*math.factorial(M-N))
    print(K)
