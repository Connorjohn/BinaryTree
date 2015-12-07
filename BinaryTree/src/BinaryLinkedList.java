
public class BinaryLinkedList<T> {
	
	private BinaryNode<T> head;
	private int size;
	
	public BinaryLinkedList(){
		this.head = null;
	}
	
	public BinaryNode<T> getHead(){
		return head;
	}
	
	public int getSize(){
		return size;
	}
	
	public void add(T item){
		if (this.head == null){
			head = new BinaryNode<T>(item);
		}else{
			BinaryNode<T> currentnode = head;
			while (currentnode != null){
				if (currentnode.getRight() == null && currentnode.getLeft()== null){
					size++;
				}
				if (currentnode.getObject().compareTo(item) > 0){
					if (currentnode.getRight()== null){
						currentnode.addRight(new BinaryNode<T>(item));
						currentnode = null;
					}else{
						currentnode = currentnode.getRight();
					}
				}else if (currentnode.getObject().compareTo(item) < 0){
					if (currentnode.getLeft()== null){
						currentnode.addLeft(new BinaryNode<T>(item));
						currentnode = null;
					}else{
						currentnode = currentnode.getLeft();
					}
				}
			}
		}
	}
}
