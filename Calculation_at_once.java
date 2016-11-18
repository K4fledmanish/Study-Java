class Calculation_at_once{
  public static void main(String[] args){
    int a=10;
    int b=5;                                                                      Output:
    int c=a+b;                                                                    The value is 15
    int d=c-b;                                                                    The value is 10
    int e =d*a;                                                                   The value is 100
    int f=e/b;                                                                    The value is 20
      System.out.println("The value is "+c);
      System.out.println("The value is "+d);
      System.out.println("The value is "+e);
      System.out.println("The value is "+f);
 }
} 

If You want to do calculation in decimal then :

class Calculation_at_once{
  public static void main(String[] args){
    Double a=10;
    Double b=5;                                                                   Output:
    Double c=a+b;                                                                 The value is 15.0
    Double d=c-b;                                                                 The value is 10.0
    Double e =d*a;                                                                The value is 100.0
    Double f=e/b;                                                                 The value is 20.0
      System.out.println("The value is "+c);
      System.out.println("The value is "+d);
      System.out.println("The value is "+e);
      System.out.println("The value is "+f);
 }
} 
