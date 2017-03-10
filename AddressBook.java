public class AddressBook {

    public static void main(String [] strArgs) {
        Person objPersonOne = new Person();
        System.out.println(objPersonOne.getName());
        objPersonOne.setFirstName("Chris");
        objPersonOne.setMiddleName("R");
        objPersonOne.setLastName("MacDougald");
        System.out.println(objPersonOne.getName());

        objPersonOne.setName("J","F","K");
        System.out.println(objPersonOne.getName());
    }
}