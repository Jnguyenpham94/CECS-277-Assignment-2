public abstract class Animal implements Comparable, Talkable, Storable
{ 
    public Animal(String name, int orderingKey) {
        
        this.name = name; 
        this.orderingKey = orderingKey;

	}
    public abstract String getType();
    public abstract void store();
    public abstract void load();
    
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