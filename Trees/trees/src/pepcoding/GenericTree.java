package pepcoding;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>(); // Changed to Node type
    }
    
    public static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = null; // Initialize root
        Stack<Node> st = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                
                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        
        // Now you can use the root node
        if (root != null) {
            display(root);
        }
    }
}