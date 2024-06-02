public class Empleadotiempocompleto extends Empleados {

    private double salarioAnual;
    private double bonus;
    private int horasextras;


    public Empleadotiempocompleto(String nombre, String numidentificacion, double salarioAnual, double bonus,int horasextras){
        super(nombre, numidentificacion);
        this.salarioAnual=salarioAnual;
        this.bonus=bonus;
        this.horasextras=horasextras;
    }

    @Override
    public double calcularsalario() {
        return salarioAnual+bonus+(horasextras*2*salarioAnual);
    }

}
