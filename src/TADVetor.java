import java.util.Arrays;

public class TADVetor implements ITADVetor{
    //Implemente o TAD Vetor utilizando array e Lista Duplamente Encadeada
    //implementar o tad vector aqui para usar seus métodos nos próximos arquivos
    Object arrayVetor[];

    int size;


    public TADVetor(int size){
        this.arrayVetor = new Object[size];
        this.size = size;
    }

    @Override
    public Object elemAtRank(int r) {
        //retorna o elemento no index r
        return arrayVetor[r];
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        //substitui o elemento na colocação 'r'(index) por 'o'(elemento) e retorna o antigo elemento
        Object temp = this.arrayVetor[r];
        this.arrayVetor[r] = o;
        return temp;
    }

    @Override
    public void insertAtRank(int r, Object o) {
        //insere um novo elemento 'o' na colocação 'r' (index)
        // r = index
        // o = elemento
        if (arrayVetor[r] != null) {
            // -2 ou então vai lançar a exceção de array cheio, duplicar array antes disso
            for (int i = r + 1; i >= r; i--) {
                arrayVetor[i+1] = arrayVetor[i];
            }
        }
        this.arrayVetor[r] = o;
    }

    @Override
    public Object removeAtRank(int r) {
        // remove e retorno o elemento na colocação 'r'(index)
        Object temp = this.arrayVetor[r];
//      this.arrayVetor[r] =q
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.arrayVetor == null;
    }
    @Override
    public String toString() {
        return Arrays.toString(arrayVetor);
    }

}
