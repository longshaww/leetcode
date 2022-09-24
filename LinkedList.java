public class LinkedList {
    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("List is empty");
        }else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null) {
                    System.out.print("->");
                }
                else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode,int value) {
        Node newNode = new Node(value);
        // Nếu list không rỗng thì next của newNode là headNode 
        if(headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToEnd(Node headNode , int value) {
        Node newNode = new Node(value);
        if(headNode != null) {
            // B1. Xác định Last Node (lastNode = Null)
            Node lastNode = headNode;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. Gán next cho lastNode = newNode;
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode , int value,int index) {
        if(index == 0) {
           return addToHead(headNode, value);
        }else {
            // B1 Tìm vị trí cần thêm vào
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while(curNode.next != null) {
                count ++;
                if(count == index) {
                    // Thực hiện add
                    // Trỏ newNode.next = curNode.next
                    //Trỏ curNode.next = newNode
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                } 
                curNode = curNode.next;
            }
        }

        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if(headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtEnd(Node headNode) {
        if(headNode == null) {
            return null;
        }
        //B1.Xác định last và previous
        Node lastNode = headNode;
        Node prevNode = null;
        while(lastNode != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if(prevNode == null) {
            return null;
        }else {
            // Gán cho prevNode.next = lastNode.next (null)
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex() {
        return null;
    }
    public static void main (String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        // Node addToHeadNode = addToHead(n1,0);
        // printLinkedList(addToHeadNode);
        n1 = addToEnd(n1,4);
        printLinkedList(n1);

    }
}
