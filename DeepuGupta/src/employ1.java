

//STATIC KEY WORD



public class employ1 {                        //public class employ1{
int empid;                                   //int empid;
                                             //String name ;
String name;
static  String company="acer";             // String company; 
                                            // employ (int empid,String name)


employ1(int empid,String name){           //employ1 (int empid,string name)
	
	this.empid =empid;                  //this.empid= empid;
	
	this. name = name;                  //this.name = name;
	
	                                    //this.company=company;
	
}                                           //}

void display() {                                              //void display(){
	System.out.println(empid+"  "+name+"  "+company);         //System.out.println(empid+""+name+""+company);
                                                                //}
	
}
public static void main( String args []) {        //public static void main (String args []){
	employ1 e1 = new employ1(5,"deepak") ;   //employ1 e1 = new employ1(5,"deepak","acer") ;   
	e1.display();
	                                        //e1.disply();
	employ1 e2 = new employ1(6,"akash") ;    //employ1 e2 = new employ1(6,"akash","acer") ;    
	e2.display();                           // e2.display();
	employ1 e3 = new employ1(7,"anup") ;    //employ1 e3 = new employ1(7,"anup""acer") ;
	e3.display();                            //	e3.display();      
	employ1 e4 = new employ1(8,"rakhi");
	e4.display();
}

		
	}


