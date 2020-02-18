public abstract class Animal implements Comparable<Animal>, Talkable, Storable
{ 
    public Animal(String name, int orderingKey) {
        
        this.name = name; 
        this.orderingKey = orderingKey;

	}
    public abstract String getType();
    
    public String getName()
    {
        return "(" + name + "," + orderingKey + "), ";
    }

    public String toString()
    {
        return getName(); 
    }

    public int getOrderingKey()
    {
        return orderingKey;
    }

    private String name;
    private int orderingKey;
}