//SINGLE LEVEL INHERITANCE
class Vehicle
{
	static String Colour;
	static String Fuel_Type;
}
class Car extends Vehicle
{
	static void Car_Properties()
	{
		Colour="RED";
		Fuel_Type="Electrical car ";
		System.out.println("Properties of Car ");
		System.out.println("Colour : "+Colour);
		System.out.println("Type of fuel  : "+Fuel_Type);
	}	
}



//MULTI LEVEL INHERITANCE
class Person
{
	static String name;
	static int year;
}
class Student extends Person
{
	static void Student_Details()
	{
		name ="Kavya";
		year =2026;
	}
}
class Clg_Student extends Student
{
	static void details()
	{
		Student_Details();
		System.out.println("Student Name : "+name);
		System.out.println("Passing year : "+year);
	}
}



//HEIRARCHIAL INHERITANCE
class Sim_Networks
{
	static String signal_speed;
	static String User_Rating;
}
class AIRTEL extends Sim_Networks
{
	static void AIRTEL()
	{
		System.out.println("AIRTEL DETAILS"); 
		signal_speed="72 mbps";
		User_Rating="4.5";
		System.out.println("Signal Speed : "+signal_speed);
		System.out.println("User Rating : "+User_Rating);
	}
}
class BSNL extends Sim_Networks
{
	static void BSNL()
	{
		System.out.println("BSNL DETAILS"); 
		signal_speed="20 mbps";
		User_Rating="2.9";
		System.out.println("Signal Speed : "+signal_speed);
		System.out.println("User Rating : "+User_Rating);
	}
}
class JIO extends Sim_Networks
{
	static void JIO()
	{
		System.out.println("JIO DETAILS ");
		signal_speed="25 mbps";
		User_Rating="4";
		System.out.println("Signal Speed : "+signal_speed);
		System.out.println("User Rating : "+User_Rating);
	}
}




//HYBRID INHERITANCE
class Plants
{
	static String Plant_Type;
	static String size;
}
class Herbs extends Plants
{
	static String name;
	static void Herbs()
	{
	Plant_Type= "Herb";
	size="Short sized";
	System.out.println("Plant type : "+Plant_Type);
	System.out.println("Plant size : "+size);
	}
}
class Tomato extends Herbs
{
	static void Tomato()
	{
		name="Tomato";
		System.out.println("Plant name : "+name);
		Herbs();
	}
}
class Shrubs extends Plants
{
	static String Name;
	static void Shrubs()
	{
		Plant_Type = "Shrub";
	    size="Medium sized";
		System.out.println("Plant type : "+Plant_Type);
		System.out.println("Plant size : "+size);
	}
}
class Rose extends Shrubs
{
	static void Rose()
	{
		Name="Rose";
		System.out.println("Plant name : "+Name);
		Shrubs();
	}
}

//METHOD OVERRIDING
class Singer
{
	static void Style()
	{
		System.out.print("Singing Style : ");
	}
}
class Shreya extends Singer
{
	static void Style()
	{
		System.out.println("Melody Singer");
	}
}
//Main class
class Java
{
	public static void main(String[] args)
	{
		Shreya ob1=new Shreya();
		System.out.println("METHOD OVERRIDING");
		System.out.println("SINGER STYLE");
		ob1.Style();//Calling Style method from Shreya class(MEthod overriding)
		Tomato ob2=new Tomato();  //Calling for Hybrid Inheritance
		System.out.println("HYBRID INHERITANCE");
		System.out.println("TOMATO PLANT");
		ob2.Tomato();
		Rose ob3=new Rose();
		System.out.println("ROSE PLANT");
		ob3.Rose();
		Car ob4=new Car();     //Calling for Single level Inheritance
		System.out.println("SINGLE LEVEL INHERITANCE");
		ob4.Car_Properties();
		Clg_Student ob5=new Clg_Student();  //Calling for multilevel inheritance
		System.out.println("MULTI LEVEL INHERITANCE");
		System.out.println("STUDENT DETAILS"); 
		ob5.details();
		System.out.println("HEIRARCHIAL INHERITANCE");
		System.out.println("Different network speeds and their user ratings "); 
		AIRTEL ob6=new AIRTEL();
		ob6.AIRTEL();
		BSNL ob7=new BSNL();
		ob7.BSNL();
		JIO ob8=new JIO();
		ob8.JIO();
	}
}