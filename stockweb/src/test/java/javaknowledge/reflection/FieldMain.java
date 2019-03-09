package javaknowledge.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;

import javaknowledge.annotation.ExcelFieldAlias;
import javaknowledge.annotation.ExcelFieldAliasBean;

import static java.lang.System.out;

import java.lang.annotation.Annotation;


public class FieldMain {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated metho
		
        Class clz=Class.forName("javaknowledge.annotation.UploadUserBean");
        
        List<ExcelFieldAliasBean> excelFieldAliasBeanList = new ArrayList<ExcelFieldAliasBean>();
        
        for(Field field:clz.getDeclaredFields()){
        	out.format("Field Name: %s%n", field.toGenericString());
        	
        	List<Annotation> annotationList =new ArrayList<Annotation>();
        	Collections.addAll(annotationList, field.getDeclaredAnnotations());
        	
			annotationList.forEach(e -> {
				out.format("   annotationName: %s%n", e.toString());
				out.format("      annotationType:%s%n",e.annotationType().toGenericString() );
				
				ExcelFieldAlias ae=field.getAnnotation(ExcelFieldAlias.class);
				
				ExcelFieldAliasBean eb=new ExcelFieldAliasBean();
				eb.setExcelField(ae.excelField());
				eb.setMandatory(ae.mandatory());
				eb.setOrderNum(ae.orderNum());
				
				excelFieldAliasBeanList.add(eb);
				
			});
			
		
			
		
        	//out.format("annotationList size: %s%n", annotationList.size());
        	/*out.format("    %s%n", field.getAnnotations());
        	
        	out.format("    %s%n", field.getDeclaredAnnotations());
        	out.format("    %s%n", field.getAnnotations());
        	out.format("    %s%n", field.getAnnotations());
        	out.format("    %s%n", field.getAnnotations());
        	out.format("    %s%n", field.getAnnotations());
        	out.format("    %s%n", field.getAnnotations());
        	out.format("    %s%n", field.getAnnotations());*/
        	
        }
        
		excelFieldAliasBeanList.stream()
				.sorted((e1, e2) -> Integer.parseInt(e2.getOrderNum()) - Integer.parseInt(e1.getOrderNum()))
				.collect(Collectors.toList()).forEach(e -> out.format("           %s   %s   %s%n", e.getExcelField(),
						e.isMandatory(), e.getOrderNum()));

		/// e -> out.format(" %s %s %s%n", e.getExcelField(), e.isMandatory(),
		/// e.getOrderNum())
		excelFieldAliasBeanList.stream().filter(e -> !e.getOrderNum().equals("3"))
				.filter(e -> !e.getExcelField().contains("id")).peek( e->out.printf("              e:%s%n", e.toString())).forEach(e -> out.format("           %s   %s   %s%n",
						e.getExcelField(), e.isMandatory(), e.getOrderNum()));

	}

}
