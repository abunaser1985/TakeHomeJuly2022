import java.io.File;
public class DoesFileExist {
	
	private static void doesFileExist() {
		// TODO Auto-generated method stub
		
	}
		
	public static void main(String[] args) {
    		
		doesFileExist();
    	
        // Initializing string to store the path
        String s1 = "/Users/aymaanabdullah/selenium/XYZ/File/Text.docx";
        String s2 = "C:\\xyz.txt";

        // Creating file handle	
        File f1 = new File(s1);
        File f2 = new File(s2);

        // Check if file a exists and is not directory
        if (f1.exists() &  !f1.isDirectory()) {
            System.out.println(f1 + " exists in the given directory.");
        } else {
            System.out.println(f1 + " does not exists or it may be a directory.");
        }

        // Check if a file exists
        if (f2.exists()) {
            System.out.println(f2 + " exists in the given directory.");
        } else {
            System.out.println(f2 + " does not exists in the given directory.");
        }
    	}
   

	
}


