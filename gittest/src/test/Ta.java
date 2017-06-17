package test;

public class Ta {
	public int sum(int x,int y){
		return x+y;
	}
	public void print(int z){
		System.out.println(z);
	}
	public static void main(String[] args){
		Ta aTa=new Ta();
		aTa.print(3);
	}
}
