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
    public String getArrayInfo()
    {
      //Pet[] pets = new Pet[arrayOfPets.length];
      //Pet[] pets = arrayOfPets;
      for(int i=0;i<arrayOfPets.length;i++)
      {
         if(arrayOfPets[0]!=null)
            {
               //pets[i]= arrayOfPets[i];
               //return pets[i].toString;
               //System.out.println(arrayOfPets[i].toString());
               //return pets;
               return arrayOfPets[i].toString();
            }
         else
         {
            System.out.println("No pets");
            break;
         }
         //return arrayOfPets[i].toString();
         //return pets[i].toString();
       }
     
      //return arrayOfPets.toString();
      //return pets.toString();
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
      return firstName+" "+lastName+", "+eAddress+", "+idNumber+", "+phoneNumber+", owns "+arrayOfPets.length+" pets";
     }
}

