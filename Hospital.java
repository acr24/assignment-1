import java.util.Scanner;

class Hospital
{
   public static void main(String args[])
   {
      Owner[] owners = new Owner[50];
      Pet pet1= new Pet("Dog","sparky","shots");
      Pet pet2 = new Pet("Cat","Whiskers","checkup");
      Pet pet3 = new Pet("Bird","Chico","boarding");
      Pet[] petArray = new Pet[5];
      petArray[0]=pet1;
      petArray[1]=pet2;
      petArray[2]=pet3;
      Owner owner1 = new Owner("Angel","Rosado","acr24@njit.edu","9731112222","1234",petArray);
      Owner owner2 = new Owner("Sam","Jones","acr25@njit.edu","9731112223","1235",petArray);
      Owner owner3 = new Owner("Brianna","Michaels","acr26@njit.edu","9731112224","1236",petArray);
      owners[0]=owner1;
      owners[1]=owner2;
      owners[2]=owner3;
      Scanner scan = new Scanner(System.in);
      System.out.println("Do you want to add to the list of owners? y/n");
      String s = scan.next();
      if(s.toLowerCase().equals("y"))
      {
         String s2="y";
         while(s2.toLowerCase().equals("y"))
         {
            System.out.println("How many pets does the owner own? Cannot be more than 5.");
            int numOfPets = Integer.parseInt(scan.next());
            if(numOfPets > 5)
            {
               continue;
            }
            System.out.println("Please enter owner's first name: ");
            String fName = scan.next();
            System.out.println("Please enter ownder's last name: ");
            String lName = scan.next();
            System.out.println("Please enter email address: ");
            String email = scan.next();
            if(!(email.contains("@")&& email.contains(".")))
            {
               System.out.println("Invalid email address");
               continue;
            }
            System.out.println("Please enter phone number: ");
            String pNumber = scan.next();
            if(!(pNumber.matches("[0-9]+") && pNumber.length()==10))
            {
               System.out.println("Invalid phone number");
               continue;
            }
            System.out.println("Please enter ID number: ");
            String id = scan.next();
            if(!(id.matches("[0-9]+") && id.length()==4))
            {
               System.out.println("Invalid ID number");
               continue;
            }
            Pet[]petArray1 = new Pet[numOfPets];
            for(int k = 3;k<owners.length;k++)
            {
            for(int i = 0; i==numOfPets; i++)
            {
              System.out.println("What type of pet do you have? ");
              String type = scan.next();
              System.out.println("What is the name of your pet?; ");
              String name = scan.next();
              System.out.println("Reason for visit?: ");
              String reason = scan.next();
              if(type.matches("[0-9]+")||name.matches("[0-9]+")||reason.matches("[0-9]+"))
              {
                System.out.println("Invalid input");
                continue;
              }
              petArray1[i]= new Pet(type,name,reason);
             }
             owners[k]=new Owner(fName,lName,email,pNumber,id,petArray);
             }
             System.out.println("Would you like to add another owner entry? y/n: ");
             s2 = scan.next();
          }
       }
       String idSearch;
       System.out.println("Do you want to see the entire list or search?: list or search");
       idSearch = scan.next();
       if(idSearch.toLowerCase().equals("list"))
       {
         for(int i = 0; i<owners.length;i++)
         {
            if(owners[i]!=null)
            {
                System.out.println(owners[i].toString());
               //System.out.println(owners[i].getArrayInfo());
               owners[i].getArrayInfo();
              
            }
            
         }
       }
       if(idSearch.toLowerCase().equals("search"))
       {
         String idNumberSearch;
         System.out.println("Please enter ID number: ");
         idNumberSearch=scan.next();
         for(int i=0;i<owners.length;i++)
         {
               if(owners[i].getId().equals(idNumberSearch)&&owners[i]!=null)
               {
                  owners[i].toString();
                  owners[i].getArrayInfo();
               }
               else
               {
                  System.out.print("ID not found");
                  break;
               }
            

         }
       }
   }
}
              

            