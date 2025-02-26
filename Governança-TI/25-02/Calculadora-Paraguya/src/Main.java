import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Main {



@Before
public void exibirInicioteste(){
    System.out.println("Inicio teste");
}
@After
public void exibirFimteste(){
    System.out.println("Fim teste");
}



@Test
public void testarSoma5com5(){
    Calculadora calc = new Calculadora();
    int resultadoConta = calc.somar(5,5);

    int resultadoEsperado = 10;

    assertEquals(resultadoConta, resultadoEsperado);
}

@Test
public void testarSoma13com12(){
    Calculadora calc = new Calculadora();
    int resultadoConta = calc.somar(13,12);

    int resultadoEsperado = 25;

    assertEquals(resultadoConta, resultadoEsperado);
}

@Test
public void testarSubtrair12de13(){
    Calculadora calc = new Calculadora();
    int resultadoConta = calc.subtrair(13,12);

    int resultadoEsperado = 1;

    assertEquals(resultadoConta, resultadoEsperado);
}

}
