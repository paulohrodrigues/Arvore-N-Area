import java.util.ArrayList;

public class Node {
	private ArrayList<Node> node;
	private int valorQueVoceQuiser;
	
	public Node(){
		this.node = new ArrayList<>();
	}
	
	public ArrayList<Node> getNode(){
		return this.node;
	}
	public void setValor(int val){
		this.valorQueVoceQuiser=val;
	}
	public void setNode(Node n){
		this.node = new ArrayList<>();
		this.node.add(n);
	}
	
}
