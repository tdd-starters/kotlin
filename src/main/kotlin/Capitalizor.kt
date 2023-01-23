object Capitalizor {
    @JvmStatic
    fun capitalize(source: String): String =
        source.split("\\s".toRegex()).filter { it.isNotEmpty() }.joinToString(" ") {
            it[0].uppercase() + it.substring(1)
        }
}