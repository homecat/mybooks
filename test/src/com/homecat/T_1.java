package com.homecat;

import java.text.SimpleDateFormat;
import java.util.Date;

class Demo<T>{
	private T var;
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var = var;
	}
}
public class T_1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Demo<String> d = new Demo();
		d.setVar("慧灯朗朗，照我一路前行");
		System.out.println(d.getVar());
		
		Date dt = new Date();
		SimpleDateFormat t = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(t.format(dt));
	}
}
