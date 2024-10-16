public class Fahrenheit {
    public double valor;

    Kelvin kelvin = new Kelvin();
    Celsius celsius = new Celsius();

    public double getValor(){
        return valor;
    }

    public double parse(Celsius celsius){
        return (celsius.getValor() * (9/5)) + 32;
    }
    public double parse(Kelvin kelvin){
        return ((kelvin.getValor() - 273.15) * (9/5)) + 32;
    }
}
