fun main() {
/*
Temario de la clase 4:
-Funciones
-Condicionales
    * If - “Then” - Else
-When
- Operadores de comparación
- Iteradores
    * For
    *While
    *Do While
-Repaso de Arrays
-Taller
*/
//---FUNCIONES---//
/*
Las funciones son bloques de código que sirven para organizar la
estructura de nuestro programa.
Las funciones se definen a partir de la necesidad de ser reutilizadas en
diferentes partes del código.
Las funciones pueden devolver un resultado o no. Muchas veces se hace
la distinción entre Función (cuando devuelve un valor) y Procedimiento
(Cuando no devuelve nada). En Kotlin llamaremos a los dos tipos,
simplemente función.
Por ejemplo:
Si tengo una función llamada “suma” la voy a invocar cada vez que
necesite calcular una suma. De esta manera, consigo que el código quede
mejor articulado y además, es más fácil para mantener.
*/
//---ESTRUCTURA DE UNA FUNCIÓN---//
//    fun nombreFuncion(parametro1:tipo,parametro2:tipo,parametro3:tipo){
    //La funcion se crea mediante la palabra reservada "fun"
    //Luego escribimos el nombre de la funcion
    //Luego pasamos los parametros con su tipo de dato
    //Puede tener cero, uno, dos o muchos parametros
    //Por ultimo  entre corchetes escribimos el cuerpo de la funcion

    //...CUERPO DE LA FUNCION...

    //002158

    // }

/*
//---Declaración de una función - Ejemplo---//

fun suma(numero1: Int, numero2: Int): Int {
return numero1 + numero2
}

//---Versión simplificada Equivalente---//

fun suma(numero1: Int, numero2: Int):Int = numero1 + numero2

*/
    //---Uso o invocación de una función---//
//Primero declaramos la funcion

    fun suma(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }
//Luego la llamamos dentro de una variable
    //var resultado = println( suma(3, 7))
}

fun estrcturasCondicionales(){
/*
//---Estructuras Condicionales---//

Las estructuras condicionales nos ayudan a controlar el flujo de los
programas. Estas estructuras se basan en la evaluación de condiciones
para tomar decisiones de acuerdo a ciertos parámetros dados.
En Kotlin vamos a ver las siguientes estructuras:
● If
● When

//---Estructuras condicionales- if---//

Las estructuras condicionales nos permiten evaluar una condición y en
base al resultado ejecutar código diferente según el caso.
La estructura if se arma de la siguiente forma:

if (Esta condición es verdadera) {
Entonces ejecuto esto
}

Básicamente en la linea de codigo de arriba, en los paréntesis vamos a
colocar la condición que se tiene que cumplir y entre las llaves que hacer
si se cumple.

//---Estructuras condicionales- if: Ejemplo---//

Por ejemplo supongamos que queremos saber si un numero ingresado es
mayor a 18

fun main(args : Array<String>) {
        var edad = 18
    if (edad >= 18) {
        println("El numero ingresado es mayor o igual que 18")
    }
}

//---Estructuras condicionales- if, else---//

En algunos casos no nos basta con saber que se cumple una condición,
sino que en caso de que no se cumpla necesitamos que se haga otra cosa.
Para resolver este aspecto, existe el comando else el que se encargará de
ejecutar todo lo que está entre sus llaves en caso de que la condición no
se cumpla.

if (Esta condición es verdadera) {
    Entonces ejecuto esto
}
else{
    Sino, ejecuto esto otro
}

//--Estructuras condicionales - if, else: Ejemplo--//

Tomando el ejercicio anterior, haremos que si el numero ingresado es
menor a 18 escriba por consola algo relacionado a ello.

fun main(args : Array<String>) {
    var edad = 18
    if (edad >= 18) {
        println("El numero ingresado es mayor o igual que 18")
    }
    else{
        println("El numero ingresado es menor que 18")
    }
}

//---Estructuras condicionales - if anidados--//

Es importante saber que se pueden anidar múltiples if en caso de ser
necesario. Esto permite que se pueda hacer operaciones específicas
anidadas considerando múltiples condiciones.

if (/* Si esto sucede */) {
    // Entonces ejecuto esto
        if (/* Si esto sucede */) {
            // Entonces ejecuto esto otro
        }
        else {
            // Entonces ejecuto esto otro
        }
}
else{
    // Entonces ejecuto esto
}
*/
/*
//---Estructuras condicionales - if anidados: Ejemplo---//

if (Tiene Pasaporte) {
    // Entonces ejecuto esto
        if (Tiene edad >=18) {
            // Entonces puede viajar solo
        } else {
            // Entonces no puede viajar solo
    }
} else {
    // No Viaja
}

*/
/*
004016
//---Estructura When---//

*/





















}
