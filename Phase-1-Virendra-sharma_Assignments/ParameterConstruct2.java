package Methods;

public class ParameterConstruct2 {
		String name;
	    int age;
	    char section;
	    char gender;
	    int subject1;
	    int subject2;
	    int subject3;
	    
	    ParameterConstruct2(String n, int a, char s, char g, int s1, int s2, int s3){
	        name = n;
	        age = a;
	        section = s;
	        gender = g;
	        subject1 = s1;
	        subject2 = s2;
	        subject3 = s3;
	    }
	    public int marks(){
	        return subject1+subject2+subject3;
	    }
	    public float percentage(){
	        return (marks()*100)/300;
	        
	    }
	    public static void main(String[] args) {
	    	ParameterConstruct2 s1 = new ParameterConstruct2("john", 24, 'A','M', 77,79,89);
	    	ParameterConstruct2 s2 = new ParameterConstruct2("Nick", 29, 'B','M', 0,56,65);
	    	ParameterConstruct2 s3 = new ParameterConstruct2("Tom", 21, 'A','M', 0,89,66);
	    	ParameterConstruct2 s4 = new ParameterConstruct2("Gosh", 24, 'B','F', 79,98,87);
	        
	        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
	        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
}
}
