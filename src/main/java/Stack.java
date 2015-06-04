import java.util.NoSuchElementException;

/**
 * Стек: LIFO = Last Input First Output
 */
public class Stack<T> {
    /**
     * Добавить на вершину стека
     *
     * @param v значение
     */
    private Element stackLink = null;
    private Element lastElem = null;

    public void push(T v) {
        Element element = new Element();
        element.value = v;
        stackLink = element;
        element.next = lastElem;
        lastElem = element;
    }

    /**
     * Получить значение с верщшины
     *
     * @return значение
     */
    public T get() {
        if (stackLink != null) {
            T gottenValue = stackLink.value;
            stackLink = stackLink.next;
            lastElem = lastElem.next;
            return gottenValue;
        } else{
            throw new NoSuchElementException();
        }
    }

    /**
     * Элемент стэка
     */
    class Element {
        T value;
        Element next;
    }
}
