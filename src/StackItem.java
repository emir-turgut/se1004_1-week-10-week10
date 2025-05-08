public class StackItem {

    private Object item = "NULL";
    private StackItem next;

    public StackItem(){

    }

    public StackItem(Object item) {
        this.item = item;
    }

    public StackItem(Object item, StackItem next) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        if(item == null){
            return "NULL";
        }
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }
}
