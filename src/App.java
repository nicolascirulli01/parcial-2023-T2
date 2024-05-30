import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Ong org = new Ong("Codigo Verde");

        // b.2 Registro de donantes
        Donante dt1 = org.registrarDonante("Wiley", "Wesley");
        Donante dt2 = org.registrarDonante("Chandler", "Stephens");
        Donante dt3 = org.registrarDonante("Keeley", "Sherman");
        Donante dt4 = org.registrarDonante("Keiran", "Raines");
        Donante dt5 = org.registrarDonante("Brendon", "Boothman");

        // b.3 Carga de Donaciones
        Donacion dc1 = org.cargarDonacion(dt1, LocalDate.of(2023,10,26), 50);
        Donacion dc2 = org.cargarDonacion(dt2, LocalDate.of(2023,10,22), 100);
        Donacion dc3 = org.cargarDonacion(dt3, LocalDate.of(2023,10,22), 60);
        Donacion dc4 = org.cargarDonacion(dt4, LocalDate.of(2023,10,31), 40);
        Donacion dc5 = org.cargarDonacion(dt5, LocalDate.of(2023,10,15), 30);
        Donacion dc6 = org.cargarDonacion(dt1, LocalDate.of(2023,11,7), 100);
        Donacion dc7 = org.cargarDonacion(dt2, LocalDate.of(2023,11,2), 100);
        Donacion dc8 = org.cargarDonacion(dt3, LocalDate.of(2023,11,9), 60);
        Donacion dc9 = org.cargarDonacion(dt4, LocalDate.of(2023,11,10), 50);
        Donacion dc10 = org.cargarDonacion(dt5, LocalDate.of(2023,11,11), 90);

        // b.4 Actualizacion de Donaciones
        dc1.setCobrada();
        dc2.setCobrada();
        dc3.setCobrada();
        dc4.setRechazada();
        dc5.setCobrada();
        dc6.setCobrada();
        dc7.setRechazada();
        dc9.setCobrada();

        // b.5 Mostrar Donantes
        //org.mostrarDonantes();

        // b.6 Mostrar Donaciones ordenadas por fecha
        org.mostrarDonaciones();

        // b.7 Mostrar Resultado a la fecha 10/11/2023
        //org.mostrarResultadoFecha(LocalDate.of(2023,11,10));
   
   
    }
}
