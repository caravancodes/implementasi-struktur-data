package lehugha;

public interface ListInterface {
    public boolean isEmpty();
    public void addFirst(Object newEntry);
    public void addLast(Object newEntry);
    public void add(Object newEntry, Integer position);
    public Object removeFirst();
    public int getPositionOf(int nilaiMasukan);
    public void traverse();
}