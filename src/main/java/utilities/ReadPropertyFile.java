package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static Properties readPropertiesFile() throws IOException
	{
		FileInputStream fis=null;
		Properties prop=null;
		try
		{
			fis=new FileInputStream(".//Resources//config.properties");
			prop=new Properties();
			prop.load(fis);
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//fis.close();
		}
		return prop;
	}



}
