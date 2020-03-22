/**
 * 
 * @author Daniela Batz 19214
 *
 */
import java.util.*;

public class BinaryTree<E> {

	Node root;

	public void addNode(E key, E value) {

		/**
		 * Crea un nuevo nodo
		 */

		Node NNode = new Node(key, value);

		/**
		 * Creación de la raiz
		 */

		if (root == null) {

			root = NNode;

		} 
		else {
			Node FNode = root;
			Node padre;

			while (true) {

				/**
				 * Raiz es la prinicpal del padre 
				 */

				padre = FNode;
				/**
				 * Verifica si el nuevo nofo continua del lado 
				 * ziquierdo del nodo padre
				 */

				if (key.toString().compareTo(FNode.key.toString()) < 0) {
					FNode = FNode.leftChild;
					if (FNode == null) {
						padre.leftChild = NNode;
						return;

					}

				} 
				else {
					FNode = FNode.rightChild;
					if (FNode == null) {
						padre.rightChild = NNode;
						return;
					}

				}

			}
		}

	}

	public void inOrTree(Node FNode) {

		if (FNode != null) {
			inOrTree(FNode.leftChild);
			System.out.println(FNode);
			inOrTree(FNode.rightChild);

		}

	}

	public void preOrTree(Node FNode) {

		if (FNode != null) {

			System.out.println(FNode);

			preOrTree(FNode.leftChild);
			preOrTree(FNode.rightChild);

		}

	}

	public void posOrTree(Node FNode) {

		if (FNode != null) {

			posOrTree(FNode.leftChild);
			posOrTree(FNode.rightChild);

			System.out.println(FNode);

		}

	}

	public Node EnNode(E key) {
		Node FNode = root;
		while (!FNode.key.toString().equalsIgnoreCase(key.toString())) {
			if (key.toString().compareTo(FNode.key.toString()) < 0) {
				FNode = FNode.leftChild;

			} 
			else {
				FNode = FNode.rightChild;
			}
			if (FNode == null)
				return null;

		}

		return FNode;

	}
        public String findValue(String key) {
		Node FNode = root;
		while (!FNode.key.toString().equalsIgnoreCase(key)) {
			if (key.compareTo(FNode.key.toString()) < 0) {
				FNode = FNode.leftChild;

			}
			else {
				FNode = FNode.rightChild;
			}
			if (FNode == null)
				return null;

		}

		return FNode.value.toString();

	}

}

class Node<E> {

	E key;
	E value;

	Node leftChild;
	Node rightChild;

	Node(E key, E value) {
            
		this.key = key;
		this.value = value;
                
	}

	public String toString() {

		return value + " has the key " + key;

	}

}