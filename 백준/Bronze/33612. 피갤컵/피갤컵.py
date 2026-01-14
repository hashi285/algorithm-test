n = int(input())

year = 2024
month = 8 + 7 * (n - 1)

year += (month - 1) // 12
month = (month - 1) % 12 + 1

print(year, month)
