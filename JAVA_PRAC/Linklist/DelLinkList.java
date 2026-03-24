public class DelLinkList {
        Node head;
        private int size;

        DelLinkList(){// constructor1
            this.size = 0;
        }
    class Node {
       
        String data;
        Node next;

        Node(String data) { // Constructor2
            this.data = data;
            this.next = null;
            size++;
        }
    }

   

    //delete first
    public void deleteFirst() {
        if(head==null){
            System.out.println("Link list is null");
            return;
        }
        size--;
        head=head.next;
    }

    //delete-last
    public void deleteLast() {
        if(head==null){
            System.out.println("Link List is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
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
    //get size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        DelLinkList list = new DelLinkList();// initialize the linked list

        list.deleteFirst();
        list.PrintList();
        list.deleteLast();
        list.PrintList();

        System.out.println(list.getSize());
    }
}
