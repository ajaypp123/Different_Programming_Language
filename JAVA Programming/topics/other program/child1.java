//Polymorphism in java is a concept by which we can perform a single action by different ways. 

 class ap
 {
	void child()
	 {	
		 System.out.println("inside ap class");
	 }

	 void child (int a)
	 {
		 System.out.println("inside ap class" + a );
	 }	
	
	 void child (int p ,double x)
	 {
		 System.out.println("inside ap class" + p + " " + x );
	 }
 }
 
 class parant extends ap
 {

	 void child()
	 {
		 System.out.println("inside parant class :");
	 }

	 void child(int a)
	 {
		 	 System.out.println("inside parant class :" + a);
	 }
 
	void child(int p,double b)
	 {
		 	 System.out.println( "inside parant class :"  + p +" "+ b);
		
	 }
 }

 class child1 extends ap
 {
	 public static void main (String a[])
	 {		
		ap obj = new parant();
		
		obj.child();
		obj.child(20);
		obj.child(20,20.21);
	 }
 }