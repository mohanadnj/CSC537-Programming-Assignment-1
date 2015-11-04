
package driver;

public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		
		HugeInteger y1 = new HugeInteger();
                HugeInteger y2 = new HugeInteger();
                y1.addFront(9);
                y1.addFront(6);
                y1.addFront(7);
                y1.addFront(9);
                y1.addFront(1);
                
                y2.addFront(8);                
                y2.addFront(5);                
                y2.addFront(7);
                y2.addFront(7);
                y2.addFront(7);
                y2.addFront(7);
                
                HugeInteger x1 = new HugeInteger();
                x1.addHugeInteger(y1, y2);
                
                System.out.println("Result off addition = ");
                x1.display();
        }
}
