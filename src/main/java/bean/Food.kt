package bean
//一个kotlin class
class Food (val foodName:String){
    //伴生对象
    companion object{
       fun sayChineseType():String{
           return "国产食品"
       }
    }
}