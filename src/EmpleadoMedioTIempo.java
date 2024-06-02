public class EmpleadoMedioTIempo extends Empleados{

    private double salariXhoras;
    private int HorastrabajadasXsemana;
    

    public EmpleadoMedioTIempo(String nombre, String numidentificacion, double salariXhoras, int HorastrabajadasXsemana) {
        super(nombre, numidentificacion);
        this.salariXhoras=salariXhoras;
        this.HorastrabajadasXsemana=HorastrabajadasXsemana;
       
       
    }
    @Override
    public double calcularsalario(){
        return salariXhoras * HorastrabajadasXsemana *  4; // Salario mensual
    }

    

}
