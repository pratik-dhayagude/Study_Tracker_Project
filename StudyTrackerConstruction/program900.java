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
    public ArrayList <StudyLog>database = new ArrayList<StudyLog>();
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
         if(database.isEmpty())
         {
           
            System.out.println("---------------------Nothing to Display-------------------------");
            System.out.println("----------------------------------------------------------------");
            return;
         }
         System.out.println("------------Log report of arvellous study track-----------------");
         System.out.println("----------------------------------------------------------------");

         for(StudyLog s : database)
         {
            System.out.println(s);

         }
        System.out.println("----------------------------------------------------------------");

    }
    public void ExportCSV()
    {
         if(database.isEmpty())
         {
            System.out.println("----------------------------------------------------------------");
            System.out.println("---------------------Nothing to Export--------------------------");
            System.out.println("----------------------------------------------------------------");
            return;
         }

         String Filename = "MarvellousStudyTracker.CSV";

         try(FileWriter fwobj = new FileWriter(Filename))
         {
            fwobj.write("date,subject,duration.,description\n");
            for(StudyLog s : database)
            {
                fwobj.write(s.getDate()+","+
                            s.getSubject().replace(","," ")+
                            ","+s.getduration()+
                            ","+s.getDescription().replace(","," ")+"\n");

                System.out.println("Data gets exported in csv"+Filename);

            }
         }
         catch(Exception eobj )
         {
            System.out.println("Exception occured in csv handling");

         }
    }

    public void SummaryByDate()
    {
        

    }
    public void SummaryBySubject()
    {
        
    }

}

class program900

{
    public static void main(String A[]) 
    {
       Scanner sobj = new Scanner(System.in);
       StudyTracker stobj = new StudyTracker();


       System.out.println("----------------------------------------------------------------");
       System.out.println("--------------Welocome to marvellous study tracker--------------");
       System.out.println("----------------------------------------------------------------");

       int iChoise =0;

       do
       {
            System.out.println("Please select approprite optation");
            System.out.println("1:Insert new study log");
            System.out.println("2:view all study log");
            System.out.println("3:Export study log to csv file");
            System.out.println("4:Summary of study log by date");
            System.out.println("5:Summary of study log by subject");
            System.out.println("6:Exit they application");

            iChoise = sobj.nextInt();

            switch (iChoise)
             {
                case 1:
                        // insert new study log
                        stobj.InsertLog();
                        break;
                    
                case 2 :
                        // view all study log 
                        stobj.DisplayLog();
                        break;
                        
                case 3 :
                       //Export study log to csv file
                        stobj.ExportCSV();
                        break;
                case 4 :
                    //Summary of study log by date
                     stobj.SummaryByDate();
                     break;

                case 5 :
                    //Summary of study log by subject
                    stobj.SummaryBySubject();
                    break;

                case 6 :
                    // Exit the application
                     System.out.println("----------------------------------------------------------------");
                     System.out.println("-----------Thanku for using Marvellous study tracker------------");  
                     System.out.println("----------------------------------------------------------------");
                    break;
            
                default:
                    System.out.println("Please Enter the vaild optation");
                    break;
            }

       }while(iChoise != 6);// End of do while


          
    }// End of main 
}//end of starter class