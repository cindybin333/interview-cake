package io.github.cindybin333;

import io.github.cindybin333.model.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BSTTest {
    private io.github.cindybin333.BST tree;

    @Before
    public void setUp() {
        tree = new io.github.cindybin333.BST();
    }

    @Test
    public void getSecondGreatestNode_givenTreeHasLessThanTwoNodes_returnsNull(){
        BinaryTreeNode node1;
        node1 = new BinaryTreeNode(1);

        assertEquals(null, tree.getSecondGreatestNode(node1));
    }

    @Test
    public void getSecondGreatestNode_givenTreeWithTwoNodes_returnsNodeWithSecondGreatestValue(){
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        node2.insertLeft(node1);

        assertEquals(node1, tree.getSecondGreatestNode(node2));

        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        node3.insertRight(node4);

        assertEquals(node3, tree.getSecondGreatestNode(node3));
    }

    @Test
    public void getSecondGreatestNode_givenTreeWithMoreThanTwoNodes_returnsNodeWithSecondGreatestValue(){
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);

        node2.insertLeft(node1);
        node2.insertRight(node5);
        node5.insertLeft(node4);

        assertEquals(node4, tree.getSecondGreatestNode(node2));
    }
}