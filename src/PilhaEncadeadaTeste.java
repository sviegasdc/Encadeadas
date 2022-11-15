public class PilhaEncadeadaTeste {

    public static void main(String[] args) throws PilhaEncadeadaException {
        PilhaEncadeada novaPilha = new PilhaEncadeada();
        novaPilha.push("teste");
        //System.out.println(novaPilha.toString());
        novaPilha.push("sara");
        novaPilha.push("JEROMIS");

        System.out.println("tamanho: "+novaPilha.size());
        System.out.println("is empty: "+novaPilha.isEmpty());
        System.out.println("topo: "+novaPilha.exibirTopo());
        novaPilha.pop();
        System.out.println("topo: "+novaPilha.exibirTopo());
        novaPilha.pop();
        System.out.println("topo: "+novaPilha.exibirTopo());
        novaPilha.pop();
        System.out.println("topo: "+novaPilha.exibirTopo());
        //System.out.println("is empty: "+novaPilha.isEmpty());

    }

}