class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root;
    Node insert(Node root , int data){
        if(root == null)return new Node(data);
        if(root.data > data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key){
            return true;
        }
        if(key<root.data){
            root.left = delete(root.left,key);
        }
        else if(key>root.data){
            root.right = delete(root.right, key);
        }
        return false;
    }
    Node delete(Node root, int key){
        if(root == null)return null;
        if(key<root.data){
            root.left = delete(root.left,key);
        }
        else if(key>root.data){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left !=null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node temp = findmin(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
        }
        return root;
    }
    Node findmin(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public class BinarySearchTree2{
    public static void main(String args[]){
        BST tree = new BST();
        int[] arr={20,35,25,27,29,40,45};
        for(int val:arr){
            tree.root = tree.insert(tree.root,val);
        }
        tree.inorder(tree.root);
        tree.root=tree.delete(tree.root,35);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println(tree.search(tree.root,35));
    }
}
