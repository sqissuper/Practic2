package main;

import java.util.*;

public class Main6 {

    //括号匹配问题
//    public static boolean isValid(String s) {
//        if(s.length() % 2 != 0) return false;
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch == '{' || ch == '[' || ch == '(') {
//                stack.push(ch);
//            } else {
//                if(!stack.empty()) {
//                    char ret = stack.peek();
//                    if(ret == '{' && ch == '}' || ret == '[' && ch == ']' || ret == '(' && ch == ')') {
//                        stack.pop();
//                    } else {
//                        return false;
//                    }
//                } else {
//                    return false;
//                }
//            }
//
//        }
//        return stack.empty();
//    }


    //棒球比赛
//    public static int calPoints(String[] ops) {
//        Stack<Integer> s = new Stack<>();
//        for(int i = 0; i < ops.length; i++) {
//            String str = ops[i];
//            if(str.equals("C") && !s.empty()) {
//                s.pop();
//            } else if(str.equals("D") && !s.empty()){
//                s.push(2 * s.peek());
//            } else if(str.equals("+") && !s.empty()) {
//                int a = s.peek();
//                s.pop();
//                int b = s.peek();
//                s.push(a);
//                s.push(a + b);
//            } else {
//                s.push(Integer.parseInt(str));
//            }
//        }
//        int sum = 0;
//        while(!s.empty()) {
//            sum += s.peek();
//            s.pop();
//        }
//        return sum;
//    }

    //逆波兰表达式求解
//    public static int evalRPN(String[] tokens) {
//        Stack<Integer> s = new Stack<>();
//        for(int i = 0; i < tokens.length; i++) {
//            String str = tokens[i];
//            if(str.equals("+") && !s.empty()) {
//                s.push(s.pop() + s.pop());
//            }else if(str.equals("-") && !s.empty()) {
//                //记录先出的栈  后出的栈减去先出的栈
//                int num1 = s.pop();
//                s.push(s.pop() - num1);
//            } else if(str.equals("*") && !s.empty()) {
//                s.push(s.pop() * s.pop());
//            } else if(str.equals("/") && !s.empty()) {
//                //记录先出的栈  后出的栈除以先出的栈
//                int num2 = s.pop();
//                s.push(s.pop() / num2);
//            } else {
//                s.push(Integer.parseInt(str));
//            }
//        }
//        return s.peek();
//    }

    //分条件出栈
//    public static ArrayList<Integer> asylum(int[][] ope) {
//        ArrayList<Integer> end = new ArrayList<>();
//        List<Integer> ret = new ArrayList<>();
//        for(int i = 0; i < ope.length; i++){
//            //若为1   临时列表添加第二个元素
//            if(ope[i][0] == 1) {
//                ret.add(ope[i][1]);
//
//            } else if(ope[i][0] == 2) {
//                //若为2  第二个元素若为0 出ret链表第一个元素  最终链表进行接收
//                if(!ret.isEmpty() && ope[i][1] == 0) {
//                    end.add(ret.get(0));
//                    ret.remove(0);
//                    //第二个元素为1 遍历ret表找到第一个为正数的数存到end表里
//                } else if(ope[i][1] == 1) {
//                    for(int j = 0; j < ret.size(); j++) {
//                        if(ret.get(j) > 0) {
//                            end.add(ret.get(j));
//                            ret.remove(j);
//                            break;
//                        }
//                    }
//                    //第二个元素为-1 遍历ret表找到第一个为负数的数存到end表里
//                } else if(ope[i][1] == -1) {
//                    for(int j = 0; j < ret.size(); j++) {
//                        if(ret.get(j) < 0) {
//                            end.add(ret.get(j));
//                            ret.remove(j);
//                            break;
//                        }
//                    }
//                }
//            }
//
//        }
//        return end;
//    }

    //约瑟夫问题
//    public static int getResult(int n) {
//        List<Integer> list = new LinkedList<>();
//        for(int i = 1; i <= n; i++) {
//            list.add(i);
//        }
//        int start = 2;
//        while(list.size() > 1) {
//            for(int i = 0; i < list.size(); i++) {
//                if((i + 1) % start != 1) {
//                    list.set(i,-1);
//                }
//            }
//            start++;
//            Iterator<Integer> iter = list.iterator();
//            while(iter.hasNext()) {
//                if(iter.next() == -1) {
//                    iter.remove();
//                }
//            }
//            list.add(0,list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        }
//        return list.get(0);
//    }
    public static void main(String[] args) {

//        Deque<Integer> q1 = new LinkedList<>();
//        LinkedList<Integer> list = new LinkedList<>();
//        List<Integer> list1 = new LinkedList<>();
////        list1.add(1,1);
//
//        list1.add(1);
//        list1.add(2);
//        System.out.println(list1.get(0));


//        int[][] arr = {{1,1},{1,-1},{2,0},{2,-1}};
//        System.out.println(asylum(arr));

//
        //System.out.println(list.get(0));

//        String[] s = {"4","13","5","/","+"};
//        System.out.println(evalRPN(s));
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        System.out.println(s.pop());
//        String[] ops = {"1"};
//        System.out.println(calPoints(ops));

//        String str = "([}}])";
//        System.out.println(isValid(str));
    }
}
