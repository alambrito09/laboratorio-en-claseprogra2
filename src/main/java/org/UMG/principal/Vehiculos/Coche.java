package org.UMG.principal.Vehiculos;

public class Coche extends Vehiculo {
    // Atributos adicionales
    private int numeroDePuertas;
    private String tipoDeMotor;

    // Constructor
    public Coche(String marca, String modelo, int año, int numeroDePuertas, String tipoDeMotor) {
        super(marca, modelo, año); // Llama al constructor de la superclase
        this.numeroDePuertas = numeroDePuertas;
        this.tipoDeMotor = tipoDeMotor;
    }

    // Método sobrescrito para mostrar los detalles del coche
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase para mostrar los detalles comunes
        System.out.println("Número de Puertas: " + numeroDePuertas);
        System.out.println("Tipo de Motor: " + tipoDeMotor);
    }

    // Getters y Setters adicionales
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }
}

