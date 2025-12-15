m, n  = map(int, input().strip().split())

a = m%n

if a == 0:
    print("Yes")
else:
    print("No")