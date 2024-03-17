import tkinter as tk
from tkinter import ttk
import numpy as np
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation
from tkinter import messagebox
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
from sympy import symbols, Eq, solve
import threading

ventana = tk.Tk()
ventana.title("Métodos numéricos")
ventana.resizable(True, True)
ventana.geometry("300x400")
ventana.grid_columnconfigure(0, weight=1)
ventana.grid_rowconfigure(0, weight=1)

def centrar_ventana(ventana):
    ventana.update_idletasks()
    width = ventana.winfo_width()
    height = ventana.winfo_height()
    x = (ventana.winfo_screenwidth() // 2) - (width // 2)
    y = (ventana.winfo_screenheight() // 2) - (height // 2)
    ventana.geometry(f"{width}x{height}+{x}+{y}")

def abrir_ventana_biseccion():
    ventana.withdraw()
    ventana_biseccion = tk.Toplevel(ventana)
    ventana_biseccion.title("biseccion")
    ventana_biseccion.geometry("350x300")
    ventana_biseccion.resizable(True, True)

    centrar_ventana(ventana_biseccion)

    # Agregar contenido a la nueva ventana
    etiqueta = tk.Label(ventana_biseccion, text="Método de bisección", pady=10, font=("Bahnschrift", 15))
    etiqueta.grid(column=0, row=0, columnspan=4)

    # Crear entradas para la función, a y b
    funcion_label = tk.Label(ventana_biseccion, text="Función: ", font=("Bahnschrift", 15))
    funcion_label.grid(column=0, row=1)

    funcion_box = tk.Entry(ventana_biseccion, font=("Bahnschrift", 13))
    funcion_box.grid(column=1, row=1, pady=10, columnspan=3)

    etiqueta_ab = tk.Label(ventana_biseccion, text="Intervalo [a, b]", font=("Bahnschrift", 15))
    etiqueta_ab.grid(row=2, column=0, padx=10, pady=10)

    entrada_a = tk.Entry(ventana_biseccion, width=5, font=("Bahnschrift", 10))
    entrada_a.grid(row=2, column=1, padx=10, pady=10)

    coma = tk.Label(ventana_biseccion, text=" , ", font=("Bahnschrift", 15))
    coma.grid(row=2, column=2, padx=10, pady=10)

    entrada_b = tk.Entry(ventana_biseccion, width=5, font=("Bahnschrift", 10))
    entrada_b.grid(row=2, column=3, padx=10, pady=10)

    etiqueta_exp = tk.Label(ventana_biseccion, text="a: extremo izquierdo | b: extremo derecho", font=("Bahnschrift", 13))
    etiqueta_exp.grid(row=3, column=0, padx=10, pady=10, columnspan=4)

    global tabla_b

    def crear_tabla(a, b, r, p):
        # Crear la ventana principal
        ventana_tabla = tk.Toplevel(ventana_biseccion)
        ventana_tabla.title("Tabla bisección")

        # Crear un Treeview con columnas
        tabla = ttk.Treeview(ventana_tabla)
        tabla['columns'] = ('i', '1', '2', '3', '4')

        # Configurar encabezados de columnas
        tabla.column('#0', width=0, stretch=tk.NO)
        tabla.column('i', anchor=tk.W, width=50)
        tabla.column('1', anchor=tk.W, width=100)
        tabla.column('2', anchor=tk.CENTER, width=100)
        tabla.column('3', anchor=tk.W, width=100)
        tabla.column('4', anchor=tk.W, width=100)

        # Agregar encabezados de columnas
        tabla.heading('#0', text='', anchor=tk.W)
        tabla.heading('i', text='n', anchor=tk.W)
        tabla.heading('1', text='a', anchor=tk.W)
        tabla.heading('2', text='b', anchor=tk.CENTER)
        tabla.heading('3', text='r', anchor=tk.W)
        tabla.heading('4', text='f(r)', anchor=tk.W)

        # Agregar datos a la tabla desde los arrays
        for i, (dato1, dato2, dato3, dato4) in enumerate(zip(a, b, r, p)):
            tabla.insert(parent='', index='end', iid=i, text='', values=(i, dato1, dato2, dato3, dato4))

        # Mostrar la tabla
        tabla.pack(pady=20)

        # Iniciar el bucle principal de la aplicación
        ventana_tabla.mainloop()

    def funcion(x):
        # Evaluar la función ingresada por el usuario
        try:
            expr = funcion_box.get()
            y = eval(expr, {"sqrt": np.sqrt,"tg": np.tan,"tg": np.tan, "cos": np.cos, "seno": np.sin, "sen": np.sin, "sin": np.sin,"ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": x})
            return y
        except Exception as e:
            # Manejar errores de evaluación de expresión
            mostrar_error(f"Error al evaluar la función: {e}")
            return np.nan

    def biseccion(a, b, tol=1e-6, max_iter=100):
        global tabla_b
        i = 0
        soluciones = []
        t_a =[]
        t_b =[]
        t_r =[]
        t_p =[]
        while (b - a) / 2 > tol and i < max_iter:
            c = (a + b) / 2
            t_a.append(a)
            t_b.append(b)
            t_r.append(c)
            t_p.append(funcion(c))
            soluciones.append(c)
            if funcion(c) == 0:
                break
            elif funcion(c) * funcion(a) < 0:
                b = c
            else:
                a = c
            i += 1
        tabla_b = [t_a, t_b, t_r, t_p]
        return soluciones

    def update(frame):
        # Función de actualización para la animación
        plt.clf()
        x_vals = np.linspace(a, b, 100)
        y_vals = funcion(x_vals)
        plt.plot(x_vals, y_vals, label='f(x)')

        # Resaltar la línea vertical en la solución encontrada por bisección en la iteración actual
        if frame < len(soluciones):
            solucion_actual = soluciones[frame]
            solucion_formateada = "{:.10f}".format(solucion_actual)
            plt.axvline(x=solucion_actual, color='red', linestyle='--', label=f'Solución en Iteración {frame+1}: {solucion_formateada}')
            plt.axhline(y=0, color='green', linestyle='-', linewidth=0.8, label='Eje x')

        plt.xlabel('x')
        plt.ylabel('f(x)')
        plt.title('Método de Bisección')
        plt.legend()

        # Mostrar el valor de la solución en la gráfica
        if frame == len(soluciones) - 1:
            plt.text(soluciones[frame], funcion(soluciones[frame]), f'Solución: {soluciones[frame]:.4f}', verticalalignment='bottom', horizontalalignment='right')

    def iniciar_biseccion():
        global a, b, soluciones
        # Obtener los valores de a y b desde las entradas del usuario
        a = float(entrada_a.get())
        b = float(entrada_b.get())

        # Aplicar el método de bisección y obtener las soluciones para cada iteración
        soluciones = biseccion(a, b)

        # Configurar la animación
        fig, ax = plt.subplots()
        animation = FuncAnimation(fig, update, frames=len(soluciones), repeat=False)

        # Mostrar la animación y tabla
        hilo = threading.Thread(target=crear_tabla, args=(tabla_b[0], tabla_b[1], tabla_b[2], tabla_b[3]))
        hilo.start()
        plt.show()
        

    def cerrar():
        ventana.deiconify()
        ventana_biseccion.destroy()

    def comprobar_entradas():
        comprobado = True
        try:
            a = float(entrada_a.get())
            b = float(entrada_b.get())
            y = eval(funcion_box.get(), {"tg": np.tan,"tg": np.tan, "cos": np.cos, "seno": np.sin, "sen": np.sin, "sin": np.sin,"ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": 1})
            if comprobado and a >= b:
                mostrar_error("' a ' debe ser el extremo izquierdo \n ' b ' debe ser el extremo derecho ")
                comprobado = False
            if comprobado and funcion(a) * funcion(b) >= 0:
                    mostrar_error(f"La función debe cambiar de signo en el intervalo [a, b] \n f(a) = {funcion(a)} \n f(b) = {funcion(b)} \n f(1) = {y}")
                    comprobado = False
            if comprobado:
                iniciar_biseccion()
        except Exception as e:
            mostrar_error(f"Error al comprobar las entradas: {e}")

    def mostrar_error(error):
        messagebox.showerror("Error", error)

    # Agregar botones
    boton_graficar = tk.Button(ventana_biseccion, text="Resolver", command=comprobar_entradas, width=20, font=("Bahnschrift", 15))
    boton_graficar.grid(column=0, row=4, columnspan=4)

    boton_cerrar_nueva_ventana = tk.Button(ventana_biseccion, text="Menú", command=cerrar, width=20, font=("Bahnschrift", 15))
    boton_cerrar_nueva_ventana.grid(column=0, row=5, columnspan=4)

    def cerradoForzoso():
        ventana_biseccion.destroy()
        ventana.destroy()

    ventana_biseccion.protocol("WM_DELETE_WINDOW", cerradoForzoso)

    # Iniciar el bucle principal de la nueva ventana
    ventana_biseccion.mainloop()

def abrir_ventana_punto_fijo():
    ventana.withdraw()
    ventana_punto_fijo = tk.Toplevel(ventana)
    ventana_punto_fijo.title("Punto fijo")
    ventana_punto_fijo.geometry("350x300")
    ventana_punto_fijo.resizable(True, True)

    centrar_ventana(ventana_punto_fijo)

    # Agregar contenido a la nueva ventana
    etiqueta = tk.Label(ventana_punto_fijo, text="Método de punto fijo", pady=10, font=("Bahnschrift", 15))
    etiqueta.grid(column=0, row=0, columnspan=4)

    # Crear entradas para la función, a y b
    funcion_label = tk.Label(ventana_punto_fijo, text="Función: ", font=("Bahnschrift", 15))
    funcion_label.grid(column=0, row=1)

    funcion_box = tk.Entry(ventana_punto_fijo, font=("Bahnschrift", 13))
    funcion_box.grid(column=1, row=1, pady=10, columnspan=3)

    etiqueta_ab = tk.Label(ventana_punto_fijo, text="Intervalo [a, b]", font=("Bahnschrift", 15))
    etiqueta_ab.grid(row=2, column=0, padx=10, pady=10)

    entrada_a = tk.Entry(ventana_punto_fijo, width=5, font=("Bahnschrift", 10))
    entrada_a.grid(row=2, column=1, padx=10, pady=10)

    coma = tk.Label(ventana_punto_fijo, text=" , ", font=("Bahnschrift", 15))
    coma.grid(row=2, column=2, padx=10, pady=10)

    entrada_b = tk.Entry(ventana_punto_fijo, width=5, font=("Bahnschrift", 10))
    entrada_b.grid(row=2, column=3, padx=10, pady=10)

    etiqueta_exp = tk.Label(ventana_punto_fijo, text="a: extremo izquierdo | b: extremo derecho", font=("Bahnschrift", 13))
    etiqueta_exp.grid(row=3, column=0, padx=10, pady=10, columnspan=4)

    global out_of_range, tabla_pf
    out_of_range = False

    def crear_tabla(a, b, r):
        # Crear la ventana principal
        ventana_tabla = tk.Toplevel(ventana_punto_fijo)
        ventana_tabla.title("Tabla de punto fijo")

        # Crear un Treeview con columnas
        tabla = ttk.Treeview(ventana_tabla)
        tabla['columns'] = ('i', '1', '2', '3')

        # Configurar encabezados de columnas
        tabla.column('#0', width=0, stretch=tk.NO)
        tabla.column('i', anchor=tk.W, width=50)
        tabla.column('1', anchor=tk.W, width=100)
        tabla.column('2', anchor=tk.CENTER, width=100)
        tabla.column('3', anchor=tk.W, width=100)

        # Agregar encabezados de columnas
        tabla.heading('#0', text='', anchor=tk.W)
        tabla.heading('i', text='n', anchor=tk.W)
        tabla.heading('1', text='X0', anchor=tk.W)
        tabla.heading('2', text='X1', anchor=tk.CENTER)
        tabla.heading('3', text='error', anchor=tk.W)

        # Agregar datos a la tabla desde los arrays
        for i, (dato1, dato2, dato3) in enumerate(zip(a, b, r)):
            tabla.insert(parent='', index='end', iid=i, text='', values=(i, dato1, dato2, dato3))

        # Mostrar la tabla
        tabla.pack(pady=20)

        # Iniciar el bucle principal de la aplicación
        ventana_tabla.mainloop()

    def funcion(x):
        # Evaluar la función ingresada por el usuario
        global out_of_range
        try:
            out_of_range = False
            expr = funcion_box.get()
            y = eval(expr, {"sqrt": np.sqrt,"tg": np.tan,"tg": np.tan, "cos": np.cos, "seno": np.sin, "sen": np.sin, "sin": np.sin,"ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": x})
            return y
        except Exception as e:
            if "Result too large" in str(e):
                out_of_range = True
            else:
                mostrar_error(f"Error al evaluar la función: {e}")
            return np.nan

    global eval1

    def punto_fijo(a, b, tol=1e-6, max_iter=100):
        global eval1, tabla_pf
        i = 0
        soluciones = []
        x0 = []
        x1 = []
        error = []
        error.append("null")
        Pn_0 = (a+b)/2
        eval1 = Pn_0
        Pn_1 = funcion(Pn_0)

        while np.abs((Pn_1 - Pn_0) / Pn_1) > tol and i < max_iter:
            x0.append(Pn_0)
            x1.append(Pn_1)
            error.append(round(np.abs((Pn_1 - Pn_0) / Pn_1),7))
            soluciones.append(Pn_1)
            Pn_0 = Pn_1
            Pn_1 = funcion(Pn_1)
            i += 1
        tabla_pf = [x0, x1, error]
        return soluciones

    def update(frame):
        global eval1
        # Función de actualización para la animación
        plt.clf()
        x_vals = np.linspace(a, b, 100)
        y_vals = funcion(x_vals)
        plt.plot(x_vals, y_vals, label='f(x) ingresada')
        plt.plot(x_vals, x_vals, color='green', linestyle='-', label='g(x) = x')

        # Resaltar la línea vertical en la solución encontrada por punto fijo en la iteración actual
        if frame < len(soluciones):
            solucion_actual = soluciones[frame]
            solucion_formateada = "{:.10f}".format(solucion_actual)
            #plt.axvline(x=solucion_actual, color='red', linestyle='--', label=f'Solución en Iteración {frame+1}: {solucion_formateada}')
            plt.axhline(y=0, color='green', linestyle='-', linewidth=0.8, label='Eje x')

            #puntos
            if 0 < frame < len(soluciones):
                x = []
                x.append(eval1)
                xD = []
                yJ = []

                for i in range(0, frame):
                    x.append(soluciones[i])

                # Duplicar elementos en xD
                for i, value in enumerate(x):
                    xD.append(value)
                    if i > 0:
                        xD.append(value)

                for i in range(0, len(xD)):
                    if i!=0:
                        if i%2 == 0:
                            yJ.append(funcion(xD[i]))
                        else:
                            yJ.append(xD[i])
                    else:
                        yJ.append(funcion(xD[i]))


                # print("x")
                # print(x)
                # print("xD y yJ")
                # print(xD)
                # print(yJ)

                #Graficar puntos
                plt.scatter(xD, yJ, color='red', marker='+')
                plt.plot(xD, yJ, color='red', linestyle='-', linewidth=1, label=f'Solución en Iteración {frame+1}: {solucion_formateada}')

                #print("------------------------------------------------------------------------------")

        plt.xlabel('x')
        plt.ylabel('f(x)')
        plt.title('Método de punto fijo')
        plt.legend()

        # Mostrar el valor de la solución en la gráfica
        if frame == len(soluciones) - 1:
            plt.text(soluciones[frame], funcion(soluciones[frame]), f'Solución: {soluciones[frame]:.4f}', verticalalignment='bottom', horizontalalignment='right')

    def iniciar_punto_fijo():
        global a, b, soluciones

        # Obtener los valores de a y b desde las entradas del usuario
        a = float(entrada_a.get())
        b = float(entrada_b.get())

        # Aplicar el método de bisección y obtener las soluciones para cada iteración
        soluciones = punto_fijo(a, b)

        # Configurar la animación
        fig, ax = plt.subplots()
        if len(soluciones) == 0:
            if (funcion((a+b)/2) == funcion(funcion((a+b)/2))):
                plt.text(0.5, 0.5, f'La expresión tiene como solución ( {a} + {b} )/2 = {(a+b)/2} \n \n No hay animación debido a la falta de pasos', horizontalalignment='center', verticalalignment='center', transform=ax.transAxes)
            else:
                plt.text(0.5, 0.5, f'La función no converge en el intervalo [{a} , {b}]', horizontalalignment='center', verticalalignment='center', transform=ax.transAxes)
        else: animation = FuncAnimation(fig, update, frames=len(soluciones), repeat=False)

        # Mostrar la animación y tabla
        hilo = threading.Thread(target=crear_tabla, args=(tabla_pf[0], tabla_pf[1], tabla_pf[2]))
        hilo.start()
        plt.show()

    def comprobar_entradas():
        global out_of_range
        comprobado = True
        try:
            a = float(entrada_a.get())
            b = float(entrada_b.get())
            y = eval(funcion_box.get(), {"sqrt": np.sqrt,"tg": np.tan,"tg": np.tan, "cos": np.cos, "seno": np.sin, "sen": np.sin, "sin": np.sin,"ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": 1})
            c = punto_fijo(a, b)
            if out_of_range:
                mostrar_error(f"La función no converge en el intervalo [{a} , {b}]")
                comprobado = False
            if comprobado and a >= b:
                mostrar_error("' a ' debe ser el extremo izquierdo \n ' b ' debe ser el extremo derecho ")
                comprobado = False
            if comprobado:
                iniciar_punto_fijo()
        except Exception as e:
            mostrar_error(f"Error al comprobar las entradas: {e}")

    def mostrar_error(error):
        messagebox.showerror("Error", error)

    def cerrar():
        ventana.deiconify()
        ventana_punto_fijo.destroy()

    def cerradoForzoso():
        ventana_punto_fijo.destroy()
        ventana.destroy()

    ventana_punto_fijo.protocol("WM_DELETE_WINDOW", cerradoForzoso)

    # Agregar botones
    boton_graficar = tk.Button(ventana_punto_fijo, text="Resolver", command=comprobar_entradas, width=15, font=("Bahnschrift", 15))
    boton_graficar.grid(column=0, row=4, columnspan=4)

    boton_cerrar_nueva_ventana = tk.Button(ventana_punto_fijo, text="Menú", command=cerrar, width=15, font=("Bahnschrift", 15))
    boton_cerrar_nueva_ventana.grid(column=0, row=5, columnspan=4)

    # Iniciar el bucle principal de la nueva ventana
    ventana_punto_fijo.mainloop()

def abrir_ventana_curvas():
    ventana.withdraw()
    ventana_curvas = tk.Toplevel(ventana)
    ventana_curvas.title("Ajuste de curvas")
    ventana_curvas.geometry("370x350")
    ventana_curvas.resizable(True, True)

    centrar_ventana(ventana_curvas)

    # Agregar contenido a la nueva ventana
    etiqueta = tk.Label(ventana_curvas, text="Método de ajuste de curvas", pady=10, font=("Bahnschrift", 15))
    etiqueta.grid(column=0, row=0, columnspan=2)

    etiqueta2 = tk.Label(ventana_curvas, text="Aplicado a ", pady=10, font=("Bahnschrift", 15))
    etiqueta2.grid(column=0, row=1)

    modelosAR = ["Modelo exponencial","Modelo lineal","Modelo polinomial grado 2"]
    modelos = ttk.Combobox(ventana_curvas, width=15, values=modelosAR, state="readonly", font=("Bahnschrift", 15))
    modelos.set("Seleccionar")
    modelos.grid(column=1, row=1, padx=5)

    etiqueta3 = tk.Label(ventana_curvas, text="Cantidad de datos", pady=5, font=("Bahnschrift", 15))
    etiqueta3.grid(column=0, row=2)

    etiqueta4 = tk.Label(ventana_curvas, text="No se han introducido datos", pady=10, font=("Bahnschrift", 15), fg="red")
    etiqueta4.grid(column=0, row=4, columnspan=2)

    cantidad = tk.Entry(ventana_curvas, width=5, font=("Bahnschrift", 15))
    cantidad.grid(column=1, row=2, padx=5)

    global datos_ingresadosX, datos_ingresadosY, act, funcion_curvas
    act=-1

    def entradas():
        try:
            datos = int(cantidad.get())
            if datos < 3:
                mostrar_error("La cantidad de datos debe ser mayor a 2")
                return
            def guardar_datos():
                global datos_ingresadosX, datos_ingresadosY, act, funcion_curvas
                datos_ingresadosX = {key: entryX.get() for key, entryX in registrosX.items()}
                # print("Datos ingresados X:", datos_ingresadosX)

                datos_ingresadosY = {key: entryY.get() for key, entryY in registrosY.items()}
                # print("Datos ingresados Y:", datos_ingresadosY)

                funcion_curvas = funcion_relleno.get()
                for i in range(datos):
                    try:
                        if datos_ingresadosX[i] == "" or datos_ingresadosY[i] == "":
                            mostrar_error("No se han introducido todos los datos")
                            etiqueta4.config(text=f"Datos vacíos o inválidos.", fg="#fa2")
                            return
                        datos_ingresadosX[i] = float(datos_ingresadosX[i])
                        datos_ingresadosY[i] = float(datos_ingresadosY[i])
                    except Exception as e:
                        mostrar_error(f"Error al convertir los datos a números \n Detalles: {e}")
                        etiqueta4.config(text=f"Datos vacíos o inválidos.", fg="#fa2")
                        return

                # print("Datos ingresados X[0]:", datos_ingresadosX[0])
                # print("Datos ingresados Y[0]:", datos_ingresadosY[0])
                

                if etiqueta4.cget("text") == "Se han introducido los datos" or (act >= 0):
                    act=act+1
                    etiqueta4.config(text=f"Se han actualizado los datos. {act+1}° vez", fg="#2aa")
                else:
                    etiqueta4.config(text="Se han introducido los datos", fg="green")

                # print(act)

            registro_datos = tk.Toplevel(ventana_curvas)
            registro_datos.title("Registro de datos")
            registro_datos.resizable(True, True)

            etiqueta1 = tk.Label(registro_datos, text="xi", pady=10, font=("Bahnschrift", 15))
            etiqueta1.grid(column=0, row=0)

            etiqueta2 = tk.Label(registro_datos, text="yi", pady=10, font=("Bahnschrift", 15))
            etiqueta2.grid(column=1, row=0)

            registrosX = {}
            registrosY = {}

            for i in range(datos):
                entryX = tk.Entry(registro_datos, width=10, font=("Bahnschrift", 15))
                entryX.grid(row=1+i, column=0, pady=5, padx=5)
                registrosX[i] = entryX

                entryY = tk.Entry(registro_datos, width=10, font=("Bahnschrift", 15))
                entryY.grid(row=1+i, column=1, pady=5, padx=5)
                registrosY[i] = entryY

            def funcionRellenar(x):
                # Evaluar la función ingresada por el usuario
                try:
                    expr = funcion_relleno.get()
                    y = eval(expr, {"sqrt": np.sqrt,"tg": np.tan,"tg": np.tan, "cos": np.cos, "seno": np.sin, "sen": np.sin, "sin": np.sin,"ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": x})
                    return y
                except Exception as e:
                    mostrar_error(f"Error al evaluar la función: \n Detalles: {e}")
                    return np.nan

            def cambiar_valor(entry, nuevo_valor):
                entry.delete(0, tk.END)
                entry.insert(0, nuevo_valor)

            def rellenar():
                try:
                    if not np.isnan(funcionRellenar(1)):
                        for i in range(datos):
                            cambiar_valor(registrosY[i], funcionRellenar(float(registrosX[i].get())))
                except Exception as e:
                    mostrar_error(f"Error en la función: \n Detalles: {e}")

            boton_rellenar = tk.Button(registro_datos, text="Rellenar yi por función", command=rellenar)
            boton_rellenar.grid(row=datos+2, column=0, pady=5)

            funcion_relleno = tk.Entry(registro_datos, width=15, font=("Bahnschrift", 12), bg="orange")
            funcion_relleno.grid(row=datos+2, column=1, pady=5, padx=5)

            # Crear un botón para guardar datos
            boton_guardar = tk.Button(registro_datos, text="Guardar Datos", command=guardar_datos)
            boton_guardar.grid(row=datos+3, column=0, columnspan=2, pady=5)
        except Exception as e:
            mostrar_error(f"Error al comprobar las entradas: Revise las celdas vacías y/o inválidas \n Información detallada: {e}")

    boton_introducir_entradas = tk.Button(ventana_curvas, text="Introducir datos", command=entradas, width=15, font=("Bahnschrift", 15))
    boton_introducir_entradas.grid(column=0, row=3, columnspan=2)

    def cerrar():
        ventana.deiconify()
        ventana_curvas.destroy()

    def mostrar_error(error):
        messagebox.showerror("Error", error)

    def cerradoForzoso():
        ventana_curvas.destroy()
        ventana.destroy()

    ventana_curvas.protocol("WM_DELETE_WINDOW", cerradoForzoso)

    def mostrar_formula(etiqueta, formula):
        # Configurar la figura de matplotlib
        fig, ax = plt.subplots(figsize=(3, 1))
        ax.text(0.5, 0.5, formula, size=15, va="center", ha="center")

        # Crear el lienzo de Tkinter para la figura de matplotlib
        canvas = FigureCanvasTkAgg(fig, master=etiqueta)
        canvas.draw()

        # Obtener el widget del lienzo y colocarlo en la etiqueta
        canvas_widget = canvas.get_tk_widget()
        canvas_widget.pack(side=tk.TOP, fill=tk.BOTH, expand=1)

    def probarPunto(funcion, datosX, datosY):
            def graficar():
                if punto_entry.get() == "":
                    mostrar_error("No se ha introducido un punto")
                    return
                try:
                    punto_evaluar = float(punto_entry.get())
                    if punto_evaluar < datosX[0] or punto_evaluar > datosX[len(datosX)-1]:
                        mostrar_error("El punto está fuera del rango de los datos")
                        return
                except Exception as e:
                    mostrar_error(f"Error al convertir el punto a número \n detalles: {e}")
                print(datosX)
                print(datosY)
                print(funcion)
                arraydeX = np.array(list(datosX.values()))
                arraydeY = np.array(list(datosY.values()))
                plt.plot(arraydeX, arraydeY, marker='o', linestyle='-', label='Puntos introducidos')
                x = np.linspace(arraydeX[0], arraydeX[-1], 100)
                y = eval(funcion, {"sqrt": np.sqrt, "tg": np.tan, "cos": np.cos, "sin": np.sin, "ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": x})
                plt.plot(x, y, label=f'Función: {funcion}')
                y_punto = eval(funcion, {"sqrt": np.sqrt, "tg": np.tan, "cos": np.cos, "sin": np.sin, "ln": np.log, "log10": np.log10, "log2": np.log2, "e": np.e, "x": punto_evaluar})
                plt.scatter([punto_evaluar], [y_punto], color='red', label=f'Punto de prueba: ({punto_evaluar}, {y_punto})')
                plt.xlabel('Eje X')
                plt.ylabel('Eje Y')
                plt.title('Funciones')
                plt.legend()
                # Mostrar el gráfico
                plt.show()

            ventana_pruebas = tk.Toplevel(ventana_curvas)
            ventana_pruebas.title("Probar punto")
            titulo_label = tk.Label(ventana_pruebas, text="Gráfico y prueba de puntos", font=("Bahnschrift", 15))
            punto_label = tk.Label(ventana_pruebas, text="Punto a probar: ", font=("Bahnschrift", 12))
            punto_entry = tk.Entry(ventana_pruebas, width=5, font=("Bahnschrift", 12))
            probar_button = tk.Button(ventana_pruebas, text="Probar", font=("Bahnschrift", 12), command=graficar)
            titulo_label.pack()
            punto_label.pack()
            punto_entry.pack()
            probar_button.pack()

    def resultadosFinales(tabla,datosX,datosY):
        resultados = tk.Toplevel(ventana_curvas)
        resultados.title("Resultados finales")
        tree = ttk.Treeview(resultados, height=5)

        def cerradoForzoso():
            resultados.destroy()
        resultados.protocol("WM_DELETE_WINDOW", cerradoForzoso)


        tree["columns"] = ("xi", "yi", "xi^2", "Y = Ln(yi)", "xi * yi")
        tree.column("#0", width=70, minwidth=70, anchor=tk.CENTER)
        tree.column("xi", width=70, minwidth=70, anchor=tk.CENTER)
        tree.column("yi", width=120, minwidth=120, anchor=tk.CENTER)
        tree.column("xi^2", width=120, minwidth=120, anchor=tk.CENTER)
        tree.column("Y = Ln(yi)", width=120, minwidth=120, anchor=tk.CENTER)
        tree.column("xi * yi", width=120, minwidth=120, anchor=tk.CENTER)

        tree.heading("#0", text="Iteración")
        tree.heading("xi", text="xi")
        tree.heading("yi", text="yi")
        tree.heading("xi^2", text="xi^2")
        tree.heading("Y = Ln(yi)", text="Y = Ln(yi)")
        tree.heading("xi * yi", text="xi * yi")

        for i, row in enumerate(tabla):
            tree.insert("", i, text=str(i+1), values=tuple(row))

        alfa = "\u03B1"
        beta = "\u03B2"
        suma_xi = round(tabla[-1][0],2)
        suma_Y = round(tabla[-1][3],2)
        suma_xi2 = round(tabla[-1][2],2)
        suma_xi_yi = round(tabla[-1][4],2)
        tree.pack(expand=True, fill=tk.BOTH)
        etiqueta1 = tk.Label(resultados, text=f"Modelo", pady=10, font=("Bahnschrift", 12))
        etiqueta1.pack()
        etiqueta2 = tk.Label(resultados, text="Sistema: ", pady=10, font=("Bahnschrift", 12))
        etiqueta2.pack()
        etiqueta3 = tk.Label(resultados, text=f"{len(datosX)} a0 + {suma_xi} a1 = {suma_Y}", pady=10, font=("Bahnschrift", 12))
        etiqueta3.pack()
        etiqueta4 = tk.Label(resultados, text=f"{suma_xi} a0 + {suma_xi2} a1 = {suma_xi_yi}", pady=10, font=("Bahnschrift", 12))
        etiqueta4.pack()
        etiqueta5 = tk.Label(resultados, text=f"Solución:", pady=10, font=("Bahnschrift", 12))
        etiqueta5.pack()
        try:
            x, y = symbols('x y')
            eq1 = Eq(len(datosX)*x + tabla[-1][0]*y, tabla[-1][3])
            eq2 = Eq(tabla[-1][0]*x + tabla[-1][2]*y, tabla[-1][4])
            solucion = solve((eq1, eq2), (x, y))
            print(solucion)
            print(solucion[x])
            print(solucion[y])
            a0 = round(float(solucion[x]),3)
            print(a0)
            print(type(a0))
            a1 = round(float(solucion[y]),3)
        except Exception as e:
            mostrar_error(f"Error al resolver el sistema de ecuaciones \n Detalles: {e}")
            cerradoForzoso()
            return
        etiqueta6 = tk.Label(resultados, text=f"a0 = {a0} \n a1 = {a1}", pady=10, font=("Bahnschrift", 12))
        etiqueta6.pack()
        etiqueta7 = tk.Label(resultados, text=f"{alfa} = e^a0", pady=10, font=("Bahnschrift", 12))
        etiqueta7.pack()
        alfaA0 = round(np.exp(a0),3)
        etiqueta8 = tk.Label(resultados, text=f"Función", pady=10, font=("Bahnschrift", 12))
        etiqueta8.pack()
        etiqueta9 = tk.Label(resultados, text="Formula matemática", pady=10, font=("Bahnschrift", 12))
        etiqueta9.pack()
        formula_latex_etiqueta9 = r"$y = " + str(alfaA0) + " e^{" + str(a1) + " x}$"
        formula_latex_etiqueta1 = r"$y = \alpha e^{\beta x}$"
        formula_latex_etiqueta7 = r"$\alpha = e^{a_0} $"
        mostrar_formula(etiqueta9, formula_latex_etiqueta9)
        mostrar_formula(etiqueta1, formula_latex_etiqueta1)
        mostrar_formula(etiqueta7, formula_latex_etiqueta7)
        probarPunto(str(alfaA0)+"*e**("+str(a1)+"*x)",datosX,datosY)
    
    def resolver():
        global funcion_curvas, datos_ingresadosX, datos_ingresadosY
        modelo = modelos.get()
        try:
            a = int(cantidad.get())
        except Exception as e:
            mostrar_error(f"Ingrese la cantidad de datos de forma válida \n Detalles: {e}")
            return
        if modelo == "Seleccionar":
            mostrar_error("Seleccione un modelo")
            return
        if etiqueta4.cget("text") == "No se han introducido datos":
            mostrar_error("Introduzca los datos")
            return
        if etiqueta4.cget("text") == "Datos vacíos o inválidos.":
            mostrar_error("Introduzca datos válidos")
            return
        if modelo == "Modelo exponencial":
            tabla = []
            for i in range (len(datos_ingresadosX)):
                tabla.append([datos_ingresadosX[i], (datos_ingresadosY[i]), datos_ingresadosX[i]*datos_ingresadosX[i], np.log(datos_ingresadosY[i]), datos_ingresadosX[i]*np.log(datos_ingresadosY[i])])
            tabla_np = np.array(tabla)
            suma_columnas = np.sum(tabla_np, axis=0)
            tabla.append(list(suma_columnas))
            resultadosFinales(tabla,datos_ingresadosX,datos_ingresadosY)


    boton_resolver = tk.Button(ventana_curvas, text="Resolver", command=resolver, width=15, font=("Bahnschrift", 15))   
    boton_resolver.grid(column=0, row=5, columnspan=2)

    boton_cerrar_nueva_ventana = tk.Button(ventana_curvas, text="Menú", command=cerrar, width=15, font=("Bahnschrift", 15))
    boton_cerrar_nueva_ventana.grid(column=0, row=6, columnspan=2, pady = 15)

    # Iniciar el bucle principal de la nueva ventana
    ventana_curvas.mainloop()

centrar_ventana(ventana)

titulo = tk.Label(ventana, text="Métodos numéricos", font=("Bahnschrift", 15), padx=0, pady=20)
btn_biseccion = tk.Button(ventana, text="Bisección", width=30, height=2, padx=0, pady=20, command = abrir_ventana_biseccion)
btn_punto_fijo = tk.Button(ventana, text="Punto fijo", width=30, height=2, padx=0, pady=20, command=abrir_ventana_punto_fijo)
btn_curvas= tk.Button(ventana, text="Ajuste de curvas", width=30, height=2, padx=0, pady=20, command=abrir_ventana_curvas) 
titulo.grid(column=0, row=0, pady=5, sticky="nsew")
btn_biseccion.grid(column=0, row=1, pady=5, sticky="nsew")
btn_punto_fijo.grid(column=0, row=2, pady=5, sticky="nsew")
btn_curvas.grid(column=0, row=3, pady=5, sticky="nsew")


ventana.mainloop()
