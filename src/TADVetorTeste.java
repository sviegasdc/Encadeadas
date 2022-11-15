public class TADVetorTeste {
    public static void main(String[] args) {
        TADVetor arrayVetor = new TADVetor(10);
//        arrayVetor.insertAtRank(0, "salame");
        arrayVetor.insertAtRank(9, "gatinhos");
//        arrayVetor.insertAtRank(1, "subs");
        arrayVetor.insertAtRank(7, "aranha-lobo");
//        System.out.println(arrayVetor);
//
//        System.out.println(arrayVetor);

//        System.out.println(arrayVetor);

//        arrayVetor.insertAtRank(3, "simba");
//        arrayVetor.insertAtRank(8, "gelo");
//        arrayVetor.insertAtRank(2, "rosa");
        System.out.println(arrayVetor);
//        arrayVetor.insertAtRank(2, "certo");
//        arrayVetor.insertAtRank(3, "void");
//        arrayVetor.replaceAtRank(4, "gamer");
//        arrayVetor.insertAtRank(2,"andy");
//        arrayVetor.insertAtRank(3, "bacon");
//        arrayVetor.insertAtRank(7, "praia");
//        arrayVetor.insertAtRank(5, "gamer");
//        arrayVetor.insertAtRank(6, "dead end");
//        System.out.println(arrayVetor);
        arrayVetor.insertAtRank(7, "slit");
//        arrayVetor.replaceAtRank(1, "cocada");
        System.out.println(arrayVetor.elemAtRank(9));
        System.out.println(arrayVetor.size());
        System.out.println(arrayVetor.isEmpty());
        System.out.println(arrayVetor);
    }
}
