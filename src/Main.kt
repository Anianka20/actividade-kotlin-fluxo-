fun main () {
    println("ejercicio 1")

    //Cadena original que vamos a evaluar
    val palabra = "Universidade"

    //Lista de referencia con todas las vocales (tanto minúsculas como mayúsculas)
    val vogais = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    //Recorremos la paalabra letra por letra
    for (caractere in palabra) {
        //Verificamos si la letra actual está contenida en nuestra lista de vocales
        if (caractere in vogais) {
            //Si es vocal, 'continue' salta esta vuelta para no imprimirla
            continue
        }

        //Si no fue vocal, imprimimos la consonante
        println(caractere)
    }
    println()

    println("ejercicio 2")
    //Inicializamos el contador en 1 tal como pide la consigna
    var numero = 1

        //Iniciamos un bucle infinito que continuará ejecutandose hasta que encontremmos el resultado
        while (true) {
            //El operador '%' obtiene el residuo de la división
            //Si el residuo con 7 y 13 es 0, significa que el número es divisible entre ambos a la vez
            if (numero % 7 == 0 && numero % 13 == 0) {
                println("O primeiro múltiplo comum de 7 e 13 é: $numero")

                // 'break' detiene el ciclo de inmediato para evitar cálculos innecesarios
                break
            }

            //Si no cumple la condición, aumentamos el número en 1 para evaluar el siguiente en la próxima vuelta
            numero++
        }
        println()

    println("ejercicio 3")
    //Variable acumuladora inicializada en cero para almacenar la suma
    var total = 0

    //Iteramos a traves de los numeros del 1 al 100
    for (numero in 1..100) {
        //Verificamos si el numero actual es multiplo de 10
        if (numero % 10 == 0) {
            // 'continue' omite la suma y salta inmediatamente al siguiente numero
            continue
        }

        //Acumulamos el valor del numero en el total
        total += numero

        //Comprobamos si el total acumulado sobrepaso el limite establecido de 500
        if (total > 500) {
            println("Limit atingido! Bucle abordado no número $numero Valor final da soma: $total")
            break
        }
    }
    println()

    println("ejercicio 4")
    //Definimmos el saldo disponible inicial y el monto fijo a retirar en cada iteracion
    var saldo = 1000.00
    val valorSaque = 150.00

    //Bucle infinito que procesa retiros continuos
    while (true) {
        //Verificamos si los fondos actuales son suficientes para cubrir el retiro
        if (saldo >= valorSaque) {
            saldo -= valorSaque //Restamos el monto del saldo disponible
            println("Saque realizado: R$ $valorSaque | Saldo restante: R$ $saldo")
        } else {
            //Si el saldo es menor que 150, notificamos la falta de fondos
            println("Saldo insuficiente. Saldo atual: R$ $saldo")

            //'break' corta el bucle infinito para finalizar las transacciones
            break
        }
    }
    println()

    println("ejercicio 5")
    //Numero de prueba a verificar
    val alvo = 29

    //Asumimos inicialmente que el numero si es primo
    var ehPrimo = true

    // 'until' crea un rango que va de 2 hasta (alvo - 1), excluyendo el propio 29
    for (divisor in 2 until alvo) {
        //Si el residuo es 0, significa que encontramos una division exacta
        if (alvo % divisor == 0) {
            ehPrimo = false //Ya no califica como primo

            //'break' detiene el ciclo de inmediato para no desperdiciar tiempo de computo
            break
        }
    }

    //Comprobamos el resultado: debe conservar la bandera en true y ser mayor que 1
    if (ehPrimo && alvo > 1) {
        println("O número $alvo é PRIMO.")
    } else {
        println("O número $alvo NÃO é primo.")
    }
    println()

    println("ejercicio 6")

    //Lista que simula las entradas introducidas por un usuario
    val entradas = listOf(1, 3, 2, 3, 0)
    var indice = 0 //Puntero para recorrer la lista de simulacion

    //Bucle inifinito solicitado en la consigna
    while (true) {
        //Tomamos la opcion correspondiente al turno actual
        val opcao = entradas[indice++]
        println("Opção escolhida: $opcao")

        //Evaluamos la opcion seleccionada
        when (opcao) {
            1, 2 -> {
                println("Procesando...")
            }

            3 -> {
                println("Módulo em manutenção")
                //'continue' regresa de inmediato al inicio del bucle inifinito
                continue
            }

            0 -> {
                println("Encerrando o programa.")
                //'break' rompe el bucle infinito y finaliza la ejecucion
                break
            }

            else -> {
                println("Opção inválida.")
            }
        }
    }
    println()

    println("ejercicio 7")
    //Recorremos los numeros del 1 al 50 de manera consecutiva
    for (numero in 1..50) {
        //En base 10, al aplicar '%10' obtenemos siempre el ultimo digito del numero
        //Si el numero termina en 7 (7, 17, 27, 37, 47), se cumple la condicion
        if (numero % 10 == 7) {
            //'continue' descarta la impresion y pasa directamente al siguiente numero
            continue
        }

        //Se imprimen todos los numeros que no terminaron en 7
        println("$numero")
    }
    println()

    println("ejercicio 8")
    //Definimos la clave correcta del cofre
    val senhaCorreta = "1234"

    //Lista simulada de intentos ingresados por el usuario
    val tentativas = listOf("0000", "9999", "8888", "1234", "1111")

    //Contador especifico para llevar el registro de intentos fallidos
    var erros = 0

    //Bucle for que otorga como maximo 5 intentos (de 1 a 5)
    for (tentativa in 1..5) {

        //Obtenemos la clave ingresada correspondiente al intento actual (inidice de 0 a 4)
        val entrada = tentativas[tentativa - 1]

        //Comprobamos si la clave ingresada es la correcta
        if (entrada == senhaCorreta) {
            println("Tentativa $tentativa: Senha correta! Acesso concedido.")
            //'break' detiene el ciclo de inmediato al otorgar el acceso
            break
        } else {
            erros++ //Incrementar el conteo de fallos
            println("Tentativa $tentativa: Senha incorreta! (Erros: $erros!)")

            //Si se equivoca por 3ra vez, se bloquea el cofre
            if (erros == 3) {
                println("Cofre travado administrativamente")
                //'break' interrumpe el bucle para impedir que se ejecuten los intentos restantes
                break
            }
        }
    }
}