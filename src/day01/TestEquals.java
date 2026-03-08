package day01;

public class TestEquals {
    public static void main(String[] args){
        //1.基本类型用==比较
        int a=10;
        int b=10;
        System.out.print("基本类型int a==b 结果"+(a==b));//结果为true
        //强调基本类型只能用==来比较，因为本来赋值于值本身，基本类型调用不了equals方法

        //2.引用类型用==比较地址
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println("引用类型String s1==s2 结果"+(s1==s2));//结果为false
        //3.引用类型用.equals比较内容
        System.out.println("引用类型String s1.equals(s2) 结果"+(s1.equals(s2)));//结果为true
        //强调：==作用一直是比较内存地址。
        // equals分情况：一般作用为比较地址，但是如果像基本类型的对象equals会被重写，作用为比较内容
        //因为符合大众需求，如字符串我们只在乎它们是否相同，不在乎它们存在哪，相同就相等


        //4.特殊情况：字符常量池
        String s3="world";
        String s4="world";
        System.out.println("字符串常量：s3==s4结果："+(s3==s4));//结果为true
        System.out.println("字符串常量：s3.equals(s4)结果："+(s3.equals(s4)));//结果为true
        //强调：变量后面直接跟双引号为使用常量池，意思为直接复用常量池的world，所以地址相同，==比较为true

        //5.自己定义的类，默认equals也是比较地址
        Person p1=new Person("张三",20);
        Person p2=new Person("张三",20);
        System.out.println("自定义类：p1==p2结果："+(p1==p2));//结果为false
        System.out.println("自定义类：p1==p2结果："+(p1.equals(p2)));//结果为false
        //强调：自定义类意思就代表类中所用由设计者定义，equals恢复为默认，有需求由设计者来改
    }
}

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}