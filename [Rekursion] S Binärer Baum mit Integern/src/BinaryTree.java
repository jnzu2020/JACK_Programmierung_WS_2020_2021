import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	BinaryTreeNode top;

	public BinaryTree() {
		top = null;
	}

	/*
	 * BEGINN des zu implementierenden Bereichs
	 */

	// Aufgabe 1
	public void insert(int number) {
		if (top == null) {
			top = new BinaryTreeNode(number);
		} else {
			insert(top, number);
		}
	}

	private void insert(BinaryTreeNode node, int number) {
		if (number < node.getNumber()) {
			if (node.getSmaller() != null) {
				insert(node.getSmaller(), number);
			} else {
				node.setSmaller(new BinaryTreeNode(number));
			}
		} else {
			if (node.getLarger() != null) {
				insert(node.getLarger(), number);
			} else {
				node.setLarger(new BinaryTreeNode(number));
			}
		}
	}

	// Aufgabe 2
	public int maxDepth() {
		if (top == null) {
			return 0;
		} else {
			return maxDepth(top);
		}
	}

	private int maxDepth(BinaryTreeNode node) {
		if (node.getSmaller() != null && node.getLarger() != null) {
			return Math.max(maxDepth(node.getSmaller()), maxDepth(node.getLarger())) + 1;
		} else if (node.getSmaller() != null) {
			return maxDepth(node.getSmaller()) + 1;
		} else if (node.getLarger() != null) {
			return maxDepth(node.getLarger()) + 1;
		} else {
			return 1;
		}
	}

	// Aufgabe 3
	public int sumOfElements() {
		if (top == null) {
			return 0;
		}
		int sum = 0;
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(top);
		while (!queue.isEmpty()) {
			BinaryTreeNode remove = queue.remove();
			sum += remove.getNumber();
			if (remove.getSmaller() != null) {
				queue.add(remove.getSmaller());
			}
			if (remove.getLarger() != null) {
				queue.add(remove.getLarger());
			}
		}
		return sum;
	}

	// Aufgabe 4
	public void deleteNumber(int number) {
		deleteNumber(top, number);
	}

	private BinaryTreeNode deleteNumber(BinaryTreeNode node, int number) {
		if (node == null) {
			return null;
		}
		if (number < node.getNumber()) {
			node.setSmaller(deleteNumber(node.getSmaller(), number));
		} else if (number > node.getNumber()) {
			node.setLarger(deleteNumber(node.getLarger(), number));
		} else {
			if (node.getSmaller() == null && node.getLarger() == null) {
				node = null;
			} else if (node.getLarger() != null) {
				node.number = successor(node);
				node.setLarger(deleteNumber(node.getLarger(), node.getNumber()));
			} else {
				node.number = predecessor(node);
				node.setSmaller(deleteNumber(node.getSmaller(), node.getNumber()));
			}
		}
		return node;
	}

	private int successor(BinaryTreeNode root) {
		root = root.getLarger();
		while (root.getSmaller() != null) {
			root = root.getSmaller();
		}
		return root.getNumber();
	}

	private int predecessor(BinaryTreeNode root) {
		root = root.getSmaller();
		while (root.getLarger() != null) {
			root = root.getLarger();
		}
		return root.getNumber();
	}

	/*
	 * ENDE des zu implementierenden Bereichs
	 */

	public static void main(String[] args) {

	}

}
