/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStruture;
import java.util.Stack;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author pedro
 */
public class BalanceamentoDeParenteses {

    public static boolean solve(String expression){
        
        Set<Character> openSymbol = Set.of('(','{','[');
        Set<Character> closeSymbol = Set.of(')','}',']');
        Stack<Character> stack = new Stack<>();

        for(char c: expression.toCharArray()){
            if(openSymbol.contains(c)) stack.push(c);
            if(closeSymbol.contains(c)){
                if(stack.isEmpty()) return false;
                var open = stack.pop();
                if(open == '(' && c != ')') return false;
                if(open == '[' && c != ']') return false;
                if(open == '{' && c != '}') return false;

            }
        }
        return stack.isEmpty();
    }
    
}
