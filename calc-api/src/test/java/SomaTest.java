package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;

public class SomaTest{
   static Soma sum;

   @BeforeEach
    public static void setup(){
        sum = new Soma();
        System.out.println("inicializando soma");

    }

    @Test 
    public void testsoma_sucess(){
        assertEquals(2, sum.Soma("1","1"));
    }
    @Test
    public void TestSoma_entradaLetra(){
        assertThrows(IllegalArgumentException.class, ()->{
          sum.Soma("a", "i");
      });
    }

}