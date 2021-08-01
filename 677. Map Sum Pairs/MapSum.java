class MapSum {

    Map<String , Integer> pair;

    public MapSum() {
        pair = new HashMap<>();
    }

    public void insert(String key , int val) {
        pair.put(key , val);
    }

    public int sum(String prefix) {
        int sum = 0;

        return sum = pair.keySet()
                .stream()
                .filter((key) -> (key.startsWith(prefix)))
                .map((key) -> pair.get(key))
                .reduce(sum , Integer::sum);

    }
}
