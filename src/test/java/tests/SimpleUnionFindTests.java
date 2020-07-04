package tests;

import exercises.IUnionFind;
import exercises.SimpleUnionFind;
import org.junit.Assert;
import org.junit.Test;

public class SimpleUnionFindTests {
    @Test
    public void DemoTest() {
        IUnionFind uf = new SimpleUnionFind(10);

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
}
