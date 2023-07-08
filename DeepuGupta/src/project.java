import java.util.Scanner;

public class project {
	public static void main (String []arg) {
		char r;
		do {

			System.out.println( "labrary management system");
			System.out.println("press 1 to  add book");
			System.out.println("press 2 to issu book");
			System.out.println("press 3 to return a book");
			System.out.println("press 4 to print complete issu details ");
			System.out.println("press s to exit");
			Scanner obj1=new Scanner (System.in);
			System.out.println("enter any number");
			int a = obj1.nextInt() ;
			switch(a) {
			case 1:
				Labrary aa = new Labrary();
				aa.add();
				break;
			case 2:
				Labrary bb= new Labrary();	
				bb.issu();
				break;

			case 3:
				Labrary cc = new Labrary();
				cc.ret();
				break;

			case 4:
				Labrary dd = new Labrary();
				dd.detail();
				break;
			case 5:
				Labrary ee = new Labrary();
				ee.exit();
				break;
			default:
				System.out.println("invailid number");
				

			}

			System.out.println("you want to select nrxt option y||Y");
			r = obj1.next().charAt(0);
		}
		while(r=='y'||r=='Y');
		if(r=='n'||r=='N') 
		{
			Labrary z = new Labrary ();
			z.exit();
		}

	}



}

class Labrary {

	static String str,  b;
	static int a,c, date;

	void add() {
		System.out.println("enter book name,price and book_no ");
		Scanner obj2 = new Scanner(System.in);
		String str = obj2.nextLine();
		float price = obj2.nextInt();
		int book_no = obj2.nextInt();
		System.out.println("your detail is "  +   str   +" " +  price +  " "+   book_no);

	}

	void issu() {
System.out.println("enter book name, book_id, issu date,total no of book issu,return book date  ");
		Scanner obj3 = new Scanner(System.in);
		System.out.println("book name"); 
		str = obj3.nextLine();
		System.out.println("book_id");
		a = obj3.nextInt();
		obj3.nextLine();
		System.out.println("issu date");
		b = obj3.nextLine();
		obj3.nextLine();
		System.out.println("total number of book issu");
		int c = obj3.nextInt();
		obj3.nextLine();
		System.out.println("return book date");
		int date = obj3.nextInt();
		obj3.nextInt();
		

	}

	int getid() {
		return date;
	}

	void ret() {
		System.out.println("entre student_name & book _id");
		Scanner c = new Scanner(System.in);
		String name = c.nextLine();
		int bookid = c.nextInt();
		if (a == bookid)

		{
			System.out.println("total detail");
			System.out.println("book name::" + Labrary.str);
			System.out.println("book id::" + Labrary.a);
			System.out.println("issu date::" + Labrary.b);
			System.out.println("total number of book issu" + Labrary.c);
			System.out.println("return book date::" + Labrary.date);

		} else {
			System.out.println("worng id please enter correct id");
		}

	}

	void detail() {

		System.out.println("book name::" + Labrary.str);
		System.out.println("book id::" + Labrary.a);
		System.out.println("issu date::" + Labrary.b);
		System.out.println("total number of book issu" + Labrary.c);
		System.out.println("return book date::" + Labrary.date);

	}

	void exit() {

		System.out.println(0);
	}

}


