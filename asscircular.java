class Node 
{
  int data;
  Node next;
  Node pre;
  Node(int data)
  {
    this.data=data;
    this.pre=null;
    this.next=null;
  }
}
class circular 
{
  Node  head;
  Node tail;
  public void insertEnd(int data)
  {
    Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      tail.next = node;
      node.pre=tail;
      node.next = head;
      head.pre=node;
      tail=node; 
      
    }
  }
  public void insertBegin(int data)
  {
     Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next = node;
    }
  }
  public void traverseClock()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else 
    {
      Node temp = head;
      while(temp.next!=head)
      {
        System.out.println(temp.data+"->");
        temp=temp.next;
      }
     System.out.println(temp.data);
    }
  }

  public void deleteBegin()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      head = head.next;
      head.pre = tail;
      tail.next=head;
    }
  }
  public void deleteEnd()
  {
     if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      tail=tail.pre;
      tail.next = head;
      head.pre=tail;
    }
  }
  public void insertPos(int data,int pos)
  {
    Node node = new Node(data);
    boolean flag=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List Empty");
    }
    else if(pos==1)
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next=node;
      flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp = temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
        temp.pre.next = node;
        node.next = temp;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        temp.pre.next = node;
        node.next=temp;
        flag=true;
        c++;
      }
    }
  }
  public void deletePos(int pos)
  {
    boolean flag = false;
    int c=1;
    if(head==null)
    {
      System.out.println("List empty");
    }
     else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else if(pos==1)
    {
       head = head.next;
       head.pre=tail;
       tail.next = head;
       flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp=temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
          temp.pre.next = temp.next;
           temp.next.pre=temp.pre;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        deleteEnd();
      }
    }
  }
}
class Main 
{
  public static void main(String args[])
  {
    circular c= new circular();
    System.out.println("list elements are: ");
    c.insertEnd(10);
    c.insertEnd(20);
    c.insertEnd(30);
    c.insertEnd(40);
    System.out.println("Insert At Begin ");
    c.insertBegin(5);
     c.traverseClock();
     System.out.println();
     System.out.println("Insert At Specific position  ");
    c.insertPos(15,3);
     c.traverseClock();
      System.out.println();
        System.out.println("Delete At Specific position  ");
    c.deletePos(5);
       c.traverseClock();

  }
}








class Node 
{
  int data;
  Node next;
  Node pre;
  Node(int data)
  {
    this.data=data;
    this.pre=null;
    this.next=null;
  }
}
class circular 
{
  Node  head;
  Node tail;
  public void insertEnd(int data)
  {
    Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      tail.next = node;
      node.pre=tail;
      node.next = head;
      head.pre=node;
      tail=node; 
      
    }
  }
  public void insertBegin(int data)
  {
     Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next = node;
    }
  }
  public void traverseClock()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else 
    {
      Node temp = head;
      while(temp.next!=head)
      {
        System.out.println(temp.data+"->");
        temp=temp.next;
      }
     System.out.println(temp.data);
    }
  }

  public void deleteBegin()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      head = head.next;
      head.pre = tail;
      tail.next=head;
    }
  }
  public void deleteEnd()
  {
     if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      tail=tail.pre;
      tail.next = head;
      head.pre=tail;
    }
  }
  public void insertPos(int data,int pos)
  {
    Node node = new Node(data);
    boolean flag=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List Empty");
    }
    else if(pos==1)
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next=node;
      flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp = temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
        temp.pre.next = node;
        node.next = temp;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        temp.pre.next = node;
        node.next=temp;
        flag=true;
        c++;
      }
    }
  }
  public void deletePos(int pos)
  {
    boolean flag = false;
    int c=1;
    if(head==null)
    {
      System.out.println("List empty");
    }
     else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else if(pos==1)
    {
       head = head.next;
       head.pre=tail;
       tail.next = head;
       flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp=temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
          temp.pre.next = temp.next;
           temp.next.pre=temp.pre;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        deleteEnd();
      }
    }
  }
}
class Main 
{
  public static void main(String args[])
  {
    circular c= new circular();
    System.out.println("list elements are: ");
    c.insertEnd(10);
    c.insertEnd(20);
    c.insertEnd(30);
    c.insertEnd(40);
    System.out.println("Insert At Begin ");
    c.insertBegin(5);
     c.traverseClock();
     System.out.println();
     System.out.println("Insert At Specific position  ");
    c.insertPos(15,3);
     c.traverseClock();
      System.out.println();
        System.out.println("Delete At Specific position  ");
    c.deletePos(5);
       c.traverseClock();

  }
}








class Node 
{
  int data;
  Node next;
  Node pre;
  Node(int data)
  {
    this.data=data;
    this.pre=null;
    this.next=null;
  }
}
class circular 
{
  Node  head;
  Node tail;
  public void insertEnd(int data)
  {
    Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      tail.next = node;
      node.pre=tail;
      node.next = head;
      head.pre=node;
      tail=node; 
      
    }
  }
  public void insertBegin(int data)
  {
     Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next = node;
    }
  }
  public void traverseClock()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else 
    {
      Node temp = head;
      while(temp.next!=head)
      {
        System.out.println(temp.data+"->");
        temp=temp.next;
      }
     System.out.println(temp.data);
    }
  }

  public void deleteBegin()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      head = head.next;
      head.pre = tail;
      tail.next=head;
    }
  }
  public void deleteEnd()
  {
     if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      tail=tail.pre;
      tail.next = head;
      head.pre=tail;
    }
  }
  public void insertPos(int data,int pos)
  {
    Node node = new Node(data);
    boolean flag=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List Empty");
    }
    else if(pos==1)
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next=node;
      flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp = temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
        temp.pre.next = node;
        node.next = temp;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        temp.pre.next = node;
        node.next=temp;
        flag=true;
        c++;
      }
    }
  }
  public void deletePos(int pos)
  {
    boolean flag = false;
    int c=1;
    if(head==null)
    {
      System.out.println("List empty");
    }
     else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else if(pos==1)
    {
       head = head.next;
       head.pre=tail;
       tail.next = head;
       flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp=temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
          temp.pre.next = temp.next;
           temp.next.pre=temp.pre;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        deleteEnd();
      }
    }
  }
}
class Main 
{
  public static void main(String args[])
  {
    circular c= new circular();
    System.out.println("list elements are: ");
    c.insertEnd(10);
    c.insertEnd(20);
    c.insertEnd(30);
    c.insertEnd(40);
    System.out.println("Insert At Begin ");
    c.insertBegin(5);
     c.traverseClock();
     System.out.println();
     System.out.println("Insert At Specific position  ");
    c.insertPos(15,3);
     c.traverseClock();
      System.out.println();
        System.out.println("Delete At Specific position  ");
    c.deletePos(5);
       c.traverseClock();

  }
}








class Node 
{
  int data;
  Node next;
  Node pre;
  Node(int data)
  {
    this.data=data;
    this.pre=null;
    this.next=null;
  }
}
class circular 
{
  Node  head;
  Node tail;
  public void insertEnd(int data)
  {
    Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      tail.next = node;
      node.pre=tail;
      node.next = head;
      head.pre=node;
      tail=node; 
      
    }
  }
  public void insertBegin(int data)
  {
     Node node = new Node(data);
    if(head==null)
    {
      node.next=node;
      node.pre=node;
      head=node;
      tail =node;
    }
    else 
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next = node;
    }
  }
  public void traverseClock()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else 
    {
      Node temp = head;
      while(temp.next!=head)
      {
        System.out.println(temp.data+"->");
        temp=temp.next;
      }
     System.out.println(temp.data);
    }
  }

  public void deleteBegin()
  {
    if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      head = head.next;
      head.pre = tail;
      tail.next=head;
    }
  }
  public void deleteEnd()
  {
     if(head==null)
    {
      System.out.println("List empty");
    }
    else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else 
    {
      tail=tail.pre;
      tail.next = head;
      head.pre=tail;
    }
  }
  public void insertPos(int data,int pos)
  {
    Node node = new Node(data);
    boolean flag=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List Empty");
    }
    else if(pos==1)
    {
      head.pre=node;
      node.next=head;
      head=node;
      node.pre=tail;
      tail.next=node;
      flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp = temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
        temp.pre.next = node;
        node.next = temp;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        temp.pre.next = node;
        node.next=temp;
        flag=true;
        c++;
      }
    }
  }
  public void deletePos(int pos)
  {
    boolean flag = false;
    int c=1;
    if(head==null)
    {
      System.out.println("List empty");
    }
     else if(head.next==null)
    {
       head=null;
       tail=null;
    }
    else if(pos==1)
    {
       head = head.next;
       head.pre=tail;
       tail.next = head;
       flag=true;
    }
    else 
    {
      c++;
      Node temp = head;
      temp=temp.next;
      while(temp.next!=head)
      {
        if(pos==c)
        {
          temp.pre.next = temp.next;
           temp.next.pre=temp.pre;
          flag=true;
        }
        c++;
        temp=temp.next;
      }
      if(pos==c && flag==false)
      {
        deleteEnd();
      }
    }
  }
}
class asscircular
{
  public static void main(String args[])
  {
    circular c= new circular();
    System.out.println("list elements are: ");
    c.insertEnd(10);
    c.insertEnd(20);
    c.insertEnd(30);
    c.insertEnd(40);
    System.out.println("Insert At Begin ");
    c.insertBegin(5);
     c.traverseClock();
     System.out.println();
     System.out.println("Insert At Specific position  ");
    c.insertPos(15,3);
     c.traverseClock();
      System.out.println();
        System.out.println("Delete At Specific position  ");
    c.deletePos(5);
       c.traverseClock();

  }
}






























