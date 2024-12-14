package lotem1;

import java.util.Scanner;

public class Level1list {
	public static Scanner reader= new Scanner (System.in);
	//level #1.
	public static Node<Integer> buildList(int[] a)
	  {
	    Node<Integer> l=new Node<Integer>(a[0]);
	    Node<Integer> p=l;
	    for(int i=1;i<a.length;i++)
	      {
	        Node<Integer> x=new Node<Integer>(a[i]);
	        p.setNext(x);
	        p=p.getNext();
	      }
	    return l;
	  }
	//level #2.
	  public static void printList(Node<Integer> list) {
	  Node<Integer> p = list;
	  while (p!=null ) {
	    int x = p.getValue();
	    System.out.print(x + " ");
	    p = p.getNext();
	  }
	  System.out.println();
	  }
	//level #3.
	  public static  Node<Integer> exe3(){
		  System.out.println("Enter a nubmer that's higher than 0: ");
		  int temp = reader.NextInt();
		  Node<Integer> x = null;
		  while(temp!= -1) {
			  x.setNext(temp);
			  System.out.println("Enter a nubmer that's higher than 0: ");
			  temp = reader.NextInt();
		  }
		  return x.getNext();
	  }
	//level #4.
	  public static void zugi(Node<Integer> list)
	  {
	  Node <Integer> p = list;
	  while(p!=null)
	  {
	  if(p.getValue%2==0)
	  System.out.println(p.getValue+", ");
	  p=p.getNext();
	  }
	  }
	  //level #5.
	  public static boolean exe5(Node<Integer> list, int num) {
		  if(list.getValue()== null) {
			  return false;
		  }
		  if(list.getValue()== num) {
			  return true;
		  }
		  return exe5(list.getNext());
	  }
	  //level #6.
	  public static Node<Integer> delete (Node<Integer> list, int x) 
	  {
		boolean okFlag = false;
	    Node<Integer> p1 = new Node<Integer>(null, list);
	    Node<Integer> p=p1;
	    
	      while (okFlag != true | p.getNext() != null) 
	      {
	        if (p.getNext().getValue() == x) 
	        {
	          p.setNext(p.getNext().getNext());
	          okFlag = true;
	        } 
	        else
	          p = p.getNext();
	      }
	    return p1.getNext();
	    }
	  //level #7.
	  public static Node<Integer> delete1 (Node<Integer> list, int x) 
	  {
		boolean okFlag = false;
	    Node<Integer> p1 = new Node<Integer>(null, list);
	    Node<Integer> p = p1;
	    int pointer = 0;
	      while (okFlag != true | p.getNext() != null) 
	      {
	        if (pointer == x) 
	        {
	          p.setNext(p.getNext().getNext());
	          okFlag = true;
	        } 
	        else
	          p = p.getNext();
	          pointer++;
	      }
	    return p1;
	    }
		public static boolean exe8(Node<Integer> L1, Node<Integer> L2) {
			Node<Integer> x=L1;
			Node<Integer> y=L2;
			
			while(x!=null&&y!= null) {
				if(x.getValue() != y.getValue()) {
					return false;
					
				}
				x=x.getNext();
				y=y.getNext;
			}
			return true;
		}
		public static void exe9(Node<Integer> L1, Node<Integer> L2) {
			Node<Integer> x=L1;
			Node<Integer> y=L2;
			
			while(x!=null&&y!= null) {
				if(x.getValue() == y.getValue()) {
					System.out.println(x.getValue());;
					
				}
				x=x.getNext();
				y=y.getNext;
			}
		}	
		public static Node<Integer> exe10(Node<Integer> L1, Node<Integer> L2) {
			Node<Integer> x=L1;
			Node<Integer> y=L2;
			Node<Integer> newList = null;
			
			while(x!=null&&y!= null) {
				if(x.getValue() == y.getValue()) {
					newList.setNext(y.getValue());
					
				}
				x=x.getNext();
				y=y.getNext;
			}
			return newList.getNext();
		}
		public static Node<Integer> exe11(Node<Integer> L1, Node<Integer> L2) {		
			Node<Integer> x=L1;
			Node<Integer> y=L2;
			Node<Integer> newList = L1;
			
			while(x!=null&&y!= null) {
				if(x.getValue() == y.getValue()) {
					newList.setNext(x.getNext().getNext());
					
				}
				x=x.getNext();
				y=y.getNext;
			}
			return newList;
		}

	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
