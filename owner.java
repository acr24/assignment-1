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
      return id;
    } 
    public String getArrayInfo()
    {
      for(int i=0;i<=arrayOfPets.length;i++)
      {
         return arrayOfPets[i].toString;
      }
    public void addPet(Pet newPet)
    {
     
      for(int i = 0; i<arrayOfPets.length(); i++)
      {
         if(i==arrayOfPets.length()-1)
         {
            arrayOfPets[i]=newPet;
          }
         else if(i==arrayOfPets.length())
         {
            System.out.println("Each owner can only check in five pets");
          }
       }
     }
      
    public String toString()
    {
      return firstName+" "+lastName+", "+eAdress+", "+idNumber+", owns "+arrayOfPets.lenght()+" pets";
     }
}