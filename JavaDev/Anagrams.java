public class Anagrams {
    public ArrayList<String> anagrams(String[] strs) {
        
        ArrayList<String> anagram = new ArrayList<String>();
        HashMap<String,ArrayList<String>> list = new HashMap<String,ArrayList<String>>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (list.containsKey(key)) {
                list.get(key).add(str);
            } else {
                list.put(key,new ArrayList<String>(Arrays.asList(str)));
            }
        }
        for (ArrayList<String> test:list.values()) {
            if (test.size() > 1) {
                anagram.addAll(test);
            }
        }
        return anagram;
    }
}