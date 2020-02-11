public abstract class Animal implements Comparable, Talkable, Storable
{ 
    public Animal(String name, int orderingKey) {
        name = this.name;
        orderingKey = this.orderingKey;
	}
	public abstract String getType();

    private String name;
    private int orderingKey;
    
}