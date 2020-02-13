public class Cat extends Animal
{
    public Cat()
    {
        this("Fluffy");
    }
    public Cat(String name)
    {
        this(name, 150);
    }
    public Cat(String name, int orderingKey)
    {
        this(name, orderingKey, "pink" );
    }
    public Cat(String name, int orderingKey, String color)
    {
        super(name, orderingKey);
        color = this.color; 
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
        return "meowing"; 
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Kitty";
    }

    @Override
    public String toString()
    {
        return ""; 
    }

    private String color;
}