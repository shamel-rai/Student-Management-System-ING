// Creating a student class 
class Student {
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    // parameterized Constructor for the student class
    Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) {
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName = "";
        this.dateOfEnrollment = "";
        this.enrollmentID = 0;
    }

    // default constructor
    Student() {

    }

    // setting attributes / mutators method = setters method
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
    
    //For droupout mutator 
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    public void setCourseDuration(int courseDuration){
        this.courseDuration = courseDuration; 
    }

    // corresponding accessor
    public int getEnrollmentId() {
        return enrollmentID;
    }

    public String getDateofBirth() {
        return dateOfBirth;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getdateOfEnrollment() {
        return dateOfEnrollment;
    }

    public int getcourseDuration() {
        return courseDuration;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    // Method
    public void display() {
        if (dateOfBirth == null || courseName == null || studentName == null || dateOfEnrollment == null
                || enrollmentID == 0 || courseDuration == 0 || tuitionFee == 0) {
            System.out.println("Some attributes are emptyy");
        } else {
            System.out.println("EnrollmentID = " + enrollmentID);
            System.out.println("CourseName = " + courseName);
            System.out.println("StudentName = " + studentName);
            System.out.println("Dateofbirth = " + dateOfBirth);
            System.out.println("DateofEnrollment = " + dateOfEnrollment);
            System.out.println("CourseDuration = " + courseDuration);
            System.out.println("TuitionFee = " + tuitionFee);
        }
    }
}


