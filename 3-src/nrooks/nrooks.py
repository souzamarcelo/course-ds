import sys
import time


def violations_matrix(board):
    amount = 0
    for l in range(len(board)):
        for c in range(len(board)):
            pass
    for c1 in range(len(board)):
        found_row = 0
        found_col = 0
        for c2 in range(len(board[c1])):
            if board[c1][c2] == 1:
                found_row += 1
            if board[c2][c1] == 1:
                found_col += 1
        amount += (found_row * (found_row - 1)) / 2
        amount += (found_col * (found_col - 1)) / 2
    return int(amount)


def violations_array(board):
    amount = 0
    for i in range(len(board) - 1):
        for j in range(i + 1, len(board)):
            if board[i] == board[j]:
                amount += 1
    return amount


def eval_matrix():
    with open(sys.argv[2], 'r') as file:
        lines = file.readlines()
        for line in lines:
            content = line.strip().split()
            n = int(content[0])
            board = [[0] * n for _ in range(n)]
            next_index = 1 
            for i in range(n):
                for j in range(n):
                    board[i][j] = int(content[next_index])
                    next_index += 1
            print(f'{violations_matrix(board)} ', end='', flush=True)


def eval_array():
    with open(sys.argv[2], 'r') as file:
        lines = file.readlines()
        for line in lines:
            board = []
            content = line.strip().split()
            for value in content[1:]:
                board.append(int(value))
            print(f'{violations_array(board)} ', end='', flush=True)


def show_matrix(board):
    for i in range(len(board)):
        for j in range(len(board)):
            print(f'{board[i][j]} ', end='', flush=True)
        print()
    print()


def show_array(board):
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i] == j: print(f'1 ', end='', flush=True)
            else: print(f'0 ', end='', flush=True)
        print()
    print()


mode = sys.argv[1]
runtime = time.time()
if(mode.lower() == 'matrix'): eval_matrix()
if(mode.lower() == 'array'): eval_array()
runtime = time.time() - runtime
print(f'\n\nRunning time: {runtime} seconds.\n')