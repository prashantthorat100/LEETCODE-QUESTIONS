class MyLinkedList {
    MyLinkedList head;
    MyLinkedList tail;
    MyLinkedList next;
    int val;
    public MyLinkedList() {
        head = null;
        tail = null;
        next = null;
    }
    public MyLinkedList(int val) {
    this.val = val;
    this.next = null;
}
    
    public int get(int index) {
        if(index<0 || head ==null){
            return -1;
        }
        
        MyLinkedList temp = head;
        for(int i=0;i<index;i++){
            if(temp==null){
                return -1;
            }
            temp = temp.next;
        }
        if(temp==null){
            return -1;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if(head ==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        MyLinkedList temp = head;
        if(head ==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        if(index ==0){
            addAtHead(val);
            return;
        }

        MyLinkedList newNode = new MyLinkedList(val);
        MyLinkedList temp = head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp = temp.next;
        }
        if(temp==null){
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        if(newNode.next == null){
            tail = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || head==null){
            return;
        }
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
        return;
        }

        MyLinkedList temp = head;
        // MyLinkedList prev = null;

        for(int i=0;i<index-1;i++){
            if(temp.next==null){
                return;
            }
            temp = temp.next;
        }
        if(temp.next==null){
            return;
        }
        if(temp.next==tail){
            tail = temp;
            
        }
        temp.next = temp.next.next;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */