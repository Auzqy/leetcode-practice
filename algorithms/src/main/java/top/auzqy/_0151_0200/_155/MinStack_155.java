package top.auzqy._0151_0200._155;

import java.util.Stack;

/**
 * description:
 *
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * createTime: 2020/4/19 14:57
 * @author au
 */
class MinStack_155 {

    private Stack<Integer> minStack;
    private Stack<Integer> normalStack;

    /** initialize your data structure here. */
    public MinStack_155() {
        minStack = new Stack<>();
        normalStack = new Stack<>();
    }
    
    public void push(int x) {
        normalStack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        // 两个栈都得 pop
        if (!normalStack.isEmpty()) {
            normalStack.pop();
            minStack.pop();
        }
    }
    
    public int top() {

        return 0;
    }
    
    public int getMin() {
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */