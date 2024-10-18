package Model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Hospedaje extends Servicio {

    private String hospedaje;
    private double precioPorNoche;
    private int diasDeHospedaje;

    public Hospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate dia, String hospedaje, double precioPorNoche, int diasDeHospedaje) {
        super(codServicio, porcentajeDescuento, enPromocion, dia);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
        this.diasDeHospedaje = diasDeHospedaje;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = precioPorNoche * diasDeHospedaje;
        DayOfWeek diaDeSemana = dia.getDayOfWeek();

        if (isEnPromocion()) {
            if (diaDeSemana != DayOfWeek.SATURDAY && diaDeSemana != DayOfWeek.SUNDAY) {
                double descuento = porcentajeDescuento / 100;
                precioFinal *= (1 - descuento);
            }
        }
        return precioFinal;

    }

    @Override
    public String toString() {
        return "Hospedaje{" + "codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + ", dia=" + dia + ", hospedaje=" + hospedaje + ", precioPorNoche=" + precioPorNoche + ", diasDeHospedaje=" + diasDeHospedaje + '}';
    }

}
