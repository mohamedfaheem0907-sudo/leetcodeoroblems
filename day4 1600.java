class ThroneInheritance {
    private Map<String, List<String>> children;
    private Set<String> dead;
    private String king;

    public ThroneInheritance(String kingName) {
        king = kingName;
        children = new HashMap<>();
        dead = new HashSet<>();
        children.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        children.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
        children.putIfAbsent(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }
    
    private void dfs(String name, List<String> order) {
        if (!dead.contains(name)) {
            order.add(name);
        }
        if (children.containsKey(name)) {
            for (String child : children.get(name)) {
                dfs(child, order);
            }
        }
    }
}
