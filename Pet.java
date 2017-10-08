class Pet
{
   private String petType,petName,rOV;
   Pet(String type,String name,String visit)
   {
      petType=type;
      petName=name;
      rOV=visit;
    }
    public String toString()
    {
      return petName + "is a "+petType+", and is visiting due to "+rOV;
     }
                                                                                                                  
}