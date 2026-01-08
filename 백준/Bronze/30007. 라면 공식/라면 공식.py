a=int(input())

for i in range(a):
    A,B,X=map(int,input().split())
    W=A*(X-1)+B
    print(W)