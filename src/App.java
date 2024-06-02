public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleados [] empleados= new Empleados [2];

        empleados[0]= new EmpleadoMedioTIempo("Gustavo ", " 1643F",  2000, 8);
        empleados[1]= new Empleadotiempocompleto("Angel ", " 28873C", 1263, 100,5);



        Empleados [] empleados2= new Empleados [2];

        empleados2[0]= new EmpleadoMedioTIempo("Gustavo2 ", " 16453643F",  20099, 8);
        empleados2[1]= new Empleadotiempocompleto("Angel2 ", " 288846473C", 9732, 2,2);


       
      for (Empleados empleadoss : empleados) {
        System.out.println(empleadoss.getnombre ()+ "Salario Mensual: $"+empleadoss.calcularsalario() );
        
      }
      System.out.println("=======================================================================================================================================================================================================================");
      for (int i = 0; i < empleados2.length; i++) {
        System.out.println(empleados2[i].getnombre ()+ "Salario "+(i+1)+" Mensual: $"+empleados2[i].calcularsalario());
        
      }

       
    }
}
