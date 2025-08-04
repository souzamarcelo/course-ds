import sys

i = int(sys.argv[1])
a = float(sys.argv[2])
b = float(sys.argv[3])
c = float(sys.argv[4])

maior = 0
menor = 0
meio = 0

if a > b and a > c:
    maior = a
if b > a and b > c:
    maior = b
if c > b and c > a:
    maior = c

if a < b and a < c:
    menor = a
if b < a and b < c:
    menor = b
if c < b and c < a:
    menor = c

if a != maior and a != menor:
    meio = a
if b != maior and b != menor:
    meio = b
if c != maior and c != menor:
    meio = c

if i == 1:
    print(menor, meio, maior)
elif i == 2:
    print(maior, meio, menor)
else:
    print(menor, maior, meio)