# Tree
Tree data structure library in all of its glory, in Java.


**What is this**

This currently, is a simple library for implementing Trees in java and learn their usage and importance. The important and basic algorithms of trees are added in the class, providing a newbie, instant understanding about everything.


**What is Tree**

Tree is a reasonably efficient and easy to use Data Structure that provides fast insertion, traversal and deletion of its elements.


**Why use Tree**

Trees provide quick insertion, searching and deletion.
Time to do any operation on a Tree is O(log N), so we can see why it is such a great data structure.

	
**Basic Info about Trees**  

Top node of the Tree is called it's root, Leaf is a node that does not have any children nodes to it.

Binary trees are special trees which only have two or less children each node and always the parent has mid value, left child has smaller value and right child has larger value, NOTE that right child MUST be greater than both parent and left child and left child needs to be smaller than both parent and right child; for the tree to  be called Binary tree.

Unbalanced trees are those trees in which most of the data is found on one particular side of the whole tree, either left or right.


**More Infor about Trees**

So Binary Trees are those trees which have only two child nodes for any parent node.

Binary Search Trees are mostly the trees we talk about when we refer Binary Trees, they are important because Searching is very fast in it.
	
Binary Search Trees are trees with every parent node having two child nodes, left child node and right child node
Left Child Node is the one which is smaller then parent node, and Right Child Node is the one which is larger than Parent node
	
Unbalanced Tree is the one with elements with higher value all being inclined to one particular side, making it be like a list and decrease the performance from O(log n) to O(n).

Balanced Tree is the one with everything balanced and so good for us to use in terms of performance
	
There are three major types of (Height First) Traversal in a Balanced tree, which are:
	1. In-order Traversal: left then root then right
	2. Pre-order Traversal: root then left then right
	3. Post-order Traversal: left then right then root
	
There is also a Breadth First Traversal, which travereses the tree along its width
	
Typically in Binary Search Trees (Balanced) we do In-order Traversal, as this mostly is the ascending order of values in the nodes
	
Recursion is everything for all operations on Trees, so be prepared to see Recursion in almost all the steps.
