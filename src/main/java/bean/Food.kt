package bean

class Food (val foodName:String){
    //伴生对象
    companion object{
       fun sayChineseType():String{
           return "国产食品"
       }
    }
}