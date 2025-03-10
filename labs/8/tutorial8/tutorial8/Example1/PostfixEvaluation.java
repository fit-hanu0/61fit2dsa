package tutorial8.Example1;


import java.util.Scanner;
public class PostfixEvaluation {
    public PostfixEvaluation()
    {
    }
    public static void main (String[]args) 
    {
        String exp;
        System.out.println("Please input a postfix expression:");
        Scanner scanner = new Scanner(System.in);
        exp = scanner.nextLine();
        
        ArrayStack s = new ArrayStack();
        for (int i = 0; i<exp.length(); i++)
        {
           char c = exp.charAt(i);
           if (('0'<=c)&&(c<='9'))
           {
        	   s.push((int)c - (int)('0'));
        	   //s.push(Character.getNumericValue(c));
           }
           else
           if ((c=='+')||(c=='-')||(c=='*')||(c=='/'))
           {
               int op1 = s.pop();
               int op2 = s.pop();
               switch (c) {
                   case '+' :
                        s.push(op2 + op1);
                        break;
                   case '-' :
                        s.push(op2 - op1);                   
                        break;
                   case '*' :     
                        s.push(op2 * op1);                   
                        break;
                   case '/' :
                        s.push(op2 / op1);                   
                        break;                   
               }
           }
        }
        System.out.println("The value of the expression is :" + s.pop());
    }    
}

