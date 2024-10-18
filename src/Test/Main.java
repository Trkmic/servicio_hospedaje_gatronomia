package Test;

import Model.Gastronomia;
import Model.Hospedaje;
import Model.Sistema;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("1-1");
        try {

            Gastronomia gastronomia1 = new Gastronomia("4892", 15.0, true, (LocalDate.of(1995, 5, 3)), "Hamburguesa criolla", 180.0, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("1-2");
        Gastronomia gastronomia2 = new Gastronomia("489235", 15.0, true, (LocalDate.of(2020, 10, 28)), "Hamburguesa criolla", 180.0, 4);
        System.out.println(gastronomia2.toString());

        System.out.println("1-3");
        try {
            Hospedaje hospedaje1 = new Hospedaje("2872", 10.0, true, (LocalDate.of(2005, 1, 3)), "Cabania 3 personas", 1500.0, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("1-4");
        Hospedaje hospedaje2 = new Hospedaje("287282", 10.0, true, (LocalDate.of(2009, 4, 21)), "Cabania 3 personas", 1500.0, 5);
        System.out.println(hospedaje2.toString());

        System.out.println("2-1");
        System.out.println(gastronomia2.calcularPrecioFinal(LocalDate.of(2020, 10, 28)));

        System.out.println("2-2");
        System.out.println(hospedaje2.calcularPrecioFinal(LocalDate.of(2020, 10, 27)));

        Sistema servicio = new Sistema();

        System.out.println("3");
        servicio.agregarGastronomia("858927", 15.0, true, (LocalDate.of(1968, 1, 1)), "Milanesa con pure", 350.0, 3);
        servicio.agregarHospedaje("489259", 10.0, true, (LocalDate.of(2020, 10, 28)), "Habitacion triple", 2200.0, 10);
        servicio.agregarGastronomia("182835", 20.0, false, (LocalDate.of(1993, 6, 4)), "Gaseosa", 120.0, 3);
        servicio.agregarHospedaje("758972", 15.0, false, (LocalDate.of(1976, 5, 31)), "Habitacion simple", 1000.0, 5);
        System.out.println(servicio.toString());

        System.out.println("4-1");
        System.out.println(servicio.traerServicio(true));

        System.out.println("4-2");
        System.out.println(servicio.traerServicio(true, (LocalDate.of(2020, 10, 28))));
    }

}
