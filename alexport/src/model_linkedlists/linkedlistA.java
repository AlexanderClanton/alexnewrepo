package model_linkedlists;
import java.util.Scanner;


public class linkedlistA 
{
	BookN head;
	
	
	//node called BookN
	class BookN
		{
			
		//properties
			String Name="";
			String Title="";
			int pagenum=0;
			BookN prev;
			BookN next;
			
			BookN(String N,String T,int p) {Name=N; Title=T; pagenum=p;}
		
		}	
	
	 
	//push on top
	public void push(String N, String T, int p) 
	    { 
	     
	        BookN new_Node = new BookN(N,T,p); 
	  
	     
	        new_Node.next = head; 
	        new_Node.prev = null; 
	  
	      
	        if (head != null) 
	            head.prev = new_Node; 
	  
	        head = new_Node; 
	    } 
	  
	
	    //print tail and beginning
	    public void printlist(BookN node) 
	    { 
	        BookN last = null; 
	        System.out.println("Traversal in forward Direction"); 
	        while (node != null) { 
	            System.out.println("Name: "+node.Name);
	            System.out.println("Title: " +node.Title);
	            System.out.println("Page: " +node.pagenum);
	            last = node; 
	            node = node.next; 
	        } 
	        System.out.println(); 
	        System.out.println("Traversal in reverse direction"); 
	        while (last != null) { 

	        	System.out.println("Name: " +last.Name);
	            System.out.println("Title: "+last.Title);
	            System.out.println("Page: " +last.pagenum);
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
			int loop=1;
			int x;
			int counter=0;
			//add until user is done
			while(loop==1)
			{
				
				Title=ConsoleMethods.inputString("Enter your book title");
				Name=ConsoleMethods.inputString("Enter your book Name");
				page=ConsoleMethods.inputInt("Enter your page numbers");
				
				b.push(Name, Title, page);
				
				System.out.println("Enter 1 to continue");
				loop= myObj.nextInt();	
				
			
			
				System.out.println("Current List");
					b.printlist(b.head);
			
					counter++;
			}
			
			//print
			System.out.println("");
			System.out.println("Final!!!");
			b.printlist(b.head);
		

			
			//delete node
			for(x=0;x<counter;x++)
			{
				b.dNode(b.head, b.head);
				
			}
			b.printlist(b.head);
			System.out.println("Bye bye");
			
		}


		//deletes nodes
		void dNode(BookN head_ref, BookN del) 
	    { 
	  
	       
	        if (head == null || del == null) { 
	            return; 
	        } 
	  

	        if (head == del) { 
	            head = del.next; 
	        } 
	  
	       
	        if (del.next != null) { 
	            del.next.prev = del.prev; 
	        } 
	  
	   
	        if (del.prev != null) { 
	            del.prev.next = del.next; 
	        } 
	  
	       
	        return; 
	    } 


}
