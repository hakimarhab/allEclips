package review;

public class Hakima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		average(20, 80, 70);
		messageForeStudents();
		TotalAccumulatedPoints(20,80, 70, "Kasdi");
	}
	// Method with argument
	public static void average (int math, int science, int English) {
			
		int A=math;
		int B=science;
		int C=English;
        int total=A+B+C;
        float av=total/3;
        System.out.println("the average is ="+av);
        
        
	}
    // Method without argument
	public static void messageForeStudents() {
		System.out.println("welcome to the classroom");
	}
	// Method with a return
	public static int TotalAccumulatedPoints(int math, int science, int English, String StudentName) {
	
		int A=math;
		int B=science;
		int C=English;
        int total=A+B+C;
        System.out.println(" The total Point Accumulated by Student "+StudentName+" is= "+total);
        return total;
		
	}
}


