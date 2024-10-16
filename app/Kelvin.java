public class Kelvin {
    public double valor;

    Fahrenheit fahrenheit = new Fahrenheit();
    Celsius celsius = new Celsius();

    public double getValor(){
        return valor;
    }

    public double parse(double Celsius, char medida){
        return Celsius + 273.15;
    }
    public double parse(double Fahrenheit){
        return ((Fahrenheit - 32) * (5/9)) + 273.15;
    }
}
