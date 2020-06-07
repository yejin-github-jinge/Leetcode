package StackCode;

import java.util.Stack;


/*["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"]*/
public class BoubleStackToQueue {

    Stack<Integer>  stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


        public void push(int node) {
            if (stack2.empty()) {
                stack1.push(node);
            } else {
                do {
                    stack1.push(stack2.pop());
                }while(!stack2.empty());
                stack1.push(node);
            }
        }

        public int pop() {
            if (!stack2.empty()) {
                return stack2.pop();
            } else {
                do {
                    stack2.push(stack1.pop());
                }while(!stack1.empty());
                return stack2.pop();
            }
        }

    public static void main(String[] args) {
        BoubleStackToQueue boubleStackToQueue = new BoubleStackToQueue();
        boubleStackToQueue.push(1);
        boubleStackToQueue.push(2);
        boubleStackToQueue.push(3);
        System.out.println(boubleStackToQueue.pop());
        System.out.println(boubleStackToQueue.pop());

        boubleStackToQueue.push(4);
        System.out.println(boubleStackToQueue.pop());
        boubleStackToQueue.push(5);
        System.out.println(boubleStackToQueue.pop());
        System.out.println(boubleStackToQueue.pop());


    }

}
