
public class elevator
{

    private int top_floor;
    private int current_floor;
    private int bottom_floor;

    public elevator() 
    {
        current_floor = 0;
        top_floor = 11;
        bottom_floor = 0;

    }

    public void ascend ()
    {
        if (current_floor < top_floor){
            current_floor = current_floor +1;
        }
        else {System.out.println("sorry you are already at the top floor");
        }
    }

    public void decend()
    {
        if(current_floor > bottom_floor){
            current_floor = current_floor -1;
        }
        else { 
            System.out.println("sorry you are already at the bottom floor");

        }
    }
}
