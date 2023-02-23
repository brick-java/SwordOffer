package exam;

import java.util.LinkedList;

/**
 * @Author: brick
 * @CreateTime: 2023-02-24  00:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Sword09 {

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public Sword09() {
        stack1 = new LinkedList();
        stack2 = new LinkedList();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return -1;
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
}
