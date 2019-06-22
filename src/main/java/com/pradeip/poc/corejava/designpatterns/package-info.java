/**
 * 
 */
/**
 * @author pradeep_patel
 *
 */
package com.p2.designpatterns;


/**

Singleton Design Pattern : When to use What 

Eager initialization is easy to implement but it may cause resource and CPU time wastage. 
Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class.
By using Static block in Eager initialization we can provide exception handling and also can control over instance.
Using synchronized we can create singleton class in multi-threading environment also but it can cause slow performance, 
so we can use Double check locking mechanism.
Bill Pugh implementation is most widely used approach for singleton classes. 
Most developers prefer it because of its simplicity and advantages.
 */