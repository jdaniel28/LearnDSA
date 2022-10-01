  public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            ++n;
        }
        n = n/2;
        temp = head;
        // System.out.println(n);
        while(n > 0){
        temp = temp.next;
            --n;
        }
        return temp;
    }