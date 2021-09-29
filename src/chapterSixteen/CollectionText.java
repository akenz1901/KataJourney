package chapterSixteen;

import java.util.*;

public class CollectionText {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List <String> list = new ArrayList<>();

        for(String color: colors)
            list.add(color);


        String[] removeColor = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for(String color: removeColor)
            removeList.add(color);

        System.out.println("ArrayList: ");

        for(int count = 0; count<list.size(); count++)
            System.out.printf("%s ", list.get(count));

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColor:%n");

        for(String color: list)
            System.out.printf("%s ", color);
    }
        public static void removeColors(Collection<String> collection, Collection<String> collection1){
            Iterator<String> iterator = collection.iterator();
            while(iterator.hasNext()){
                if (collection1.contains(iterator.next()))
                    iterator.remove();
            }
        }

}
