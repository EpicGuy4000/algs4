package tests;

import exercises.IUnionFind;
import exercises.QuickUnion;
import org.junit.Assert;
import org.junit.Test;

public abstract class UnionFindTests {

    @Test
    public void Demo1() {
        IUnionFind uf = CreateInstanceOfAlgorithm(10);

        uf.union(5,6);
        uf.union(3,4);
        uf.union(8, 3);
        uf.union(4, 9);
        uf.union(1, 2);

        Assert.assertTrue(uf.connected(8, 9));
        Assert.assertFalse(uf.connected(0, 5));

        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);

        Assert.assertTrue(uf.connected(0, 7));
        Assert.assertFalse(uf.connected(2, 3));
    }

    @Test
    public void Demo2() {
        IUnionFind uf = CreateInstanceOfAlgorithm(10);

        uf.union(4,3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);

        Assert.assertTrue(uf.connected(8, 9));
        Assert.assertFalse(uf.connected(5, 4));

        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(7, 3);

        Assert.assertTrue(uf.connected(6, 4));
    }

    public abstract IUnionFind CreateInstanceOfAlgorithm(int totalPoints);
}
