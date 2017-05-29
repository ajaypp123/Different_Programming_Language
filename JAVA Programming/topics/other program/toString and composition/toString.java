
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

class apple{
	public static void main(String a[]){
		people obj = new people(23,7,1995);
	}
}