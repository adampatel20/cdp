/**
 * A class for tracking students in a college. This is a naive approach,
 * just to demonstrate information hiding and the separation of
 * User and Developer roles.
 * @author Leo Irakliotis
 * @version 1.00
 */

public class Student {

    private String fname, lname;
    private String degreeObjective;

    /**
     * Constructor for Student
     * @param fname The first name of the student
     * @param lname The last name of the student
     * @param degreeObjective The degree the student is pursuing
     */
    public Student(String fname, String lname, String degreeObjective) {
        this.fname = fname;
        this.lname = lname;
        this.degreeObjective = degreeObjective;
    } // method Student

    /**
     * Returns grad v. ungrad status with a _properly_
     * prefixed indefinite article (an v. a).
     * @return level School lever for student.
     */
    public String undergradOrGrad() {
        String level;
            if (degreeObjective.equals("Bachelor")) {
                level = "an Undergraduate student";
            } else {
                level = "a Graduate student";
            } // endif
        return level;
    } // method undergradOrGrad

    /**
     * A method to return the student's first and last names
     * @return names A concatenation of fields fname and lname
     */
    public String getNames() {
            String names;
            names = fname+" "+lname;
            return names;
    } // method getNames

} // class Student

