//adding and creating a linked list
public class LinkList {
    Node head;

    class Node {
       
        String data;
        Node next;

        Node(String data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    void insert(String data, int pos) {

        Node newNode = new Node(data);

        // Case 1: Insert at beginning
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to (pos - 2)th node
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            // If position is invalid
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    //add-first, last
    public void addfirst( String data) {
         Node newNode = new Node(data);
        
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
       currNode.next = newNode; 
    }
    
    //print LinkList
    public void PrintList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();// initialize the linked list

         list.insert("a", 1);  // 10
        list.insert("b", 2);  // 10 → 20
        list.insert("c", 3);  // 10 → 20 → 30
        list.insert("d", 3);  // insert in middle
        list.PrintList();

        list.addfirst("a");
        list.addfirst("is");
        list.PrintList();

        list.addlast("list");
        list.PrintList();
    }
}
