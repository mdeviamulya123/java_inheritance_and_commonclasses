package java_inheritance_commonclasses_Pe3;



import java.util.Scanner;


class Pe3
{
   public static void main(String args[])
   {
int n,i;

String strNew;

      System.out.println("Enter the number of places");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();

      String a[]=new String[n];

 System.out.println("Enter the list of places");

for( i=0;i<a.length ;i++){

     
      a[i] = in.nextLine();

}


for( i=0;i<a.length ;i++){

	strNew = a[i].replaceAll("[aeiouAEIOU]", "");

     System.out.println("Place Name without vowels: "  + strNew);

     
}



}
}
