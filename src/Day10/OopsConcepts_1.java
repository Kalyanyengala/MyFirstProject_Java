package Day10;

public class OopsConcepts_1 

{ 
	int eid;                        // variables
	String name;
	String job;
	int salary;
	
    void display() {                           // user display
		
		System.out.println(eid);
		System.out.println("Name");
		System.out.println("job");
		System.out.println("salary");	
	}
	
	public static void main(String[] args)        // main metods
	
	{
		OopsConcepts_1 emp1=new OopsConcepts_1();  // methods
		
		emp1.eid =102;
		emp1.name="renu";
		emp1.job="engineer";
		emp1.salary= 40000;
		
		emp1.display();
		
		
		
		OopsConcepts_1 emp2=new OopsConcepts_1();  // methods 
		
		emp2.eid=102;
		emp2.name="pavan";
		emp2.job="tester";
		emp2.salary=30000;
		
		emp2.display();
		
		

	}

} 
