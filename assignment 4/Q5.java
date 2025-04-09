class Q5 {
    private int intVal;
    private double doubleVal;

    void initialize(int i, double d) {
        intVal = i;
        doubleVal = d;
    }

    void setValues(int i, double d) {
        intVal = i;
        doubleVal = d;
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        Q5 obj1 = new Q5();
        obj1.initialize(10, 10.5);

        Q5 obj2 = new Q5();
        obj2.setValues(20, 20.5);

        System.out.println("Before GC:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("After GC:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
    }
}
