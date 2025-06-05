package balaji;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AdvanceGraph {
	static class graph{
		private Map<Integer,List<Integer>> ob=new HashMap<Integer,List<Integer>>();
		void addEdge(int u,int v) {
			ob.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
			ob.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
		}
		void printGraph() {
			for(int node:ob.keySet()) {
				System.out.println("Node" +node+" is connected to :");
			for(int neighbor:ob.get(node)) {
				System.out.println(neighbor+" ");
			}
			System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		graph g1=new graph();
		g1.addEdge(2, 2);
		g1.addEdge(1, 3);
		g1.addEdge(2, 4);
		g1.addEdge(1, 4);
		g1.printGraph();
		// TODO Auto-generated method stub

	}

}
