package binarySearchTreeActivity;

public class Test {
    public static void main(String[] args) {
        BinarySearchTreeDemo charTree = new BinarySearchTreeDemo();

        charTree.addNode('D');
        charTree.addNode('B');
        charTree.addNode('F');
        charTree.addNode('A');
        charTree.addNode('C');
        charTree.addNode('E');
        charTree.addNode('G');

        System.out.println("preorder traversal:");
        charTree.preOrderTraverse(charTree.getRoot());
        System.out.println();

        System.out.println("inorder traversal:");
        charTree.inOrderTraverse(charTree.getRoot());
        System.out.println();

        System.out.println("postorder traversal:");
        charTree.postOrderTraverse(charTree.getRoot());
        System.out.println();

        System.out.println(charTree.findNode('E'));
        System.out.println(charTree.findNode('G'));
        System.out.println();

        System.out.println(charTree.removeNode('B'));
        System.out.println("New inorder traversal:");
        charTree.inOrderTraverse(charTree.getRoot());
    }
}
