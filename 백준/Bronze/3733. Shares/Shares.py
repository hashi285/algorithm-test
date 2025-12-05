while True:
    try:
        S, N = map(int, input().strip().split())
        K = N//(S + 1)
        print(K)
    except EOFError:
        break