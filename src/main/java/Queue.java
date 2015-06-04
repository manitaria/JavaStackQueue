import java.util.NoSuchElementException;

/**
 * Очередь: FIFO = First Input First Output
 */
public class Queue<T> {
    /**
     * Добавить в конец очереди
     *
     * @param v значение
     */

    private Element queueLink = null;
    private Element lastElem = null;
    private int currentDepth = 0;

    public void put(T v) {
        Element element = new Element();
        element.value = v;
        element.next = null;
        if (currentDepth == 0) {
            queueLink = element;
        } else if (currentDepth == 1){
            queueLink.next = element;
        } else {
            lastElem.next = element;
        }
        lastElem = element;
        currentDepth++;
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() {
        if (queueLink != null) {
            T gottenValue = queueLink.value;
            queueLink = queueLink.next;
            currentDepth--;
            return gottenValue;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Элемент очереди
     */
    class Element {
        T value;
        Element next;
    }
}
