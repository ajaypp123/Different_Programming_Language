//Polymorphism is a concept in which we can perform a single action in different ways. 

class child
{
	 child()
	 {
		 System.out.println("empty");
	 }

	 child(int a)
	 {
		 	 System.out.println(a);
	 }
 
	child(int p,double b)
	 {
		 	 System.out.println( p +" "+ b);
		
	 }
}

 class parant extends child
 {
	 public static void main (String a[])
	 {		
		child obj1 = new child();
		child obj = new child(20);
		child obj2 = new child(20,20.2);
	 }
 }
