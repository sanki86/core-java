package test;

import java.util.Scanner;

class Add {
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
    public static void main(String[] args) {
   	 Add s= new Add();
   	 Scanner scr=new Scanner(System.in);
   
        ListNode l1=new ListNode();
        l1.val=2;
        l1.val=4;
        l1.val=3;
        System.out.println(l1.val);
        ListNode l2=new ListNode();
        l2.val=5;
        l2.val=6;
        l2.val=4;
        
       
        ListNode l=  s.addTwoNumbers(l1,l2);
 System.out.println(1);  
}
}