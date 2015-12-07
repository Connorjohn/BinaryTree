
public class BinaryNode<T> {

	private T item;
	private BinaryNode<T> left;
	private BinaryNode<T> right;

	public BinaryNode(T item){
		this.item = item;
		this.left = null;
		this.right = null;
	}

	public T getObject(){
		return item;
	}

	public BinaryNode<T> getLeft(){
		return left;
	}

	public BinaryNode<T> getRight(){
		return right;
	}

	public void addLeft(BinaryNode<T> node){
		this.left = node;
	}

	public void addRight(BinaryNode<T> node){
		this.right = node;
	}

}
