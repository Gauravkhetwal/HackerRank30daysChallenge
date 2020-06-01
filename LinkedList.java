package hackerrank;
import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
	
}

public class LinkedList {
	
	static Node insert(Node head,int data)
	{
	    
	    if(head == null)
	        return new Node( data);
	    
	    if(head.next == null){
	            head.next = new Node(data);
	        }
	    else{
	        insert(head.next,data);
	    }

	    return head;
	}
	static void  display(Node head)
	{
		Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node head = null;
		int testcase = scan.nextInt();
		while(testcase-->0)
		{
			int data = scan.nextInt();
			head = insert(head,data);
		}
		
		display(head);
		scan.close();

	}

}
