//Assignment 2
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class Dog extends Animal
{
    public Dog(){
        this("Jason"); //defaults 
    }

    public Dog(String name){
        this(name, 5);
    }

    public Dog (String name, int orderingKey)
{
    this(name, orderingKey, 100.0);

}

public Dog(String name, int orderingKey, double weight)
{
    super(name, orderingKey); 
    this.weight = weight;

}
   
@Override
public int compareTo(Animal d) {
    if(!(d instanceof Dog))
    {
        return 1;
    }
    else
    {
        Dog otherDog = (Dog)d;
        int key1 =this.getOrderingKey();
        int key2 =otherDog.getOrderingKey();
        
       if(key1<key2)
       {
           return -1;
       }
       else if(key1==key2)
       {
           return 0;
       }
       else
       {
           return 1;
       } 
    }
    
}

    @Override
    public String speaksBy()
    {
        return "barking"; 
    }

@Override
    public String toString()
    {
        return super.toString() + "weight = " + getWeight() +" "; 
    }
    public double getWeight()
    {
        return weight;
    }

    private double weight;

    @Override
    public String getType() {
        return "Doggie";
    }

    @Override
    public void store()
    {
        System.out.println(toString() + "being stored in coach");
    }

     @Override
    public void load()
    {
        System.out.println(toString() + "being loaded from kennel");
    }

}