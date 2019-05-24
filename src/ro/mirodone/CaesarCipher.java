package ro.mirodone;

 class CaesarCipher {

     private String result = "";

     String decode(String code) {

         StringBuilder builder = new StringBuilder();
         String decoded = "";
         int lastCharValue = 'z';
         int alphabetLength = 'z' - 'a' + 1;
         for (char character : code.toCharArray()) {
             int charNoRotation = character + 5;
             int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
             //decoded += (char) charValue;
             builder.append(decoded);
             builder.append((char)charValue);
            result = builder.toString();
           // System.out.println(result);

        }
         //System.out.println(result);
        return result;
    }
}
