package app;
import java.util.ArrayList;


/**
 *  This class provides methods that perform operations on a list of generic objects.
 *  The Objects are assumed to have an appropriate implementation of the equals method.
 */
public class ArrayListServices <T> {

   /**
    * This method takes an ArrayList as a parameter and returns a new ArrayList that 
    * does not contain any duplicate data. For example, if this list was passed in: 
    * [A, B, D, A, A, E, B], the method would return a list containing: [A, B, D, E]. 
    * The ordering of the data does not matter. 
    * Assume that the parameter is not null, but it may be an empty ArrayList, in which case 
    * your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the 
    * same as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> deDuplicate(ArrayList<T> inputList){
      //Write your comments on how you implemented the method.
      /**
       
      **/
      
      //TODO: Implement this method.
      
      ArrayList<T> newList = new ArrayList<T>();

      for (T element : inputList) {
         if (!newList.contains(element)) {
            newList.add(element);
         }
      }
      return newList;

 // return the new list
    }

   

   /**
    * This method takes two ArrayLists as parameters and returns a new ArrayList that 
    * contains the intersection of the data in the ArrayLists passed in. The intersection 
    * contains the elements that occur in both lists.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method 
    * would return a list containing: [B, E]. The ordering of the data does not matter. Note that 
    * the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList, in which 
    * case your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same as 
    * the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetIntersection(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       
      **/
      
      //TODO: Implement this method.

         
      ArrayList<T> listC = new ArrayList<T>();
      if(listA.size() == 0 || listB.size() == 0){
         return listC;
      }else{
         for(T t1 : listA){
            for(T t2 : listB){
               if(t1.equals(t2)){
                  listC.add(t1);
               }
            }
         }
         listC= this.deDuplicate(listC);
         return listC;
      }
    }
      
      
   

   /**
    *  This method takes two ArrayLists as parameters and returns a new ArrayList that 
    * contains the set difference of the data in the ArrayLists passed in. The set difference 
    * contains the elements that occur only in one or the other list, but not in both.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method 
    * would return a list containing: [A, D, C]. The ordering of the data does not matter. Note 
    * that the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList. In the 
    * case where one list is empty, your method returns a new ArrayList that contains all of the 
    * elements on the other list- with no duplicates. In the case where both lists are empty, your 
    * method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same 
    * as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetDifference(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       
      **/
      
      //TODO: Implement this method.

      ArrayList<T> intersection = this.getSetIntersection(listA, listB);

      ArrayList<T> union = new ArrayList<T>();
      for(T t1 : listA){
         union.add(t1);
      }

      for(T t2 : listB){
         union.add(t2);
      }

      ArrayList<T> difference = new ArrayList<T>();
      for(T t3 : union){
         if (!difference.contains(t3) && !intersection.contains(t3)) {
            difference.add(t3);
         }
      }
      return difference;
   }
}


