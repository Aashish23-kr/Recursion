class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,new ArrayList<>(),result,k,n);
        return result;
    }
    private void backtrack(int index,List<Integer> current,List<List<Integer>> result,int k, int target){
        if(target == 0 && current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0 || current.size()>k){
            return;
        }
        for(int i=index; i<=9; i++){
            current.add(i);
            backtrack(i+1,current,result,k,target-i);
            current.remove(current.size()-1);
        }
    }
}