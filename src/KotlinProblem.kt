fun main(args: Array<String>){
    val rnaTranscription = RnaTranscriptionProblem()
    val dnaString = getDNAString()
    val convertedRNA = rnaTranscription.convertDNAToRNA(dnaString)
    printConvertedDNA(convertedRNA)
}

fun getDNAString(): String{
    println("Enter the DNA String")
    return "" + readLine()
}

fun printConvertedDNA(convertedRNA: String) {
    println("The converted RNA String is as below")
    println(convertedRNA)
}