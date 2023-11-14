package list_of_duplicate_objects;

import java.util.List;


public class ObjectOfFilter {
    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(List<Integer> index) {
        this.index = index;
    }

    public List<String> getObjects() {
        return objects;
    }

    public void setObjects(List<String> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "ObjectOfFilter{" +
                "index=" + index +
                ", objects=" + objects +
                '}';
    }

    private List<Integer> index;
    private List<String> objects;
}
