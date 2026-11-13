package ejercicios;

import java.util.List;

public class Ejercicios {

    // EJERCICIO 1
    public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
        String resultado;
        if (a + b <= c || a + c <= b || b + c <= a) {
            resultado = "Invalido";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            resultado = "Rectangulo";
        } else if (a.equals(b) && b.equals(c)) {
            resultado = "Equilatero";
        } else if (a.equals(b) || a.equals(c) || b.equals(c)) {
            resultado = "Isosceles";
        } else {
            resultado = "Escaleno";
        }
        // si no es ninguno de los anteriores debuelve el resultado que seria invadido
        return resultado;
    }
    
    
    //EJERCICIO 2
    public static void trianguloAlterno(Integer n) {
        //va a recorrer las filas desde 1 hasta hasta n
        for (int i = 1; i <= n; i++) {
        	// si la fila es par va a poner 0 y si es impar va a poner 1
            Integer valor = (i % 2 != 0) ? 1 : 0;
            //va a imprime tantos numeros como indique el numero de la  fila actual que es i
            for (int j = 1; j <= i; j++) {
                System.out.print(valor);
                // el valor va a ir alternando el valor entre 0 y 1 para que suiguente columna no vuelva a empezar por el mismo nuero que termino el de antes 
                valor = (valor == 1) ? 0 : 1;
            }
            System.out.println(); 
        }
    }
    
    
    //EJERCICIO 3
    public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {
        Integer resultado = -1;
        boolean encontrado = false;

        for (int num = inicio; num <= fin && !encontrado; num++) {
            Integer contadorDivisores = 0;
            for (int d = 1; d < num; d++) {
                if (num % d == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores >= minimoDivisores) {
                resultado = num;
                encontrado = true; //cuando encuentre el numero va a detener la busqueda en la siguiente vuelta que haga
            }
        }

        return resultado;
    }
    
    //EJERCICIO 4
    public static Integer tribonacci(Integer n) {
        Integer resultado;
        // empezamos haciendo los casos como T(5) = T(4) + T(3) + T(2) = 4 + 2 + 1 = 7. 
        if (n == 0) {
            resultado = 0;
        } else if (n == 1 || n == 2) {
            resultado = 1;
        } else {
            resultado = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3); //haremos la suma de los tres términos anteriores que se ha hecho con anterioridad arriba
        }

        return resultado;
    }
    
    //EJERCICIO 5
    public static Boolean esCasiCreciente(List<Integer> datos) {
        Integer rupturas = 0;
        for (int i = 1; i < datos.size(); i++) {
            if (datos.get(i) <= datos.get(i - 1)) {
                rupturas++;
            }
        }
        Boolean resultado = rupturas <= 1;
        return resultado;
    }    
    

    
    
    //EJERCICIO 6 
    public static Integer primeraVentanaObjetivo(List<Integer> ventas, Integer longitud, Integer objetivo) {
        Integer posicionEncontrada = -1;
        boolean encontrada = false;
        for (int i = 0; i < ventas.size()- longitud ; i++) {
			
		}
    return posicionEncontrada;
    }
    
    

    
    //EXERCISE 7
    
    
}

