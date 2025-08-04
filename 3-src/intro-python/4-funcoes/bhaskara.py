import math

def bhaskara(a, b, c):
    delta = (b ** 2) - (4 * a * c)
    if delta < 0:
        print('Raízes não reais!')
        exit()
    else:
      x1 = (-b + math.sqrt(delta)) / (2 * a)
      x2 = (-b - math.sqrt(delta)) / (2 * a)
      print(x1, x2)

bhaskara(-1, 2, 3)
bhaskara(2, 4, -3)
bhaskara(2, 4, 3)