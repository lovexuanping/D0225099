package hah;

import java.util.ArrayList;

public class using {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void list(){
		int num;
		String que;
		
		
	}
}


abstract class component
{	
	abstract void usingca();
}

class composite extends component
{
	ArrayList<component> list;	



}













class quetion
{
	
	String des;
	
	public quetion(String decs)
	{
		this.des=decs;
	}

	public void print()
	{
		System.out.println(this.des);
	}

}