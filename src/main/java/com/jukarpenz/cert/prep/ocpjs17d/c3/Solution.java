package com.jukarpenz.cert.prep.ocpjs17d.c3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            //bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
              //  bufferedWriter.write(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeListsChatGPTFailed(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mainNode = null;
        SinglyLinkedListNode current = null;
        SinglyLinkedListNode alternate = null;

        if (head1 == null) {
            return head2;
        }
        else if (head2 == null) {
            return head1;
        }

        if (head1.data <= head2.data) {
            mainNode = head1;
            current = head1;
            alternate = head2;
        }
        else {
            mainNode = head2;
            current = head2;
            alternate = head1;
        }

        SinglyLinkedListNode next = current.next;
        while (alternate != null) {
            for (; next != null && alternate.data >= next.data; current = next, next = next.next);

            SinglyLinkedListNode temp = current.next;
            current.next = alternate;
            alternate = next;
            next = temp;
        }

        return mainNode;
    }

    public static SinglyLinkedListNode mergeListsGPTTwo(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0); // create a dummy node to represent the head of the merged list
        SinglyLinkedListNode tail = dummy; // initialize the tail to the dummy node

        // continue merging until either head1 or head2 becomes null
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) { // if the data value in head1 is less than or equal to the data value in head2
                tail.next = head1; // append head1 to the tail of the merged list
                head1 = head1.next; // move head1 to the next node in its list
            } else { // otherwise, the data value in head2 is less than the data value in head1
                tail.next = head2; // append head2 to the tail of the merged list
                head2 = head2.next; // move head2 to the next node in its list
            }
            tail = tail.next; // move the tail to the newly appended node
        }

        // append the remaining nodes in head1 or head2 to the tail of the merged list
        if (head1 != null) {
            tail.next = head1;
        } else if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next; // return the merged list, excluding the dummy node
    }

    static SinglyLinkedListNode mergeListsGPTWorked(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mainNode = null;
        SinglyLinkedListNode current = null;
        SinglyLinkedListNode alternate = null;

        if (head1 == null) {
            return head2;
        }
        else if (head2 == null) {
            return head1;
        }

        if (head1.data <= head2.data) {
            mainNode = head1;
            current = head1;
            alternate = head2;
        }
        else {
            mainNode = head2;
            current = head2;
            alternate = head1;
        }

        while (current.next != null && alternate != null) {
            if (alternate.data >= current.data && alternate.data <= current.next.data) {
                SinglyLinkedListNode temp = current.next;
                current.next = alternate;
                alternate = alternate.next;
                current.next.next = temp;
                current = current.next;
            }
            else {
                current = current.next;
            }
        }

        if (current.next == null && alternate != null) {
            current.next = alternate;
        }

        return mainNode;
    }


    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode currentNode = null;

        if(head1==null)
            return head2;

        if(head2==null)
            return head1;

        if(head1.data <= head2.data){
            currentNode = head1 ;
            head1=head1.next;
        }
        else{
            currentNode = head2;
            head2=head2.next;
        }

        SinglyLinkedListNode mainNode = currentNode;


        while(head1!=null&&head2!=null){

            if(head1.data<=head2.data){
                currentNode.next=head1;
                head1=head1.next;
            }
            else{
                currentNode.next=head2;
                head2=head2.next;
            }

            currentNode = currentNode.next;

        };

        if(head1==null){
            currentNode.next=head2;
        }
        if(head2==null){
            currentNode.next=head1;
        }

        return mainNode;
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeListsOK(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode mainNode = null;
        SinglyLinkedListNode currentNode = null;
        SinglyLinkedListNode alternateNode = null;

        if(head1.data <= head2.data){
            currentNode = head1 ;
            alternateNode = head2;
        }
        else{
            currentNode = head2;
            alternateNode = head1;
        }

        mainNode=currentNode;
        SinglyLinkedListNode newNextNode = new SinglyLinkedListNode(0);
        do{
            newNextNode = new SinglyLinkedListNode(0);
            SinglyLinkedListNode stillNextCurrent = null;
            if(currentNode.next!=null){
                newNextNode=currentNode.next;
                //IN CASE TODAVIA HAYA
                stillNextCurrent = currentNode.next;
            }
            else if(alternateNode!=null){
                newNextNode=alternateNode;
                alternateNode=null;
            }
            else{
                newNextNode=null;
            }
            if(alternateNode!=null){
                if(currentNode.next!=null && alternateNode.data<currentNode.next.data){
                    newNextNode=alternateNode;
                    if(stillNextCurrent!=null){
                        alternateNode=stillNextCurrent;
                    }
                }
            }
            currentNode.next=newNextNode;
            currentNode=currentNode.next;
        }while(newNextNode!=null);


        // do{
        //     System.out.println("mainNode: " + mainNode.data);
        //     hasNext=mainNode.next!=null;
        //     mainNode= hasNext ? mainNode.next:null;
        //     ///*currentNode=currentNode.next;*/
        // }while(hasNext);

        return mainNode;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ");
        }

        scanner.close();
    }
}
