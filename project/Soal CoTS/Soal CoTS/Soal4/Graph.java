package com.company;

import java.util.ArrayList;

public class Graph implements GraphInterface {
    final int DEFAULTMAX = 100;

    private int[][] data = new int[DEFAULTMAX][DEFAULTMAX];
    private String[] label = new String[DEFAULTMAX];    // Label vertex
    public int jumlahVertex;                        // Jumlah vertex



    public Graph(int maximum) {
        data = new int[maximum][maximum];
        jumlahVertex = 0;
    }

    private int find(String labelVertex){
        for(int i = 0; i <=jumlahVertex; i++){
            if(label[i]!= null)
                if (label[i].equals(labelVertex))
                    return i;
        }
        return -1;
    }

    @Override
    public void insertVertex(String labelVertex) {
        if(jumlahVertex == data.length) {
            System.out.println("FULL");
            return;
        }

        if(find(labelVertex) > -1){
            System.out.println("Sudah ada");
            return;
        }

        // buat matrix jumlah label x jumlah label
        for (int i = 0; i <= jumlahVertex; i++) {
            data[i][jumlahVertex] = 0;
            data[jumlahVertex][i] = 0;
        }

        label[jumlahVertex] = labelVertex;

        jumlahVertex++;
    }

    @Override
    public void insertEdge(String vertex1, String vertex2) {
        //to do
            /* cari posisi vertex 1 */
            /* cari posisi vertex 2 */

        if ( (pos1 == -1) || (pos2 == -1) ) {
            System.out.println("Ada vertex yang tidak dikenal" );
            return;
        }

        /* --- Sisipkan kedalam matrix untuk membentuk representasi dari graf */


    }

    @Override
    public void penerbanganLangsung() {
        ArrayList traversalOrder = new ArrayList();
        ArrayList vertexQueue = new ArrayList();

        char[] simpulDikunjungi = new char[data.length];
        for (int i = 0; i < jumlahVertex; i++)
            simpulDikunjungi[i] = 'x';
        //to do
            /*
                kunjungi simpul pertama dan masukan ke traversalOrder dan vertexQue
             */

        while(!vertexQueue.isEmpty()) {
            String frontVertex = (String) vertexQueue.remove(0);
            int posisi = find(frontVertex);
            for (int j = 0; j < jumlahVertex; j++) {
                // to do
                    /* jika vertex tersebut memiliki tetangga yang belum dikunjungi
                     kungjungi tetangga tersebut dan masukan kedalam
                      */
            }

        }

        while (!traversalOrder.isEmpty()){
            System.out.print(traversalOrder.remove(0) + " - ");
        }

    }

    @Override
    public void jadwalTerurut() {
        int indegree[]= new int[data.length];
        ArrayList stackzero = new ArrayList();
        ArrayList toposort= new ArrayList();
        char[] visited = new char[data.length];

        for(int i=0; i<jumlahVertex; i++){
            //to do
            /* set semua indegree = 0
            set semua visited = x
             */
        }

        for(int i=0; i<jumlahVertex; i++){
            for(int j=0; j<jumlahVertex; j++){
                //to do
                /*
                hitung indegree dari setiap vertex
                 */
            }
        }
        for(int i=0; i<jumlahVertex; i++){
            if(indegree[i]==0){
                stackzero.add(i);
                visited[i]='v';
            }
        }

        while(!stackzero.isEmpty()){
            int top = (int) stackzero.remove(stackzero.size()-1);
            toposort.add(label[top]);
            for(int i=0; i<jumlahVertex; i++){
                //to do
                /*
                jika vertex top memiliki tetangga, kurangi 1, indegree dari tetangga tersebut.
                jika indegree tetangga tersebut = 0, dan belum visited,
                maka masukan tetangga tsb ke dalam stack, dan set sudah visited
                 */

            }
        }
        while(!toposort.isEmpty()){
            System.out.print(toposort.remove(0)+" ");
        }
    }
}
