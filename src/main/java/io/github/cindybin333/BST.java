package io.github.cindybin333;

//it's important to you to be able to grabe the second greatest node in a binary tree

import io.github.cindybin333.model.BinaryTreeNode;

public class BST {
    private BinaryTreeNode gn;
    private BinaryTreeNode sgn;

    public BinaryTreeNode getSecondGreatestNode(BinaryTreeNode head) {
        if (nodeCount(head) < 2) return null;
        if (nodeCount(head) == 2) {
            return head.getLeft() == null ? head : head.getLeft();
        }

        sgn = head;
        gn = head.getRight();
        calcSecondGreatestNode(head.getRight());
        return sgn;
    }

    private void calcSecondGreatestNode(BinaryTreeNode current) {
        if (current == null) return;

        if (current.getValue() > gn.getValue()) {
            sgn = gn;
            gn = current;
        } else if ((current.getValue() != gn.getValue()) && current.getValue() > sgn.getValue()){
            sgn = current;
        }

        calcSecondGreatestNode(current.getRight());
        calcSecondGreatestNode(current.getLeft());
    }

    private int nodeCount(BinaryTreeNode current) {
        if (current == null) return 0;
        return 1 + nodeCount(current.getLeft()) + nodeCount(current.getRight());
    }
}
