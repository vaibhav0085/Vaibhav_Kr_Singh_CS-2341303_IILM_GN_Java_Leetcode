public class linkprac {
    Node head;

    class Node{
        String data;
        Node next;
        
        Node(String data){
        this.data = data;
        this.next= null;
        }
    }

    public void insertion(String data, int pos){
        Node newNode = new Node(data);

        if(pos==1){
            newNode.next=head;
            head=newNode;
        }

        Node temp = head;

        for(int i=1; i=pos-1; i++){
            temp = temp.next;
            
            if(temp==null){
            System.out.print("linklist is null");
            return;

        }

        
        }

    }

    
}
