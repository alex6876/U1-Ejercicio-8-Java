public class TermometroIoT {
    private double temperaturaCelsius;

    public TermometroIoT( double temperaturaCelsius ) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double obtenerFahrenheit(){

        return temperaturaCelsius * 9/5 + 32;
    }

    public void mostrarDetalle(){
        System.out.println("Grado Fahrenheit: " + obtenerFahrenheit());
        System.out.println("Temperatura Celsius: " + temperaturaCelsius);
    }
}
