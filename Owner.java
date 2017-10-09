class Owner
{
   private String firstName,lastName,eAddress,phoneNumber,idNumber;
   private Pet[] arrayOfPets = new Pet[5];
   Owner(String fName,String lName, String email, String phone,String id,Pet[] petArray)
   {
      firstName=fName;
      lastName=lName;
      eAddress=email;
      phoneNumber=phone;
      idNumber=id;
      arrayOfPets=petArray;
    }
    public String getId()
    {
      return idNumber;
    } 
    public void getArrayInfo()
    {
      //String[] pets = new String[arrayOfPets.length];
      //Pet[] pets = arrayOfPets;
      for(int i=0;i<arrayOfPets.length;i++)
      {
         if(arrayOfPets[0]!=null&&arrayOfPets.length>0)
            {
               //return arrayOfPets.toString();
               //pets[i]= arrayOfPets[i].toString();
               //return pets[i].toString();
              // System.out.println(arrayOfPets[i].toString());
             
               //return pets;
               //return this.arrayOfPets[i].toString();
               
            }
         else
         {
            System.out.println("end of file");
            break;
         }
         System.out.println(arrayOfPets[i].toString());
         
       }
     
         //return arrayOfPets[i].toString();
     
    }
    public void addPet(Pet newPet)
    {
     
      for(int i = 0; i<arrayOfPets.length; i++)
      {
         if(i==arrayOfPets.length-1)
         {
            arrayOfPets[i]=newPet;
          }
         else if(i==arrayOfPets.length)
         {
            System.out.println("Each owner can only check in five pets");
          }
       }
     }
      
    public String toString()
    {
      int length=0;
      for(int i=0;i<arrayOfPets.length;i++)
      {
         if(arrayOfPets[i]==null)
         {
            continue;
          }
          else
          {
            length++;
          }
      }
      return firstName+" "+lastName+", "+eAddress+", "+idNumber+", "+phoneNumber+", owns "+integer.toString(length)+" pets";
     }
}

