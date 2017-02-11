package io.github.cindybin333.model;

public class SinglyLinkedNode {
    private Integer value;
    private SinglyLinkedNode nextNode;

    public SinglyLinkedNode(Integer value) {
        this.value = value;
    }

    public SinglyLinkedNode(Integer value, SinglyLinkedNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SinglyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }
}
