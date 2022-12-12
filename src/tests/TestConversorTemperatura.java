package tests;
import programa.ConversorTemperatura;
import org.junit.*;
import static org.junit.Assert.assertTrue;

public class TestConversorTemperatura {
    private double entrada;
    private double resultado;

    @Test
    public void testCFInputInteiroPequeno(){
        entrada = 8.00;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCFInputInteiroGrande(){
        entrada = 120.00;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCFInputInteiroNegativo(){
        entrada = -30.00;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCFInputDoublePequeno(){
        entrada = 3.20;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCFInputDoubleGrande(){
        entrada = 110.30;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCFInputDoubleNegativo(){
        entrada = -25.80;
        resultado = entrada * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.celsius_para_farenheit(entrada));
    }

    @Test
    public void testCKInputInteiroPequeno(){
        entrada = 10.00;
        resultado = entrada + 273.15;
        assertTrue(resultado == ConversorTemperatura.celsius_para_kelvin(entrada));
    }

    @Test
    public void testFKInputInteiroPequeno(){
        entrada = 15.00;
        resultado = (entrada - 32.00) / 1.80 + 273.15;
        assertTrue(resultado == ConversorTemperatura.farenheit_para_kelvin(entrada));
    }
    
    @Test
    public void testKFInputInteiroPequeno(){
        entrada = 20.00;
        resultado = (entrada  - 273.15) * 1.80 + 32.00;
        assertTrue(resultado == ConversorTemperatura.kelvin_para_farenheit(entrada));
    }
}
