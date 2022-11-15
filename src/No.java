public class No {
    private Object element;
    private No next;

    public No(Object newElement) {
        this.element = newElement;
    }


    public Object getElement() {
        return element;
    }

    public void setElement(Object item ) {
        this.element = item;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += String.format("%s ", this.element.toString());

            if (this.getNext() != null)
                texto += String.format("=> %s", this.getNext().toString());

        return texto;
    }

}