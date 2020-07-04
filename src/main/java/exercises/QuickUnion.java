package exercises;

public class QuickUnion implements IUnionFind {
    private final int[] Points;
    private final int[] SizeOfComponents;

    public QuickUnion(int totalPoints) {
        Points = new int[totalPoints];
        SizeOfComponents = new int[totalPoints];

        for (int i = 0; i < totalPoints; i++) {
            Points[i] = i;
            SizeOfComponents[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int rootOfP = GetRoot(p);
        int rootOfQ = GetRoot(q);

        int sizeOfP = SizeOfComponents[rootOfP];
        int sizeOfQ = SizeOfComponents[rootOfQ];

        if (sizeOfP >= sizeOfQ) {
            Points[rootOfQ] = rootOfP;
            SizeOfComponents[rootOfP] += SizeOfComponents[rootOfQ];
            SizeOfComponents[rootOfQ] = 0;
        }
        else {
            Points[rootOfP] = rootOfQ;
            SizeOfComponents[rootOfQ] += SizeOfComponents[rootOfP];
            SizeOfComponents[rootOfP] = 0;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return GetRoot(Points[p]) == GetRoot(Points[q]);
    }

    private int GetRoot(int point) {
        while (point != Points[point])
        {
            Points[point] = Points[Points[point]];
            point = Points[point];
        }

        return point;
    }
}
