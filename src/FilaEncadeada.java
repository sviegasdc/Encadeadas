public class FilaEncadeada {
    private ListaEncadeada Lista;
    private No start;

    public FilaEncadeada() {
        this.Lista = new ListaEncadeada();
    }

    public void Queue(Object elemento){
        Lista.adicionar(elemento);
    }

    public void Enqueue(){
        Lista.removerPrimeiro();
    }

    public int size() {
        return Lista.getTamanho();
    }

    public boolean isEmpty() {
        return Lista.getPrimeiro() == null;
    }

    @Override
    public String toString() {
        return Lista.toString();
    }

}
