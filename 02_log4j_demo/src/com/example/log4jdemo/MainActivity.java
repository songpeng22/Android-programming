package com.example.log4jdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//log
import android.util.Log;
//log4j
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

public class MainActivity extends Activity {
	private String TAG = "log4j_demo";
	//Logger logger = LogManager.getRootLogger();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
          
        //log
        Log.i(TAG, "log4jdemo init.");
/*     
        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");
*/                
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
