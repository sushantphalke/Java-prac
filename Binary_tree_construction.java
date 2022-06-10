public class Binary_tree_construction {
    public static class Node {
        int data;
        Node right,left;
        Node (int data){
            this.data  = data;
            this.left = null;
            this.right = null;


        }

    }
    static class Binary_tree{
        static int idx = -1;
        public static Node Build_tree(int [] Nodes){
            idx++;
            if (Nodes[idx] == -1){
            return null;
        }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = Build_tree(Nodes);
            newNode.right = Build_tree(Nodes);
            return newNode;
        }

    }

    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree tree  = new Binary_tree();
        Node root =  tree.Build_tree(nodes);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }


}
