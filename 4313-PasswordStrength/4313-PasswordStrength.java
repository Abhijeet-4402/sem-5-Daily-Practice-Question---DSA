// Last updated: 23/7/2026, 9:34:47 am
class Solution {
    public int passwordStrength(String password) {
        Set<Character> symbols = new HashSet<>();
		symbols.add('!');
		symbols.add('@');
		symbols.add('#');
		symbols.add('$');
		Set<Character> visited = new HashSet<>();
		int strength = 0;
		for(char ch: password.toCharArray()) {
			if(ch<='z' && 'a'<=ch) {
				if(!visited.contains(ch)) {
					strength++;
					visited.add(ch);
				}
			}else if(ch<='Z' && 'A'<=ch){
				if(!visited.contains(ch)) {
					strength+=2;
					visited.add(ch);
				}
			}else if(ch<='9' && '0'<=ch){
				if(!visited.contains(ch)) {
					strength+=3;
					visited.add(ch);
				}
			}else if(symbols.contains(ch)) {
				if(!visited.contains(ch)) {
					strength+=5;
					visited.add(ch);
				}
			}
		}
		return strength;
    }
}