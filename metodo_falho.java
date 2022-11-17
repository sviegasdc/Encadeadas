   public void insertAtRank(int r, Object o) {
        //insere um novo elemento 'o' na colocação 'r' (index)
        // r = index
        // o = elemento
        if (arrayVetor[r] != null) {
            for (int i = arrayVetor.length -1; i > r; i--) {
                arrayVetor[r+1] = arrayVetor[i-1];
                System.out.println(Arrays.toString(arrayVetor));
            }
        }
        this.arrayVetor[r] = o;
        System.out.println(Arrays.toString(arrayVetor));
    }
