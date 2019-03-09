package javaknowledge.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.assertj.core.util.Arrays;

import javaknowledge.annotation.UploadUserBean;

public class reflectionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		UploadUserBean userUploadBean =new UploadUserBean();
		
		
		/*note: If an instance of an object is available, then the simplest way to get its Class is to invoke Object.getClass().
		 *  Of course, this only works for reference types which all inherit from Object
		 */
		Class clz =userUploadBean.getClass();
		
		
		/*
		 * If the type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type. 
		 * This is also the easiest way to obtain the Class for a primitive type.
		 * */
        Class booleanClz=boolean.class;
        
        Class clz2=UploadUserBean.class;
        
        
        Class clz3=Class.forName("javaknowledge.annotation.UploadUserBean");
        
        
        clz3.getSuperclass();
        System.out.println("clz3.getSuperclass();"+clz3.getSuperclass());
       
        System.out.println("clz3.getDeclaredClasses();"+clz3.getDeclaredClasses());
        Class<?>[] clzArr= clz3.getClasses();
        		//clz3.getDeclaredClasses();
        
        for(int i=0;i<clzArr.length;i++){
        	
        	System.out.println("clzArr["+i+"]:"+clzArr[i].getDeclaredClasses());
        }
        
        clz3.getClasses();
        System.out.println("clz3.getClasses();"+clz3.getClasses());
        
        
        //Class members
        
        System.out.format("Package: %n  %s%n%n", clz.getPackage());
        
        
        
      /// Arrays.asList(clz.getDeclaredFields()).forEach(e->System.out.format("  %s%n", ((Field)e).toGenericString()));
       
        System.out.format("Get by using  %s method: %n", "getDeclaredField()");
       for(Field field:clz.getDeclaredFields()){
    	   System.out.format("   %s%n", field.toGenericString());
    	   
       }
       
       
       System.out.format("Get by using  %s method: %n", "getFields()");
      for(Field field:clz.getFields()){
   	   System.out.format("   %s%n", field.toGenericString());
   	   
      }
      
      
      System.out.format("Get by using  %s : %n%n", "getMethods()");
      for(Method method: clz.getMethods()){
    	  System.out.format("   %s%n", method.toGenericString()); 
      }
       
      
      
      System.out.format("Get by using  %s : %n%n", "getMethods()");
      for(Method method: clz.getDeclaredMethods()){
    	  System.out.format("   %s%n", method.toGenericString()); 
      }
       
      
      
   
      
      System.out.format("Get by using  %s : %n%n", "getConstructors()");
      for(Constructor<?> custructor: clz.getConstructors()){
    	  System.out.format("   %s%n", custructor.toGenericString()); 
      }
       
      
      
      System.out.format("Get by using  %s : %n%n", "getDeclaredConstructors()");
      for(Constructor<?> custructor: clz.getDeclaredConstructors()){
    	  System.out.format("   %s%n", custructor.toGenericString()); 
      }
       
       
	}

}
