package assessment2;

import java.util.Scanner;

public class StudentScanner {

	public static void main(String[] args) {
		
		//Students s = new Students();
		
		Students s[] = new Students[10];
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Students you want to store: ");
		
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the Name of Student "+(i+1)+":");
			String name = sc.next();
			
			System.out.println("Enter the email of Student "+(i+1)+":");
			String email = sc.next();
			
			System.out.println("Enter the address of Student "+(i+1)+":");
			String address = sc.next();
			
			System.out.println("Enter the phone of Student "+(i+1)+":");
			long phone = sc.nextLong();
			
			System.out.println("Enter the Status of Student "+(i+1)+":");
			String status = sc.next();
			
			Students temp = new Students();
			temp.Stud(name, email, address, phone, status);
			
			 s[i] = temp;
			
		}
		
		System.out.println("Which Student information you want: ");
		int j = sc.nextInt();
		
		System.out.println("Student "+j+":");
		
		System.out.println(s[j-1].name +"\n"+ s[j-1].email +"\n"+ s[j-1].address +"\n"+ s[j-1].phone+"\n"+s[j-1].status);
		
		sc.close();

	}

}
