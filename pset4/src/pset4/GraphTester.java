package pset4;

import org.junit.*;
import pset4.Graph.Node;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by Aria Pahlavan on 4/3/17.
 */
public class GraphTester {
	private Graph graph;
	private Set<Node> sources;
	private Set<Node> targets;
	private final Node n1 = new Node(1);
	private final Node n2 = new Node(2);
	private final Node n3 = new Node(3);
	private final Node n4 = new Node(4);
	private final Node IV1 = new Node(5);
	private final Node IV2 = new Node(6);

	@Before
	public void setUp() throws Exception {
		graph = new Graph();
		sources = new HashSet<>();
		targets = new HashSet<>();

		graph.addNode(n1);
		graph.addNode(n2);
		graph.addNode(n3);
		graph.addNode(n4);
	}


	/**
	 * tests for method "unreachable" in class "Graph"
	 */
	@Test
	public void tr0() {
		Graph     g     = new Graph();
		Set<Node> nodes = new HashSet<>();

		g.addNode(n1);
		nodes.add(n1);

		assertTrue(g.unreachable(new HashSet<>(), nodes));
	}

	@Test
	public void addEdgeExistingNodes() throws Exception {
		graph.addEdge(n1, n2);
		graph.addEdge(n1, n3);
		graph.addEdge(n1, n4);

		assertTrue(graph.testEdgesFor(
				n1,
				e -> e.equals(n2)));
	}

	@Test
	public void addEdgeNoEdges() throws Exception {
		assertFalse(
				graph.testEdgesFor(
						n1,
						e -> e.equals(n2) ||
						     e.equals(n3) ||
						     e.equals(n4)));
	}

	@Test
	public void addEdgeSelfEdge() throws Exception {
		graph.addEdge(n1, n1);

		assertTrue(
				graph.testEdgesFor(
						n1,
						e -> e.equals(n1)));
	}

	@Test
	public void addEdgeLoop() throws Exception {
		graph.addEdge(n1, n2);
		graph.addEdge(n2, n1);

		assertTrue(
				graph.testEdgesFor(
						n1,
						e -> e.equals(n2)) &
				graph.testEdgesFor(
		        		n2,
				        e -> e.equals(n1))
		);
	}

	@Test
	public void unreachableEmptyTargetAndSource() throws Exception {
		assertTrue(graph.unreachable(sources, targets));
	}

	@Test
	public void unreachableEmptyTarget() throws Exception {
		sources.add(n1);
		assertTrue(graph.unreachable(sources, targets));
	}

	@Test
	public void unreachableEmptySource() throws Exception {
		targets.add(n2);
		assertTrue(graph.unreachable(sources, targets));
	}

	@Test
	public void unreachableNonempty() throws Exception {
		targets.add(n1);
		sources.add(n3);
		assertTrue(graph.unreachable(sources, targets));
	}

	@Test
	public void unreachableNonsubset() throws Exception {
		sources.add(IV1);
		assertFalse(graph.unreachable(sources, targets));

		sources.clear();
		targets.add(IV2);
		assertFalse(graph.unreachable(sources, targets));
	}

	@Test
	public void reachable() throws Exception {
		graph.addEdge(n3, n1);
		targets.add(n1);
		sources.add(n3);
		assertFalse(graph.unreachable(sources, targets));
	}

	@Test
	public void unreachable() throws Exception {
		graph.addEdge(n1, n3);
		targets.add(n1);
		sources.add(n3);
		assertTrue(graph.unreachable(sources, targets));
	}

	@Test
	public void complexReachable() throws Exception {
		setupComplexGraph();

		targets.addAll(Arrays.asList(n2));
		sources.addAll(Arrays.asList(n3, n1, n2));

		assertFalse(graph.unreachable(sources, targets));
	}

	@Test
	public void complexUnreachable() throws Exception {
		setupComplexGraph();

		targets.addAll(Collections.singletonList(n2));
		sources.addAll(Arrays.asList(n3, n1));

		assertTrue(graph.unreachable(sources, targets));
	}

	private void setupComplexGraph() {
		graph.addEdge(n3, n1);
		graph.addEdge(n2, n3);
		graph.addEdge(n1, n3);
		graph.addEdge(n2, n2);
	}
}