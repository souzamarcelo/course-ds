import sys
import time
import glob

num_books = int(sys.argv[1]) if len(sys.argv) > 1 else 1
books = glob.glob('./*.txt')[:num_books]


def count_lists(text):
    words = []
    count = []
    for word in text:
        if word in words:
            index = words.index(word)
        else:
            words.append(word)
            count.append(0)
            index = len(words) - 1
        count[index] += 1

    max_count = float('-inf')
    max_word = ''
    for i in range(len(words)):
        if count[i] > max_count:
            max_count = count[i]
            max_word = words[i]
    print(f'\nMost frequent word: {max_word} ({max_count})')


def count_dict(text):
    words = {}
    for word in text:
        if word in words:
            words[word] += 1
        else:
            words[word] = 1

    max_count = float('-inf')
    max_word = ''
    for word, count in words.items():
        if count > max_count:
            max_count = count
            max_word = word            
    print(f'\nMost frequent word: {max_word} ({max_count})')


now = time.time()
text = ''
for book in books:
    with open(book, 'r') as file:
        text += file.read()
text = text.split()
count_lists(text)
print(f'Execution time: {time.time() - now:.2f} seconds\n')


