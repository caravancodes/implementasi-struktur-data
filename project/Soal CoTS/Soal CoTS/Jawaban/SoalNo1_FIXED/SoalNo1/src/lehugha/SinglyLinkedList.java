package lehugha;

public class SinglyLinkedList<T> implements ListInterface {

    private Node head;
    private Node tail;
    int numberOfEntries;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.numberOfEntries = 0;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void addFirst(Object newEntry) {
        Node newNode = new Node((T) newEntry);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        numberOfEntries++;
    }

    @Override
    public void addLast(Object newEntry) {
        Node newNode = new Node((T) newEntry);
        tail.setNext(newNode);
        tail = newNode;
        numberOfEntries++;
    }

    @Override
    public void add(Object newEntry, Integer nilaimasuk) {
        Node newNode = new Node((T) newEntry);
        if (isEmpty()){
            head = tail = newNode;
            numberOfEntries++;
        }
        else {
            Node temp = head;
            Mahasiswa mahasiswa = (Mahasiswa)temp.getData();
            if(nilaimasuk < mahasiswa.getNilai()) {
                addFirst(newEntry);
            } else if(nilaimasuk >= mahasiswa.getNilai()) {
                if (head.next != null) {
                    temp = temp.next;
                    if (((Mahasiswa) temp.getData()).getNilai()>= nilaimasuk){
                        Node before = head;
                        while (before.getNext()!=temp){
                            before = before.next;
                        }
                        before.setNext(newNode);
                        newNode.setNext(temp);
                    }
                    numberOfEntries++;
                } if (head.next==null || temp.next==null){
                    addLast(newEntry);
                }
            }
        }
    }


    @Override
    public Object removeFirst() {
        T result = null;
        if(isEmpty())
            return null;
        else{
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            result = temp.getData();
        }
        numberOfEntries--;
        return result;
    }

    @Override
    public void traverse() {
        Node temp=head;
        Mahasiswa mhs = (Mahasiswa) temp.data;
        for(int i = 0; i < numberOfEntries; i++){
            System.out.println(temp.data);
            if(temp.next == null){
                break;
            }
            else{
                temp = temp.next;
            }
        }
    }

    /*Method getPositionOf akan mengembalikan
    **posisi dari node yang akan dimasukkan
    **berdasarkan nilai. Nilai yang akan ditambahkan
    **dibandingkan dengan nilai mahasiswa lain
    yang sudah ada*/

    @Override
    public int getPositionOf(int nilaiMasukan) {
        assert (head!=null);

        Node iterator = head;
        Mahasiswa mahasiswa = (Mahasiswa) iterator.data;

        for (int i = 1; i <= numberOfEntries; i++) {
            if (nilaiMasukan==mahasiswa.getNilai())
                return i;
            else
                iterator = iterator.next;
        }
        return numberOfEntries;
    }

    public int getSize(){
        return numberOfEntries;
    }

    private class Node{
        private T data;
        private Node next;

        private Node(T dataPortion) {
            this(dataPortion, null );
        }

        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }
}
