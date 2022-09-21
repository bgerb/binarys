public class Kstack {

    private static final int MAX_ARRAY_SIZE = (int) Math.pow(2,31);
    int[] ar;
    int index = 0;

    public Kstack(int size) {
        ar = new int[size];
    }

    public Kstack() {
        ar = new int[2];
    }

    public int pop() throws RuntimeException {
        if (index - 1 == -1) throw (new RuntimeException("underflow"));
        return ar[--index];
    }

    public void push(int x) throws RuntimeException {
        if (index == ar.length) {
            if (index == MAX_ARRAY_SIZE) throw (new RuntimeException("overflow"));

            int newArrSize = Math.min(index * 2, MAX_ARRAY_SIZE);

            int[] corr = new int[newArrSize];
            for (int i = 0; i < index; ++i) {
                corr[i] = ar[i];
            }
            ar = corr;
        }
        ar[index++] = x;
    }

    public void fullprint() {
        for (int i = 0; i < ar.length; ++i) System.out.println(ar[i]);
    }


    public int getSize() {
        return index;
    }
}
