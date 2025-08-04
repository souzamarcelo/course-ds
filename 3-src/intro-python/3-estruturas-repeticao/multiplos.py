import sys

x = int(sys.argv[1])

for i in range(x, x * 100 + 1, x):
    print(i)