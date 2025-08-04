inteiros = [4, 1, -7, 4, -2, 0, 5, 3, 1, -8, 5, 2]

for i in range(len(inteiros)):
    if inteiros[i] < 0:
        inteiros[i] = 0

print(inteiros)