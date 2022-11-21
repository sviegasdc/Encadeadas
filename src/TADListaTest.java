public class TADListaTest {
    public static void main(String[] args) {
        TADLista arrayLista = new TADLista(10);
        System.out.println(arrayLista);


        //inserir no primeiro index do array
        arrayLista.insertFirst("rocksen");
        System.out.println(arrayLista);
        arrayLista.insertFirst("ghost");
        System.out.println(arrayLista);
        arrayLista.insertFirst("devil");
        System.out.println(arrayLista);


        //inserir elementos depois de certo index
//        arrayLista.insertAfter(7, "meow");
//        System.out.println(arrayLista);


        //inserir no último index do array
        arrayLista.insertLast("glorb");
        System.out.println(arrayLista);
//        arrayLista.insertLast("octane");
//        System.out.println(arrayLista);
//        arrayLista.insertLast("rebaixado");
//        System.out.println(arrayLista);


        //elemento posterior ao index
//        arrayLista.After(0);
//        System.out.println(arrayLista);


        //elemento anterior ao index
//        arrayLista.Before(1);
//        System.out.println(arrayLista);


        //remover elementos
//        arrayLista.remove(0);
//        System.out.println(arrayLista);


        //trocar elementos de index
//        arrayLista.swapElement(0, 9);
//        System.out.println(arrayLista);


        //substituir elementos
//        arrayLista.insertFirst("superman");
//        System.out.println(arrayLista);
//        arrayLista.replaceElement(0,"alex");
//        System.out.println(arrayLista);


        //inserir depois de um index
//        arrayLista.insertAfter(0, "soap");
//        System.out.println(arrayLista);
//        arrayLista.insertAfter(1, "killer");
//        System.out.println(arrayLista);


        //métodos de checagem
        arrayLista.isFirst();
        arrayLista.isLast();
        System.out.println("Empty = "+arrayLista.isEmpty());
    }
}
