public class MaximumOcurringChar{
 static final int size=256;
  static char world(String str){
    int count[]= new int [size];
    int len=str.length();
    for(int i=0; i<len; i++){
      count[str.charAt(i)]++;
    }
    int max=-1;
    char result=' ';
    for(int i=0;i<len;i++)
      {
        if(max<count[str.charAt(i)])
        {
          max=count[str.charAt(i)];
          result=str.charAt(i);
        }
      }
    return result;
      
  }
  

  public static void main(String args[]) { 
    String str="Java bolte";
    System.out.println("max time occured:- "+world(str));
}}