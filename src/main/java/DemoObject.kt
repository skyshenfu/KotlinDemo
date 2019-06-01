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