class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Set<Integer> unique_sizes = new HashSet<Integer>();
        List<List<Integer>> initial = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            unique_sizes.add(groupSizes[i]);
        }
        for(int size:unique_sizes)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<groupSizes.length;i++)
            {
                if(size==groupSizes[i])
                {
                    temp.add(i);
                }
            }
            if(temp.size()<=size)
            {
                initial.add(temp);
            }
            else{
                int number_of_subsets = temp.size()/size;
                int index =0;
                while (number_of_subsets>0) {
                    initial.add(temp.subList(index,index+size));
                    index = index+size;
                    number_of_subsets--;
                }
            }
        }
        return initial;

    }
}
