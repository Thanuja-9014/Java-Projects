package balaji;
import java.util.*;

public class DFSExample {

    public static void main(String[] args) {

      
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", Arrays.asList("F"));
        graph.put("F", new ArrayList<>());

        System.out.println("DFS starting from node A:");
        Set<String> visited = new HashSet<>();
        dfs(graph, "A", visited);
    }

    
    public static void dfs(Map<String, List<String>> graph, String node, Set<String> visited) {
        if (!visited.contains(node)) {
            System.out.println("Visited: " + node);
            visited.add(node);

            for (String neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}
