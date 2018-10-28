package com.weihong.password;

import org.junit.Test;

/**
 * Created by hongw on 2018/8/20.
 */
public class CreatePasswordActivityTest {
    @Test
    public void onClick() throws Exception {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode target = null;
        ListNode c1 = l1;
        ListNode c2 = l2;
        int gw = 0;
        int sw = 0;

        while (c1.next != null || c2.next != null) {
            gw = (c1.val + c2.val) % 10 + sw;
            sw = (c1.val + c2.val) / 10;
            target = new ListNode(gw);


        }

        return target;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}