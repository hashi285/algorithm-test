while True:
    N = int(input().strip())
    if N == 0:
        break

    M = 0

    for i in range(N):
        M += i

    print(M + N)
