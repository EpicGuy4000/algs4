package exercises;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SimpleUnionFind implements IUnionFind {
    private final int TotalPoints;
    private final int[] Points;

    private Dictionary<Integer, List<Integer>> Components;

    public SimpleUnionFind(int totalPoints) {
        TotalPoints = totalPoints;
        Points = new int[TotalPoints];
        Components = new Hashtable<>();

        for (int i = 0; i < totalPoints; i++) {
            Points[i] = i;
            List<Integer> component = new ArrayList<>();
            component.add(i);
            Components.put(i, component);
        }
    }

    @Override
    public void union(int p, int q) {
        int componentIdOfP = Points[p];
        int componentIdOfQ = Points[q];

        if (componentIdOfP != componentIdOfQ) {
            List<Integer> componentOfP = Components.get(componentIdOfP);
            List<Integer> componentOfQ = Components.get(componentIdOfQ);

            for (int componentMember :
                    componentOfP) {
                componentOfQ.add(componentMember);
                Points[componentMember] = componentIdOfQ;
            }

            Components.remove(componentIdOfP);
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return Points[p] == Points[q];
    }
}
