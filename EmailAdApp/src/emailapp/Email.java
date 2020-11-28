package emailapp;
import java.util.Scanner;
public class Email {
		private String firstname;
		private String lastname;
		private String department;
		private String password;
		private int mailboxcapacity=500;
		private String alteremail;
		private String email;
		private int defaultpassword=10;
		private String companySuffix="bighitentertainment.com";
		//constructor for receiving firstname & lastname 
		
		public Email(String firstname, String lastname) {
			this.firstname=firstname;
			this.lastname=lastname;
			
			
			this.department=setdepartment();
			System.out.println("Department: " +this.department);
			
			this.password=randompassword(defaultpassword);
			System.out.println("Your password is :" + this.password);
			
			email=firstname.toLowerCase()+""+lastname.toLowerCase()+"@"+ department + companySuffix;
			
			
		}
		
		//ask for the department
		public String setdepartment() {
			System.out.println("New worker " + firstname + " the Department Codes:\n1. Sales\n2. Development \n3. Accounting \n4. None" );
			Scanner in =new Scanner(System.in);
			int dtchoice = in.nextInt();
			if(dtchoice==1) {return "Sales";}
			else if(dtchoice==2) {return "Development";}
			else if(dtchoice==3) {return "Accounting";}
			else {return "";}
		}
		//generate random password
		public String randompassword(int length) {
			String passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#%*";
			char[]password=new char[length];
			for(int i=0;i<length;i++) {
				int rand=(int)(Math.random()*passwordset.length());
				password[i]=passwordset.charAt(rand);
			}
			return new String(password);
		}
		//set mail box capacity
		public void setmailcapacity(int capacity) {
			this.mailboxcapacity=capacity;
		}
		//change the password
		public void changepassword(String password) {
			this.password= password;
		}
		//set alternate email
		public void setalternateemail(String altemail) {
			this.alteremail=altemail;
		}
		//get mail box capacity
		public int getmailboxcapacity() {
			return mailboxcapacity;
		}
		public String getalternatemail() {
			return alteremail;
		}
		public String getpassword() {
			return password;
		}
		//print the whole information
		public String Showinfo() {
			return "DISPLAY"+ "\nName " +firstname +" "+lastname + "\nCompany Email :" +email +"\nMailbox Capacity: " + mailboxcapacity + "" + "mb" ;
		}
		
		

	}


