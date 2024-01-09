//Clase base vivienda
public class vivienda {
    //Atributos de la clase padre
    private String direccion;
    private int numHabitaciones;
    private String tipoVivienda;

    //Contructor de la clase vivienda
    public vivienda(String direccion, int numHabitaciones, String tipoVivienda) {
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.tipoVivienda = tipoVivienda;
    }
    //getters y setters de la clase atributo
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    public String getTipoVivienda() {
        return tipoVivienda;
    }
    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }
    //metodo mostrar Informacion
    public void mostrarInfo() {
        System.out.println("La info de la vivienda es: ");
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de Habitaciones: " + numHabitaciones);
        System.out.println("Tipo de vivienda: " + tipoVivienda);
    }
    //nueva clase hija heredada de la clase vivienda
    public static class casa extends vivienda {
        //atributos de la clase casa
        private double areaConstruida;
        private int numBanos;
        //constructor de la clase hija
        public casa(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida, int numBanos) {
            super(direccion, numHabitaciones, tipoVivienda);
            this.areaConstruida = areaConstruida;
            this.numBanos = numBanos;
        }
        //getters y setters de la clase hija
        public double getAreaConstruida() {
            return areaConstruida;
        }
        public void setAreaConstruida(double areaConstruida) {
            this.areaConstruida = areaConstruida;
        }
        public int getNumBanos() {
            return numBanos;
        }
        public void setNumBanos(int numBanos) {
            this.numBanos = numBanos;
        }

        //metodo mostrar Informacion
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Area Construida: " + areaConstruida);
            System.out.println("Numero de baños: " + numBanos);
        }


    }

//clase casaCiudad heredada de casa

    public static class casaCiudad extends casa {
        //atributos departamiento
        private String estadoCasaCiudad;
        private float precioCasaCiudad;

        //metodos clase departamiento
        //Constructor
        public casaCiudad(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida, int numBanos, String estadoCasaCiudad, float precioCasaCiudad) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos);
            this.estadoCasaCiudad = estadoCasaCiudad;
            this.precioCasaCiudad = precioCasaCiudad;
        }

        //getters y setters de la clase departamento
        //atributo estadoDepartamento
        public String getEstadoCasaCiudad() {
            return estadoCasaCiudad;
        }

        public void setEstadoCasaCiudad(String estadoCasaCiudad) {
            this.estadoCasaCiudad = estadoCasaCiudad;
        }
        //atributo precioDepartamento

        public float getPrecioCasaCiudad() {
            return precioCasaCiudad;
        }

        public void setPrecioCasaCiudad(float precioCasaCiudad) {
            this.precioCasaCiudad = precioCasaCiudad;
        }

        //metodo mostrar Informacion
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Estado: " + estadoCasaCiudad);
            System.out.println("Precio: " + precioCasaCiudad);
        }

    }

    //tercer nivel de herencia
    public static class apartamentoCiudad extends casaCiudad {
        //atributos
        private String tipoAparcamiento;
        private String tipoSeguridad;
        private int numPersonasViviendo;

        //metodos
        //constructor
        public apartamentoCiudad(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida,
                                 int numBanos, String estadoCasaCiudad, float precioCasaCiudad, String tipoAparcamiento,
                                 String tipoSeguridad, int numPersonasViviendo) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos, estadoCasaCiudad, precioCasaCiudad);
            this.tipoAparcamiento = tipoAparcamiento;
            this.tipoSeguridad = tipoSeguridad;
            this.numPersonasViviendo = numPersonasViviendo;
        }

        //getters and setters clase apartamentoCiudad
        //atributo tipoAparcamiento
        public String getTipoAparcamiento() {
            return tipoAparcamiento;
        }

        public void setTipoAparcamiento(String tipoAparcamiento) {
            this.tipoAparcamiento = tipoAparcamiento;
        }

        //atributo tipoSeguridad
        public String getTipoSeguridad() {
            return tipoSeguridad;
        }

        public void setTipoSeguridad(String tipoSeguridad) {
            this.tipoSeguridad = tipoSeguridad;
        }

        //atributo numPersonasViviendo
        public int getNumPersonasViviendo() {
            return numPersonasViviendo;
        }

        public void setNumPersonasViviendo(int numPersonasViviendo) {
            this.numPersonasViviendo = numPersonasViviendo;
        }

        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Tipo de aparcamiento: " + tipoAparcamiento);
            System.out.println("Tipo de seguridad: " + tipoSeguridad);
            System.out.println("Numero de personas viviendo: " + numPersonasViviendo);
        }

    }

    //Cuarto nivel de herencia
    public static class chalet extends apartamentoCiudad {
        private float areaPatio;
        private boolean tieneJardin;

        public chalet(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida,
                      int numBanos, String estadoCasaCiudad, float precioCasaCiudad, String tipoAparcamiento,
                      String tipoSeguridad, int numPersonasViviendo, float areaPatio, boolean tieneJardin) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos, estadoCasaCiudad, precioCasaCiudad,
                    tipoAparcamiento, tipoSeguridad, numPersonasViviendo);
            this.areaPatio = areaPatio;
            this.tieneJardin = tieneJardin;
        }

        public float getAreaPatio() {
            return areaPatio;
        }

        public void setAreaPatio(float areaPatio) {
            this.areaPatio = areaPatio;
        }

        public boolean getTieneJardin() {
            return tieneJardin;
        }

        public void setTieneJardin(boolean tieneJardin) {
            this.tieneJardin = tieneJardin;
        }

        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Area del patio: " + areaPatio + "m");
            System.out.println("Tiene Jardin?: " + tieneJardin);
        }
    }

    //Quinto nivel de herencia
    public static class loft extends chalet {
        private double alturaTecho;
        private int numVentanas;

        // Constructor de la clase hija
        public loft(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida,
                    int numBanos, String estadoCasaCiudad, float precioCasaCiudad, String tipoAparcamiento,
                    String tipoSeguridad, int numPersonasViviendo, float areaPatio, boolean tieneJardin,
                    double alturaTecho, int numVentanas) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos, estadoCasaCiudad, precioCasaCiudad,
                    tipoAparcamiento, tipoSeguridad, numPersonasViviendo, areaPatio, tieneJardin);
            this.alturaTecho = alturaTecho;
            this.numVentanas = numVentanas;
        }

        public double getAlturaTecho() {
            return alturaTecho;
        }

        public void setAlturaTecho(double alturaTecho) {
            this.alturaTecho = alturaTecho;
        }

        public int getNumVentanas() {
            return numVentanas;
        }

        public void setNumVentanas(int numVentanas) {
            this.numVentanas = numVentanas;
        }
        // Metodo mostrar Informacion
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Altura del Techo: " + alturaTecho + "m");
            System.out.println("Numero de Ventanas: " + numVentanas);
        }

    }
    //ejecucion main
    public static void main(String[] args){
        loft casa1 = new loft("Ibarra", 5, "loft y apartamento", 48.7, 3, "Nuevo", 74999,
                "Personal", "Privado", 6, 150, true, 5.3, 12);
        casa1.mostrarInfo();
        System.out.println("Ya esta xd");
    }
}