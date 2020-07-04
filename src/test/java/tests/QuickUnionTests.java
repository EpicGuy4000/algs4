package tests;

import exercises.IUnionFind;
import exercises.QuickUnion;

public class QuickUnionTests extends UnionFindTests {
    @Override
    public IUnionFind CreateInstanceOfAlgorithm(int totalPoints) {
        return new QuickUnion(10);
    }
}
