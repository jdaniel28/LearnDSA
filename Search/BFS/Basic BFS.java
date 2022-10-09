 public ArrayListInteger bfsOfGraph(int V, ArrayListArrayListInteger adj) {
         Code here
        QueueInteger q = new LinkedList();
        q.add(0);
        ArrayListInteger finalList = new ArrayList();
        SetInteger visited = new HashSet();
        visited.add(0);
        while(!q.isEmpty()){
            int val = q.poll();
            ArrayListInteger arr = adj.get(val);
            for(int i  arr){
                if(!visited.contains(i)){
                    visited.add(i);
                    q.add(i);
                }
            }
            finalList.add(val);
        }
        return finalList;
    }