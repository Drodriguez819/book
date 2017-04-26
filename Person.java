public class Person {

    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private int intBirthYear = 1970;
    private int intBirthMonth = 1;
    private int intBirthDay = 1;
    private char chrGender = ' ';
    private int intHeightIN = 72;
    private int intWeightLBS = 165;

    //setter and getter for first name
                public void setFirstName(String pstrFirstName) {
                    this.strFirstName = pstrFirstName;
                }
                public String getFirstName() {
                    return this.strFirstName;
                }
    //setter and getter for middle name
                public void setLastName(String pstrLastName) {
                    this.strLastName = pstrLastName;
                }
                public String getLastName() {
                    return this.strLastName;
                }
    //Setter and getter for middle name
                public void setMiddleName(String pstrMiddleName) {
                    this.strMiddleName = pstrMiddleName;
                }
                public String getMiddleName() {
                    return this.strMiddleName;
                }
    //setter and getter for first middle and last name (all in one bs)
                public String getName() {
                    return "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
                }
   
    //uses setters and getters to change the bs uptop for name
        public void setName(String pstrFirstName, 
                                String pstrMiddleName,
                                String pstrLastName) {
            this.setFirstName(pstrFirstName);
            this.setMiddleName(pstrMiddleName);
            this.setLastName(pstrLastName);
                 }

    //setter and getter for birthyear
                public void setBirthYear(int pintBirthYear) {
                    this.intBirthYear = pintBirthYear;
                }
                public int getBirthYear(){
                    return this.intBirthYear;
                }
    //birth month setter and getter 
                public void setBirthMonth(int pintBirthMonth){
                    this.intBirthMonth = pintBirthMonth;
                }
                public int getBirthMonth (){
                    return this.intBirthMonth;
                }
    //birthday setter and getter 
                public void setBirthDay(int pintBirthDay){
                    this.intBirthDay = pintBirthDay;
                }
                public int getBirthDay(){
                    return this.intBirthDay;
                }
    //Birthday bs all in one
                public String getDayofBirth(){
                    return "" + this.getBirthMonth() + "/"+ this.getBirthDay() + "/" + this.getBirthYear();
                }
    //uses setters and getters to get the birthday of individual
        public void setDayofBirth(int pintBirthYear,
                                  int pintBirthDay,
                                  int pintBirthMonth){
            this.setBirthDay(pintBirthDay);
            this.setBirthMonth(pintBirthMonth);
            this.setBirthYear(pintBirthYear);
                }

//setters and getters for gender and characteristics of individual
        
    //gender
                public void setchrGender(char pchrGender){
                    this.chrGender = pchrGender;
                }
                public char getchrGender(){
                    return this.chrGender;
                }
    //intHeightIN setter and getters 
                public void setintHeightIN(int pintHeightIN){
                    this.intHeightIN = pintHeightIN;
                }
                public int getintHeightIN(){
                    return this.intHeightIN;
                }
    //intWeightLBS setter and getter
                public void setintWeightLBS(int pintWeightLBS){
                    this.intWeightLBS = pintWeightLBS;
                }
                public int getWeightLBS(){
                    return this.intWeightLBS;
                }
    //bs for characteristics all together
        public String getcharacteristics(){
            return this.getWeightLBS() + "," + this.getintHeightIN();
            }
    public void getallcharacteristics(char pchrGender,
                                      int  pintHeightIN,
                                      int  pintWeightLBS){
            this.chrGender = pchrGender;
            this.intHeightIN = pintHeightIN;
            this.intWeightLBS = pintWeightLBS;
         }
        
}