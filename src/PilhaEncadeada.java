public class PilhaEncadeada {
    //private Object PilhaEncadeada[];
    private ListaEncadeada Lista;
    private int topo = -1;
	/*private No primeioNo=null;
	private No ultimoNo=null;*/

    public PilhaEncadeada() {
        this.Lista = new ListaEncadeada();
    }

    public int size() {
        return Lista.getTamanho();
    }

    public boolean isEmpty() {
        return Lista.getPrimeiro() == null;
    }
    public Object exibirTopo() {
        if(this.isEmpty()) {
            return null;
        }
        return this.Lista.getUltimo();
    }

    public void push(Object elemento) {

        Lista.adicionar(elemento);

		/*this.topo = this.topo +1;
		this.PilhaEncadeada[this.topo] = elemento;*/
    }

    public void pop(){
          Lista.removerUltimo();
    }

    @Override
    public String toString() {
        return Lista.toString();
    }

}
