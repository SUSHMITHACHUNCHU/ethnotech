public class train{
    class Node{
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        train t = new train();
        t.add("First Stop");
        System.out.println("Train list initialized.");
    }
}