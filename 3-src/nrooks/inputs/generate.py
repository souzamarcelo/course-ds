import random

random.seed(123)
amount = 1000
min_size = 8
max_size = 500
fileArray = open('inputArray.txt', 'w')
fileMatrix = open('inputMatrix.txt', 'w')

for b in range(amount):
    n = random.randint(min_size, max_size)
    fileArray.write(f'{n}')
    fileMatrix.write(f'{n}')
    board = [[0] * n for _ in range(n)]
    for i in range(n):
        col = random.randint(0, n - 1)
        fileArray.write(f' {col}')
        board[i][col] = 1
    for row in board:
        for v in row:
            fileMatrix.write(f' {v}')
    fileArray.write('\n')
    fileMatrix.write('\n')
    print(f'Created board #{b+1}')

fileArray.close()
fileMatrix.close()