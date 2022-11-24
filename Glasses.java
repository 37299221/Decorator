//Class made for 'Glasses'. Contains code to allow "with glasses" to display.
//Extends from PersonDecorator.

public class Glasses extends PersonDecorator {


//Class containing the parameters (needed for object used inside {}).
    public Glasses(Person personObj) {
		
		//Takes object from the extended file.
        super(personObj);
		
		//End of class.
    }
    
	//String for decorate().
    public String decorate() {
		
		//Allows the person to be decorated + adds an attribute to be used for the tetx displayed.
        return super.decorate() + decorateWithglasses();
		
		//End of string.
    }


	//Builds upon the newly created attribute by creating a string with the contents of what will be
	//displayed inside.
    private String decorateWithglasses() {
		
		//Text to be displayed in DecoratorDriver once attribute is called.
        return " with glasses";
		
		//End of string.
    }
	
	//End of class.
}