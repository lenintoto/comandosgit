public class Numeros {
    public static void main(String[] args) {
        try {
            int[] numeros = {10, 6, 3};
            System.out.println(numeros[10]);
        } catch (Exception e) {
            System.out.println("No existe un número en esa posición");
        }
    }
}