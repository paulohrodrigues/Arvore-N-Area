import java.util.ArrayList;
import java.util.Hashtable;

public class Tree {
	private Node root;
	private Hashtable<Integer,Node> table;
	
	public Tree() {
		this.root = null;
		this.table=new Hashtable<>();
	}
	
	private Node insert(int val, Node temp, int key){
		if(temp == null) {
			temp = new Node();
			temp.setValor(val);
			this.table.put(val, temp);
		}else{
			Node temp1 = new Node();
			temp1.setValor(val);
			table.get(key).setNode(temp1);
			temp=this.root;
			this.table.put(val,temp1);
		}
		return temp;
	}
	
	public void insert(int value,int key){
		this.root = this.insert(value, this.root, key);
	}
}