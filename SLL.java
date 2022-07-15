public class SLL {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;
        int size;

        private void add(int data) {
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                head.next = null;
            }
            else{
                Node current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = newNode;
            }
            ++size;
        }

        // This function removes the last element from the Singly linked list.
        private void delete(){
            if (head == null)
                return;
            int counter = 0;
            Node current = head;
            while (current.next != null) {
                current = current.next;
                ++counter;
            }
            current = head;
            if (counter == 0)
            {
                head = null;
                --size;
                return;
            }
            while (counter > 1)
            {
                current = current.next;
                --counter;
            }
            current.next = null;
            --size;

        }

        private void delete(int data){
            Node current = head;
            if (head == null)
                return;

            int counter = 0;
            while (current.data != data){
                current = current.next;
                ++counter;
            }

            if (current.next == null && current.data != data)
                return;

            current = head;
            if (counter == 0){
                current = current.next;
                head = current;
                --size;
                return;
            }
            while(counter > 1)
            {
                current = current.next;
                --counter;
            }
            if (current.next == null)
                current = null;
            else {
                current.next = current.next.next;
            }
            --size;
        }


        private void print(){
            Node node = head;
            for (int i = 0; i < size; i++) {
                System.out.println(node.data);
                node = node.next;
            }
        }
}

