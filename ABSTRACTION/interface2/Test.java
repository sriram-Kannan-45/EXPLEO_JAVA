package interface2;

public class Test 
{
	public static void main(String[] args)
	{

        MovableCircle c = new MovableCircle(10, 10, 2, 2, 5);

        System.out.println("Before Move: " + c);

        c.moveRight();
        c.moveUp();
        c.moveRight();
        c.moveUp();

        System.out.println("After Move: " + c);

    }


}
