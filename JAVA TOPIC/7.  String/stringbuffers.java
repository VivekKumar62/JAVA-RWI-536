public class stringbuffers {
    public static void main(String[]args){

        // methods :********************

//append:--------------example

       StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

            sb.append("vivek");
           System.out.println(sb.capacity()); //vivek

           sb.append("vivek java");
          System.out.println(sb.capacity());  //16

        sb.append("vivek javaa");
        System.out.println(sb.capacity()); //34 (16*2)+2
//
//        StringBuffer sb=new StringBuffer("vivek  ");
//        System.out.println(sb.append("python")); //vivek  python



//length:------------example
//  StringBuffer sb=new StringBuffer("vivek");
//        System.out.println(sb.length()); // count length of char =5



//charAt:---------------example
//        StringBuffer sb=new StringBuffer("vivek");
//        System.out.println(sb.charAt(3));  // present char on index = e



//delete:---------------example
//        StringBuffer sb=new StringBuffer("vivek");
//        System.out.println(sb.delete(0,1)); // delete char=ivek



//deletecharAt:---------------example
//StringBuffer sb=new StringBuffer("MARVEL");
//        System.out.println(sb.deleteCharAt(3)); //MAREL



//equals:---------------example
//        StringBuffer sb1= new StringBuffer("MARVEL");
//        StringBuffer sb2 = new StringBuffer("MARVEL");
//        System.out.println(sb1.equals(sb2)); //false because kisi or object ko refer kr rhe hai agar kisi ek ko krte to True aata !
//
//        StringBuffer string1= new StringBuffer("MARVEL");
//        StringBuffer string2 = string1.append("MCU");
//        System.out.println(string1.equals(string2)); //true



//indexof:---------------example
//        StringBuffer sb=new StringBuffer("MARVEL DCD")       ;
//        System.out.println(sb.indexOf("R")); // find index of char  = 2
//        System.out.println(sb.lastIndexOf("D")); // check last index =9



 //replace:-------------example
//        StringBuffer sb=new StringBuffer("MARVEL DCD");
//        System.out.println(sb.replace(7,10,"MCU"));  //MARVEL MCU



//reverse:------------------example
//        StringBuffer sb=new StringBuffer("MARVEL MCU");
//        System.out.println(sb.reverse()); // char reverse = UCM LEVRAM



//subSequence:------------------example
//        StringBuffer sb=new StringBuffer("MARVEL MCU");
//        System.out.println(sb.subSequence(3,5)); //VE



 //substring:-------------example
// StringBuffer sb=new StringBuffer("PYTHON JAVA")      ;
//        System.out.println(sb.substring(3,8)); //HON J
//



//ensureCapcity:----------example
//        StringBuffer sb=new StringBuffer("vivek");
//        System.out.println(sb.capacity());
//        sb.ensureCapacity(100);
//        System.out.println(sb.capacity());
         //21
        //100



 //setCharAt:----------example
//        StringBuffer sb=new StringBuffer("java python");
//        sb.setCharAt(4,'R');
//        System.out.println(sb); //javaRpython



//setLength:--------example
//        StringBuffer sb=new StringBuffer("java python");
//        sb.setLength(5);
//        System.out.println(sb);


//trimToSize:---------example
//      StringBuffer sb=new StringBuffer();
//      sb.ensureCapacity(100);
//      sb.append("hello");
//      sb.trimToSize();
//      System.out.println(sb.capacity());  //5 west memory cover





    }
}