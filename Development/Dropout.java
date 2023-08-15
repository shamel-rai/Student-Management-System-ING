    class Dropout extends Student {
    int numOfRemainingModules;
    int numOfMonthsAttended;
    String dateOfDroupout;
    int remainingAmount;
    boolean hasPaid;

    Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules,
            int numOfMonthsAttended, String dateOfDroupout) {

        // calling the super class
        super(dateOfBirth, studentName, courseDuration, tuitionFee);

        // calling the parent setter/ mutator
        super.setCourseName("Programming");
        super.setEnrollmentID(1);
        super.setDateOfEnrollment("2021-05-10");

        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDroupout = dateOfBirth;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }

    public void setNumOfRemainingModules(int numOfRemainingModules) {
        this.numOfRemainingModules = numOfRemainingModules;
    }
    public void setNumOfMonthsAttended(int numOfMonthsAttended) {
        this.numOfMonthsAttended = numOfMonthsAttended;
    }
    public void setDateOfDroupout(String dateOfDroupout) {
        this.dateOfDroupout = dateOfDroupout;
    }
    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    // corressponding access method

    public int getNumofMonthAttended() {
        return numOfMonthsAttended;
    }

    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public String getDateOfDropout() {
        return dateOfDroupout;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    // Method
    public void billsPayable() {
        remainingAmount = (super.getcourseDuration() - numOfMonthsAttended) * super.getTuitionFee();

        if (remainingAmount == 0) {
            hasPaid = true;
        }
    }

    // Method for student

    public void removeStudent() {
        if (hasPaid) {
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName(" ");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            super.setEnrollmentID(0);
            this.dateOfDroupout = "";
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0; 
            this.remainingAmount = 0; 
        }
        else{
            System.out.println("All bills not cleared");
        }
    }
    
    // printing the final result 
    public void display(){
        super.display(); 
        System.out.println("Number of remaning modules: " + numOfRemainingModules);
        System.out.println("Number of months attended: " + numOfMonthsAttended);
        System.out.println("Date of dropout: " + dateOfDroupout); 
        System.out.println("Remaining amount: " + remainingAmount); 
        
    }
    public static void main(String[]agrs){
        Dropout obj = new Dropout("2059-03-23", "Shamel", 100, 100000, 5,24,"2023-05-10");
        obj.display();
    }
}

