package Collection;

import java.util.ArrayList;

public class Arraylist {
	public  static void main (String []args ) {
		ArrayList al=new ArrayList(3);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("deepu");
		System.out.println(al);
	/*	
		ArrayList al2=new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("deepu");
		System.out.println(al2);
		*/
		/*
		al.addAll(al2);     //isme al2 ka all object al me aa gya hai
		System.out.println(al);
		*/
		
	
		/*
		System.out.println(al.add(50)); //ISKA MATLAB 50 add ho gya hai al me
		System.out.println(al);
		*/
		/*
		//contain
		System.out.println(al.contains(10)); //ye contain  cheak karta ki 10 haI ki nahi al me agar hoga to true print hoga nahi to false
		*/
		/*
		//is empty
		System.out.println(al.isEmpty());//al empty hoga to tru print hoga nahi to false 
		*/
		/*
		// size
		System.out.println(al.size()); // ye size batata hai
		*/
		/*
		al.remove(0);  //index position likha jata hai tab delet hota hai
		
		System.out.println(al);
		*/
		/*
		al.remove("deepu"); //name ,char ke liye inddex nahilikhte hai
		System.out.println();
		*/
		/*
		al.removeAll(al2);
		System.out.println(al);// al me jo jo comman object milega from al2 se  wo delet ho jayega
		
		System.out.println(al2);
		*/
		//clear
		/*
		al.clear();
		System.out.println(al);
		*/
	}

}

	