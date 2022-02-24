// linked_list

class LinkedList{
    
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) { // ������
            data = d; next = null;
        }
    }

    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    }

    public static void main(String[] args){

        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        /*
          llist.head        second              third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 1  | null |     | 2  | null |     |  3 | null | 
         +----+------+     +----+------+     +----+------+ 
        */
    
        llist.head.next = second; // ù��° ��忡 �ι�° ��� ����
        second.next = third; // �ι�° ��忡 ����° ��� ����
        
        /*
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ 
        
        */
        llist.printList(); 
    }
}