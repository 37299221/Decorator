//This is the main file that is ran. Takes everything needed and diaplays it.

//Class made to display all of the features applied to each of the people.
public class DecoratorDriver {

//Everything within the main method will be displayed. In this case, everything within the
//two person objects will.
    public static void main(String[] args) {
        
		//Person 1 object made by using PersonImpl. There is nothing attached to this
		//person so will output 'Person '.
        Person personObj1 = new PersonImpl();
		
		//prints personObj1 (above).
        System.out.println(personObj1.decorate());

		//Person 2 object by using PersonImpl. Glasses will be made alongside 'Person '. Will
		//output 'Person with glasses'
        Person personObj2 = new Glasses(new PersonImpl());
		
		//prints personObj2 (above).
        System.out.println(personObj2.decorate());

	//End of main method.
    }

//End of class.
}