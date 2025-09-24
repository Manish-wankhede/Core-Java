import java.util.*;
public class reverseStack {
    public static void pushAtBott(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBott(s, data);
        s.push(top);
    }
    public static void reverseStackEle(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStackEle(s);
        pushAtBott(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        // 3 - 2 - 1
        reverseStackEle(s);
        printStack(s);
        // 1 - 2 - 3
    }
}
