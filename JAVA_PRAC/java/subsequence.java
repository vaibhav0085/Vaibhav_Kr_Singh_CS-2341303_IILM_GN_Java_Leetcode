public class subsequence {
    public static void subsequence(String str, int idx, String newstr) {
        if(idx==str.length()){
            System.err.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        subsequence(str, idx+1, newstr+currchar);

        subsequence(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str="abcd";
        subsequence(str, 0, "");
    }
}