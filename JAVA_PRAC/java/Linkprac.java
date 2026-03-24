 class Linkprac {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int data, int index) {
    
    if (index == 0) {
        addFirst(data); 
        return;
    }

    Node newNode = new Node(data); 
    Node temp = head;              
    
    for (int i = 0; i < index - 1; i++) {
        if (temp == null) {
            System.out.println("Index out of range!");
            return;
        }
        temp = temp.next; 
    }

    newNode.next = temp.next; 
    temp.next = newNode;      
}
   public void nodedelete(int key) {
   if(head==null) return;
   if(head.data == key){
    head = head.next;
    return;
   }
   Node current=head;  Node prev=null;
   while(current != null && current.data != key){
    prev = current;
    current = current.next;
   }
   if(current != null){
    prev.next = current.next;
   }
   }
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Linkprac list = new Linkprac();
        list.addFirst(12);    
        list.insertAt(30, 1);
        list.addNode(10);
        list.addNode(20);
        list.addNode(40);

     list.nodedelete(10);

        list.display();
    }
}
