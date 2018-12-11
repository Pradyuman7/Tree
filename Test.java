
public class Test {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree(40);
		
		tree.insert(50);
		tree.insert(30);
		
		System.out.println(tree.contains(30));
		
		System.out.println();
		
		tree.printInOrder(); // left, root, right
		
		System.out.println();
		
		tree.printPreOrder(); // root, left, right
		
		System.out.println();
		
		tree.printPostOrder(); // left, right, root
		
		System.out.println();
		
		System.out.println(tree.deleteRec(tree, 1));
		
		System.out.println();
		
		System.out.println(tree.minValue(tree));
		
		System.out.println();
		
		
	}

}
