class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        //by getting rulekey index we are going to compare with rulevalue if it matches
        //count will increment 
        int j =value(ruleKey);
        for(int i=0; i< items.size(); i++){
             String s=items.get(i).get(j);
             if(ruleValue.equals(s))
             count++;
        }
        return count;
    } 
         public static int value(String ruleKey){
            //Given is in the format of [type, color, name];
            //rulekey it may be "type","color", "name";
            //by using switch case we can return the indices 
            switch(ruleKey){
                case "type":
                return 0;
                case "color":
                return 1;
                case "name":
                return 2;
                default :
                return -1;
            }
        }
    }