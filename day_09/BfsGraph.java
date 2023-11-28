// package Day12DSA;

import java.util.LinkedList;
import java.util.Queue;

public class BfsGraph {

    int V = 5;
    
    public void bfs(int arr[][], int source) {

        Queue<Integer> q = new LinkedList<>();

        boolean isVisited[] = new boolean[V];

        q.add(source);
        isVisited[source] = true;

        while (q.size() != 0) {
            int node = q.poll();
            System.out.println("Visited Node: " + node);

            for (int index = 0; index < V; index++) {
                if (arr[node][index] == 1 && isVisited[index] == false) {
                    q.add(index);
                    isVisited[index] = true;
                }
            }
        }

    }

    public static void main(String[] args) {

        int arr[][] = {
        {0, 1, 1, 1, 0}, 
        {1, 0, 0, 1, 1}, 
        {1, 0, 0, 1, 0}, 
        {1, 1, 1, 0, 1}, 
        {0, 1, 0, 1, 0}};

        BfsGraph obj = new BfsGraph();
        obj.bfs(arr, 0);
    }

}