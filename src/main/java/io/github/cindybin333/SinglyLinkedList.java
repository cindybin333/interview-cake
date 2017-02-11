package io.github.cindybin333;

import io.github.cindybin333.model.SinglyLinkedNode;

public class SinglyLinkedList {
    private SinglyLinkedNode headNode;

    public SinglyLinkedList(SinglyLinkedNode headNode) {
        this.headNode = headNode;
    }

    public void removeNode(SinglyLinkedNode node) {
        if (node.getNextNode() != null) {
            node.setValue(node.getNextNode().getValue());
            node.setNextNode(node.getNextNode().getNextNode());
        }
        else node.setValue(null);
    }

    public String printList() {
        SinglyLinkedNode node = headNode;
        String list = "";
        while (node != null && node.getValue() != null) {
            if (node.getNextNode() != null && node.getNextNode().getValue() != null)
                list = list + (node.getValue() + " -> ");
            else list = list + node.getValue();
            node = node.getNextNode();
        }
        return list;
    }
}
