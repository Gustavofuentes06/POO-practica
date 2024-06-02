abstract public class Empleados {
    private String nombre;
    private String numidentificacion;

    public Empleados(String nombre, String numidentificacion){
        this.nombre=nombre;
        this.numidentificacion=numidentificacion;
    }

    public String getnombre(){
        return nombre;
    }
    public String getnumidentificacion(){
       return numidentificacion;
    }

    public abstract double calcularsalario();

}
