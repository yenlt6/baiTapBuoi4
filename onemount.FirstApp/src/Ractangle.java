public class Ractangle {
    int width;
    int length;

    public Ractangle(int a, int b) {
        width = a;
        length = b;
    }

    public int rectangularArea(Ractangle rac) {
        int acreage = rac.width * rac.length;
        return acreage;
    }

    public int ractangularCircuit(Ractangle rac) {
        int circuit = (rac.width + rac.length) * 2;
        return circuit;
    }

}
