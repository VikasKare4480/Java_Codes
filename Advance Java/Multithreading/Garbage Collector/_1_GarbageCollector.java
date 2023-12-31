class GarbageCollector {

    int num = 1;

    public void finalize() {

        System.out.println("Finalised Object " + num);
        num++;
    }

    public static void main(String[] args) {

        GarbageCollector g1 = new GarbageCollector();
        GarbageCollector g2 = new GarbageCollector();

        g1 = null;
        g2 = null;

        System.gc();
    }
}