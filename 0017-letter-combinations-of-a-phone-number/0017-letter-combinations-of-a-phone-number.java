class Solution {
    private List<String> result = new ArrayList<>();

    private void solve(int index, String digits, StringBuilder sb, Map<Character,String> map){
        if(index >= digits.length()){
            result.add(sb.toString());
            return;
        }
        char ch = digits.charAt(index);
        String str = map.get(ch);

        for(int i=0; i<str.length(); i++){
            sb.append(str.charAt(i));
            solve(index+1,digits,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length() ==0) return new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        solve(0,digits,new StringBuilder(),map);

        return result;
    }
}