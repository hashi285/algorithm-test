A,B=map(int,input().split())
C,D=map(int,input().split())

HanyangUniv=A+C
Yongdap=B+D

if HanyangUniv<Yongdap:
    print("Hanyang Univ.")
elif HanyangUniv==Yongdap:
    print("Either")
else:
    print("Yongdap")