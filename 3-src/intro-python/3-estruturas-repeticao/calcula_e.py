import sys

n = int(sys.argv[1])
somatorio = 0

for i in range(n + 1):
    fatorial = 1
    for j in range(1, i + 1):
        fatorial = fatorial * j
    somatorio = somatorio + (1 / fatorial)

print(somatorio)