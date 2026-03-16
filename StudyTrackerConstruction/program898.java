import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.io.*;

class StudyLog
{
    private LocalDate Date;
    private String subject;
    private double duration;
    private String description;

    public StudyLog(LocalDate a, String b,double c,String d)

    {
        this.Date = a;
        this.subject = b;
        this.duration = c;
        this.description = d;

    }
    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.subject;
    }
    public double getduration()
    {
        return this.duration;
    }

    public  String getDescription()
    {
        return this.description;
    }
    @Override
    public String toString()
    {
        return Date+"|"+subject+"|"+duration+"|"+description;

    }
}
class StudyTracker
{
    public ArrayList <StudyLog> database = new ArrayList <StudyLog> ();
    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------Enter Valid details of your study---------------");
        System.out.println("----------------------------------------------------------------");

        LocalDate dateobj = LocalDate.now();

        System.out.println("Please Enter the name of subject like c/c++/java/python");
        String sub = sobj.nextLine();
        
        System.out.println("Enter the time period of study in hours");
        double dur = sobj.nextDouble();

        System.out.println("please provide the description of your study");
        String des = sobj.next();

        StudyLog studyobj = new StudyLog(dateobj, sub, dur, des);

        database.add(studyobj);

        System.out.println("Study log gets stored successfully..");

        System.out.println("----------------------------------------------------------------");




    }
    public void DisplayLog()
    {
         System.out.println("----------------------------------------------------------------");
         System.out.println("------------Log report of arvellous study track-----------------");
        System.out.println("----------------------------------------------------------------");

         for(StudyLog s : database)
         {
            System.out.println(s);

         }
        System.out.println("----------------------------------------------------------------");

    }

}

class program898

{
    public static void main(String A[]) 
    {
       StudyTracker stobj = new StudyTracker(); 
       
       stobj.InsertLog();
       stobj.DisplayLog();
          
    }
}