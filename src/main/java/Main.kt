import bean.Cat
import bean.DemoObject
import bean.Food

class Person(val name:String, var age:Int){
    override fun toString(): String {
        return "$name:$age";
    }
}
fun main() {
    //推导出num为int
    val num=3
    //推导出str为String
    val str="一个字符串"
    //推导出pai为double
    var pai=3.1415926

    //调用get方法
    val time= DemoObject().time
    //调用伴生方法
    var canReleaseMemory= DemoObject.enable

    //使用默认参数
    add(5)
    //不使用默认参数
    add(3,789.0)
    //使用命名参数，调换顺序
    add(num2=3.14,num1 = 6)
    //使用扩展函数
    println(str.lastChar())

    //构建一个列表这种方式构建的list是一个只读的
    val personList= listOf(Person("张三",60),Person("李四",20),Person("王五",25))

    //filter筛选
    println(personList.filter {
        it.age>20

    })
    //map映射修改
    personList.map {
        if (it.name=="王五"){
            it.age=33
        }
    }
    println(personList)

    println(Cat("Tom").eat(Food("鱼")))
    println(Cat("Garfield").eatWithFrom(Food("奶酪")))
    println(Cat.say())
    //函数作为参数
    trySomething { paramFunction(2) }


}
    //声明一个将int和double相加的方法，返回值为Double
     fun add(num1:Int,num2:Double=9.2):Double{
         val result=num1+num2
         println(result)
        return result
    }

    //扩展函数:为Sting声明一个扩展方法
    fun String.lastChar(): Char = this[this.length - 1]

    //
    fun paramFunction(int1:Int){
    print(int1)
    }

    //接收函数作为参数
    fun <T> trySomething(action:()->T):T{
        return  action()
    }
