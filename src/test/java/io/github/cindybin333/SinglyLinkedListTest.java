package io.github.cindybin333;

import io.github.cindybin333.model.SinglyLinkedNode;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SinglyLinkedListTest {
    @Test
    public void removeNode_givenMiddleNode_removesItFromSinglyLinkedList(){
        SinglyLinkedNode node3 = new SinglyLinkedNode(3);
        SinglyLinkedNode node2 = new SinglyLinkedNode(2, node3);
        SinglyLinkedNode node1 = new SinglyLinkedNode(1, node2);

        SinglyLinkedList list = new SinglyLinkedList(node1);
        String stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("1 -> 2 -> 3"));

        list.removeNode(node2);
        stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("1 -> 3"));
    }

    @Test
    public void removeNode_givenHeadNode_removesItFromSinglyLinkedList(){
        SinglyLinkedNode node3 = new SinglyLinkedNode(3);
        SinglyLinkedNode node2 = new SinglyLinkedNode(2, node3);
        SinglyLinkedNode node1 = new SinglyLinkedNode(1, node2);

        SinglyLinkedList list = new SinglyLinkedList(node1);
        String stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("1 -> 2 -> 3"));

        list.removeNode(node1);
        stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("2 -> 3"));
    }

    @Test
    public void removeNode_givenLastNode_removesItFromSinglyLinkedList(){
        SinglyLinkedNode node3 = new SinglyLinkedNode(3);
        SinglyLinkedNode node2 = new SinglyLinkedNode(2, node3);
        SinglyLinkedNode node1 = new SinglyLinkedNode(1, node2);

        SinglyLinkedList list = new SinglyLinkedList(node1);
        String stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("1 -> 2 -> 3"));

        list.removeNode(node3);
        stringifiedList = list.printList();
        assertThat(stringifiedList, equalTo("1 -> 2"));
    }
}
