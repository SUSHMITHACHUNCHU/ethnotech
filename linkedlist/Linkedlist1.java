import java.util.LinkedList;
 class Linkedlist1{
    public static void main(String[] args) {
    LinkedList<Integer> l1=new LinkedList<>();
    l1.add(1);
    l1.add(2);
    l1.addFirst(3);
    l1.addLast(4);
    l1.add(5);
    l1.remove(3);
    System.out.println(l1);
    System.out.println(l1.getFirst());
    System.out.println(l1.getLast());
    }
}