class Q3 {
    String name;

    Q3(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println(name + " is garbage collected");
    }

    public static void main(String[] args) {
        Q3 obj = new Q3("Object A");
        obj = null;

        System.gc();
    }
}
