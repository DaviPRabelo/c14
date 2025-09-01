import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteFIFO {
    @Test
    public void testeEnfileirar(){
        FIFO<Integer> fila = new FIFO<Integer>();
        int i1 = 4;
        int i2 = 8;
        int i3 = 6;
        fila.enfileirar(i1);
        fila.enfileirar(i2);
        fila.enfileirar(i3);
        assertEquals(3,fila.size());
    }
    @Test
    public void testeRemover(){
        FIFO<Integer> fila = new FIFO<Integer>();
        int i1 = 4;
        int i2 = 8;
        int i3 = 6;
        fila.enfileirar(i1);
        fila.enfileirar(i2);
        fila.enfileirar(i3);
        int tam = fila.size();
        int eliminado = fila.removerFila();
        System.out.println(eliminado);
        assertEquals(2,tam-1);
    }
    @Test
    public void testeSize(){
        FIFO<Integer> fila = new FIFO<Integer>();
        int i1 = 6;
        fila.enfileirar(i1);
        int size = fila.size();
        assertEquals(1,size);

    }
    @Test
    public void testVazia(){
        FIFO<Integer> fila = new FIFO<Integer>();
        boolean vazio = fila.filaVazia();
        assertTrue(vazio);
    }

}
