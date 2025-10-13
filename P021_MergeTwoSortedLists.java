public class P021_MergeTwoSortedLists {
    /*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode falsa = new ListNode(-1);
        ListNode atual = falsa;

        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){
                atual.next = list1;
                list1 = list1.next;
            } else {
                atual.next = list2;
                list2 = list2.next;
            }

            atual = atual.next;
        }

        if(list1 != null){
            atual.next = list1;
        } else {
            atual.next = list2;
        }
        return falsa.next;

    }
}

*/
}