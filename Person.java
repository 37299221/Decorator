//The main reason for this file is just to act as an interface, hding the more important
//elements to anyone using the program. Contains the core of the program(decorate)().

//Next layer implementing this file will have this overridden. 'Decorate()' will
//allow the person to be decorated.
public interface Person {
    String decorate();
	
	//End of interface
}