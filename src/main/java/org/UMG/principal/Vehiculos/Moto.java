package org.UMG.principal.Vehiculos;

public class Moto extends Vehiculo {
    // Atributo adicional
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año); // Llama al constructor de la superclase
        this.tieneSidecar = tieneSidecar;
    }

    // Método sobrescrito para mostrar los detalles de la moto
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase para mostrar los detalles comunes
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    // Getter y Setter adicional
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}

