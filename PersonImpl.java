//This file will be used to place teh word 'Person' at the beginning of every occurance of
//'PersonImpl' being created.

//Class to contain the word that will be present at the start of each 'DecoratorDriver' file. In this case,
//'Person' will start.
public class PersonImpl implements Person {

    @Override
	//Overrides / updates method 'person' with below.
	
	//Command that will be used to show the text. Will be used in other files that have been
	//extended from this file.
    public String decorate() {
		
		//The exact text within "" will show in the actual DecoratorDriver file.
        return "Person";
		
		//End of string
    }

//End of class
}