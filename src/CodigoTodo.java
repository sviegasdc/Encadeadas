import java.util.Arrays;

public interface ITADLista {
    public void replaceElement(int index, Object elemento);

    public void swapElement(int indexElemento1, int indexElemento2);

    public void insertBefore(int index, Object elemento);

    public void insertAfter(int index, Object elemento);

    public void insertFirst(Object elemento);

    public void insertLast(Object elemento);

    public void remove(int index);

    public void Before(int index);

    public void After(int index);

    public void isLast();

    public void isFirst();

    public void size();

    public boolean isEmpty();
}
import java.util.Arrays;

public class TADLista implements ITADLista{

    Object arrayLista[];
    int size;

    public TADLista(int size){
        this.size = size;
        this.arrayLista = new Object[size];

    }

    public void replaceElement(int index, Object elemento) {
        Object temp = this.arrayLista[index];
        this.arrayLista[index] = elemento;
        System.out.println("Elemento substituido: '"+ temp +"'");

    }

    public void swapElement(int indexElemento1, int indexElemento2) {
        Object temp = this.arrayLista[indexElemento1];
        Object temp2 = this.arrayLista[indexElemento2];
        this.arrayLista[indexElemento1] = temp2;
        this.arrayLista[indexElemento2] = temp;
        System.out.println("Elemento: '"+ temp +"' trocado pelo elemento: '"+temp2+ "'");
    }

    public void insertBefore(int index, Object elemento) {
        int temp = index - 1;
        if (arrayLista[temp - 1] != null) {
            while(arrayLista[temp + 1]!=null){
                temp++;
            }
            System.arraycopy(this.arrayLista, temp, arrayLista, temp - 1, (temp) - index +1);

        }
        this.arrayLista[temp] = elemento;

    }

    public void insertAfter(int index, Object elemento) {
        // after = depois
        int temp = index + 1;
        if (arrayLista[temp] != null) {
            while(arrayLista[temp]!=null){
                temp++;
            }
            System.arraycopy(this.arrayLista, index+1, arrayLista, temp-1 , size-temp-1);
        }
        this.arrayLista[index+1] = elemento;
    }

    public void insertFirst(Object elemento) {
        int temp = 1;
        if (arrayLista[0] != null) {
            while(arrayLista[temp]!=null){
                temp++;
            }
            System.arraycopy(this.arrayLista, 0, arrayLista, 1, temp );

        }
        this.arrayLista[0] = elemento;

    }

    public void insertLast(Object elemento) {
        int ultimo =  arrayLista.length -1;
        int contador = ultimo - 1;
        if (arrayLista[ultimo] != null) {
            while (arrayLista[contador] != null) {
                contador--;
            }
            //checar se existe algum nulo depois de o index para poder adicionar os elementos depois dele
            // para a direita com os outros elementos
            System.arraycopy(this.arrayLista, contador + 1, arrayLista, contador, size - contador - 1);
        }
        this.arrayLista[ultimo] = elemento;
    }


    public void remove(int index) {
        Object temp = this.arrayLista[index];
        this.arrayLista[index] = null;
        System.out.println("Elemento removido: '"+ temp +"'");
    }

    public void Before(int index) {
        Object temp = arrayLista[index - 1];
        System.out.println("Elemento anterior ao '"+arrayLista[index]+"'"+" é o '"+temp+"'");
    }

    public void After(int index) {
        Object temp = arrayLista[index + 1];
        System.out.println("Elemento posterior ao '"+arrayLista[index]+"'"+" é o '"+temp+"'");
    }

    public void isLast() {
        int i;
        Object temp = "";
        for (i = arrayLista.length - 1; i >= 0 ; i--) {
            if (arrayLista[i] != null) {
                temp = arrayLista[i];
                break;
            }
        }
        System.out.println("Último elemento: '"+temp+"',encontrado no index: "+i);

    }

    public void isFirst() {
        int i;
        Object temp = "";
        for (i = 0; i <= arrayLista.length - 1; i++) {
            if (arrayLista[i] != null) {
                temp = arrayLista[i];
                break;
            }
        }
        System.out.println("Primeiro elemento: '"+temp+"',encontrado no index: "+i);
    }

    public void size() {
        int count = 0;
        for (int i=0; i<=arrayLista.length-1; i++) {
            if(arrayLista[i] != null) {
                count++;
            }
        }
        System.out.println("Tamanho do array = "+size+"\n"+"Número de elementos no array: "+count);

    }

    public boolean isEmpty() {
        boolean checagem = true;
        //checa se existe elementos no array
        //se existir ele retorna false
        //se só existir nulos ele retorna true
        for (int i=0; i<=arrayLista.length-1; i++) {
            if (arrayLista[i] != null) {
                checagem = false;
            }
        }
        return checagem;
    }

    public String toString() {
        return Arrays.toString(arrayLista);
    }
}
public class TADListaTest {
    public static void main(String[] args) {
        TADLista arrayLista = new TADLista(10);
        //mostrar array
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


