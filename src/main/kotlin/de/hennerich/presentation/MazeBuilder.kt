package de.hennerich.presentation

class MazeBuilder {


    /**
     * build the String to a list
     *
     * @param s -> Maze
     * @return list -> list of maze cols and rows
     */
    fun buildMaze(s: String): List<MutableList<Char>> {
        val tmp = mutableListOf<MutableList<Char>>()
        for(line in s.lines())
            tmp += line.toMutableList()
        return tmp.toList()
    }

    /**
     * Print the maze in the console
     *
     * @param maze -> labyrinth
     */
    fun printMaze(maze: List<List<Char>>){
        for(line in maze)
            println(line.joinToString(separator = "")
                .replace('W', '\u2588'))
        println()
    }

    /**
     * Search through the maze to find the entry
     *
     * @param maze -> map of maze as list
     * @return Poistion -> X and Y Coordinates
     */
    fun findStart(maze: List<List<Char>>): Position {
        for(row in maze.indices){
            val col = maze[row].indexOf('s')
            if(col != -1)
                return Position(row, col)
        }
        return Position(-1,-1)
    }

}