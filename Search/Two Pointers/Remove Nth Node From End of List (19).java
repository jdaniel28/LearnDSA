 public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            ++count;
        }
        n = count - n;
        int counter = 1;
        temp = head;
        while(true){
            if(n == 0 && counter == 1){
                head = temp.next;
                break;
            }
            else if(counter == n){
                temp.next = temp.next.next;
                break;
            }
            ++counter;
            temp = temp.next;
        }
        return head;
    }