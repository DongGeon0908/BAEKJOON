package aaaaaaaaaaa;


public class Student {
   protected String name;
   protected int number;
   protected int midEx;
   protected int finalEx;
   protected int homeWork;
   
   //������
   public Student(int Snumber, String Sname, int SmidEx, int SfinalEx, int ShomeWork)
   {
      number=Snumber;
      name=Sname;
      midEx=SmidEx;
      finalEx=SfinalEx;
      homeWork=ShomeWork;
   }
   
   //������
   public String getStudentName()
   {
	   return name;
   }
   public int getStudentNumber()
   {
	   return number;
   }
   public int getStudentMidEx()
   {
	   return midEx;
   }
   public int getStudenFinalEx()
   {
	   return finalEx;
   }
   public int getStudentHomeWork()
   {
	   return homeWork;
   }
   //������
   public void setStudentName(String name)
   {
      this.name = name;
   }
   public void setStudentNumber(int number)
   {
	   this.number = number;
   }
   public void setStudentMidEx(int midEx)
   {
	   this.midEx = midEx;
   }
   public void setStudentFinalEx(int finalEx)
   {
	   this.finalEx = finalEx;
   }
   public void setStudentHomeWork(int homeWork)
   {
	   this.homeWork = homeWork;
   }
   //���
   double getAverage()
   {
      return (midEx + finalEx + homeWork) / 3 ;
   }
   public String toString() {
	   return name+ " \t" + number + " \t" + midEx+ " \t" + finalEx+ " \t" + homeWork + "\n";
   }
   
}
