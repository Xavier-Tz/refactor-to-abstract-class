package com.github.hcsp.polymorphism;

public class 西红柿炒鸡蛋 extends 菜{

    public 西红柿炒鸡蛋() {
        super("西红柿炒鸡蛋");
    }


    @Override
    public void 开始烹饪(){
        System.out.println("放鸡蛋");
        System.out.println("放西红柿");
        super.开始烹饪();
    }


//    public void 做个西红柿炒鸡蛋() {
//        System.out.println("洗炒锅");
//        System.out.println("倒油");
//        System.out.println("放鸡蛋");
//        System.out.println("放西红柿");
//        System.out.println("炒啊炒啊炒");
//        System.out.println("放盐");
//        System.out.println("香喷喷的西红柿炒鸡蛋出锅啦");
//    }
}
