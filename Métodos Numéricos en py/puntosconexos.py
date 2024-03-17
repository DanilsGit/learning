import numpy as np

diccionario = {0: 1.0, 1: 2.0, 2: 3.0}

# Convertir el diccionario a un array de NumPy
array_resultante = np.array(list(diccionario.values()))

print(array_resultante[0]+1)