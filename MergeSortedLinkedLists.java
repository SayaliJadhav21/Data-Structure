class MergeSortedLinkedLists
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        Node head3 = null;
        Node curr3 = null;
        while(curr1!=null && curr2!=null) {
            if(curr1.data<=curr2.data) {
                if(head3==null) {
                    curr3 = new Node(curr1.data);
                    head3 = curr3;
                } else {
                    curr3.next = new Node(curr1.data);
                    curr3 = curr3.next;
                }
                curr1 = curr1.next;
            } else {
                if(head3==null) {
                    curr3 = new Node(curr2.data);
                    head3 = curr3;
                } else {
                    curr3.next = new Node(curr2.data);
                    curr3 = curr3.next;
                }
                curr2 = curr2.next;
            }
            
        }
        while(curr1!=null) {
                curr3.next = new Node(curr1.data);;
                curr3 = curr3.next;
                curr1 = curr1.next;
        }
        while(curr2!=null) {
                curr3.next = new Node(curr2.data);
                curr3 = curr3.next;
                curr2 = curr2.next;
        }
        return head3;
   } 
}
