package module_4;

public class StringDiffExample {
	    public static void main(String[] args) {

	        String s = "Hello";
	        s = s + " Everyone";  
	        System.out.println("String: " + s);

	        
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" Everyone");  
	        System.out.println("StringBuilder: " + sb);

	       
	        StringBuffer sbf = new StringBuffer("Hello");
	        sbf.append(" Everyone");  
	        System.out.println("StringBuffer: " + sbf);
	    }
}
