//---TALLER PRACTICO---//
fun main() {
//FUNCIONES
/*
El identificador de una funcion sigue las mismas reglas que los
identificadores de las variables:
-No puede empezar con un numero
-No puede ser una palabra reservada
-No puede tener espacios
-No puede llevar _, @, *, !, -, +
-Se escriben en cammel case
-En principio las funciones las vamos a declarar FUERA del main
-Las declaramos por fuera, pero las invocamos por DENTRO del main
*/
    //---EJERCICIO---//
    /*
        1. Escribir 4 funciones para calcular suma, resta, multiplicación y
        división de dos números guardados en variables predefinidas.
    */

    //---¿Como llamar a una funcion?---//

    //Primero creo una variable que contenga el resultado de esa funcion
    var resultado: Int = suma(4, 7)
    //Luego imprimo el resultado de la suma guardado en la variable resultado
    println(resultado)
    var resultado1: Int = resta()
    println(resultado1)
}

//---FUNCION DE SUMA---//
fun suma(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

//---FUNCION DE RESTA---//
fun resta(numero1: Int = 10, numero2: Int = 5): Int {//Declaracion de una funcion con valores predefinidos
    return numero1 - numero2
}
//011312













//---EJERCICIOS---//
/*
2. Vamos a agregar interactividad a nuestro programa. Para ello, vamos
a hacer uso de una función que permite el ingreso de datos durante
la ejecución del programa:
Agregar a la función anterior la posibilidad de ingresar los dos valores
en tiempo de ejecución, a través de la consola
*El programa debe mostrar textos que den información al usuario de lo
que tiene que hacer y de los resultados, por ejemplo:
“Programa para sumar”
“Ingrese el primer número: ”
“La suma de 2 + 3, dio como resultado 5”
Dado el siguiente array [12, 0, -4, 48, -52, 25, 2, 31]
A. Escribir una función que devuelva el resultado de la suma de todos
sus valores.
B. Escribir una función que devuelva el promedio de los valores del
array.
C. Escribir una función que devuelva la cantidad de números negativos.
D. Escribir una función que muestre los números impares y además que
muestre la cantidad.
E. Escribir una función que muestre los números del Array que sean
múltiplos de 2, de 3 o de 5
*Tener en cuenta para todas las operaciones, que el Array pueda
cambiar, es decir, que es necesario calcular la longitud del Array.
*/