package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Servicio> lstServicio = new ArrayList<>();
    private List<Servicio> serviciosEnPromocion = new ArrayList<>();
    private List<Servicio> serviciosPorDia = new ArrayList<>();

    public Servicio traerServicio(String codServicio) {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                return servicio;
            }

        }
        throw new IllegalArgumentException("No existe un servicio con el codigo que proporciono.");
    }

    public List<Servicio> traerServicio(boolean enPromocion) {

        for (Servicio servicio : lstServicio) {
            if (servicio.enPromocion == enPromocion) {
                serviciosEnPromocion.add(servicio);
            }
        }
        return serviciosEnPromocion;
    }

    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
        for (Servicio servicio : lstServicio) {
            if (servicio.enPromocion == enPromocion && servicio.getDia().equals(dia)) {
                serviciosPorDia.add(servicio);
            }
        }
        return serviciosPorDia;
    }

    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento,
            boolean enPromocion, LocalDate dia, String gastronomia, double precio, int diaSemDesc) {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                throw new IllegalArgumentException("No pueden existir dos gastronomias con el mismo codigo!.");
            }
        }
        Gastronomia nuevagastronomia = new Gastronomia(codServicio, porcentajeDescuento, enPromocion, dia, gastronomia, precio, diaSemDesc);
        lstServicio.add(nuevagastronomia);
        return true;
    }

    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento,
            boolean enPromocion, LocalDate dia, String hospedaje, double precioPorNoche, int diasDeHospedaje) {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                throw new IllegalArgumentException("No pueden existir dos hospedajes con el mismo codigo!.");
            }
        }
        Hospedaje nuevohospedaje = new Hospedaje(codServicio, porcentajeDescuento, enPromocion, dia, hospedaje, precioPorNoche, diasDeHospedaje);
        lstServicio.add(nuevohospedaje);
        return true;
    }

    @Override
    public String toString() {
        return "Sistema{" + "lstServicio=" + lstServicio + '}';
    }

}
