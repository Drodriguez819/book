/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 11
* Description: Displays names from person class
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*  1. Calls Person class 
*  2. Displays Person class in a string 
*   
*---------------------------------------------------------------------------------------
*/
public class AddressBook {



    public static void main(String [] strArgs) {
        Person objPersonOne = new Person();
        System.out.println(objPersonOne.getName());
        objPersonOne.setFirstName("John");
        objPersonOne.setMiddleName("R");
        objPersonOne.setLastName("Legend");
        System.out.println(objPersonOne.getName());

        objPersonOne.setName("J","F","K");
        System.out.println(objPersonOne.getName());
    }
}
