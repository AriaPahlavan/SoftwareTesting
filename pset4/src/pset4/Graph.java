package pset4;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


/**
 * map between a node and a list of nodes that are connected to it by outgoing edges
 * class invariant: fields "nodes" and "edges" are non-null;
 * "this" graph has no node that is not in "nodes"
 */
public class Graph {
	private Set<Node> nodes; // set of nodes in the graph

	static class Node{
		private Integer value;
		private Set<Node> edges = new HashSet<>();

		Node(Integer value) {
			this.value = value;
		}

		public Set<Node> edgesFrom() {return edges;}

		boolean addDirectedEdge(Node to){
			return edges.add(to);
		}

		boolean canReach(Node target){
			return edges.contains(target);
		}

		boolean hasEdges(){
			return !edges.isEmpty();
		}

		@Override
		public String toString() {
			return value.toString();
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Node)) return false;

			Node node = (Node) o;

			return value != null ? value.equals(node.value) : node.value == null;
		}

		@Override
		public int hashCode() {
			return value != null ? value.hashCode() : 0;
		}
	}

	public Graph() {
		nodes = new HashSet<>();
	}

	public boolean testEdgesFor(Node n, Predicate<Node> condition){
		return n.edgesFrom()
				.parallelStream()
				.map(condition::test)
				.reduce((b1, b2) -> b1|b2)
				.orElse(false);
	}

	/**
	 * adds the node "n" to this graph
	 *
	 * @param n
	 */
	public void addNode(Node n) {
		nodes.add(n);
	}

	/**
	 * adds a directed edge "n1" -> "to" to this graph
	 *
	 * @param from
	 * @param to
	 */
	public void addEdge(Node from, Node to) {
		nodes.add(from);
		nodes.add(to);

		from.addDirectedEdge(to);
	}

	/**
	 * @param sources
	 * @param targets
	 * @return true if (1) SOURCES is a subset of NODES, (2) TARGETS is
	 * a subset of NODES, and (3) for each node "m" in set TARGETS,
	 * there is no node "n" in set SOURCES such that there is a
	 * directed path that starts at "n" and ends at "m" in "this"; and
	 * false otherwise
	 */
	public boolean unreachable(Set<Node> sources, Set<Node> targets) {
		if (sources == null || targets == null) throw new IllegalArgumentException();


		return nodes.containsAll(sources) &&
		       nodes.containsAll(targets) &&
		       isConnected(sources, targets);
	}

	/**
	 * @param sources
	 * @param targets
	 * @return true if for each node "m" in set TARGETS,
	 * there is no node "n" in set SOURCES such that there is a
	 * directed path that starts at "n" and ends at "m" in "this"; and
	 * false otherwise
	 */
	private boolean isConnected(Set<Node> sources, Set<Node> targets) {

		return targets.parallelStream()
		              .map(m -> sources.parallelStream()
		                               .map(n -> !n.canReach(m))
		                               .reduce((res1, res2) -> res1 & res2)
		                               .orElse(true)
		              )
		              .reduce((finalRes1, finalRes2) -> finalRes1 & finalRes2)
		              .orElse(true);
	}


	public String toString() {
		return "nodes=" + nodes.toString() + "; " +
		       "edges=" + nodes.stream()
		                       .unordered()
		                       .filter(Node::hasEdges)
		                       .map(src -> src.toString() + "=" +
		                                   src.edges.stream()
		                                            .map(Object::toString)
		                                            .collect(Collectors.joining(", ", "[", "]"))
		                       ).collect(Collectors.joining(", ", "{", "}"));
	}
}