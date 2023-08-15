    class Regular extends Student {
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    // Constructor
    Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,
            int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);

        // calling super class mutator methods
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setEnrollmentID(enrollmentID);

        // initializing the derived instance varible
        this.daysPresent = daysPresent;  
        this.numOfCreditHours = numOfCreditHours;
        this.numOfModules = numOfModules;

        // setting boolean false
        isGrantedScholarship = false;
    }

    // acessor method
    public int getNumOfModules() {
        return numOfModules;
    }

    public int getNumOfCreditHour() {
        return numOfCreditHours;
    }

    public double getDaysPresent() {
        return daysPresent;
    }

    public boolean getIsGrantedSchoalrShip() {
        return isGrantedScholarship;
    }

    public char presentPrecentage(int daysP) {
        if (daysP > super.getcourseDuration()) {
            System.out.println("Invalid Data");
            return 1;
        }
        // getting course duration from super class
        double percentage;
        percentage = ((double)daysP / super.getcourseDuration()) * 100;
        if (percentage >= 80) {
            isGrantedScholarship = true;
            return 'A';
        } else if (percentage >= 60 && percentage <= 79) {
            return 'B';
        } else if (percentage >= 40 && percentage <= 59) {
            return 'C';
        } else if (percentage >= 20 && percentage <= 39) {
            return 'D';
        } else {
            return 'E';
        }

    }

    // method to check schoolarship and display the reuslt of the students
    public void grandCertificate(String courseName, int enrollmentID, String dateofEnrollment) {
        System.out.println("Graduated");
        System.out.println(courseName);
        System.out.println(enrollmentID);
        System.out.println(dateofEnrollment);

        if (isGrantedScholarship) {
            System.out.println("The scholarship has been granted");
        }
    }

    // method detail
    public void display() {
        super.display();
        System.out.println("Number of Modules = " + numOfModules);
        System.out.println("Number of Credit Hours = " + numOfCreditHours);
        System.out.println("Number of Modules = " + daysPresent);
    }

}
