import java.util.ArrayList;
public class ImplementList {
    ArrayList<Integer> arraylist = new ArrayList<Integer>();

    protected void addElement(int num)
    {

        arraylist.add(num);
    }
    protected void removeElement(int num)
    {
        arraylist.remove(new Integer(num));

    }
    protected int getIndex(int num)
    {
        return arraylist.indexOf(num);
    }
    protected void print()
    {
        System.out.println(arraylist);
    }
}
