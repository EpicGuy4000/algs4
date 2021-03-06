package tests;

import exercises.IUnionFind;
import exercises.SimpleUnionFind;

public class SimpleUnionFindTests extends UnionFindTests {
    @Override
    public IUnionFind CreateInstanceOfAlgorithm(int totalPoints) {
        return new SimpleUnionFind(10);
    }
}
