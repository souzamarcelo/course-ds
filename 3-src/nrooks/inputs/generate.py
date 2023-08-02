import random
import sys

amount = int(sys.argv[1])

outputArray = ''
outputMatrix = ''
for _ in range(amount):
    n = random.randint(8, 500)
    outputArray += f'{n}'
    outputMatrix += f'{n}'
    cells = []
    for i in range(n):
        col = random.randint(0, n - 1)
        outputArray += f' {col}'
        cells.append((i, col))
    for i in range(n):
        for j in range(n):
            outputMatrix += ' 1' if (i, j) in cells else ' 0'
    outputArray += '\n'
    outputMatrix += '\n'

fileArray = open('inputArray.txt', 'w')
fileMatrix = open('inputMatrix.txt', 'w')
fileArray.write(outputArray)
fileMatrix.write(outputMatrix)
fileArray.close()
fileMatrix.close()