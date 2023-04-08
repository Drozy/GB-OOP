package oop4;

public class SimpleBox {
    Object obj;

    public SimpleBox() {
    }

    public SimpleBox(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "SimpleBox{" +
                "obj=" + obj +
                '}';
    }
}
