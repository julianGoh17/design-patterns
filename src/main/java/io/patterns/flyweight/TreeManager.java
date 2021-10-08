package io.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeManager {
    private final List<Pair<Integer, Integer>> trees;

    public TreeManager() {
        this.trees = new ArrayList<>();
    }

    public List<Pair<Integer, Integer>> getTrees() {
        return trees;
    }

    public void addTree(int x, int y) {
        trees.add(new Pair<>(x, y));
    }

    public List<String> display() {
        return trees.stream()
        .map(tree -> Tree.display(tree.getLeft(), tree.getRight()))
        .collect(Collectors.toList());
    }
}
