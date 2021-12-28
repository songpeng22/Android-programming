package com.example.appendlog2file;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainActivity extends Activity {

	public void appendLog(String text)
	{       
	   File logFile = new File("sdcard/log.txt");
	   if (!logFile.exists())
	   {
	      try
	      {
	         logFile.createNewFile();
	      } 
	      catch (IOException e)
	      {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	   }
	   try
	   {
	      //BufferedWriter for performance, true to set append to file flag
	      BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true)); 
	      buf.append(text);
	      buf.newLine();
	      buf.close();
	   }
	   catch (IOException e)
	   {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	   }
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        appendLog("this is simple file log append2.");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
