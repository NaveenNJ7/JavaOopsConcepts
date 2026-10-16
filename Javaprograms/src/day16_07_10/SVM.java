package day16_07_10;

public class SVM extends RCU {

	void svm(String sname, int id, String cname)
	{
		System.out.println("Student name : "+sname);
		
		System.out.println("id : "+id);
		
		System.out.println("College name : "+cname);
	}
	
	public static void main(String[] args) {
		
		SVM college = new SVM();
		
		college.svm("Raju", 110, "SVM");
		
		System.out.println("University name : "+college.uname);
	}
}
