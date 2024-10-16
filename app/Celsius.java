public class Celsius  {

    public double valor;

    Kelvin kelvin = new Kelvin();
    Fahrenheit fahrenheit = new Fahrenheit();

    public double getValor(){
        return valor;
    }

    public double parse(double Fahrenheit, char medida){
        return (Fahrenheit - 32) * (5/9);
    }
    public double parse(double Kelvin){
        return Kelvin - 273.15;
    }
}
