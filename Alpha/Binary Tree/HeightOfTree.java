public class HeightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Height of tree
    public static int Height(Node root){
        if(root == null) return 0;

        int lh = Height(root.left);
        int rh = Height(root.right);

        return Math.max(lh, rh) + 1;
    }
    //Count Nodes
    public static int Count(Node root){
        if(root == null) return 0;

        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount + rightCount + 1;
    }
    // Sum of Node
    public static int Sum(Node root){
        if(root == null) return 0;

        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum + rightSum + root.data;
    }
    
    //Diameter of tree - Approch 1 O(n^2)
    public static int Diameter(Node root){
        if(root == null) return 0;

        int leftDia = Diameter(root.left);
        int leftHei = Height(root.left);
        int rightDia = Diameter(root.right);
        int rightHei = Height(root.right);

        int self = leftHei + rightHei + 1;

        return Math.max(self, Math.max(leftDia, rightDia));
    }

    //Approch 2 O(n)
    static class Info{
        int dia;
        int ht;

        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info Diameter2(Node root){
        if(root == null) return new Info(0, 0);

        Info leftInfo = Diameter2(root.left);
        Info rightInfo = Diameter2(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht + 1);

        return new Info(dia, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(Height(root));
        // System.out.println(Count(root));
        // System.out.println(Sum(root));
        System.out.println("Diameter of Node = "+Diameter2(root).dia);
        System.out.println("Height of tree = "+Diameter2(root).ht);
    }
}
