class Subset {
    public List<List<Integer>> subsets(int[] nums) {
         
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> ans = new ArrayList<>();
        int index=0;
         solve(nums , index , ans , result);
         System.out.println(nums.length);
         return result;
    }

    public void solve(int [ ] nums , int index , List<Integer> ans ,List<List<Integer>> result )
     {
     if(index >= nums.length){
          result.add(new ArrayList<>(ans));
          return ;
     }

     solve(nums , index+1 , ans , result);

     int element = nums[index];
     ans.add(element);
     solve(nums , index+1 , ans , result);
     ans.remove(ans.size() - 1);
    }
}
