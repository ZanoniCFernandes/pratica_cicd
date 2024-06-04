import pratica.calculadora.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*; 

public class CalculadoraTest {
    
  @Test
  public void testeSoma1() {
    Calculadora calc = new Calculadora();
    float resultadoEsperado = 5;
    float resultadoRetornado = calc.soma(2,3);
    assertEquals(resultadoEsperado, resultadoRetornado);
  }

  @Test
  public void testeSoma2() {
    Calculadora calc = new Calculadora();
    assertEquals(10, calc.soma(4,6));
  }

}
