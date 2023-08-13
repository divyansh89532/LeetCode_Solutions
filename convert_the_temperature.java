class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temperature = new double[2];
        double fahrenheit = (9.0/5.0)*celsius + 32.0 ;
        double kelvin = celsius + 273.15;
        temperature[0]=kelvin;
        temperature[1]=fahrenheit;
        return temperature;
    }
}
