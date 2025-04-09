class Q1 {
    String name;

    Q1(String name) {
        this.name = name;
    }

    void display() {
        Q1 obj2 = new Q1("Object 2");
    }

    void show() {
        Q1 obj1 = new Q1("Object 1");
        obj1.display();
    }

    @Override
    protected void finalize() {
        System.out.println(name + " is garbage collected");
    }

    public static void main(String[] args) {
        Q1 uo = new Q1("Main Object");
        uo.show();
        uo = null;
        System.gc();
    }
}
