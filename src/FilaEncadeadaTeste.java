public class FilaEncadeadaTeste {
    public static void main(String[] args) throws PilhaEncadeadaException {
        FilaEncadeada novaFila = new FilaEncadeada();
        novaFila.Queue("teste");
        //System.out.println(novaFila.toString());
        novaFila.Queue("sara");
        novaFila.Queue("JEROMIS");
        System.out.println(novaFila);
        System.out.println("tamanho: "+novaFila.size());
        System.out.println("is empty: "+novaFila.isEmpty());
        novaFila.Enqueue();
        System.out.println("tamanho: "+novaFila.size());
        novaFila.Enqueue();
        System.out.println("tamanho: "+novaFila.size());

//        novaFila.showFila();
//        novaFila.Enqueue();
//        novaFila.showFila();
//        novaFila.Enqueue();
//        novaFila.showFila();
        //System.out.println("is empty: "+novaPilha.isEmpty());

    }
}
