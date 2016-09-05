class LinkNode {
Node next = null;
int data;

public LinkNode(int d) {
 data = d;
}

void appendToTail(int d) {
 Node end = new Node(d);
 Node n = this;
 while (n.next != null) {
 n = n.next;
 }
 n.next = end;
 }
 }