package copyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

public class CopyFileInJava {
	public static void main (String[] args) throws IOException {
		System.out.println("Program starting..");
      
		File source = new File("F:/Ravi Agrawal/Videos/Annual Day 26 Jan 2018/VIDEO_TS/VTS_01_1.vob");
        File dest = new File("F:/Ravi Agrawal/Videos/Annual Day 26 Jan 2018/VIDEO_TS/Test1.vob");
        
        System.out.println(java.time.LocalDate.now());
        long startTime = System.nanoTime();
        
        //copy file conventional way using Stream
        //copyFileUsingStream(source, dest);
        
        copyFileUsingJava7Files(source, dest);
        
        
        long endTime = System.nanoTime()-startTime;
        System.out.println("Time taken by Stream Copy in Nano Seconds: = "+endTime);
        System.out.println("Time in seconds: " +TimeUnit.SECONDS.convert(endTime, TimeUnit.NANOSECONDS));
	}

	//Using Files class copy() method to copy file in java for Java 7 or higher versions. It uses File System providers to copy the files.
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	    
		}
	
	
	//This is the conventional way of file copy in java, here we create two Files, source and destination. 
	//Then we create InputStream from source and write it to destination file using OutputStream for java copy file operation. 
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        	}
	    	} finally {
	        is.close();
	        os.close();
	    	}
		}
	



}
