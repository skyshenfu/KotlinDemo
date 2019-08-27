package bean

import java.io.Serializable
class DemoObject{
    companion object{
        var enable=false
    }
    val time=System.currentTimeMillis()
}
class SingleBorrow(val amt:Int=0,val name:String="",val platform:String="--"):Serializable
class SinglePlatform(val amt:Int,val userNum:Int,val partnerNum:Int):Serializable
class SingleCard(var bankName:String="",var cardId:Long=0L,var cardNumber:String="",var icon:String=""):Serializable
class SingleBorrowHistory(var amt:Double=0.toDouble(),var createTime:String="",var id:Long=0L,
                          var lastUpdateTime:String="",var picture:String="",
                          var platformName:String="",var userId:Long=0L):Serializable

//声明为dataclass直接自动完成序列化，但是不能作为base类
data class DataDemo(var name: String)
//但是可以继承普通类
data class DataExtendDemo(var name1 :String):Cat(name1)
