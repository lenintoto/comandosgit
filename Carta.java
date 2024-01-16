public abstract class Carta {
    protected String nombre;
    public Carta(String nombre){
        this.nombre=nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public abstract void jugar();
    public abstract void mostrarDescripcion();
}
class CartaNumerica extends Carta{
    private int num;
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public CartaNumerica(String nombre, int num) {
        super(nombre);
        this.num=num;
    }
    @Override
    public void jugar() {
        double numeroDouble = (double) num;
        double resultado = numeroDouble / 2;
        System.out.println("El resultado del cálculo es: " + resultado);

    }
    @Override
    public void mostrarDescripcion() {

    }
}
class CartaEspecial extends Carta{
    public CartaEspecial(String nombre){
        super(nombre);
    }
    @Override
    public void jugar() {

    }
    @Override
    public void mostrarDescripcion() {

    }
    public void activarEfectoEspecial() {
        try {

        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar activar el efecto especial: " + e.getMessage());
        }
    }
}
