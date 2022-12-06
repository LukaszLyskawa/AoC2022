val lines = input.split("\n")

var currentIndex = 0
fun readNextLine() = lines[currentIndex++]

fun main() {
    val elves = mutableListOf<Int>()
    
    while(currentIndex<lines.size){
    	var calories = 0
        do
        {
         val line =runCatching{readNextLine()}.getOrNull()
         line?.let{
         	runCatching{it.toInt()}.getOrNull()?.let{calories+=it}//add up calories
         }
        }while(line !=null && line != "")//until empty line
        elves.add(calories)//add the sum of calories
    }
    
    println(elves.maxOrNull())
    
}
