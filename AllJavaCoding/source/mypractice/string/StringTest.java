package mypractice.string;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Mar 23, 2012
 * Time: 9:50:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {


    public StringTest() {
    }

    public static void main(String[] args) {
        String str = null;
        System.out.println("The returned string is " + new StringTest().checkEmptydata(str));
    }


    public String checkEmptydata(Object obj) {
        String writeValue = null;

            /*if (obj == null)
                writeValue = "";
            else
                writeValue = (String) obj;*/
            if(obj!=null){
                writeValue = (String) obj;
            }else
                throw  new IllegalArgumentException();

         /*  if (obj == null)
                writeValue = "";
            else
                writeValue = obj.toString();  */

        return writeValue;
    }
}


