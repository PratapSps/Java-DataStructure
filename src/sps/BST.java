package sps;

public class BST {
	
	int data;
	BST leftNode;
	BST rightnode;
	BST root=null;
	
	public BST(int item){
		data=item;
		
	}
	

	public BST() {
		// TODO Auto-generated constructor stub
	}


	public void insert(int data){
		
		BST newNode=new BST(data);
		if(root==null){
			root=newNode;
		}
		else{
			BST current=root;
			BST parent;
			
			while(true){
				parent=current;
				
				if(data<current.data){
					current=current.leftNode;
					
					if(current==null){
						parent.leftNode=newNode;
						return;
					}
					
					
				}
				else{
					current=current.rightnode;
					if(current==null){
						parent.rightnode=newNode;
						return;
					}
				}
			}
		}
		
	}
	
	public void Inorder(BST rootNode){
		if(rootNode!=null){
			Inorder(rootNode.leftNode);
			System.out.print(rootNode.data + " ");
			Inorder(rootNode.rightnode);
		}
		
		
		
	}
	
	
	public void Preorder(BST rootNode){
		if(rootNode!=null){
			System.out.print(rootNode.data + " ");
			Inorder(rootNode.leftNode);
			Inorder(rootNode.rightnode);
		}
		
		
		
	}
	
	public void Postorder(BST rootNode){
		if(rootNode!=null){
			
			Inorder(rootNode.leftNode);
			Inorder(rootNode.rightnode);
			System.out.print(rootNode.data + " ");
		}
		
		
		
	}
	
	public BST Search(int data){
		BST current=root;
		
		while(data != current.data){
			if(data<current.data){
				current=current.leftNode;
			}
			else{
				current=current.rightnode;
			}
			if(current==null){
				return null;
			}
		}
		
		return current;
	}

	public static void main(String[] args) {
		BST bb=new BST();
		bb.insert(54);
		bb.insert(10);
		bb.insert(25);
		bb.insert(5);
		bb.insert(90);
		bb.insert(64);
		bb.Inorder(bb.root);
		System.out.println();
		bb.Preorder(bb.root);
		System.out.println();
		bb.Postorder(bb.root);
		System.out.println();
		System.out.println(bb.Search(90).data);

	}

}
