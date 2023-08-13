class Solution {
    public String defangIPaddr(String address) {
        String[] string_array = null;
        string_array = address.split("\\.");
        String answer = String.join("[.]",string_array);
        return answer;
    }
}
