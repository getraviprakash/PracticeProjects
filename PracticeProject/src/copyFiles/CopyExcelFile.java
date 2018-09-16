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

public class CopyExcelFile {
	public static void main (String[] args) throws IOException {
		System.out.println("Program starting..");
		
		String todaysDate = (java.time.LocalDate.now()).toString();
		System.out.println(todaysDate);
		File sourceFile = new File("D:/Ravi Agrawal/Practice/Test.xlsx");
		File destFile = new File("D:/Ravi Agrawal/Practice/"+todaysDate+".xlsx");
        
        long startTime = System.nanoTime();
        
        copyFileUsingJava7Files(sourceFile, destFile);
        
        long endTime = System.nanoTime()-startTime;
        System.out.println("Time taken by Stream Copy in Nano Seconds: = "+endTime);
        System.out.println("Time in seconds: " +TimeUnit.SECONDS.convert(endTime, TimeUnit.NANOSECONDS));
	}

	//Using Files class copy() method to copy file in java for Java 7 or higher versions. It uses File System providers to copy the files.
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	    
		}
	

}
