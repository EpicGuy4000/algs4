package exercises;

public class QuickUnion implements IUnionFind {
    private final int[] Points;

    public QuickUnion(int totalPoints) {
        Points = new int[totalPoints];

        for (int i = 0; i < totalPoints; i++) {
            Points[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        Points[GetRoot(p)] = GetRoot(q);
    }

    @Override
    public boolean connected(int p, int q) {
        return GetRoot(Points[p]) == GetRoot(Points[q]);
    }

    private int GetRoot(int point) {
        while (point != Points[point])
        {
            point = Points[point];
        }

        return point;
    }
}
