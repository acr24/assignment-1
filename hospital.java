import java.util.Scanner;

class hospital
{
   public static void main(String args[])
   {
      public Owner[] owners = new Owner[50];
      Pet pet1= new Pet("Dog","sparky","shots");
      Pet pet2 = new Pet("Cat","Whiskers","checkup");
      Pet pet3 = new Pet("Bird","Chico","boarding");
      Owner owner1 = new Owner("Angel","Rosado","acr24@njit.edu","9731112222","1234",Pet[] petArray = new Pet[5]);
      Owner owner2 = new Owner("Sam","Jones","acr25@njit.edu","9731112223","1235",Pet[] petArray = new Pet[5]);
      Owner owner3 = new Owner("Brianna","Michaels","acr26@njit.edu","9731112224","1236",Pet[] petArray = new Pet[5]);
      owners.push(owner1);
      owners.push(owner2);
      owners.push(owner3);
      Scanner scan = new Scanner(System.in);
      System.out.println("Do you want to add to the list of owners? y/n");
      String s = scan.next();
      if(s.equals("y"))
      {
         String s2="y";
         while(s2.equals("y"))
         {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many pets does the owner own? Cannot be more than 5.");
            int numOfPets = Integer.parseInt(scan.next());
            if(numOfPets > 5)
            {
               continue;
            }