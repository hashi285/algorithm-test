A,B,C=map(int,input().split())

M=[0]*101

a=0
b=0
c=0
for _ in range(3):
    H,J=map(int,input().split())
    for j in range(H,J):
        M[j]+=1

for i in range(1,100):
    if M[i]==1:
        a+=M[i]*A
    elif M[i]==2:
        b+=M[i]*B
    elif M[i]==3:
        c+=M[i]*C

print(a+b+c)