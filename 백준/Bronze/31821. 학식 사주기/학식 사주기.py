N = int(input().strip())
menus = [int(input().strip()) for _ in range(N)]

M = int(input().strip())
choices = list(map(int, (input().strip() for _ in range(M))))

total = sum(menus[idx - 1] for idx in choices)
print(total)
