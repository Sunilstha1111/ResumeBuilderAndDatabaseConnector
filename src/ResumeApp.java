
import java.util.Scanner;

public class ResumeApp {
	public static void main (String[] args){
		
  	  Scanner sc = new Scanner(System.in); 	 
  	 
  	  String eduAll="";
  	  String workAll="";
  	  String skillAll="";
  	  
  	  String[] Edu_Achievements;
  	  Edu_Achievements = new String[10];
  	  String Education;
  	  
  	  String[] Experience;
  	  Experience = new String[10];
  	  String Work_Experience;
  	  
  	  String[] Skill_Ratings;
  	  Skill_Ratings = new String[20];
  	  String Skills;
  	  
  	  int i = 1;
  	  int i1 = 0;
  	  int i2 = 1;
  	  
  	  System.out.println("Enter you name:");
  	  String name = sc.nextLine();
  	  
  	  
  	  System.out.println("\nEnter your email:");
  	  String email = sc.nextLine();
  	  
  	  
  	  
  	  
  	  System.out.println("How many education acheivements do you have? You can input at max 10.");
  	  int num = sc.nextInt();
  	  sc.nextLine();
  	  
  	 
  	   while (i < (num+1)){
  		  System.out.println("Enter your degree:");
  		  String degree = sc.nextLine();
  		  System.out.println("Enter your university:");
  		  String University = sc.nextLine();
  		  System.out.println("Enter your Graduation Year:");
  		  int GraduationYear = sc.nextInt();
  		  sc.nextLine();
  		  Education= degree +","+"\n"+University+", "+GraduationYear+"\n"; 
  		  Edu_Achievements[i] = Education; 
  		  eduAll += Education;
  		  i++;
  	   }
  	 
  	   System.out.println("How many work experience do you have? You can input at max 10.");
  	   int num1 = sc.nextInt();
  	   sc.nextLine();
  	 
  		 
  	   while(i1 < num1)
  		 {
  			 if (num1 > 0)
      		 {   
  				 System.out.println("Enter your Job name:");
      			 String JobName = sc.nextLine();
      			 System.out.println("Enter your Company name:");
          		 String Company = sc.nextLine();
      			 System.out.println("Enter your Tenure of work::");
          	     String date = sc.nextLine(); 
          	     System.out.println("Enter your Job1:");
          		 String Job1 = sc.nextLine();
          		 System.out.println("Enter your Job2:");
          		 String Job2 = sc.nextLine();
          		 Work_Experience = JobName +", "+"\n"+Company+", " +date+"\n-Duty 1, "+Job1+ "\n-Duty 2, "+Job2 +"\n";
          		 Experience[i1] = Work_Experience;
          		 workAll += Work_Experience;
          		 i1++;
      		 }
      		  
  		 }
  		 
  	 
  	 
  	 System.out.println("How many skills do you have? You can input at max 20.");
  	 int num2 = sc.nextInt();
  	 sc.nextLine();
  	 
  	 while (i2 < (num2+1))
  	 { 
  		 System.out.println("Enter your skills:");
  		 String skills = sc.nextLine();
  		 System.out.println("Enter your ratings:");
  		 String ratings = sc.nextLine();
  		 Skills = skills + ", "+ ratings+"\n";
  		 Skill_Ratings[i2] = Skills;
  		 skillAll += Skills;
  		 
  		 i2++;
  	 }
  	 
  	 //Output
  	 System.out.println("Resume");
  	 System.out.println("=======================================================================================================");
  	 System.out.println(name);
  	 System.out.println(email);
  	 
  	 
  	 System.out.println("\nEducation");
  	 System.out.println("-----------------------------------------------------------------------------------------------------");
  	 for (i = 1; i <(num+1); i++)
  	 {
			  System.out.println(Edu_Achievements[i]);
  	 }
	     
  	 
  	 System.out.println("\nExperience");
  	 System.out.println("-----------------------------------------------------------------------------------------------------");
  	 
  	 if (num1 == 0)
		 {
			 Experience[i1] = "No work experience";
			 System.out.println(Experience[i1]);
					 
		 }
  	 for (i1 = 0; i1 < num1; i1++)
	     {
	    	System.out.println(Experience[i1]);
	      }
  	 
  	 System.out.println("\nSkills");  
  	 System.out.println("------------------------------------------------------------------------------------------------------");
  	 for (i2 = 1; i2 < (num2+1); i2++)
  	 {
  		 System.out.println(Skill_Ratings[i2]);
  	 }
  	
  	 
  	 ConnectToSQL cts = new ConnectToSQL();
  	 cts.connect(name, email, eduAll, workAll, skillAll);
		
		

        
  	}
	}
  	  
    



