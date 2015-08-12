
public class Abc {  
		   int rollno;  
		   String name;  
		   static String college ="ITS";  
		     
		   Abc(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
		 void display ()
		 {System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
			 Abc s1 = new Abc(111,"Karan");  
			 Abc s2 = new Abc(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		 
		}  
}
