package TreeCode;

import sun.reflect.generics.tree.Tree;

import javax.transaction.TransactionRequiredException;
import java.util.*;

public class LevelTrave {

    static class  TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(){
        }
        TreeNode(int value){
            this.value = value;
        }
    }


    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        postTravel(root);
        return list;
    }

    public static void postTravel(TreeNode root){
        if (root.left != null){
            postTravel(root.left);
        }

        if (root.right != null){
            postTravel(root.right);
        }
        System.out.println(root.value);

    }


    public static void flatten(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();

        if(root == null){
            return ;
        }

        TreeNode tree = root;
        TreeNode treeNode = new TreeNode(root.value);
        root = treeToLink(treeNode,tree) ;
    }

    public static TreeNode treeToLink(TreeNode root ,TreeNode tree){

        if(tree != null){
            //tree.left = new TreeNode(root.val);
            System.out.println(tree.value);
            root.right = new TreeNode(tree.value);
        }

        if(tree.left != null){
            treeToLink(root.right,tree.left);
        }

        if(tree.right != null){
            treeToLink(root.right,tree.right);
        }

        return root;
    }


    public static void main(String[] args) {

        int count = 2;
        //System.out.println(count % 2 == 0);

        TreeNode root = new TreeNode(3);
        TreeNode treeNode = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        TreeNode treeNode2 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(4);

        root.left = treeNode;
        root.right = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode.right = treeNode4;

        flatten(root);
       // postTravel(root);

        //前序遍历
//        System.out.println("前序遍历结果是：");
//        preTrave(treeNode4);
//        System.out.println("---------------------------------");

//        System.out.println("中序遍历结果是：");
//        midTrave(root);

//        System.out.println("后序遍历结果是：");
//        postTrave(root);

//         System.out.println("层次遍历结果是：");
//         System.out.println(levelTraveToArray(new TreeNode()));

       // System.out.println(zigzagLevelOrder(root));
       // System.out.println(maxDepth(root));
//        System.out.println(postTravelByStack(root));
//        System.out.println("前序非递归遍历结果是：");
//        System.out.println(preTraveByStack(root));
//        System.out.println("中序非递归遍历结果是：");
//        System.out.println(midTraveByStack(root));
    }

    //前序遍历
    public static void preTrave(TreeNode root){
        System.out.println(root.value);
        if (root.left != null){
             preTrave(root.left);
        }
        if (root.right != null){
            preTrave(root.right);
        }
    }

    //非递归前序
    public static List<Integer> preTraveByStack(TreeNode root){
        //char a ='a';
        //char[] chars = new StringBuffer[10].toString().toCharArray();
        List<Integer> list =  new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode treeNode = stack.pop();
            list.add(treeNode.value);
            if(treeNode.right != null){
                stack.push(treeNode.right);
            }
            if(treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }

        return list;
    }

    //中续遍历
    public static void midTrave(TreeNode root){
        if (root.left != null){
            midTrave(root.left);
        }
        System.out.println(root.value);
        if (root.right != null){
            midTrave(root.right);
        }
    }

    /*思路：每到一个节点 A，因为根的访问在中间，将 A 入栈。然后遍历左子树，接着访问 A，最后遍历右子树。

在访问完 A 后，A 就可以出栈了。因为 A 和其左子树都已经访问完成。
思路：

栈S;
p= root;
while(p || S不空){
    while(p){
        p入S;
        p = p的左子树;
    }
    p = S.top 出栈;
    访问p;
    p = p的右子树;
}

https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/die-dai-fa-by-jason-2/
*/

    //非递归中序 用stack
    public static List<Integer> midTraveByStack(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return list;
        }
        //stack.push(root);
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            while(temp != null){
                stack.push(temp);
                temp = temp.left;
            }

            if(!stack.isEmpty()){
                temp = stack.pop();
                list.add(temp.value);
                //if(temp.right != null)
                temp = temp.right;
            }
        }

//        if (root.left != null){
//
//            stack.add(root);
//            stack.add(root.left);
//        }else{
//            stack.add(root);
//        }
//
//        if(root.right != null){
//            TreeNode right = root.right;
//        }
//
//        while(!stack.isEmpty()){
//            TreeNode treeNode = stack.pop();
//            list.add(treeNode.value);
//            if(treeNode.right != null){
//                stack.push(treeNode.right);
//            }
//
//            if (treeNode != root){
//                if(treeNode.left != null){
//                    stack.push(treeNode.left);
//                }
//            }
//        }

        return list;
    }

    //后续遍历
    public static void postTrave(TreeNode root){
        if (root.left != null){
            postTrave(root.left);
        }

        if (root.right != null){
            postTrave(root.right);
        }
        System.out.println(root.value);
    }


    //非递归 后序遍历
    public static List<Integer> postTravelByStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);

        //while(stack.peek() != null)
        try {
            //TreeNode tree1 = stack.peek();
            System.out.println(stack.peek());
            while (!stack.empty()) {
                TreeNode tree = stack.pop();
                list.add(tree.value);
                if (tree.left != null) {
                    stack.push(tree.left);
                }
                if (tree.right != null) {
                    stack.push(tree.right);
                }
            }
        }catch(EmptyStackException e){
            e.printStackTrace();
        }finally {
            Collections.reverse(list);
        }

        return list;
    }



    //层次遍历
    public static void levelTrave(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()){
            int size = treeNodeQueue.size();
            while(size > 0){
                TreeNode poll = treeNodeQueue.poll();
                System.out.println(poll.value);
                size--;
                if(poll.left != null){
                    treeNodeQueue.offer(poll.left);
                }
                if(poll.right != null){
                    treeNodeQueue.offer(poll.right);
                }
            }
        }
    }


    //层次遍历保存到数组
    public static List<List<Integer>> levelTraveToArray(TreeNode root){
        List<List<Integer>> listList = new ArrayList<>();
        if(root == null){
            return listList;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);

        while (!treeNodeQueue.isEmpty()){
            int size = treeNodeQueue.size();
            List<Integer> integerList = new ArrayList<>();

            while(size > 0){
                TreeNode poll = treeNodeQueue.poll();
                System.out.println(poll.value);
                integerList.add(poll.value);
                size--;
                if(poll.left != null){
                    treeNodeQueue.offer(poll.left);
                }
                if(poll.right != null){
                    treeNodeQueue.offer(poll.right);
                }
            }

            listList.add(integerList);
        }
        return listList;
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listList = new ArrayList<>();
        if(root == null){
            return listList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 1;

        while (! queue.isEmpty()){
            int size = queue.size();
            List<Integer> listInteger = new ArrayList<>();

            while(size > 0){
                TreeNode treenode = queue.poll();
                listInteger.add(treenode.value);

                    if(treenode.left != null){
                        queue.offer(treenode.left);
                    }
                    if(treenode.right != null){
                        queue.offer(treenode.right);
                    }

                size--;
            }

            if (count % 2 == 0){
                Collections.reverse(listInteger);
            }
            count++;
            listList.add(listInteger);

        }
        return listList;

    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int left_height = maxDepth(root.left) + 1;
            int right_height = maxDepth(root.right) + 1;
            return Math.max(left_height, right_height);
        }
//        if (root == null){
//            return 0;
//        }
//
//        if (root.left == null && root.right == null){
//            return 1;
//        }else if (root.left == null && root.right != null){
//            return maxDepth(root.right) + 1;
//        }else if (root.right == null && root.left != null){
//            return maxDepth(root.left) + 1;
//        }
//        return (maxDepth(root.left) + 1 ) > (maxDepth(root.right) + 1) ?  maxDepth(root.left) + 1 : maxDepth(root.right) + 1 ;
    }

    public static int maxDepthByQueue(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size,count = 0;
        while(!queue.isEmpty())
        {
            size = queue.size();
            while(size > 0){
                TreeNode treeNode = queue.poll();
                if(treeNode.left != null){
                    queue.offer(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.offer(treeNode.right);
                }
                size--;
            }
            count++;
        }
        return count;
    }


/*    根据一棵树的前序遍历与中序遍历构造二叉树。
    注意:你可以假设树中没有重复的元素。
    前序遍历 preorder = [3,9,20,15,7]
    中序遍历 inorder = [9,3,15,20,7]*/
    public static TreeNode buildTreePreIn(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode tree = new TreeNode();
        tree.value = preorder[0];

        for(int i = 0; i < inorder.length;i++){
            if (preorder[0] == inorder[i]){
                tree.left  = buildTreePreIn(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                tree.right = buildTreePreIn(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
                break;
            }
        }
        return tree;

    }



/*    根据一棵树的中序遍历与后序遍历构造二叉树。
    你可以假设树中没有重复的元素。
    中序遍历 inorder = [9,3,15,20,7]
    后序遍历 postorder = [9,15,7,20,3]*/

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        if(inorder.length == 0 || postorder.length == 0){
            return null;
        }

        int rootValue = postorder[postorder.length - 1];
        TreeNode tree = new TreeNode(rootValue);

        for(int i = 0;i < postorder.length;i++){
            if(inorder[i] == rootValue){
                tree.left = buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));
                tree.right = buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i,inorder.length -1));
                break;
            }
        }
        return tree;

    }

}
