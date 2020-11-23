import java.util.*;

public class GraphSearchEngineImpl implements GraphSearchEngine {

    @Override
    public List<Node> findShortestPath(Node s, Node t) {
        ArrayList<Node> queue = new ArrayList<>();  //If I remember correctly java doesnt have a queue in its default packages

        queue.add(0, s);

        while (queue.size() > 0) {
            Node n = queue.remove(queue.size()-1);

        }
        return null;
    }



}
