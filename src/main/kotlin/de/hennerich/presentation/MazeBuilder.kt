class MazeBuilder {

    fun buildMaze(s: String): List<MutableList<Char>> {
        val tmp = mutableListOf<MutableList<Char>>()
        for(line in s.lines())
            tmp += line.toMutableList()
        return tmp.toList()
    }

    fun printMaze(maze: List<List<Char>>){
        for(line in maze)
            println(line.joinToString(separator = "")
                .replace('W', '\u2588'))
        println()
    }
    fun findStart(maze: List<List<Char>>): Position{
        for(row in maze.indices){
            val col = maze[row].indexOf('s')
            if(col != -1)
                return Position(row, col)
        }
        return Position(-1,-1)
    }

}