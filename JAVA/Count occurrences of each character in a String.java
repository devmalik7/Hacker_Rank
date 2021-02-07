
public class EachCharacterCountInString
{ 

 public static void main(String[] args)
    {
       characterCount("Alive is Awesome");
 
       characterCount("Java Hungry");
 
       characterCount("USA has 50 states");
    }

 static void characterCount(String inputString)
    {
        //Creating a HashMap, key :Character  value : occurrences as Integer
 
        HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
 
        //Converting inputString to char array
 
        char[] charArray = inputString.toCharArray();
 
        //traversal of each Character of charArray
 
        for (char c : charArray)
        {
            if(eachCharCountMap.containsKey(c))
            {
                //If char is present in eachCharCountMap, increment count by 1
 
                eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
            }
            else
            {
                                eachCharCountMap.put(c, 1);
            }
        }
 
        //Showing the eachCharCountMap
 
        System.out.println(eachCharCountMap);
    }
     
}
