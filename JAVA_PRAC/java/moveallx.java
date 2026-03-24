public class moveallx{
    public static void movellx(String str, int idx, int count, String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }

        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            movellx(str, idx+1, count, newstr); 
        }
        else{
            newstr+=currchar;
            movellx(str, idx+1, count, newstr);
        }

    }
    public static void main(String args[]){
        String str="xaxxbcxxdxx";
        movellx(str, 0, 0, "");
    }
}


