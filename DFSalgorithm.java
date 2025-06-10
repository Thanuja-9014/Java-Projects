package balaji;

import java.util.*;

public class DFSalgorithm {

    private Map<String, List<String>> adjList;

    public DFSalgorithm(Map<String, List<String>> adjList) {
        this.adjList = adjList;
    }

    public List<String> findSocialCircle(String person) {
        if (!adjList.containsKey(person)) {
            return new ArrayList<>();
        }

        List<String> socialCircle = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        dfsRecursive(person, visited, socialCircle);

        return socialCircle;
    }

    private void dfsRecursive(String currentPerson, Set<String> visited, List<String> socialCircle) {
        visited.add(currentPerson);
        socialCircle.add(currentPerson);

        List<String> neighbors = adjList.getOrDefault(currentPerson, Collections.emptyList());

        for (String neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, socialCircle);
            }
        }
    }

    public List<String> findSocialCircleIterative(String person) {
        if (!adjList.containsKey(person)) {
            return new ArrayList<>();
        }

        List<String> socialCircle = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        stack.push(person);
        visited.add(person);

        while (!stack.isEmpty()) {
            String currentPerson = stack.pop();
            socialCircle.add(currentPerson);

            List<String> neighbors = adjList.getOrDefault(currentPerson, Collections.emptyList());

            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
        return socialCircle;
    }

    public static void main(String[] args) {
        Map<String, List<String>> socialNetwork = new HashMap<>();
        socialNetwork.put("Alice", Arrays.asList("Bob", "Charlie"));
        socialNetwork.put("Bob", Arrays.asList("Alice", "David"));
        socialNetwork.put("Charlie", Arrays.asList("Alice"));
        socialNetwork.put("David", Arrays.asList("Bob"));
        socialNetwork.put("Eve", Arrays.asList("Frank"));
        socialNetwork.put("Frank", Arrays.asList("Eve"));
        socialNetwork.put("Grace", new ArrayList<>());

        DFSalgorithm finder = new DFSalgorithm(socialNetwork);

        System.out.println("--- Recursive DFS ---");
        System.out.println("Social circle of Alice: " + finder.findSocialCircle("Alice"));
        System.out.println("Social circle of Eve: " + finder.findSocialCircle("Eve"));
        System.out.println("Social circle of Grace: " + finder.findSocialCircle("Grace"));
        System.out.println("Social circle of Zoe: " + finder.findSocialCircle("Zoe"));

        System.out.println("\n--- Iterative DFS ---");
        System.out.println("Social circle of Alice: " + finder.findSocialCircleIterative("Alice"));
        System.out.println("Social circle of Eve: " + finder.findSocialCircleIterative("Eve"));
        System.out.println("Social circle of Grace: " + finder.findSocialCircleIterative("Grace"));
        System.out.println("Social circle of Zoe: " + finder.findSocialCircleIterative("Zoe"));
    }
}
