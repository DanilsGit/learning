import math
#Demanda
d = [4,5,3,1]
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
u = 8
#Limite de inventario
m = 7
#Solución
ss = []
#Totales

def solucionOptima(d,md,n,Ci,Cu,Cv,u,m):
    for k in range(n):
        d = md.copy()
        s = []
        for i in range(k):
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
            while j+1 < k:
                j += 1
                if a + d[j] <= u and a + d[j] - d[i] <= m:
                    a = a + d[j]
                    cont += 1
            inv = a - d[i]
            c2 = (Ci + Cu*a + Cv*inv*cont)/cont
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
        d = md.copy()
        for i in range(k,n):
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
            while j+1 < n:
                j += 1
                if a + d[j] <= u and a + d[j] - d[i] <= m:
                    a = a + d[j]
                    cont += 1
            inv = a - d[i]
            c2 = (Ci + Cu*a + Cv*inv*cont)/cont
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
        ss.append(s)
        d = md.copy()
        s = []
        k = n-1
        inv = 0
        #intercalados
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
            inv += d[k]
            if d[i] + d[k] <= u and inv <= m:
                s.append(d[i] + d[k])
                d[k] = 0
            else:
                s.append(d[i])
            k -= 1
        ss.append(s)

    costoT = float('inf')
    mejores = [0]*6

    for s in ss:
        al = []
        total_Cu = 0
        total_Ci = 0
        total_Cv = 0
        for i in range(len(s)):
            if i != 0:
                al.append(al[i-1] + s[i] - md[i])
            else:
                al.append(s[i] - md[i])
            total_Ci += Ci if s[i] > 0 else 0
            total_Cu += Cu * s[i]
            total_Cv += Cv * al[i]
            costoA = total_Ci + total_Cu + total_Cv
        if costoA < costoT:
            costoT = costoA
            mejores[0] = s
            mejores[1] = al
            mejores[2] = total_Ci
            mejores[3] = total_Cu
            mejores[4] = total_Cv
            mejores[5] = costoA
    print(ss)
    return mejores

mejores = solucionOptima(d,md,n,Ci,Cu,Cv,u,m)
print("La solución es:  ", mejores[0])
print("Almacén por mes: ", mejores[1])
print("Ci total: $", mejores[2], "USD")
print("Cu total: $", mejores[3], "USD")
print("Cv total: $", mejores[4], "USD")
print("Costo total: $", mejores[5], "USD")