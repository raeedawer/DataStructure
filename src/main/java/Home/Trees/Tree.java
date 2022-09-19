package Home.Trees;

public interface Tree {
    void add(int t);

    void printAll();

    void delete(Nodet nodet);

    void delete();

    static int depth(Nodet n) {
        return 0;
    }

    static int height(Nodet n) {
        return 0;
    }
}
