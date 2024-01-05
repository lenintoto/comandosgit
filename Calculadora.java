public class Calculadora {
    public int a;
    public int b;
    public int c;
    public int sumar(int a, int b){
        return a+b;

    }
    public int sumar(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int resultado1 = calc.sumar(3, 4);
        int resultado2 = calc.sumar(3, 4, 5);
        System.out.println("La suma de los números es: "+resultado1);
        System.out.println("La suma de los números es: "+resultado2);
    }
}
