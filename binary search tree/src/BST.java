import java.lang.Math;

public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(BST<T> tree) {
		left = tree;
	}

	public void setRight(BST<T> tree) {
		right = tree;
	}
	
	public void insert(T datum) {

		if (datum.compareTo(this.datum) < 0) {

			if (left == null) {
				setLeft(new BST<T>(datum));
			} else {
				left.insert(datum);
			}
		} else if (datum.compareTo(this.datum) > 0) {
			if (right == null) {
				setRight(new BST<T> (datum));
			} else {
				right.insert(datum);
			}
		}
	}
	



	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
	
	public int depth () {
		if (getLeft() == null && getRight() == null) {
			return 1;
			}
		else if (getLeft() == null) {
			return getRight().depth() + 1;
		}
		else if (getRight() == null) {
			return getLeft().depth() +1;
		}
		else {
			return 1 + Math.max(getLeft().depth(), getRight().depth());
		
	}
	
}

	
	
}
