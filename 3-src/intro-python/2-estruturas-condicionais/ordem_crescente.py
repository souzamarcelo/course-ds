import sys

n1 = float(sys.argv[1])
n2 = float(sys.argv[2])
n3 = float(sys.argv[3])

if n1 < n2 and n1 < n3:
    print(n1)
elif n2 < n1 and n2 < n3:
    print(n2)
elif n3 < n1 and n3 < n2:
    print(n3)

if (n1 > n2 and n1 < n3) or (n1 < n2 and n1 > n3):
    print(n1)
elif (n2 > n1 and n2 < n3) or (n2 < n1 and n2 > n3):
    print(n2)
elif (n3 > n1 and n3 < n2) or (n3 < n1 and n3 > n2):
    print(n3)

if n1 > n2 and n1 > n3:
    print(n1)
elif n2 > n1 and n2 > n3:
    print(n2)
elif n3 > n1 and n3 > n2:
    print(n3)