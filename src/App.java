import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public List<String> concat(List<String> l1, List<Integer> l2) {
        l1.addAll(l2.stream().map((x) -> String.valueOf(x)).collect(Collectors.toList()));
        return l1;
    }

    public boolean isPalindrome(String text) {
        return Optional.ofNullable(text.substring(0, text.length() / 2))
                .map(s1 -> s1.equals(text.substring(text.length() / 2, text.length()))).orElseGet(() -> false)
                .booleanValue();
    }

    public long wordCount(String text, String word) {
        List<String> list = Arrays.asList(text.split(" "));
        return list.stream().filter(p -> p.contains(word)).count();
    }

    public Character firstNoRepeatedChar(String x) {
        List<Character> list = x.chars().mapToObj(xf -> (char) xf).collect(Collectors.toList());
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> {
                    if (v == 1) {
                        map.put(k, x.indexOf(k));
                    }

                });
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(p -> p.getKey()).findFirst().get();
    }
}
