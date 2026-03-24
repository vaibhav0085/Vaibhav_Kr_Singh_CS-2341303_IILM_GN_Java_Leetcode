public class permutaion {
    public static void permPrint(String str, String permut) {
      if(str.length()==0){
        System.out.println(permut);
        return;
      }
      for(int i=0;i<str.length();i++){
       char currchar = str.charAt(i);
       String newstr=str.substring(0,i)+str.substring(i+1);
       permPrint(newstr, permut+currchar); 
      }
    }
    public static void main(String args[]){
        String str="abc";
        permPrint(str, "");
    }
}
