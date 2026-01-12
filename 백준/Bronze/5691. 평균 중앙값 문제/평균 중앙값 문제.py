while True:
    A, B = map(int, input().split())
    if  B == 0 and A == 0:
        break
    else:
        K=B-A
        C=A-K
        print(C)