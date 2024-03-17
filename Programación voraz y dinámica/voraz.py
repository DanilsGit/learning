import math

# Definición de variables
#Demanda
d = [4,2,2,3,5,1]
md = d.copy()
#Meses
n = len(d)
#Costo inicial de producir
Ci = 3
#Costo de unidad
Cu = 1
#Costo de inventario
Cv = 0.5
#Limite de producción
u = 5
#Limite de inventario
m = 4
#Solución
s = []
#Totales
al = [0]*n
costoT = 0
total_Cu = 0
total_Ci = 0
total_Cv = 0


for i in range(n):
    if i == n-1:
        if d[i] == 0:
            s.append(0)
            break
        s.append(d[i])
        break
    if d[i] == 0:
        s.append(0)
        continue
    c1 = Ci + Cu*d[i]
    a = d[i]
    j = i
    cont=1
    while j+1 < n and a + d[j+1] <= u and a + d[j+1] - d[i] <= m:
        a = a + d[j+1]
        j += 1
        cont += 1
    inv = a - d[i]
    c2 = (Ci + Cu*a + Cv*inv)/cont
    if c1 <= math.floor(c2):
        s.append(d[i])
    else:
        s.append(a)
        for j in range(i+1,n):
            if d[j] - inv < 0:
                inv = inv - d[j]
                d[j] = 0
            else: 
                d[j] = d[j] - inv
                inv = 0

for i in range(n):
    if i != 0:
        al[i] = (al[i-1] + s[i] - md[i])
    else:
        al[i] = s[i] - md[i]
    total_Ci += Ci if s[i] > 0 else 0
    total_Cu += Cu * s[i]
    total_Cv += Cv * al[i]
    costoT = total_Ci + total_Cu + total_Cv

print("La solución es:  ", s)
print("Almacén por mes: ", al)
print("Ci total: $", total_Ci, "USD")
print("Cu total: $", total_Cu, "USD")
print("Cv total: $", total_Cv, "USD")
print("Costo total: $", costoT, "USD")


"""
EJEMPLO:
Suponga que se tiene la demanda
proyectada para 4 meses, con los
siguientes datos:
➢ n = 4
➢ Demanda para los 4 meses:
{1,3,2,4}
➢ Ci = $ 3 USD
➢ Cu = $ 1 USD
➢ Cv = $ 0.5 USD
➢ u = 5 unidades
➢ m = 4 unidades
La solución óptima se da al producir
{1,5,04} unidades en cada mes
respectivamente, con un costo total de
$20 USD.
"""