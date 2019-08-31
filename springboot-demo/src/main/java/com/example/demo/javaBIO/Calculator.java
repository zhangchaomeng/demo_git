package com.example.demo.javaBIO;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 工具类
 * @author userzcm
 *
 */
public class Calculator {
	
    private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");

   public static Object cal(String expression) throws ScriptException{

   return jse.eval(expression);

   }


}
