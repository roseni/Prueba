package umg.principal.Conductores;


public class Conductor{
    public class Condutor {
        public String nombre;
        public Condutor(String nombre, String licencia) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
        public void usarFuerza(){
            System.out.println(nombre+ "ESTA USANDO LA FUERZA");

        }
}