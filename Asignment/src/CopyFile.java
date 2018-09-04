import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
		
		try {
		    InputStream is = null;
		    OutputStream os = null;
		    try {
		        is = new FileInputStream("one.txt");
		        os = new FileOutputStream("two.txt");
		        byte[] buffer = new byte[1024];
		        int length;
		        while ((length = is.read(buffer)) > 0) {
		            os.write(buffer, 0, length);
		        }
		        System.out.println("Copy Successful");
		    } finally {
		        is.close();
		        os.close();
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
