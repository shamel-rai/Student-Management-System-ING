import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI {
        ArrayList<Regular> regularStudents = new ArrayList<>();
        ArrayList<Dropout> dropoutStudents = new ArrayList<>();

        Dropout sharedDropoutStudent = null;

        private JFrame openningFrame, regularFrame, dropoutFrame;

            // For Regular Student
        private JLabel introduction, catogory, studentName, enrollmentID, daysPresent, courseName, courseDuration,
                        tuitionFee,numberOfModules, numberOfCreditHours, regularIntroduction, dateOfBirth, dateOfEnrollment;
        private JTextField studentTextField, enrollmentIDTextField, courseNameTextField, courseDurationTextField,
                        tuitionFeeTextField, numberOfModulesTextField, numberOfCreditHoursTextField,
                        daysPresentTextField;
        private JComboBox<String> dateOfBirthYears, dateOfBirthMonths, dateOfBirthDays, dateOfEnrollmentYears,
                        dateOfEnrollmentMonths, dateOfEnrollmentDays;
        private JButton percentage, add, certification, displayRegular, clearRegular;

        // For Dropout Student  
        private JLabel studentNameDropout, dropoutIntroduction, enrollmentIDDropout, courseNameDropout,
                        dropoutDateOfBirth, dropoutDateOfEnrollment, courseDurationDropout, tuitionFeeDropout,
                        numberOfRemainingModulesDropout,
                        numberOfMonthAttendedDropout, dateOfDropout;
        private JComboBox<String> dateOfEnrollmentYearsDropout, dateOfEnrollmentMonthsDropout,
                        dateOfEnrollmentDaysDropout,
                        dateOfBirthYearsDropout, dateOfBirthMonthsDropout, dateOfBirthDaysDropout, dropoutYear,
                        dropoutMonth, dropoutDay;
        private JTextField dropoutStudentTextField, dropoutEnrollmentTextField, dropoutCourseName,
                        dropoutCourseDuration, dropoutTuitionFee, dropoutRemainingModules,
                        dropoutMonthAttendedTextField;
        private JButton bills, removeStudent, displayDropout, clearDropout, adding;

        // buttons for the Oppening GUI
        private JButton regularStudent, dropoutStudent;

        public StudentGUI() {
                // For the Starter GUI
                openningFrame = new JFrame("Student Management System");

                introduction = new JLabel("Welcome to the Student Management System");
                catogory = new JLabel("Please Select A Catogry");

                regularStudent = new JButton("Regular Student");
                dropoutStudent = new JButton("Dropout Student");
        
                // Setting the x-axis, y-axis, height width of the Openning Frame components
                introduction.setBounds(110, 50, 500, 50);
                introduction.setFont(new Font("Serial", Font.ITALIC | Font.BOLD, 20));
                introduction.setForeground(new Color(220, 215, 201));
                catogory.setBounds(205, 120, 500, 50);
                catogory.setFont(new Font("Serial", Font.ITALIC | Font.BOLD, 20));
                catogory.setForeground(new Color(220, 215, 201));
                regularStudent.setBounds(150, 180, 160, 60);
                regularStudent.setBackground(new Color(63, 78, 79));
                regularStudent.setForeground(new Color(220, 215, 201));
                regularStudent.setFont(new Font("Serial", Font.ITALIC | Font.BOLD, 16));
                dropoutStudent.setBounds(350, 180, 160, 60);
                dropoutStudent.setBackground(new Color(63, 78, 79));
                dropoutStudent.setFont(new Font("Serial", Font.ITALIC | Font.BOLD, 16));
                dropoutStudent.setForeground(new Color(220, 215, 201));

                // Adding the component in the openning Frame
                openningFrame.add(introduction);
                openningFrame.add(catogory);
                openningFrame.add(regularStudent);
                openningFrame.add(dropoutStudent);

                // Setting the background of the openning Frame
                openningFrame.getContentPane().setBackground(new Color(44, 54, 57));

                openningFrame.setLayout(null);
                openningFrame.setResizable(false);
                openningFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                openningFrame.setSize(650, 400);
                openningFrame.setVisible(true);
                openningFrame.setLocationRelativeTo(null);

                // For Regular Student
                regularFrame = new JFrame("Regular Student");
                regularIntroduction = new JLabel("Regular Student");

                studentName = new JLabel("Student Name:");
                studentTextField = new JTextField();

                enrollmentID = new JLabel("EnrollmentID:");
                enrollmentIDTextField = new JTextField();

                courseDuration = new JLabel("Course Duration:");
                courseDurationTextField = new JTextField();

                tuitionFee = new JLabel("Tuition Fee:");
                tuitionFeeTextField = new JTextField();

                numberOfModules = new JLabel("Number of Modules:");
                numberOfModulesTextField = new JTextField();

                courseName = new JLabel("Course Name:");
                courseNameTextField = new JTextField();

                numberOfCreditHours = new JLabel("Credit Hours:");
                numberOfCreditHoursTextField = new JTextField();

                daysPresent = new JLabel("Days Present:");
                daysPresentTextField = new JTextField();

                dateOfBirth = new JLabel("Date Of Birth:");

                // Array for the date Of birth for the Regular Frame
                String yearValue[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                                "2005",
                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                                "2017", "2018",
                                "2019", "2020", "2021", "2022", "2023", "2024" };
                dateOfBirthYears = new JComboBox<String>(yearValue);

                String monthValue[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                                "Dec" };
                dateOfBirthMonths = new JComboBox<String>(monthValue);

                String dayValue[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                                "16",
                                "17",
                                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
                dateOfBirthDays = new JComboBox<String>(dayValue);

                // For Date of Enrollment
                dateOfEnrollment = new JLabel("Enrollment Date:");
                String enrollmentYear[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                                "2004",
                                "2005",
                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                                "2017", "2018",
                                "2019", "2020", "2021", "2022", "2023", "2024" };
                dateOfEnrollmentYears = new JComboBox<String>(enrollmentYear);

                String enrollmentMonth[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
                                "Nov",
                                "Dec" };
                dateOfEnrollmentMonths = new JComboBox<String>(enrollmentMonth);

                String enrollmentDay[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
                                "15",
                                "16",
                                "17",
                                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
                dateOfEnrollmentDays = new JComboBox<String>(enrollmentDay);

                // JButton of the Regular Frame
                add = new JButton("Add");
                percentage = new JButton("Calculate Percentage");
                certification = new JButton("Grant Certificate");
                displayRegular = new JButton("Display");
                clearRegular = new JButton("Clear");

                // adding all the JLabels inside the Regular frame.
                regularFrame.add(regularIntroduction);
                regularFrame.add(studentName);
                regularFrame.add(enrollmentID);
                regularFrame.add(courseDuration);
                regularFrame.add(courseName);
                regularFrame.add(tuitionFee);
                regularFrame.add(numberOfCreditHours);
                regularFrame.add(numberOfModules);
                regularFrame.add(daysPresent);
                regularFrame.add(dateOfBirth);
                regularFrame.add(dateOfEnrollment);

                // Adding all the JButtons inside the Regular frame
                regularFrame.add(add);
                regularFrame.add(percentage);
                regularFrame.add(certification);
                regularFrame.add(displayRegular);
                regularFrame.add(clearRegular);

                // Adding all the JTextField inside the Regular Frame
                regularFrame.add(studentTextField);
                regularFrame.add(enrollmentIDTextField);
                regularFrame.add(courseDurationTextField);
                regularFrame.add(courseNameTextField);
                regularFrame.add(tuitionFeeTextField);
                regularFrame.add(numberOfCreditHoursTextField);
                regularFrame.add(numberOfModulesTextField);
                regularFrame.add(daysPresentTextField);
                regularFrame.add(dateOfBirthYears);
                regularFrame.add(dateOfBirthMonths);
                regularFrame.add(dateOfBirthDays);
                regularFrame.add(dateOfEnrollmentYears);
                regularFrame.add(dateOfEnrollmentMonths);
                regularFrame.add(dateOfEnrollmentDays);

                // setting Bonds of the JButtons for the Regular Frame

                add.setBounds(540, 690, 100, 35);
                add.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                add.setBackground(new Color(63, 78, 79));
                add.setForeground(new Color(220, 215, 201));
                percentage.setBounds(240, 500, 200, 60);
                percentage.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 16));
                percentage.setBackground(new Color(63, 78, 79));
                percentage.setForeground(new Color(220, 215, 201));
                certification.setBounds(490, 500, 200, 60);
                certification.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 16));
                certification.setBackground(new Color(63, 78, 79));
                certification.setForeground(new Color(220, 215, 201));
                displayRegular.setBounds(660, 690, 100, 35);
                displayRegular.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                displayRegular.setBackground(new Color(63, 78, 79));
                displayRegular.setForeground(new Color(220, 215, 201));
                clearRegular.setBounds(780, 690, 100, 35);
                clearRegular.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                clearRegular.setBackground(new Color(63, 78, 79));
                clearRegular.setForeground(new Color(220, 215, 201));

                regularIntroduction.setBounds(360, 30, 220, 40);
                regularIntroduction.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
                regularIntroduction.setForeground(new Color(220, 215, 201));

                studentName.setBounds(40, 100, 150, 70);
                studentName.setFont(new Font("Serif", Font.BOLD, 20));
                studentName.setForeground(new Color(220, 215, 201));
                studentTextField.setBounds(210, 123, 190, 25);
                studentTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                dateOfBirth.setBounds(450, 100, 150, 70);
                dateOfBirth.setFont(new Font("Serif", Font.BOLD, 20));
                dateOfBirth.setForeground(new Color(220, 215, 201));
                dateOfBirthYears.setBounds(630, 123, 80, 25);
                dateOfBirthYears.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfBirthMonths.setBounds(730, 123, 80, 25);
                dateOfBirthMonths.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfBirthDays.setBounds(830, 123, 80, 25);
                dateOfBirthDays.setFont(new Font("Serif", Font.BOLD, 15));

                enrollmentID.setBounds(40, 170, 125, 70);
                enrollmentID.setFont(new Font("Serif", Font.BOLD, 20));
                enrollmentID.setForeground(new Color(220, 215, 201));
                enrollmentIDTextField.setBounds(210, 190, 190, 25);
                enrollmentIDTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                dateOfEnrollment.setBounds(450, 170, 150, 70);
                dateOfEnrollment.setFont(new Font("Serif", Font.BOLD, 20));
                dateOfEnrollment.setForeground(new Color(220, 215, 201));
                dateOfEnrollmentYears.setBounds(630, 190, 80, 25);
                dateOfEnrollmentYears.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfEnrollmentMonths.setBounds(730, 190, 80, 25);
                dateOfEnrollmentMonths.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfEnrollmentDays.setBounds(830, 190, 80, 25);
                dateOfEnrollmentDays.setFont(new Font("Serif", Font.BOLD, 15));

                courseDuration.setBounds(40, 240, 150, 70);
                courseDuration.setFont(new Font("Serif", Font.BOLD, 18));
                courseDuration.setForeground(new Color(220, 215, 201));
                courseDurationTextField.setBounds(210, 264, 190, 25);
                courseDurationTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                tuitionFee.setBounds(450, 240, 100, 70);
                tuitionFee.setFont(new Font("Serif", Font.BOLD, 18));
                tuitionFee.setForeground(new Color(220, 215, 201));
                tuitionFeeTextField.setBounds(590, 265, 190, 25);
                tuitionFeeTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                numberOfModules.setBounds(40, 310, 180, 70);
                numberOfModules.setFont(new Font("Serif", Font.BOLD, 18));
                numberOfModules.setForeground(new Color(220, 215, 201));
                numberOfModulesTextField.setBounds(210, 335, 190, 25);
                numberOfModulesTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                courseName.setBounds(450, 310, 150, 70);
                courseName.setFont(new Font("Serif", Font.BOLD, 18));
                courseName.setForeground(new Color(220, 215, 201));
                courseNameTextField.setBounds(590, 335, 190, 25);
                courseNameTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                numberOfCreditHours.setBounds(40, 380, 120, 70);
                numberOfCreditHours.setFont(new Font("Serif", Font.BOLD, 18));
                numberOfCreditHours.setForeground(new Color(220, 215, 201));
                numberOfCreditHoursTextField.setBounds(210, 402, 190, 25);
                numberOfCreditHoursTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                daysPresent.setBounds(450, 380, 110, 70);
                daysPresent.setFont(new Font("Serif", Font.BOLD, 18));
                daysPresent.setForeground(new Color(220, 215, 201));
                daysPresentTextField.setBounds(590, 405, 190, 25);
                daysPresentTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                // Background color for the Regular Frame
                regularFrame.getContentPane().setBackground(new Color(44, 54, 57));

                regularFrame.setLayout(null);
                regularFrame.setSize(950, 800);
                regularFrame.setVisible(false);
                regularFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // GUI for the Dropout
                dropoutFrame = new JFrame("Dropout Student");
                dropoutIntroduction = new JLabel("Dropout Student");

                studentNameDropout = new JLabel("Student Name:");
                dropoutStudentTextField = new JTextField();

                enrollmentIDDropout = new JLabel("EnrollmentID:");
                dropoutEnrollmentTextField = new JTextField();

                courseNameDropout = new JLabel("Course Name:");
                dropoutCourseName = new JTextField();

                courseDurationDropout = new JLabel("Course Duration:");
                dropoutCourseDuration = new JTextField();

                tuitionFeeDropout = new JLabel("Tuition Fee:");
                dropoutTuitionFee = new JTextField();

                numberOfRemainingModulesDropout = new JLabel("Remaining Modules:");
                dropoutRemainingModules = new JTextField();

                numberOfMonthAttendedDropout = new JLabel("Month Attended: ");
                dropoutMonthAttendedTextField = new JTextField();

                dropoutDateOfBirth = new JLabel("Date Of Birth:");
                dropoutDateOfEnrollment = new JLabel("Enrollment Date:");
                dateOfDropout = new JLabel("Dropout Date:");

                // Array for the date of birth for the dropout year
                String dodBirthYear[] = { "1995", "1996", "1997", "1998", "1999", "2000",
                                "2001", "2002", "2003",
                                "2004",
                                "2005",
                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                "2015", "2016",
                                "2017", "2018",
                                "2019", "2020", "2021", "2022", "2023", "2024" };
                dateOfBirthYearsDropout = new JComboBox<String>(dodBirthYear);

                String dodBirthMonth[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                                "Aug", "Sep", "Oct", "Nov",
                                "Dec" };
                dateOfBirthMonthsDropout = new JComboBox<String>(dodBirthMonth);

                String dodBirthDay[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                "11", "12", "13", "14",
                                "15",
                                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                                "29",
                                "30", "31" };
                dateOfBirthDaysDropout = new JComboBox<String>(dodBirthDay);

                String dodYears[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001",
                                "2002", "2003", "2004",
                                "2005",
                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                "2015", "2016",
                                "2017", "2018",
                                "2019", "2020", "2021", "2022", "2023", "2024" };
                dateOfEnrollmentYearsDropout = new JComboBox<String>(dodYears);

                String dodMonths[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                                "Aug", "Sep", "Oct", "Nov",
                                "Dec" };
                dateOfEnrollmentMonthsDropout = new JComboBox<String>(dodMonths);

                String dodDays[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                "12", "13", "14", "15",
                                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                                "29",
                                "30", "31" };
                dateOfEnrollmentDaysDropout = new JComboBox<String>(dodDays);

                String dropoutYears[] = { "1995", "1996", "1997", "1998", "1999", "2000",
                                "2001", "2002", "2003",
                                "2004",
                                "2005",
                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                "2015", "2016",
                                "2017", "2018",
                                "2019", "2020", "2021", "2022", "2023", "2024" };
                dropoutYear = new JComboBox<String>(dropoutYears);

                String dropoutMonths[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                                "Aug", "Sep", "Oct", "Nov",
                                "Dec" };
                dropoutMonth = new JComboBox<String>(dropoutMonths);

                String dropoutDays[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                                "11", "12", "13", "14",
                                "15",
                                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                                "29",
                                "30", "31" };
                dropoutDay = new JComboBox<String>(dropoutDays);

                bills = new JButton("Pay Bills (Dropout Student)");
                removeStudent = new JButton("Remove Student");
                displayDropout = new JButton("Display");
                clearDropout = new JButton("Clear");
                adding = new JButton("Add");

                // Adding all the JLabel for the Dropout Frame
                dropoutFrame.add(dropoutIntroduction);
                dropoutFrame.add(studentNameDropout);
                dropoutFrame.add(enrollmentIDDropout);
                dropoutFrame.add(courseNameDropout);
                dropoutFrame.add(courseDurationDropout);
                dropoutFrame.add(tuitionFeeDropout);
                dropoutFrame.add(numberOfRemainingModulesDropout);
                dropoutFrame.add(numberOfMonthAttendedDropout);
                dropoutFrame.add(dropoutDateOfBirth);
                dropoutFrame.add(dropoutDateOfEnrollment);
                dropoutFrame.add(dateOfDropout);

                // Adding the JButtons in the DropoutFrame
                dropoutFrame.add(bills);
                dropoutFrame.add(removeStudent);
                dropoutFrame.add(displayDropout);
                dropoutFrame.add(clearDropout);
                dropoutFrame.add(adding);


                // Adding the textField and the JComboBox in the Dropout Frame
                dropoutFrame.add(dropoutStudentTextField);
                dropoutFrame.add(dropoutEnrollmentTextField);
                dropoutFrame.add(dropoutCourseName);
                dropoutFrame.add(dropoutCourseDuration);
                dropoutFrame.add(dropoutTuitionFee);
                dropoutFrame.add(dropoutRemainingModules);
                dropoutFrame.add(dropoutMonthAttendedTextField);
                dropoutFrame.add(dateOfBirthYearsDropout);
                dropoutFrame.add(dateOfBirthMonthsDropout);
                dropoutFrame.add(dateOfBirthDaysDropout);
                dropoutFrame.add(dateOfEnrollmentYearsDropout);
                dropoutFrame.add(dateOfEnrollmentMonthsDropout);
                dropoutFrame.add(dateOfEnrollmentDaysDropout);
                dropoutFrame.add(dropoutYear);
                dropoutFrame.add(dropoutMonth);
                dropoutFrame.add(dropoutDay);

                //
                dropoutIntroduction.setBounds(360, 30, 210, 40);
                dropoutIntroduction.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
                dropoutIntroduction.setForeground(new Color(220, 215, 201));

                studentNameDropout.setBounds(40, 100, 150, 70);
                studentNameDropout.setFont(new Font("Serif", Font.BOLD, 20));
                studentNameDropout.setForeground(new Color(220, 215, 201));
                dropoutStudentTextField.setBounds(210, 123, 190, 25);
                dropoutStudentTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                enrollmentIDDropout.setBounds(40, 170, 125, 70);
                enrollmentIDDropout.setFont(new Font("Serif", Font.BOLD, 20));
                enrollmentIDDropout.setForeground(new Color(220, 215, 201));
                dropoutEnrollmentTextField.setBounds(210, 190, 190, 25);
                dropoutEnrollmentTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                dropoutDateOfBirth.setBounds(450, 100, 150, 70);
                dropoutDateOfBirth.setFont(new Font("Serif", Font.BOLD, 20));
                dropoutDateOfBirth.setForeground(new Color(220, 215, 201));
                dateOfBirthYearsDropout.setBounds(630, 123, 80, 25);
                dateOfBirthYearsDropout.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfBirthMonthsDropout.setBounds(730, 123, 80, 25);
                dateOfBirthMonthsDropout.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfBirthDaysDropout.setBounds(830, 123, 80, 25);
                dateOfBirthDaysDropout.setFont(new Font("Serif", Font.BOLD, 15));

                dropoutDateOfEnrollment.setBounds(450, 170, 150, 70);
                dropoutDateOfEnrollment.setFont(new Font("Serif", Font.BOLD, 20));
                dropoutDateOfEnrollment.setForeground(new Color(220, 215, 201));
                dateOfEnrollmentYearsDropout.setBounds(630, 190, 80, 25);
                dateOfEnrollmentYearsDropout.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfEnrollmentMonthsDropout.setBounds(730, 190, 80, 25);
                dateOfEnrollmentMonthsDropout.setFont(new Font("Serif", Font.BOLD, 15));
                dateOfEnrollmentDaysDropout.setBounds(830, 190, 80, 25);
                dateOfEnrollmentDaysDropout.setFont(new Font("Serif", Font.BOLD, 15));

                courseNameDropout.setBounds(40, 240, 150, 70);
                courseNameDropout.setFont(new Font("Serif", Font.BOLD, 18));
                courseNameDropout.setForeground(new Color(220, 215, 201));
                dropoutCourseName.setBounds(210, 264, 190, 25);
                dropoutCourseName.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                courseDurationDropout.setBounds(450, 240, 150, 70);
                courseDurationDropout.setFont(new Font("Serif", Font.BOLD, 18));
                courseDurationDropout.setForeground(new Color(220, 215, 201));
                dropoutCourseDuration.setBounds(630, 265, 190, 25);
                dropoutCourseDuration.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                tuitionFeeDropout.setBounds(40, 310, 180, 70);
                tuitionFeeDropout.setFont(new Font("Serif", Font.BOLD, 18));
                tuitionFeeDropout.setForeground(new Color(220, 215, 201));
                dropoutTuitionFee.setBounds(210, 335, 190, 25);
                dropoutTuitionFee.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                numberOfRemainingModulesDropout.setBounds(450, 310, 180, 70);
                numberOfRemainingModulesDropout.setFont(new Font("Serif", Font.BOLD, 18));
                numberOfRemainingModulesDropout.setForeground(new Color(220, 215, 201));
                dropoutRemainingModules.setBounds(630, 335, 190, 25);
                dropoutRemainingModules.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                numberOfMonthAttendedDropout.setBounds(40, 380, 139, 70);
                numberOfMonthAttendedDropout.setFont(new Font("Serif", Font.BOLD, 18));
                numberOfMonthAttendedDropout.setForeground(new Color(220, 215, 201));
                dropoutMonthAttendedTextField.setBounds(210, 402, 190, 25);
                dropoutMonthAttendedTextField.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));

                dateOfDropout.setBounds(450, 380, 150, 70);
                dateOfDropout.setForeground(new Color(220, 215, 201));
                dateOfDropout.setFont(new Font("Serif", Font.BOLD, 20));
                dropoutYear.setBounds(630, 403, 80, 25);
                dropoutYear.setFont(new Font("Serif", Font.BOLD, 15));
                dropoutMonth.setBounds(730, 403, 80, 25);
                dropoutMonth.setFont(new Font("Serif", Font.BOLD, 15));
                dropoutDay.setBounds(830, 403, 80, 25);
                dropoutDay.setFont(new Font("Serif", Font.BOLD, 15));

                bills.setBounds(200, 500, 217, 60);
                bills.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                bills.setBackground(new Color(63, 78, 79));
                bills.setForeground(new Color(220, 215, 201));
                removeStudent.setBounds(470, 500, 217, 60);
                removeStudent.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 15));
                removeStudent.setBackground(new Color(63, 78, 79));
                removeStudent.setForeground(new Color(220, 215, 201));
                displayDropout.setBounds(660, 690, 100, 35);
                displayDropout.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                displayDropout.setBackground(new Color(63, 78, 79));
                displayDropout.setForeground(new Color(220, 215, 201));
                clearDropout.setBounds(780, 690, 100, 35);
                clearDropout.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                clearDropout.setBackground(new Color(63, 78, 79));
                clearDropout.setForeground(new Color(220, 215, 201));
                adding.setBounds(540, 690, 100, 35);
                adding.setFont(new Font("Serial", Font.BOLD | Font.ITALIC, 14));
                adding.setBackground(new Color(63, 78, 79));
                adding.setForeground(new Color(220, 215, 201));

                dropoutFrame.getContentPane().setBackground(new Color(44, 54, 57));

                dropoutFrame.setLayout(null);
                dropoutFrame.setVisible(false);
                dropoutFrame.setSize(950, 800);
                dropoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // calling the Event Handling Methods
                addActionListeners();

        }

        // Method for all the Event Handling
        public void addActionListeners() {
                // ActionListener for "regularStudent" button
                regularStudent.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                openningFrame.setVisible(true); // Hides the openingFrame
                                regularFrame.setVisible(true); // Opens the regularFrame
                        }
                });

                // ActionListener for "dropoutStudent" button
                dropoutStudent.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                openningFrame.setVisible(true); // Hides the openingFrame
                                dropoutFrame.setVisible(true); // Opens the dropoutFrame
                        }
                });

                // ActionListener for "displayDropout" button
                displayDropout.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                displayDropoutAction();
                        }
                });


                removeStudent.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                String dropoutStudent = dropoutStudentTextField.getText();
                                String dropoutEnrollmentID = dropoutEnrollmentTextField.getText();
                                String dropoutCourseDurationText = dropoutCourseDuration.getText();
                                String dropoutTuitionFeeText = dropoutTuitionFee.getText();
                                String dropoutRemainingModulesText = dropoutRemainingModules.getText();
                                String dropoutMonthAttendedText = dropoutMonthAttendedTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfBirthYear = (String) dateOfBirthYearsDropout.getSelectedItem();
                                String dropoutDateOfBirthMonth = (String) dateOfBirthMonthsDropout.getSelectedItem();
                                String dropoutDateOfBirthDay = (String) dateOfBirthDaysDropout.getSelectedItem();
                                String dateOfBirthCombined = dropoutDateOfBirthYear + "-" + dropoutDateOfBirthMonth + "-" + dropoutDateOfBirthDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfEnrollmentYear = (String) dateOfEnrollmentYearsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentMonth = (String) dateOfEnrollmentMonthsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentDay = (String) dateOfEnrollmentDaysDropout.getSelectedItem();
                                String dateOfEnrollmentCombined = dropoutDateOfEnrollmentYear + "-" + dropoutDateOfEnrollmentMonth + "-" + dropoutDateOfEnrollmentDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutYears = (String) dropoutYear.getSelectedItem();
                                String dropoutMonths = (String) dropoutMonth.getSelectedItem();
                                String dropoutDays = (String) dropoutDay.getSelectedItem();
                                String dateOfDropoutCombined = dropoutYears + "-" + dropoutMonths + "-" + dropoutDays;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int dropoutEnrollmentIDValue = Integer.parseInt(dropoutEnrollmentID);
                                        int dropoutCourseDurationValue = Integer.parseInt(dropoutCourseDurationText);
                                        int dropoutTuitionFeeValue = Integer.parseInt(dropoutTuitionFeeText);
                                        int dropoutRemainingModules = Integer.parseInt(dropoutRemainingModulesText);
                                        int dropoutMonthAttended = Integer.parseInt(dropoutMonthAttendedText);


                                        for (Regular student : regularStudents) {
                                                if (student.getEnrollmentId() == dropoutEnrollmentIDValue) {
                                                        if (sharedDropoutStudent == null) {
                                                                sharedDropoutStudent = new Dropout(dateOfBirthCombined, dropoutStudent, dropoutCourseDurationValue, dropoutTuitionFeeValue, dropoutRemainingModules, dropoutMonthAttended, dateOfDropoutCombined);
                                                        }
                                                        if (sharedDropoutStudent.getHasPaid()) { // bills cleared
                                                                JOptionPane.showMessageDialog(null, "All bills cleared! Student has been removed", "Success",
                                                                        JOptionPane.INFORMATION_MESSAGE);
                                                                regularStudents.remove(student);
                                                                dropoutStudents.add(sharedDropoutStudent);
                                                        } else {
                                                                JOptionPane.showMessageDialog(null, "Bills not cleared! Please clear all bills", "Error",
                                                                        JOptionPane.INFORMATION_MESSAGE);
                                                        }

                                                }

                                        }
                                }  catch (NumberFormatException a) {
                                         // To Display the Error Message To the User
                                         JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });


                // ActionListener for "displayRegular" button
                displayRegular.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                displayRegularStudentAction();
                        }
                });


                // student add button
                add.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                // Getting the input values as Strings
                                String studentName = studentTextField.getText();
                                String courseName = courseNameTextField.getText();
                                String enrollmentStr = enrollmentIDTextField.getText();
                                String courseDurationStr = courseDurationTextField.getText();
                                String tuitionFeeStr = tuitionFeeTextField.getText();
                                String numberOfModulesStr = numberOfModulesTextField.getText();
                                String daysPresentStr = daysPresentTextField.getText();
                                String creditHoursStr = numberOfCreditHoursTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dateOfBirthYear = (String) dateOfBirthYears.getSelectedItem();
                                String dateOfBirthMonth = (String) dateOfBirthMonths.getSelectedItem();
                                String dateOfBirthDay = (String) dateOfBirthDays.getSelectedItem();
                                String dateOfBirthCombined = dateOfBirthYear + "-" + dateOfBirthMonth + "-" + dateOfBirthDay;

                                // Getting the selected date values for Date of Enrollment
                                String dateOfEnrollmentYear = (String) dateOfEnrollmentYears.getSelectedItem();
                                String dateOfEnrollmentMonth = (String) dateOfEnrollmentMonths.getSelectedItem();
                                String dateOfEnrollmentDay = (String) dateOfEnrollmentDays.getSelectedItem();
                                String dateOfEnrollmentCombined = dateOfEnrollmentYear + "-" + dateOfEnrollmentMonth + "-" + dateOfEnrollmentDay;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int enrollmentIDValue = Integer.parseInt(enrollmentStr);
                                        int courseDurationValue = Integer.parseInt(courseDurationStr);
                                        int tuitionFeeValue = Integer.parseInt(tuitionFeeStr);
                                        int numberOfModulesValue = Integer.parseInt(numberOfModulesStr);
                                        int daysPresentValue = Integer.parseInt(daysPresentStr);
                                        int creditHoursValue = Integer.parseInt(creditHoursStr);

                                        boolean found = false;
                                        for (Regular student : regularStudents) {
                                                if (student.getEnrollmentId() == enrollmentIDValue) {
                                                        found = true;
                                                        break;
                                                }
                                        }


                                        if (found) {
                                                JOptionPane.showMessageDialog(null, "Student with that Enrollment ID already exist", "Error",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                                Regular newRegularStudent = new Regular(enrollmentIDValue, dateOfBirthCombined, courseName, studentName, dateOfEnrollmentCombined, courseDurationValue, tuitionFeeValue, numberOfModulesValue, creditHoursValue, daysPresentValue);
                                                regularStudents.add(newRegularStudent);

                                                JOptionPane.showMessageDialog(null, "Student has been added", "Success",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }catch (NumberFormatException a) {
                                        // To Display the Error Message To the User
                                        JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });

                // pay bills
                bills.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                String dropoutStudent = dropoutStudentTextField.getText();
                                String dropoutEnrollmentID = dropoutEnrollmentTextField.getText();
                                String dropoutCourseDurationText = dropoutCourseDuration.getText();
                                String dropoutTuitionFeeText = dropoutTuitionFee.getText();
                                String dropoutRemainingModulesText = dropoutRemainingModules.getText();
                                String dropoutMonthAttendedText = dropoutMonthAttendedTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfBirthYear = (String) dateOfBirthYearsDropout.getSelectedItem();
                                String dropoutDateOfBirthMonth = (String) dateOfBirthMonthsDropout.getSelectedItem();
                                String dropoutDateOfBirthDay = (String) dateOfBirthDaysDropout.getSelectedItem();
                                String dateOfBirthCombined = dropoutDateOfBirthYear + "-" + dropoutDateOfBirthMonth + "-" + dropoutDateOfBirthDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfEnrollmentYear = (String) dateOfEnrollmentYearsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentMonth = (String) dateOfEnrollmentMonthsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentDay = (String) dateOfEnrollmentDaysDropout.getSelectedItem();
                                String dateOfEnrollmentCombined = dropoutDateOfEnrollmentYear + "-" + dropoutDateOfEnrollmentMonth + "-" + dropoutDateOfEnrollmentDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutYears = (String) dropoutYear.getSelectedItem();
                                String dropoutMonths = (String) dropoutMonth.getSelectedItem();
                                String dropoutDays = (String) dropoutDay.getSelectedItem();
                                String dateOfDropoutCombined = dropoutYears + "-" + dropoutMonths + "-" + dropoutDays;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int dropoutEnrollmentIDValue = Integer.parseInt(dropoutEnrollmentID);
                                        int dropoutCourseDurationValue = Integer.parseInt(dropoutCourseDurationText);
                                        int dropoutTuitionFeeValue = Integer.parseInt(dropoutTuitionFeeText);
                                        int dropoutRemainingModules = Integer.parseInt(dropoutRemainingModulesText);
                                        int dropoutMonthAttended = Integer.parseInt(dropoutMonthAttendedText);


                                        boolean found = false;
                                        for (Regular student : regularStudents) {
                                                if (student.getEnrollmentId() == dropoutEnrollmentIDValue) {
                                                        found = true;
                                                        if (sharedDropoutStudent == null) {
                                                                sharedDropoutStudent = new Dropout(dateOfBirthCombined, dropoutStudent, dropoutCourseDurationValue, dropoutTuitionFeeValue, dropoutRemainingModules, dropoutMonthAttended, dateOfDropoutCombined);
                                                        }
                                                        sharedDropoutStudent.setHasPaid(true);
                                                        //sharedDropoutStudent.removeStudent();
                                                        JOptionPane.showMessageDialog(null, "All bills cleared!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                        }

                                        if (!found) {
                                                JOptionPane.showMessageDialog(null, "Did not find student", "Error", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }catch (NumberFormatException a) {
                                        // To Display the Error Message To the User
                                        JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });

                // percentage calc button
                percentage.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                // Getting the input values as Strings
                                String enrollmentStr = enrollmentIDTextField.getText();
                                String courseDurationStr = courseDurationTextField.getText();
                                String tuitionFeeStr = tuitionFeeTextField.getText();
                                String numberOfModulesStr = numberOfModulesTextField.getText();
                                String daysPresentStr = daysPresentTextField.getText();
                                String creditHoursStr = numberOfCreditHoursTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dateOfBirthYear = (String) dateOfBirthYears.getSelectedItem();
                                String dateOfBirthMonth = (String) dateOfBirthMonths.getSelectedItem();
                                String dateOfBirthDay = (String) dateOfBirthDays.getSelectedItem();
                                String dateOfBirthCombined = dateOfBirthYear + "-" + dateOfBirthMonth + "-" + dateOfBirthDay;

                                // Getting the selected date values for Date of Enrollment
                                String dateOfEnrollmentYear = (String) dateOfEnrollmentYears.getSelectedItem();
                                String dateOfEnrollmentMonth = (String) dateOfEnrollmentMonths.getSelectedItem();
                                String dateOfEnrollmentDay = (String) dateOfEnrollmentDays.getSelectedItem();
                                String dateOfEnrollmentCombined = dateOfEnrollmentYear + "-" + dateOfEnrollmentMonth + "-" + dateOfEnrollmentDay;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int enrollmentIDValue = Integer.parseInt(enrollmentStr);
                                        int daysPresentValue = Integer.parseInt(daysPresentStr);


                                        boolean found = false;
                                        char grade = 0;
                                        for (Regular student : regularStudents) {
                                                if (student.getEnrollmentId() == enrollmentIDValue) {
                                                        found = true;
                                                        grade = student.presentPrecentage(daysPresentValue);
                                                }
                                        }

                                        if (found) {
                                                JOptionPane.showMessageDialog(null, "Congratulation your grade is: " + grade, "Success", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Did not find student", "Error", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }catch (NumberFormatException a) {
                                        // To Display the Error Message To the User
                                        JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });

                // certificate
                certification.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                // Getting the input values as Strings
                                String enrollmentStr = enrollmentIDTextField.getText();
                                String daysPresentStr = daysPresentTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dateOfBirthYear = (String) dateOfBirthYears.getSelectedItem();
                                String dateOfBirthMonth = (String) dateOfBirthMonths.getSelectedItem();
                                String dateOfBirthDay = (String) dateOfBirthDays.getSelectedItem();
                                String dateOfBirthCombined = dateOfBirthYear + "-" + dateOfBirthMonth + "-" + dateOfBirthDay;

                                // Getting the selected date values for Date of Enrollment
                                String dateOfEnrollmentYear = (String) dateOfEnrollmentYears.getSelectedItem();
                                String dateOfEnrollmentMonth = (String) dateOfEnrollmentMonths.getSelectedItem();
                                String dateOfEnrollmentDay = (String) dateOfEnrollmentDays.getSelectedItem();
                                String dateOfEnrollmentCombined = dateOfEnrollmentYear + "-" + dateOfEnrollmentMonth + "-" + dateOfEnrollmentDay;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int enrollmentIDValue = Integer.parseInt(enrollmentStr);
                                        int daysPresentValue = Integer.parseInt(daysPresentStr);

                                        boolean found = false;
                                        boolean isgranted = false;
                                        for (Regular student : regularStudents) {
                                                if (student.getEnrollmentId() == enrollmentIDValue) {
                                                        found = true;
                                                        char grade = student.presentPrecentage(daysPresentValue);
                                                        if (grade == 'A') {
                                                                isgranted = true;
                                                        }
                                                }
                                        }

                                        if (found) {
                                                if (isgranted) {
                                                        JOptionPane.showMessageDialog(null, "Certificate Granted!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                        JOptionPane.showMessageDialog(null, "Certificate not Granted!", "Error", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Did not find student", "Error", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }catch (NumberFormatException a) {
                                        // To Display the Error Message To the User
                                        JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });
                adding.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                String dropoutStudent = dropoutStudentTextField.getText();
                                String dropoutEnrollmentID = dropoutEnrollmentTextField.getText();
                                String dropoutCourseDurationText = dropoutCourseDuration.getText();
                                String dropoutTuitionFeeText = dropoutTuitionFee.getText();
                                String dropoutRemainingModulesText = dropoutRemainingModules.getText();
                                String dropoutMonthAttendedText = dropoutMonthAttendedTextField.getText();

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfBirthYear = (String) dateOfBirthYearsDropout.getSelectedItem();
                                String dropoutDateOfBirthMonth = (String) dateOfBirthMonthsDropout.getSelectedItem();
                                String dropoutDateOfBirthDay = (String) dateOfBirthDaysDropout.getSelectedItem();
                                String dateOfBirthCombined = dropoutDateOfBirthYear + "-" + dropoutDateOfBirthMonth + "-" + dropoutDateOfBirthDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutDateOfEnrollmentYear = (String) dateOfEnrollmentYearsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentMonth = (String) dateOfEnrollmentMonthsDropout.getSelectedItem();
                                String dropoutDateOfEnrollmentDay = (String) dateOfEnrollmentDaysDropout.getSelectedItem();
                                String dateOfEnrollmentCombined = dropoutDateOfEnrollmentYear + "-" + dropoutDateOfEnrollmentMonth + "-" + dropoutDateOfEnrollmentDay;

                                // Getting the selected date values for Date of Birth
                                String dropoutYears = (String) dropoutYear.getSelectedItem();
                                String dropoutMonths = (String) dropoutMonth.getSelectedItem();
                                String dropoutDays = (String) dropoutDay.getSelectedItem();
                                String dateOfDropoutCombined = dropoutYears + "-" + dropoutMonths + "-" + dropoutDays;

                                try {
                                        // Converting the input Strings to integer using the parseIntValue method
                                        int dropoutEnrollmentIDValue = Integer.parseInt(dropoutEnrollmentID);
                                        int dropoutCourseDurationValue = Integer.parseInt(dropoutCourseDurationText);
                                        int dropoutTuitionFeeValue = Integer.parseInt(dropoutTuitionFeeText);
                                        int dropoutRemainingModules = Integer.parseInt(dropoutRemainingModulesText);
                                        int dropoutMonthAttended = Integer.parseInt(dropoutMonthAttendedText);

                                        boolean found = false;
                                        for (Dropout student : dropoutStudents) {
                                                if (student.getEnrollmentId() == dropoutEnrollmentIDValue) {
                                                        found = true;
                                                        break;
                                                }
                                        }


                                        if (found) {
                                                JOptionPane.showMessageDialog(null, "Student with that Enrollment ID already exist", "Error",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                                Dropout newDropoutStudent = new Dropout(dateOfBirthCombined, dropoutStudent, dropoutCourseDurationValue, dropoutTuitionFeeValue, dropoutRemainingModules, dropoutMonthAttended, dateOfDropoutCombined);
                                                dropoutStudents.add(newDropoutStudent);

                                                JOptionPane.showMessageDialog(null, "Student has been added", "Success",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }catch (NumberFormatException a) {
                                        // To Display the Error Message To the User
                                        JOptionPane.showMessageDialog(openningFrame, "Invalid input! Please enter a valid integer.");
                                }
                        }
                });

                // ActionListener for "clearRegular" button
                clearRegular.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                clearRegularData();
                        }
                });

                // ActionListener for "clearDropout" button
                clearDropout.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                clearDropoutData();
                        }
                });
        }

        // Method to clear the Data of the Regular Student Data
        public void clearRegularData() {
                // Clearing the text fields
                studentTextField.setText("");
                enrollmentIDTextField.setText("");
                courseDurationTextField.setText("");
                tuitionFeeTextField.setText("");
                numberOfModulesTextField.setText("");
                courseNameTextField.setText("");
                numberOfCreditHoursTextField.setText("");
                daysPresentTextField.setText("");
                // Resetting the combo boxes
                dateOfBirthYears.setSelectedIndex(0);
                dateOfBirthMonths.setSelectedIndex(0);
                dateOfBirthDays.setSelectedIndex(0);
                dateOfEnrollmentYears.setSelectedIndex(0);
                dateOfEnrollmentMonths.setSelectedIndex(0);
                dateOfEnrollmentDays.setSelectedIndex(0);
        }

        // Method to clear the data for the Dropout Student Data
        public void clearDropoutData() {
                // Clearing the text fields
                dropoutStudentTextField.setText("");
                dropoutEnrollmentTextField.setText("");
                dropoutCourseName.setText("");
                dropoutCourseDuration.setText("");
                dropoutTuitionFee.setText("");
                dropoutRemainingModules.setText("");
                dropoutMonthAttendedTextField.setText("");

                // Resetting the combo boxes
                dateOfBirthYearsDropout.setSelectedIndex(0);
                dateOfBirthMonthsDropout.setSelectedIndex(0);
                dateOfBirthDaysDropout.setSelectedIndex(0);
                dateOfEnrollmentYearsDropout.setSelectedIndex(0);
                dateOfEnrollmentMonthsDropout.setSelectedIndex(0);
                dateOfEnrollmentDaysDropout.setSelectedIndex(0);
                dropoutYear.setSelectedIndex(0);
                dropoutMonth.setSelectedIndex(0);
                dropoutDay.setSelectedIndex(0);

        }

         // Method to handle actions for Regular Student frame
        public void displayRegularStudentAction() {
                StringBuilder message = new StringBuilder();

                if (regularStudents.isEmpty()) {
                        JOptionPane.showMessageDialog(regularFrame, "No regular students found!");
                        return;
                }

                for (Regular student : regularStudents) {
                        message.append("Student Name: ").append(student.getStudentName())
                                .append("\nCourse name: ").append(student.getCourseName())
                                .append("\nEnrollment ID: ").append(student.getEnrollmentId())
                                .append("\nCourse Duration: ").append(student.getcourseDuration())
                                .append("\nNumber of Modules: ").append(student.getNumOfModules())
                                .append("\nDays Present: ").append(student.getDaysPresent())
                                .append("\nCredit Hours: ").append(student.getNumOfCreditHour())
                                .append("\nTuition Fee: ").append(student.getTuitionFee())
                                .append("\nDate of Birth: ").append(student.getDateofBirth())
                                .append("\nDate of Enrollment: ").append(student.getdateOfEnrollment())
                                .append("\n");
                }

                String resultMessage = message.toString();

                JOptionPane.showMessageDialog(regularFrame, resultMessage);
        }

        public void displayDropoutAction() {
                StringBuilder message = new StringBuilder();

                if (dropoutStudents.isEmpty()) {
                        JOptionPane.showMessageDialog(regularFrame, "No dropout students found!");
                        return;
                }

                for (Dropout student : dropoutStudents) {
                        message.append("Student Name: ").append(student.getStudentName())
                                .append("\nCourse Name: ").append(student.getCourseName())
                                .append("\nDate of Birth: ").append(student.getDateofBirth())
                                .append("\nEnrollment ID: ").append(student.getEnrollmentId())
                                .append("\nDate of Enrollment: ").append(student.getdateOfEnrollment())
                                .append("\nCourse Duration: ").append(student.getcourseDuration())
                                .append("\nTuition Fee: ").append(student.getTuitionFee())
                                .append("\nRemaining Modules: ").append(student.getNumOfRemainingModules())
                                .append("\nMonth Attended: ").append(student.getNumofMonthAttended())
                                .append("\nDate of Dropout: ").append(student.getDateOfDropout())
                                .append("\n");
                }
                String resultMessage = message.toString();
                JOptionPane.showMessageDialog(dropoutFrame, resultMessage);
        }

        public static void main(String[] args) {
                new StudentGUI();
        }
}
