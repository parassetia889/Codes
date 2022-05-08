class NestedIterator implements Iterator<Integer> {
    private final List<Integer> flat;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.flat = new ArrayList<>();
        flatten(nestedList);
    }

    private void flatten(List<NestedInteger> lst) { //In-order DFS traversal
        for (NestedInteger i : lst) {
            if (i.isInteger()) flat.add(i.getInteger());
            else flatten(i.getList());
        }
    }

    @Override
    public Integer next() {
        return flat.remove(0);
    }

    @Override
    public boolean hasNext() {
        return flat.size() > 0;
    }
}