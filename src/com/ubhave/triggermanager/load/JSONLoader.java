package com.ubhave.triggermanager.load;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public abstract class JSONLoader
{

	public static boolean isValidJson(String jsonString)
	{
		JSONParser p = new JSONParser();
		try
		{
			p.parse(jsonString);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	protected static String loadFileContents(String fn) throws IOException
	{
		try {
			StringBuffer fileContents = new StringBuffer();
			String line;
			// TODO
			
//			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(Constants.CONFIG_DIR + "/" + fn)));
			BufferedReader in = null;
			while ((line = in.readLine()) != null)
			{
				fileContents.append(line);
			}
			in.close();
			return fileContents.toString();
		}
		catch(FileNotFoundException e)
		{
			return null;
		}
	}

}
