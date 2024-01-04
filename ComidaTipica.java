public class ComidaTipica {
    public String nombre;
    private String ingPrin;
    public String getIngPrin() {
        return ingPrin;
    }
    public void setIngPrin(String ingPrin) {
        this.ingPrin = ingPrin;
    }
    public ComidaTipica(String nombre){
        this.nombre=nombre;
    }
    public void plato(){
        System.out.printf("El plato: %s tiene como ingrediente principal: %s\n",nombre,ingPrin);
    }
}
class Costa extends ComidaTipica{
    public double precio;
    public Costa(String nombre, double precio) {
        super(nombre);
        this.precio=precio;
    }
    public void costo(){
        System.out.printf("El plato %s, tiene un costo de %f\n",super.nombre,precio );
    }
}
class Restaurante extends Costa{
    public String tipoRestaurante;
    public Restaurante(String nombre,String ingPrin,double precio,String tipoRestaurante) {
        super(nombre, precio);
        this.tipoRestaurante=tipoRestaurante;
        super.setIngPrin(ingPrin);
    }
    public void mensaje(){
        System.out.printf("El restaurante tipo %s vende %s con su ingrediente principal '%s' a un precio de %.2f",tipoRestaurante,super.nombre,super.getIngPrin(),super.precio);
    }
    public static void main(String[] args){
        Restaurante nuevo1 = new Restaurante("Ceviche", "camarón",3.75,"Marisqueria");
        nuevo1.costo();
        nuevo1.plato();
        nuevo1.mensaje();
    }
}
