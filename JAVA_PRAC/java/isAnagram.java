public class isAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr = t.toCharArray();
        for(int  i = 0; i< s.length(); i++){
            Boolean found = false;
            for(int j = 0; j<t.length(); j++){
                if(s.charAt(i) == arr[j]){
                    arr[j] = '#';
                found = true;
                break;
                }
            }if(!found) return false;

        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("cat", "tac"));
    }
}
