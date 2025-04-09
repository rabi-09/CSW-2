class Student {
    String name;
    String course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    protected void finalize() {
        System.out.println("Student " + name + " is garbage collected");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        Student s1 = new Student("Alice", "CSE");
        Student s2 = new Student("Bob", "ECE");

        System.out.println("Memory before GC:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());

        s1 = null;
        s2 = null;

        System.gc();

        System.out.println("Memory after GC:");
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
    }
}
