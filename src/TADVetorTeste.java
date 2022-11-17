public class TADVetorTeste {
    public static void main(String[] args) {
        TADVetor arrayVetor = new TADVetor(10);

        //inserir elementos
        arrayVetor.insertAtRank(0, "salame");
        arrayVetor.insertAtRank(1, "aranha-lobo");
        arrayVetor.insertAtRank(2, "subs");
        arrayVetor.insertAtRank(3, "peixe-palhaço");
        arrayVetor.insertAtRank(4, "gatinhos");
        arrayVetor.insertAtRank(5, "roupa-de-cama");
        arrayVetor.insertAtRank(6, "chuva");
        arrayVetor.insertAtRank(7, "hera");
        arrayVetor.insertAtRank(8, "round");
        arrayVetor.insertAtRank(9, "glorb");
        System.out.println(arrayVetor);


        //substituir elementos
//        arrayVetor.replaceAtRank(3,"alvejante");
        arrayVetor.size();

        //remover elementos
//        arrayVetor.removeAtRank(1);
//        System.out.println(arrayVetor);
//        arrayVetor.removeAtRank(2);
//        System.out.println(arrayVetor);


        //checar se array está vazio
//        System.out.println("Empty = "+arrayVetor.isEmpty());

        //mostrar array final
//        System.out.println(arrayVetor);
    }
}
