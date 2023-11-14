package list_of_duplicate_objects;

import java.util.ArrayList;
import java.util.List;

public class ListOfDuplicateObjects {

    static class ListStringComparator {

        public static Integer count(List<String> list, List<String> comparator) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains(comparator.get(i))) {
                    count++;
                }
            }
            return count;
        }

        public static List<String> listEquals(List<String> list, List<String> comparator) {
            List<Integer> indexEquals = listIndex(list, comparator);
            List<String> stringList = new ArrayList<>();
            for (Integer i : indexEquals) {
                stringList.add(list.get(i));
            }
            return stringList;
        }

        public static Integer countListAny(List<String> list, List<String> comparator) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < comparator.size(); j++) {
                    if (list.get(i).contains(comparator.get(j))) {
                        count++;
                    }
                }
            }
            return count;
        }


        public static ObjectOfFilter IndexAndObject(List<String> original , List<String> comparator){
            ObjectOfFilter objectOfFilter = new ObjectOfFilter();
            List<Integer> index = new ArrayList<>();
            index = listIndex(original , comparator );
            original = listEquals(original,comparator);

            objectOfFilter.setObjects(original);
            objectOfFilter.setIndex(index);

            return objectOfFilter;

        }

        public static List<Integer> listIndex(List<String> list, List<String> comparator) {
            List<Integer> listIndexDuplicate = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains(comparator.get(i))) {
                    listIndexDuplicate.add(i);
                }
            }
            return listIndexDuplicate.stream().toList();
        }

        public static void main(String[] args) {

            var listFull = ReturnList.listAll();

            var names = listFull.subList(0, 20);
            var comparator = listFull.subList(20, 40);

            var count = ListStringComparator.count(names, comparator);
            var list = ListStringComparator.listIndex(names, comparator);
            var listAny = ListStringComparator.countListAny(names, comparator);
            var listEquals = ListStringComparator.listEquals(names, comparator);

            var objFilter = ListStringComparator.IndexAndObject(names,comparator);

            //System.out.println(count);
           //System.out.println(list);
             System.out.println(listAny);
            //System.out.println(listEquals);
            System.out.println(objFilter);
        }
    }
}

