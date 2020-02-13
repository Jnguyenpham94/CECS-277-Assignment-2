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
    super(name,orderingKey); //mimic this for cat too 
    weight = this.weight;

}
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public String store()
    {
        return "";
    }
    public String load()
    {
        return "";
    }
    @Override
    public String speaksBy()
    {
        return "barking"; 
    }

@Override
    public String toString()
    {
return super.toString() + "weight = " + getWeight(); 
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


}