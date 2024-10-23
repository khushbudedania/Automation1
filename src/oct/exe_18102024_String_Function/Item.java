package oct.exe_18102024_String_Function;

public class Item  {

    private String desc;
    public String getDescription()
    {
        return desc;
    }
    public void setDescription(String desc)
    {
        this.desc = desc;
    }
    public static void modifyDesc(Item item, String desc)
    {
        item = new Item();
        item.setDescription(desc);

    }

    public static void main(String [] args) {

        Item it = new Item();
        it.setDescription("Blue");

        Item it2 = new Item();
        it2.setDescription("Red");

        modifyDesc(it,"Green");
       // it.setDescription("Green");// because they modify but don't set the value.


        System.out.println(it.getDescription());
        System.out.println(it2.getDescription());

    }
    }
//interview question
//What will be output by the following code?
//A) Compilation fails
//B)  Blue
//    Red
//C)  Green
//    Red
