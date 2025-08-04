import sys

n1 = int(sys.argv[1])
n2 = int(sys.argv[2])
n3 = int(sys.argv[3])
n4 = int(sys.argv[4])

if n4 > n3:
    print(n4, n3, n2, n1)
elif n4 > n2:
    print(n3, n4, n2, n1)
elif n4 > n1:
    print(n3, n2, n4, n1)
else:
    print(n3, n2, n1, n4)