package pizzaorder;

public class dominos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
user(); // calling another method  with in i n the class


Pizzatype kar=new Pizzatype();

kar.chicken();



String ma1=kar.veg();// getting parameters from veg method

System.out.println(ma1+"this is main method");

String Y1="only one pizza is enough ";

kar.nonveg(Y1);

	}

	public static void user()
	{
		System.out.println( "enter user");
	
	
	}
}
