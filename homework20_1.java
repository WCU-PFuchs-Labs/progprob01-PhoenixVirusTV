/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
import java.util.Scanner;

public class homework20_1
{
   public static void main(String[] args)
   {
      //add your code here
      Scanner sc = new Scanner(System.in);
      LinkedList llist = new LinkedList();

      // build list with 5 numbers
      llist.head = new ListNode(sc.nextInt());
      ListNode curr = llist.head;

      for(int i = 1; i < 5; i++)
      {
         curr.next = new ListNode(sc.nextInt());
         curr = curr.next;
      }

      deleteDuplicates(llist);
      System.out.println(llist.toString());
   }

   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
      ListNode curr = llist.head;

      while(curr != null && curr.next != null)
      {
         if(curr.value == curr.next.value)
         {
            curr.next = curr.next.next;
         }
         else
         {
            curr = curr.next;
         }
      }
   }

}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
