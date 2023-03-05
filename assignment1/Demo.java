import java.util.Scanner;
public class Demo {
  public static void main(String[] args) {
char select;
        Scanner sc=new Scanner(System.in);

    Geometry obj=new Geometry();
    Geometry obj1=new Geometry();
    Geometry obj2=new Geometry();
    
    System.out.println("Geometry Calculator");
    System.out.println("1.Calculate the Area of a Circle");
    System.out.println("2.Calculate the Area of a Rectangle");
    System.out.println("3.Calculate the Area of a Triangle");
    System.out.println("4.Quit");

    System.out.println("Enter your choice (1-4) :");
    int choice=sc.nextInt();
    
    if(choice==2) {
      
      System.out.println("please enter length:");
      double length=sc.nextDouble();
      
      System.out.println("please enter width:");
      double width=sc.nextDouble();
      
      double rec=obj.geAresOfRec(length,width);
      
      System.out.println("The areaof the rectangleis"+rec);
      
      
        
    }else if(choice==1) {
      System.out.println("please enter radius:");
      double radius=sc.nextDouble();
      
      double rad=obj1.getAreaOfCircle( radius);
      
      System.out.println("area of the circle "+rad);
    }else if (choice==3) {
      System.out.println("please enter Base:");
      double base=sc.nextDouble();
      
      System.out.println("please enter width:");
      double widthT=sc.nextDouble();
      
      double trang=obj2.getAreaTrangle(base,widthT);
      
      System.out.println("The areaof the Triangle :"+trang);
      
    }else {
      System.out.println("You are quited");
      return;
    }
    
    System.out.println("Do you need to continue (y/n):");
    select=sc.next().charAt(0);
  
while(select=='y'||select=='Y') {

System.out.println("Geometry Calculator");
    System.out.println("1.Calculate the Area of a Circle");
    System.out.println("2.Calculate the Area of a Rectangle");
    System.out.println("3.Calculate the Area of a Triangle");
    System.out.println("4.Quit");
	
	System.out.println("Enter your choice (1-4) :");
    choice=sc.nextInt();

  if(choice==2) {
    
    System.out.println("please enter length:");
    double length=sc.nextDouble();
    
    System.out.println("please enter width:");
    double width=sc.nextDouble();
    
    double rec=obj.geAresOfRec(length,width);
    
    System.out.println("The areaof the rectangleis"+rec);
    
    
      
  }else if(choice==1) {
    System.out.println("please enter radius:");
    double radius=sc.nextDouble();
    
    double rad=obj1.getAreaOfCircle( radius);
    
    System.out.println("area of cicle"+rad);
    
    
  }else if (choice==3) {
    System.out.println("please enter Base:");
    double base=sc.nextDouble();
    
    System.out.println("please enter width:");
    double widthT=sc.nextDouble();
    
    double trang=obj2.getAreaTrangle(base,widthT);
    
    System.out.println("The areaof the Triangle :"+trang);
    
  }else {
    System.out.println("You are quited");
    return;
  }
  
  System.out.println("Do you need to continue (y/n):");
  select=sc.next().charAt(0);
  
} System.out.println("Thank you");
}}