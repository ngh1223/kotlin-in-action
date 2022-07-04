package chapter3;

import java.util.*;

public class CollectionJava {
    public Set<String> set = new HashSet<>();
    public Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2));
    public Map<Integer, String> map = new HashMap<>();
    public static final String DEFINE = "DEFINE";

    public <T> String joinToString(Collection<T> collection, String separator ,String prefix) {
        String result = prefix;
        Iterator<T> iterator = collection.iterator();
        int index = 0;

        while (iterator.hasNext()) {
            if(index > 0)
                result += separator;
            result += iterator.next();
            index++;
        }
        return result;
    }

    // 자바는 오버로딩이 필요함
    public <T> String joinToString(Collection<T> collection, String separator) {
        return joinToString(collection, separator, "");
    }
}
