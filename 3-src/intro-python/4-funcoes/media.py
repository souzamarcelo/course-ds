def media(n1, n2, n3, tipo):
    if tipo == 'A':
        return (n1 + n2 + n3) / 3
    elif tipo == 'P':
        return (n1 * 5 + n2 * 3 + n3 * 2) / 10
    else:
        print('Tipo inválido')
        exit()

print(media(5, 7, 9, 'A'))
print(media(5, 7, 9, 'P'))
print(media(10, 9, 2, 'A'))
print(media(10, 9, 2, 'P'))