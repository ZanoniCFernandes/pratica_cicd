import pratica.calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

public class CalculadoraTest {

  Calculadora calc = new Calculadora();

  @Test
  public void testeSoma1() {
    float resultadoEsperado = 5;
    float resultadoRetornado = calc.soma(2,3);
    assertEquals(resultadoEsperado, resultadoRetornado);
  }

  @Test
  public void testeSoma2() {
//    Calculadora calc = new Calculadora();
    assertEquals(10, calc.soma(4,6));
  }

  @Test
  public void testSoma3(){
//    Calculadora calc = new Calculadora();
    assertNotEquals(11, calc.soma(4,6));
  }

  public void testSubtrai1(){
    assertEquals(5, calc.subtrai(10, 5));
  }

  public void testSubtrai2(){
    assertNotEquals(10, calc.subtrai(10,5));
  }

  public void testMultiplica1(){
    assertEquals(10, calc.multiplica(5,2));
  }

  public void testMultiplica2(){
    assertNotEquals(10, calc.multiplica(7,3));
  }

  public void testDivisao1(){
    assertEquals(10, calc.divide(100,10));
  }

  public void testDivisao2(){
    assertNotEquals(100, calc.divide(100,10));
  }

}
