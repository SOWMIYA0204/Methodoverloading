package startproject;

//
//prgm 1
public class Methodoverloading 
{
	void  add(int a,int b)
	{
	
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
	    System.out.println(a+b);
	}
	void add(int a,float b)
	{
		System.out.println(a+b);
	}
	double add(double a,double b)
	{
		return a+b;
	}
	
	
	
	
	
   public static void main(String[] args)
   {
	  //class 1 
	   Methodoverloading m=new Methodoverloading();
	 //class 2  
	   Sowmiya s=new Sowmiya();
	   Bungalow b=new Bungalow();
	   
	   m.add(10.0f,30.0f);  
	   m.add(20,30.0f);
	   System.out.println(m.add(50.0,40.0));
	   s.topper();
	   s.topper(10);
	   s.topper(20.0,30.0);
	   b.construction(10.0f,20.0f);
	   b.construction(20,30);
	   
	   }
}
//class 2
	
   class Sowmiya
	{
		void topper()
		{
			
			System.out.println("By birth she is golden one");
		}
		void topper(int a)
		{
			System.out.println("In 1st Standard");
		}
		void topper(int a,float b)
		{
			System.out.println("In 2 nd standard she is the topper");
		}
		void topper(int a,int b,int c)
		{
			System.out.println("In 3 rd standard she is the topper");
		}
		void topper(double a,double b)
		{
			System.out.println("In Academics she is the best");
		}
	}
      
   class Bungalow
   {
	   void construction()
	   {
		   System.out.println("We need Good Basement");
	   }
	   void construction(int a,int b) 
	   {
		   System.out.println("We need good rods and construction things");
	   }
	   void construction(float a,float b)
	   {
		   System.out.println("The finishing should be good");
	   }
   }
   
   
  
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
