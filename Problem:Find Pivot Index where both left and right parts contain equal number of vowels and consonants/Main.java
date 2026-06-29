class Main{
  static boolean isVowel(char ch){
    ch=Character.toLowerCase(ch);
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
  }
  static int findIndex(char[] arr){
    int totalV=0,totalC=0;
    for(char ch:arr){
      if(isVowel(ch))
        totalV++;
      else
        totalC++;
    int leftV=0,leftC=0;
    for (int i=0;i<arr.length;i++){
      if(isVowel(arr[i]))
        totalV--;
      else
        totalC--;
      if(leftV==leftC && totalV==totalC)
        return i;
      if(isVowel(arr[i]))
        leftV++;
      else
        leftC++;
    }
      return -1;
    }
    public static void main(String args[]){
      char[] arr={'a','b','e','c','i','d','o','f'};
      System.out.println(findIndex(arr));
    }
  }
  
