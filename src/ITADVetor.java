public interface ITADVetor {
    Object elemAtRank(int r);
    //retorna o elemento r

    Object replaceAtRank(int r, Object o);
    //substitui o elemento na colocação 'r'(index) por 'o'(elemento) e retorna o antigo elemento

    void insertAtRank(int r, Object o);
    //insere um novo elemento 'o'(elemento) na colocação 'r' (index)

    void removeAtRank(int r);
    // remove e retorno o elemento na colocação 'r'(index)

    public void size();

    public boolean isEmpty();
}
