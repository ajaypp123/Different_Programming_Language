
class people{
	private int month;
	private int year;
	private int day;
	
	public people(int d,int m,int y){
		month = m; year = y; day = d;
		
		System.out.println( "In constructure date is " + this ) ;
	}
	
	public String toString(){
		return String.format("%2d/%2d/%d",day,month,year);
	}
}

class tuna {
	private String name;
	private people birth;
	
	public tuna(String n,people b){
		name = n;
		birth = b;
	}
	
	public String toString(){
		return String.format("My name is %s & My birthday is %s ",name,birth);
	}
}

class apple{
	public static void main(String a[]){
		
		people obj = new people(23,7,1995);
		tuna obj1 = new tuna("ajay",obj);
	}
}