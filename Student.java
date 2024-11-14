public class Student {
private String name = "";
private static int students = 0;
private int ID = 0;
private double grades = 0;
private double gradeTotal = 0;
private double GPA = 0;
private Teacher favoriteTeacher = null;

public Student(String name) {
    this.name = name;
    ID = students;
    students++;
}//A constructor for a new student object
public static void addStudents(int number){
    students += number;
} //Increases the total number of students
public static int getStudentCount(){
    return(students);
} //Returns the total number of students
public String getName(){
    return(this.name);
} // Returns the name of the student
public int getID(){
    return(this.ID);
} // Returns the ID of the student
public void addGrade(int Grade){
    gradeTotal += Grade;
    grades++;
    GPA = gradeTotal / grades;
} //Takes in a grade on a 1-4 scale and recalculates the GPA
public double getGPA(){
    return(this.GPA);
} //Returns the GPA of the student
public void setFavoriteTeacher(Teacher favorite){
    this.favoriteTeacher = new Teacher(favorite.getName(), favorite.getReason());
} //Sets the student's favorite teacher
public Teacher getFavoriteTeacher(){
    return(this.favoriteTeacher);
} //Returns a reference to the student's favorite teacher

}