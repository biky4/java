
class UserData {
	//member + static(same value for all objects) variables
	static int age;  //Default is 0
	static String name; //Default is null
	static boolean is_what;
	//member instance variable (can change its value across objects)
	String lastName;
	//The value of static final variable can not be changed & has to be initialized
	static final int group = 10;
	
public static void main(String args[]) {
	//1st object creation/instantiation
		UserData udata = new UserData();  //udata is an object with age,name, lastname as attributes(instance/member variables)
		
	//2nd object creation/instantiation	
		UserData udata2 = new UserData(); //udata is a second object with similar structure
		//UserData.name = "Biruk"; // Java prefers this one accessing  static with class name
		//UserData.age = 30;
		
	//1st object value assignment	
		udata.name = "Biruktawit";
		udata.age = 27;
		udata.lastName = "Tarekegne";
		//udata.group = 80; This can not be assigned (is error)
		System.out.println("User data group no " + UserData.group);
		
	//2nd object value assignment	
		udata2.name = "Baba";
		udata2.age = 30;
		udata2.lastName = "WTsadik";
		
		
		//UserData.name = "Baba";
		
		//System.out.println("User name is "+ UserData.name);
		//System.out.println("User age is "+ UserData.age);
		System.out.println("The default value of boolean is "+ UserData.is_what); //UserData.is_what accessed with dot since is_what is static
		System.out.println("User name is "+ udata.name);
		System.out.println("User age is "+ udata.age);
		System.out.println("User last name is "+ udata.lastName);
		
		System.out.println("User name is "+ udata2.name);
		System.out.println("User age is "+ udata2.age);
		System.out.println("User last name is "+ udata2.lastName);
	}
	
}

//class TestUser{
	
//}