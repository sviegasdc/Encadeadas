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
        boolean duplica = true;
        //checando se precisa duplicar o array
        for(int i = 0; i< arrayVetor.length;i++){
            if(arrayVetor[i] == null){
            //se encontrar algum nulo no array significa que ele não está cheio
                duplica = false;
                break;
            }
        }
        if(duplica){
          //duplica = true
            duplicaArray();
        }
        int temp = r + 1;
        //checar se existe algum nulo depois do index para não "pular" os nulos
        //para a direita com os outros elementos
        if (arrayVetor[r] != null) {
            while(arrayVetor[temp]!=null){
                temp++;
            }
            System.arraycopy(this.arrayVetor, r, arrayVetor, r + 1, temp - r );
        }
        this.arrayVetor[r] = o;
    }

    @Override
    public void removeAtRank(int r) {
        // remove e retorna o elemento na colocação 'r'(index)
        Object temp = this.arrayVetor[r];
        System.arraycopy(this.arrayVetor, r+1, arrayVetor, r, arrayVetor.length - r -1);
        //adicionar null no final
        System.out.println("Elemento removido: '"+temp+"'");
    }

    private void duplicaArray() {
        int novoSize = this.arrayVetor.length * 2;
        Object novoArray[] = new Object[novoSize];
        // copiar elementos para o novo array
        System.arraycopy(this.arrayVetor, 0, novoArray, 0, arrayVetor.length );
        this.arrayVetor = novoArray;
    }

    @Override
    public void size() {
        int count = 0;
        for (int i=0; i<=arrayVetor.length-1; i++) {
            if(arrayVetor[i] != null) {
               count++;
            }
        }
        System.out.println("Tamanho do array = "+size+"\n"+"Número de elementos no array: "+count);

    }

    @Override
    public boolean isEmpty() {
        boolean checagem = true;
        //checa se existe elementos no array
        //se existir ele retorna false
        //se só existir nulos ele retorna true
        for (int i=0; i<=arrayVetor.length-1; i++) {
            if (arrayVetor[i] != null) {
                checagem = false;
            }
        }
        return checagem;
    }
    @Override
    public String toString() {
        return Arrays.toString(arrayVetor);
    }

}
