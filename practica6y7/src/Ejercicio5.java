public class Ejercicio5 {

    public static void main(String[] args) {

        int V = 8;

        Graph uGraph = new Graph(V);

        uGraph.uGraphNodeAdd(1,5);
        uGraph.uGraphNodeAdd(5,4);
        uGraph.uGraphNodeAdd(7,4);
        uGraph.uGraphNodeAdd(7,3);
        uGraph.uGraphNodeAdd(4,0);
        uGraph.uGraphNodeAdd(0,2);
        uGraph.uGraphNodeAdd(0,6);

        for (int i = 0; i < 3; i++) {
            uGraph.DFS();
        }
    }
}
