package assessment2;

public class Trainer {
	
	// Task 1
			int id;
			String name,course,email;
			
			public Trainer(String t_name, String t_course, String t_email, int c_id)
			{
				name = t_name;
				course = t_course;
				email = t_email;
				id = c_id;
			}

	public static void main(String[] args) {
		
		Trainer t1 = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer t2 = new Trainer("Hitesh","Dev","hitesh@gmail.com",2);
		Trainer t3 = new Trainer("Mukesh","Devops","mukesh@gmail.com",3);
		
		// Task 2
		Trainer t[] = {t1,t2,t3};
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Trainer "+(i+1)+":");
		
			System.out.println(t[i].name +" "+ t[i].course +" "+ t[i].email +" "+ t[i].id +" "+ "\n");
		}
		

	}

}
