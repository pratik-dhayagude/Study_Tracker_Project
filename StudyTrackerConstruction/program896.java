import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.io.*;

//done
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

class program896

{
    public static void main(String A[]) 
    {
       

        LocalDate lobj = LocalDate.now();

        StudyLog sobj = new StudyLog(lobj, "C Programming",4.2,"Advanced pointer and array");

        System.out.println(sobj);




       
          
    }
}