package com.abc;

import java.util.Calendar;
import java.util.Date;

public class DateProvider {
	//Added Volatile keyword to prevent threads caching
    private volatile static DateProvider instance = null;

    // Implemented Singleton design pattern using double checked locking mechanism
    public static DateProvider getInstance() {
        if (instance == null){
        	synchronized(DateProvider.class){
        		if(instance == null){
                    instance = new DateProvider();
        		}
        	}
        }
        return instance;
    }

    public Date now() {
        return Calendar.getInstance().getTime();
    }
}
