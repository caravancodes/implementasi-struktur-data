package com.company;

public class Main {

    public static void main(String[] args) {
        GraphInterface graph = new Graph(11);
        graph.insertVertex("Bangkok");
        graph.insertVertex("Hanoi");
        graph.insertVertex("Jakarta");
        graph.insertVertex("KL");
        graph.insertVertex("Manila");
        graph.insertVertex("Singapore");
        graph.insertVertex("Timor");

        graph.insertEdge("Bangkok", "KL");
        graph.insertEdge("Jakarta", "Singapore");
        graph.insertEdge("KL","Jakarta");
        graph.insertEdge("KL","Manila");
        graph.insertEdge("KL", "Singapore");
        graph.insertEdge("Manila", "Singapore");
        graph.insertEdge("Singapore", "Timor");
        graph.insertEdge("Timor", "Hanoi");

        System.out.println("Penerbangan Langsung");
        graph.penerbanganLangsung();
        System.out.println();
        System.out.println("Jadwal Terurut");
        graph.jadwalTerurut();


    }
}
