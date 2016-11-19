class Calculation_at_once{
  public static void main(String[] args){
    int a=10;
    int b=5;                                                                      
    int c=a+b;                                                                    
    int e =d*a;                                                                   
    int f=e/b;                                                                    Output:
      System.out.println("The value is "+c);                                      The value is 15
      System.out.println("The value is "+d);                                      The value is 10
      System.out.println("The value is "+e);                                      The value is 20
      System.out.println("The value is "+f);                                      The value is 100
 }
} 

If You want to do calculation in decimal then :

class Calculation_at_once{
  public static void main(String[] args){
    Double a=10;
    Double b=5;                                                                   
    Double c=a+b;                                                                 
    Double d=c-b;                                                                 
    Double e =d*a;                                                                
    Double f=e/b;                                                                 Output:
      System.out.println("The value is "+c);                                      The value is 15.0
      System.out.println("The value is "+d);                                      The value is 10.0
      System.out.println("The value is "+e);                                      The value is 100.0
      System.out.println("The value is "+f);                                      The value is 20.0
 }
} 
