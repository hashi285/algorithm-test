a=input()

b=True

for i in range(len(a)):
    if a[i]!='1' and a[i]!="0" and a[i]!=" ":
        print("F")
        b=False
        break

if b:
    print("S")