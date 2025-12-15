class ReverseString {

    String reverse(String inputString) {
      //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char[] reverseChars = inputString.toCharArray();
         String reverseString = "";
          for(int i=inputString.length()-1;i>=0;i--){
              reverseString += reverseChars[i];
          }

        return reverseString;
    }
  
}
