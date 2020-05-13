public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    // Your code here
    int[] finalArray;
    
    finalArray = new int[beforeArray.length + 1];
    
    for(int i = 0 ; i < indexToInsert ; i++){
      finalArray[i] = beforeArray[i];
    }
    finalArray[indexToInsert] = valueToInsert;
    
    for(int i = indexToInsert ; i < beforeArray.lenght ; i++){
      finalArray[i+1] = beforeArray[i];
    }
    
    return finalArray
  }

  public static void main(String[] args){
    // Your code here
    int[] newsValueArray;
    newsValueArray = new int[]{2,4,6,8,10};
    System.out.println('Old Array');
    
    for(int i = 0 ; i < newsValueArray.length ; i++){
      System.out.println(newsValueArray[i]);
    }
    
    newsValueArray = insertIntoArray(newsValueArray,12,14);
    System.out.println('New Array after two insertions');
    
    for(int i = 0 ; i < newsValueArray.length ; i++){
      System.out.println(newsValueArray[i]);
    }
    
  }
}
