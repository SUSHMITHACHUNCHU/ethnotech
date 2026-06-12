import java.util.HashMap;
public class classbucket{
    public static void main(String[] args){
        HashMap<String,Integer> mailbox=new HashMap<>();
        //mailbox = bucket ,receivers= index values
        mailbox.put("Sushu", 1);
        mailbox.put("likky", 2);
        mailbox.put("sneha", 33);
        mailbox.put("yakshi", 4);
        mailbox.put("chukka", 5);
        mailbox.put("madhu",6);
        System.out.println(mailbox);
        //display all the recievers
        for(HashMap.Entry<String,Integer> entry:mailbox.entrySet()){
            System.out.println(entry.getKey());
        } 
        //represent the bucket
        for(HashMap.Entry<String,Integer> entry:mailbox.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}