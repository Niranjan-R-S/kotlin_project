class RnaTranscriptionProblem{
    fun convertDNAToRNA(DNAStrand: String): String {
        var convertedRNA = ""
        val componentMap = getComponentMap()
        for(component in DNAStrand){
            val currentComponent = "" + component
            convertedRNA += componentMap[currentComponent]
        }
        return convertedRNA
    }

    private fun getComponentMap(): Map<String, String>{
        val dnaComponents = arrayOf("G", "C", "T", "A")
        val rnaComponents = arrayOf("C", "G", "A", "U")
        val componentMap = mutableMapOf<String, String>()
        for(component in dnaComponents){
            componentMap[component] = rnaComponents[dnaComponents.indexOf(component)]
        }
        return componentMap
    }
}