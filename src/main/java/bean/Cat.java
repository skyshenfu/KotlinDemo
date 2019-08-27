package bean;

/**
 * 一个java class
 */
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say(){
        System.out.println("喵喵喵");
    }

    public void eat(Food food){
        System.out.println(name+"吃了"+food.getFoodName());
    }
    public void eatWithFrom(Food food){
        System.out.println(name+"吃了"+Food.Companion.sayChineseType()+food.getFoodName());
    }
}
