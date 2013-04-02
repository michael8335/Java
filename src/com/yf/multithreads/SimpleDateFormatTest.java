package com.yf.multithreads;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *该测试程序主要证明 SimpleDateFormat为非线程安全的
 * 
 */
public class SimpleDateFormatTest{
   // private SimpleDateFormat dateFormat ;
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        Date tomorrow = new Date(today.getTime()+1000*60*60*24);
        System.out.println("today : "+today); // 今天是2010-01-11
        System.out.println("tomorrow : "+tomorrow); // 明天是2010-01-12
        Thread thread1 = new Thread(new SimpleDateFormatThread1(dateFormat,today));
        thread1.start();
        Thread thread2 = new Thread(new SimpleDateFormatThread2(dateFormat,tomorrow));
        thread2.start();
        thread1.join();
        thread2.join();
    }
    
}
class SimpleDateFormatThread1 implements Runnable{
    private SimpleDateFormat dateFormat;
    private Date date;
    public SimpleDateFormatThread1(SimpleDateFormat dateFormat,Date date){
        this.dateFormat = dateFormat;
        this.date = date;
    }
    public void run() {
        for(;;){// 一直循环到出问题为止吧。
            String strDate = dateFormat.format(date);
            // 如果不等于2010-01-11，证明出现线程安全问题了！！！！
            if(!"2012-12-05".equals(strDate)){
                System.err.println("today="+strDate);
                System.exit(0);
            }
        }
    }
}
class SimpleDateFormatThread2 implements Runnable{
    private SimpleDateFormat dateFormat;
    private Date date;
    public SimpleDateFormatThread2(SimpleDateFormat dateFormat,Date date){
        this.dateFormat = dateFormat;
        this.date = date;
    }
    public void run() {
        for(;;){
            String strDate = dateFormat.format(date);
            if(!"2012-12-06".equals(strDate)){
                System.err.println("tomorrow="+strDate);
                System.exit(0);
            }
        }
    }
}