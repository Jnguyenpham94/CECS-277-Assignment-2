public abstract class Animal implements Comparable, Talkable, Storable
{ 
    public Animal(String name, int orderingKey) {
        name = this.name;
        orderingKey = this.orderingKey;
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
    private String name;
    private int orderingKey;
    
}