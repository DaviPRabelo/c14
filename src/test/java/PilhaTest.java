import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PilhaTest {

    @Test
    public  void test(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }
    @Test
    public void testPush(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(23);
        int tam = pilhaInteiros.size();
        assertEquals(1,tam);
    }
}
