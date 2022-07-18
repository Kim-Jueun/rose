package chapter5;

public class Test {
	 int studentID;
	    public String studentName;
	    int grade;
	    String address;
	    
	    public String getStudentName() {
	    	return studentName;
	    }
	    
	    public void setStudentName(String studentName) {
	    	this.studentName = studentName;
	    }
	public static void main(String[] args) {
	      Student studentLee = new Student();
	      //studentLee.studentName = "이상원";
	      studentLee.setStudentName("이상원");
 
	      
	      System.out.println(studentLee.getStudentName());
		}
}
