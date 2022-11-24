//This file will be used to allow the person to be decorated. All decorations will extend this interface.
public abstract class PersonDecorator implements Person {
	
	//New object being created for this file. Main and only object to be used.
    private Person personObj;
    
	//Makes sure that the program knows that the object being used within the parameters is
	//the object being used for other files. 'This.' does this.
    public PersonDecorator (Person personObj) {
        this.personObj = personObj;
    }
    
	//Overrides / updates original interface for new code to be used
    @Override
	
	//Uses string made from the implemented interface.
    public String decorate() {
		
		//Displays what is in the 'PersonObj' object by using 'decorate()'.
        return personObj.decorate();
		
		//End of string.
    }

//End of class
}