import java.util.LinkedList;

public class Node
{
    private final LinkedList<Node> next;
    private final LinkedList<Integer> edges;

    private final int num;
    private int N = 0;
    private int E = 0;

    public Node(int num)
    {
        this.next = new LinkedList<>();
        this.edges = new LinkedList<>();
        this.num = num;
    }

    public LinkedList<Node> getNext() {
        return next;
    }

    public LinkedList<Integer> getEdges() {
        return edges;
    }

    public int getNum() {
        return num;
    }

    public int getN() {
        return N;
    }

    public int getE() {
        return E;
    }

    /*Node Methods*/

    public void addNode(Node node)
    {
        this.N += 1;
        next.add(N-1, node);
    }

    /*Pondered Node Methods*/

    public void addNode(Node node, int edge)
    {
        this.N += 1;
        this.E += 1;
        next.add(N-1, node);
        edges.add(E-1, edge);
    }
}
