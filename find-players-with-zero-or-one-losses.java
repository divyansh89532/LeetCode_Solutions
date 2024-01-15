class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> win= new HashSet<>();
        Set<Integer> loss= new HashSet<>();
        Set<Integer> loss2= new HashSet<>();
        for(int []val:matches){
            int winner= val[0];
            int loser= val[1];

            if(!loss.contains(winner) && !loss2.contains(winner)){
                win.add(winner);
            }

            if(win.contains(loser)){
                win.remove(loser);
                loss.add(loser);
            }
            else if(loss.contains(loser)){
                loss.remove(loser);
                loss2.add(loser);
            }
            else if(loss2.contains(loser)){
                continue;
            }
            else
                loss.add(loser);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(win));
        ans.add(new ArrayList<>(loss));
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}
