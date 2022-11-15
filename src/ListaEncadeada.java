
public class ListaEncadeada {
    private No primeiro;
    private No ultimo;

    private No atual;
    private int tamanho;

    public ListaEncadeada() {

        this.tamanho = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(Object novoElemento) {
        No novoNo = new No(novoElemento);
        //passando o valor para o nó
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;

        } else {
            this.ultimo.setNext(novoNo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void adicionarInicio(Object novoElemento) {
        No novoNo = new No(novoElemento);
        //pasando o valor para o no
        if(this.primeiro==null && this.ultimo==null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;

        }else {
            novoNo.setNext(primeiro);
            this.primeiro=novoNo;
        }
        this.tamanho++;
    }

    public void removerMeio(){
        No anterior = null;
        this.atual = this.primeiro;
        for (int i=0; i<getTamanho();i++) {
            if (atual.getNext() == this.ultimo) {
                anterior.setNext(atual.getNext());
                this.atual = this.ultimo;
                break;
            }
            anterior = atual;
            atual = atual.getNext();

        }
    }
    public void removerPrimeiro(){
        No anterior = null;
        this.atual = this.primeiro;
        for (int i=0; i<getTamanho();i++) {
            if(this.primeiro == this.ultimo){
                this.primeiro = null;
                this.ultimo = null;
            }else{
                this.primeiro = this.atual.getNext();
            }
        }
        this.tamanho--;
    }

    public void removerUltimo(){
        No atual = this.primeiro;
        for (int i = 0; i < getTamanho(); i++) {
            if (atual.getNext() == this.ultimo) {
                this.ultimo = atual;
                atual.setNext(null);
                break;
            }
            atual = atual.getNext();
        }
        this.tamanho--; // testar

    }

    public No get(int posicao){
        //é um metodo para visualizar todos da lista e encontrar o elemento que foi repassado
        No atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getNext() != null) {
                //verifico se o atual tem próximo
                atual = atual.getNext();
                //assim eu avanço na lista
            }
        }

        return atual;
    }

    @Override
    public String toString() {
        return this.primeiro.toString();
    }
}