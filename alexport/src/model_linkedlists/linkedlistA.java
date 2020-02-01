package model_linkedlists;
import java.util.Scanner;


public class linkedlistA 
{
	BookN head;
	
	class BookN
		{
			String Name="";
			String Title="";
			int pagenum=0;
			BookN prev;
			BookN next;
			
			BookN(String N,String T,int p) {Name=N; Title=T; pagenum=p;}
		
		}	
	
	
		
	 public void push(String N, String T, int p) 
	    { 
	     
	        BookN new_Node = new BookN(N,T,p); 
	  
	     
	        new_Node.next = head; 
	        new_Node.prev = null; 
	  
	      
	        if (head != null) 
	            head.prev = new_Node; 
	  
	        head = new_Node; 
	    } 
	  
	   
	    public void InsertAfter(BookN prev_Node,String N, String T, int p ) 
	    { 
	  
	      
	        if (prev_Node == null) { 
	            System.out.println("The given previous node cannot be NULL "); 
	            return; 
	        } 
	  
	     
	        BookN new_node = new BookN(N,T,p); 
	  
	        new_node.next = prev_Node.next; 
	  
	    
	        prev_Node.next = new_node; 
	  
	    
	        new_node.prev = prev_Node; 

	        if (new_node.next != null) 
	            new_node.next.prev = new_node; 
	    } 
	  
	    void append(String N, String T, int p) 
	    { 

	       BookN new_node = new BookN(N,T,p); 
	  
	        BookN last = head;
	  

	        new_node.next = null; 
	  
	        if (head == null) { 
	            new_node.prev = null; 
	            head = new_node; 
	            return; 
	        } 
	  
	        while (last.next != null) 
	            last = last.next; 
	  
	        
	        last.next = new_node; 
	  
	        new_node.prev = last; 
	    }
	
	
	
	
	    public void printlist(BookN node) 
	    { 
	        BookN last = null; 
	        System.out.println("Traversal in forward Direction"); 
	        while (node != null) { 
	            System.out.println(node.Name);
	            System.out.println(node.Title);
	            System.out.println(node.pagenum);
	            last = node; 
	            node = node.next; 
	        } 
	        System.out.println(); 
	        System.out.println("Traversal in reverse direction"); 
	        while (last != null) { 

	        	System.out.println(last.Name);
	            System.out.println(last.Title);
	            System.out.println(last.pagenum);
	            last = last.prev; 
	        } 
	    }
	
	
	

		public static void main(String args[])
		{
			linkedlistA b= new linkedlistA();
			Scanner myObj = new Scanner(System.in);
			String Name;
			String Title;
			int page;
			String loop="y";
			
			while(loop=="y")
			{
				
				Title=ConsoleMethods.inputString("Enter your book title");
				Name=ConsoleMethods.inputString("Enter your book Name");
				page=ConsoleMethods.inputInt("Enter your page numbers");
				
				b.push(Name, Title, page);
				
				System.out.println("Enter n to stop");
				loop= myObj.nextLine();	
				
			}
			
			
			b.printlist(b.head);
		
		
		}

	
}
