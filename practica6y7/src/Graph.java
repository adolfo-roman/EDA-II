import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

    Scanner scanner = new Scanner(System.in);

    private int V;
    private final LinkedList<Node> nodes;

    public Graph()
    {
        System.out.print("Nodes: ");
        this.V = scanner.nextInt();

        nodes = new LinkedList<>();

        for (int i = 0; i < V; i++)
        {
            Node node = new Node(i);
            nodes.add(i, node);
        }
    }

    public Graph(int v)
    {
        this.V = v;
        nodes = new LinkedList<>();

        for (int i = 0; i < v; i++)
        {
            Node node = new Node(i);
            nodes.add(i, node);
        }
    }

    public int getV() {
        return V;
    }

    public LinkedList<Node> getNodes() {
        return nodes;
    }

    /*General Graph Methods*/

    public void addNodesToGraph()
    {
        int n;

        do
        {
            System.out.print("Nodes: ");
            n = scanner.nextInt();
        }
        while(n < 1);

        for (int i = 0; i < n; i++)
        {
            this.V += 1;
            Node node = new Node(V);
            nodes.add(V-1, node);
        }
    }

    /*Undirected Graph Methods*/

    public void uGraphNodeAdd(int v, int w)
    {
        dGraphNodeAdd(v, w);
        dGraphNodeAdd(w, v);
    }

    /*Directed Graphs Methods*/

    public void dGraphNodeAdd(int v, int w)
    {
        nodes.get(v).addNode(nodes.get(w));
    }

    /*Pondered Undirected Graphs Methods*/

    public void uGraphNodeAdd(int v, int edge, int w)
    {
        dGraphNodeAdd(v, edge, w);
        dGraphNodeAdd(w, edge, v);
    }

    /*Pondered Directed Graphs Methods*/

    public void dGraphNodeAdd(int v, int edge, int w)
    {
        nodes.get(v).addNode(nodes.get(w), edge);
    }

    /*BFS Search Method*/

    public void BFS()
    {
        int s;
        do
        {
            System.out.print("BFS nodo inicio: ");
            s = scanner.nextInt();
        }
        while (s > V || s < 0);

        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        System.out.print("BFS: ");

        while(queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s + " ");

            for (Node node : nodes.get(s).getNext())
            {
                int n = node.getNum();

                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    /*DFS Search Method*/

    public void DFS()
    {
        int v;

        do
        {
            System.out.print("DFS nodo inicio: ");
            v = scanner.nextInt();
        }
        while (v > nodes.size() || v < 0) ;

        boolean[] visited = new boolean[V];

        System.out.print("DFS: ");

        DFSUtil(v, visited);

        System.out.println();
    }

    public void DFSUtil(int v, boolean[] visited)
    {
        visited[v] = true;

        System.out.print(v + " ");

        for (Node node : nodes.get(v).getNext())
        {
            int n = node.getNum();

            if (!visited[n])
            {
                DFSUtil(n, visited);
            }
        }
    }

    /*Primm's Algorithm*/

    public void primm()
    {
        System.out.println("Node start: ");
        int n = scanner.nextInt();
        int edgesSize = 0;
        int nodesSize = 0;
        int min;
        int node = -1;

        ArrayList<Integer> edgeList = new ArrayList<>();
        ArrayList<Integer> nodeList = new ArrayList<>();

        min = nodes.get(n).getEdges().get(0);

        nodeList.add(n);
        boolean flag = false;

        System.out.println("1");

        do
        {
            System.out.println("2");
            for (int i = 0; i < nodeList.size(); i++)
            {
                System.out.println("3");
                for (int j = 0; j < nodes.get(nodeList.get(i)).getE(); j++)
                {
                    System.out.println("4");
                    try
                    {
                        System.out.println("5");
                        if(nodes.get(nodeList.get(i)).getEdges().get(j) < min && nodes.get(i).getNext().get(j).getNum() != nodeList.get(i + 1) )
                        {
                            System.out.println("6");
                            min = nodes.get(i).getEdges().get(j);
                            node = nodes.get(i).getNext().get(j).getNum();
                            flag = true;
                            System.out.print("Min: " + min + ", Node: " + node + "\n");
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        System.out.println("7");
                        nodeList.add(i + 1, -1);
                        j--;
                    }
                }
            }

            nodesSize++;
            System.out.println("8");

            if(flag) {
                edgeList.add(min);
                nodeList.add(node);
            }

            if(nodesSize > 10)
            {
                break;
            }
        }
        while(!flag);

        System.out.print("Edges: ");
        for (Integer i: edgeList) {
            System.out.print(i + " ");
            edgesSize += i;
        }
        System.out.println();
        System.out.print("Nodes: ");
        for (Integer i: nodeList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("EdgeSum: " + edgesSize);
        System.out.println();
    }


    /*Set Edges*/

    public void setEdges(String x, String y)
    {
        if(V < 2){ return; }

        int v, w,edges, e = 0, maxedges = 0;
        boolean flag;

        switch (x)
        {
            case "u":
                maxedges = (V*(V-1))/2;
                break;
            case "d":
                maxedges = (V*(V-1));
                break;
        }

        do
        {
            System.out.print("No. de conexiones: ");
            edges = scanner.nextInt();

        }
        while(edges > maxedges);

        if (y.equals("p"))
        {
            System.out.println("Node -> Distance -> Node");
        }
        else
        {
            System.out.println("Node -> Node");
        }

        for (int i = 0; i < edges; i++)
        {
            flag = true;
            System.out.print((i + 1) + ". ");

            do
            {
                v = scanner.nextInt();

                if(y.equals("p"))
                    e = scanner.nextInt();

                w = scanner.nextInt();
            }
            while(v > V - 1 || w > V - 1 || v < 0 || w < 0);

            for (Node node : nodes.get(v).getNext())
            {
                if(node.getNum() == w)
                {
                    System.out.println("Connection already exists!");
                    flag = false;
                }
            }

            if(nodes.get(v).getN() == V - 1)
            {
                System.out.println("Cannot add more connections!");
                flag = false;
            }

            if(flag)
            {
                switch (x)
                {
                    case "u":

                        switch (y)
                        {
                            case "r":
                                uGraphNodeAdd(v,w);
                                break;
                            case "p":
                                uGraphNodeAdd(v,e,w);
                                break;
                        }
                        break;

                    case "d":

                        switch (y)
                        {
                            case "r":
                                dGraphNodeAdd(v,w);
                                break;
                            case "p":
                                dGraphNodeAdd(v,e,w);
                                break;
                        }
                        break;
                }
            }
            else
            {
                i--;
            }
        }
    }

    /*Graph Printing Methods*/

    public void printGraph()
    {
        for(int v = 0; v < V; v++)
        {
            System.out.println("Lista de adyacencia del vertice " + v);
            System.out.print(v);

            if(nodes.get(v).getNext().size() == 0)
            {
                System.out.print(" -> /");
            }
            else
            {
                for (Node node : nodes.get(v).getNext())
                {
                    System.out.print(" -> " + node.getNum());
                }
            }
            System.out.println("\n");
        }
    }

    public void printPGraph()
    {
        int s;
        int n;
        int e;

        for(int v = 0; v < V; v++)
        {
            System.out.println("Lista de adyacencia del vertice " + v);
            System.out.print(v);

            s = nodes.get(v).getE();

            if(s == 0)
            {
                System.out.print(" -> /");
            }
            else
            {
                for (int i = 0; i < s; i++)
                {
                    n = nodes.get(v).getNext().get(i).getNum();
                    e = nodes.get(v).getEdges().get(i);

                    System.out.print(" -(" + e + ")-> " + n);
                }

                System.out.println("\n");
            }
        }
    }
}
