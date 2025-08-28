// Last updated: 28/8/2025, 11:20:59 am
class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
    Map<String,List<String>> map = new HashMap<>();
    List<List<String>> ll = new ArrayList<>();
    for(int i = 0; i < arr.length; i++){
        String key = getKey(arr[i]);
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(arr[i]);
    }

    for(String key : map.keySet()){
        ll.add(map.get(key));
    }

    return ll;
    // for(String word:strs){
    //     char[] ch=word.toCharArray();
    //     Arrays.sort(ch);
    //     String sortedWord=new String(ch);
    //     if(!map.containsKey(sortedWord)){
    //         map.put(sortedWord,new ArrayList<>());
    //     }
    //     map.get(sortedWord).add(word);
    // }
    // return new ArrayList<>(map.values());


    }

    public String getKey(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i]);
            sb.append('x');
        }
        return sb.toString();
    }

}