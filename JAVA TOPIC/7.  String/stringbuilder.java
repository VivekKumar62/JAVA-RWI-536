public class stringbuilder {
    public static void main(String[]args){

        // Non- Synchronized methods :********************
 //  setCharAt:-

        StringBuilder sb= new StringBuilder("marvel");
        System.out.println(sb);

        // if you want to print char at index 0
        System.out.println(sb.charAt(0));

        //set char  at index
        sb.setCharAt(0,'c');
        System.out.println(sb); // replace string means vivek= pivek

   //insert:-
        sb.insert(0,'m');//add
        System.out.println(sb);   //mcarvel

        sb.insert(2,'n');
        System.out.println(sb); //add  mcnarvel

  //delete:-
        sb.delete(2,3);
        System.out.println(sb); // mcarvel

        sb.delete(1,2);
        System.out.println(sb); //marvel

  //append:-
        sb.append(" "); // str= str +" "
        sb.append("m");  // str= str +"m"
        sb.append('c');  // str= str +"c"
        sb.append('u')  ;   // str= str +"u"
        System.out.println(sb); //marvel mcu

        System.out.println(sb.length()); //10

// startwith
        String str1="vivekmarvel";
        System.out.println("resut:- " + str1.startsWith("vivek")); // give boolean value= true
        System.out.println("resut:- " + str1.endsWith("vivek"));   //false

// format:-
//        String s1=new String("vivek");
//        String s2=new String("java");
//        String s3=String.format("%s %s",s1,s2);
//        System.out.println(s3.toString());




    }
}
