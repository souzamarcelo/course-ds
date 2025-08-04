import sys

n = int(sys.argv[1])

anterior1 = 0
anterior2 = 1

for i in range(0, n + 1):
    if i <= 1:
        print(i)
    else:
        atual = anterior1 + anterior2
        print(atual)
        anterior1 = anterior2
        anterior2 = atual
