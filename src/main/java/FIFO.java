import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class FIFO<T> {
    private List<T> fila= new ArrayList<>();
    private int tamanho = 0;

    public void enfileirar(T elem){
      fila.addLast(elem);
      tamanho++;

    };
    public T removerFila() throws EmptyStackException {
        if (filaVazia())
            throw new EmptyStackException();
        T elem = fila.removeFirst();
        tamanho--;
        return elem;
    };
    public int size(){
        return tamanho;
    };
    public boolean filaVazia(){
        return (tamanho == 0);
    };
}
