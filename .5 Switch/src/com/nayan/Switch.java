//

/*package com.nayan;

public class Main {
// we can use it for string  int char etc
    public static void main(String[] args) {
	char value='d';
	switch (value){
        case 'a':
            System.out.println("Char a found");
            break;
        case 'b':
            System.out.println("char b found");
            break;
        case 'c': case 'd': case 'e':
            System.out.println("char "+value+" found");
            break;

        default:
            System.out.println("char a b c d e not found please enter a valid value ");
            break;
    }
    }
}
*/
package com.nayan;

public class Main {
    public static void main(String[] args) {
        String value="NAYAN";
        // use this key words or know about this key words
        switch (value.toLowerCase()){
            case "nayan": case "ganga": case "vinu":
                System.out.println("name "+value+" found");
                break;
            default:
                System.out.println("value not found");
        }
    }
}