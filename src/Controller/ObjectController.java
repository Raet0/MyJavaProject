package Controller;

public class ObjectController {
    public class BusquedaSecuencial {

        public static int busquedaSecuencial(int[] array, int valorBuscado) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valorBuscado) {
                    return i; // Devuelve el índice donde se encuentra el valor buscado
                }
            }
            return -1; // Devuelve -1 si el valor no se encuentra en el array
        }
    
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            int valorBuscado = 30;
            int resultado = busquedaSecuencial(array, valorBuscado);
    
            if (resultado != -1) {
                System.out.println("El valor " + valorBuscado + " se encuentra en el índice " + resultado);
            } else {
                System.out.println("El valor " + valorBuscado + " no se encuentra en el array");
            }
        }
    }
    
}
