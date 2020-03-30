/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("aman", 1);
        obj.insert("karan", 4);
        obj.insert("madhav", 3);
        obj.insert("ishita", 2);
        obj.insert("prachi", 5);
        obj.display();
    }
}
