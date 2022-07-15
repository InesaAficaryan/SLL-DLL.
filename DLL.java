public class DLL {
        class Node{
            int data;
            Node next;
            Node prev;
            Node(int data){
                this.data = data;
            }
        }

        Node head;
        int size = 0;
        private void add(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                head.next = null;
                head.prev = null;
            }
            else{
                Node current = head;
                while(current.next != null)
                    current = current.next;
                current.next = newNode;
                newNode.prev = current;
            }
            ++size;
        }

        private void delete(){
            if (head == null)
                return;
            else if(head.next == null)
                head = null;
            else{
                Node current = head;
                while(current.next != null)
                    current = current.next;
                current.prev.next = null;
            }
            --size;
        }

        // This function removes the last element from the Doubly linked list.  
        private void delete(int data){
            if (head == null)
                return;
            else{
                Node current = head;
                while(current.data != data) {
                    current = current.next;
                }
                if (current.next == null && current.data != data)
                    return;
                if (current.next == null && current != head) //if it is the last element
                    current.prev.next = null;
                else if(current == head){        // if it is the first element
                    head = current.next;
                }

                else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                --size;
            }

        }


        public void print(){
            Node node = head;
            for (int i = 0; i < size; i++){
                System.out.println(node.data);
                node = node.next;

            }
        }
}
