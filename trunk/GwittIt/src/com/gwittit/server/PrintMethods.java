package com.gwittit.server;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

import com.gwittit.client.facebook.entities.*;

public class PrintMethods {
    
    
	public static void main ( String[] args ) {
		
	    Class c = Event.class;
		
		Field fields[] = c.getFields ();
		
		
		for ( Field f : fields ) {
		    String methodName = up1 ( f.getName () );
		    
		    if ( f.getType () == java.lang.Long.class ) {
                System.out.println ( "public final native String get" + methodName + "String() /*-{ return this." +  convertToCamelCase (f.getName()) + " + \"\"; }-*/;" );
                System.out.println ( "public final Long get" + methodName + "() { return new Long ( get" + methodName + "String() ); }" );
		        
		    } else {
		        System.out.println ( "public final native " + f.getType ().getSimpleName ()  + " get" + methodName + "() /*-{ return this." +  convertToCamelCase (f.getName()) + "; }-*/;" );
		    }
		}
		

		
		System.out.println ( "public static native " +c.getSimpleName () + " fromJson(String jsonString) /*-{ return eval('(' + jsonString + ')');}-*/;");
		
	}
	
	private static String convertToCamelCase(String cn) {

	    Pattern p =  Pattern.compile ( "[A-Z]");
	    
	    StringBuilder tmp = new StringBuilder();

	    for ( int i = 0 ; i < cn.length (); i++ ) {
	        if ( Pattern.matches ( "[A-Z]", "" + cn.charAt ( i ) ) )  {
	            
	            tmp.append ( "_" );
	            tmp.append ( (""+cn.charAt ( i )).toLowerCase () );
	        }
	        else {
	            tmp.append ( cn.charAt ( i ) );
	        }
	    }
	    
	    return tmp.toString ();
    }

	public static String up1(String s) {
	    
	    
	    return (s.length()>0)? Character.toUpperCase(s.charAt(0))+s.substring(1) :
	    s;
	 }
}