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
       this.color = color; 
    }


    @Override
    public int compareTo(Object c) {
        if(!(c instanceof Cat))
        {
            return 1;
        }
        else
        {
            Cat otherCat = (Cat)c;
            int key1 = 0 - this.getOrderingKey();
            int key2 = 0 - otherCat.getOrderingKey();
            
           if(key1<key2)
           {
               return -1;
           }
           else if(key1==key2)
           {
               return 0;
           }
           else return 1;
        }
        
    }
@Override
    public void store()
    {
        System.out.println(toString() + "being stored in first class"); 

    }
    @Override
    public void load()
    {
        System.out.println(toString() + "being loaded into wooden box");
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
        return super.toString() + "color = " + getColor() +" "; 
    }

    public String getColor()
    {
        return color;
    }

    public int getOrderingKey()
    {
        return super.getOrderingKey();
    }
    private String color;
}