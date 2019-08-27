import kotlinx.coroutines.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.system.measureTimeMillis
//Kotlin协程相关
fun main(
        args:Array<String>)= runBlocking {
    val  time=measureTimeMillis {
        test4()
        //TODO 这里替换为想要执行的函数名 test1，test2，test3
    }
    println("$time ms")
}
//test1仅仅使用协程来进行非阻塞的调用
suspend fun test1() {
    val job=GlobalScope.launch {
        search()
    }
    println("Hello,")
    //join后jvm会等待job任务执行完再销毁
    job.join()

}
//延迟1s后输入文本
suspend fun search() {
    delay(1000L)
    println("world")
}

//test2  先后执行one 和 two两个函数输出结果 耗时4s
suspend fun test2() {
 val one=search1()
    val two=search2()
    println("$one and$two")

}

suspend fun search1() : String {
    delay(2000L)
    return "123"
}
suspend fun search2():String {
    delay(2000L)
    return "456"
}
//test3  同时执行one two两个任务  耗时2s
suspend fun test3(){
    val one= GlobalScope.async{
        search1()
    }
    val two=GlobalScope.async{
        search2()
    }
    println("${one.await()}and${two.await()}")
}
//test4开启
suspend fun test4(){
    repeat(100_000){
        GlobalScope.launch {
            println("test4")
        }
    }
}

