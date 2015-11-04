package driver;

public class HugeInteger 
{
    private Node head;
    private int count;
	
	public HugeInteger()
	{
		this.head = null;
		this.count = 0;
	}
        public void addFront(int value)
	{
		Node n = new Node(value);
		n.setNextNode(head);
		head = n;
		this.count++;
	}
        public void addHugeInteger(HugeInteger y1, HugeInteger y2)
        {
            int n1 = y1.howLong();
            int n2 = y2.howLong();
            if (n1 >= n2)
            {
                for (int i =0; i< n1-n2; i++)
                {
                    y2.addFront(0);
                }   
                  
                int addz=0;
                for(int i = n1; i >= 0; i--)
                {
                    
                    int z1 = y1.getvalue(i);
                    int z2 = y2.getvalue(i); 
                    if(addz==1)
                    {
                    if (z1+z2+1>=10)
                    {
                       this.addFront(z1+z2-10+1);
                       addz=1;
                    }
                    else
                    {
                        this.addFront(z1+z2+1);
                        addz=0;
                    }
                    
                    }
                    else
                    {
                    if (z1+z2>=10)
                    {
                       this.addFront(z1+z2-10);
                       addz=1;
                    }
                    else
                    {
                        this.addFront(z1+z2);
                        addz=0;
                    }
                    }
                }
            }
        else
            {
                for (int i =0; i< n2-n1; i++)
                {
                    y1.addFront(0);
                }   
                   
                int addz=0;
                for(int i = n2; i >= 0; i--)
                {
                    
                    int z1 = y1.getvalue(i);
                    int z2 = y2.getvalue(i); 
                    if(addz==1)
                    {
                    if (z1+z2+1>=10)
                    {
                       this.addFront(z1+z2-10+1);
                       addz=1;
                    }
                    else
                    {
                        this.addFront(z1+z2+1);
                        addz=0;
                    }
                    
                    }
                    else
                    {
                    if (z1+z2>=10)
                    {
                       this.addFront(z1+z2-10);
                       addz=1;
                    }
                    else
                    {
                        this.addFront(z1+z2);
                        addz=0;
                    }
                    }
                }
            }   
            y1.display(); 
            y2.display(); 
        }
        public int howLong()
        {
            int n =0;
            Node currNode = head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
                                n++;
			}
                        return n;
        }
        public int getlast()
	{
		
			Node currNode = head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
			}			
				
				return currNode.getPayload();
			
		
	} 
        
        public int getvalue(int index)
        {
           Node currNode = head;
			for(int i = 0; i < index; i++)
			{
				currNode = currNode.getNextNode();
			}
			return currNode.getPayload();

        }
        public void display()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			this.head.display();
                        System.out.println();

		}
	}
}
