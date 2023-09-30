package de.hennerich.algorithm

import de.hennerich.presentation.Position

class BreadthSearch {

    private val directions = listOf(
        Position(1,0),
        Position(-1,0),
        Position(0,1),
        Position(0,-1)
    )

    fun breadthFirstSearch(maze: List<MutableList<Char>>, start: Position): Boolean{
        val rows = maze.size
        val cols = maze[0].size
        val previous = mutableMapOf<Position, Position>()
        val frontier = mutableListOf(start)
        maze[start.row][start.col] = ' '

        while(frontier.size > 0){
            val node = frontier.removeAt(0)
            for(dir in directions) {
                val newrow = node.row + dir.row
                val newcol = node.col + dir.col

                if(newrow !in (0 until rows) ||
                    newcol !in (0 until cols) ||
                    maze[newrow][newcol] == '.' ||
                    maze[newrow][newcol] == 'W'
                )
                    continue

                println(" $newrow $newcol")
                if(maze[newrow][newcol] == 'd'){
                    println("Ziel gefunden!")
                    var cnt = 0
                    var back: Position? = node
                    println(back)
                    while(back !== null){
                        cnt++
                        maze[back.row][back.col] = 'x'
                        back = previous[back]
                    }

                    println("Länge des wegs: $cnt\n")
                    return true
                }

                maze[newrow][newcol] = '.'
                val nextpos = Position(newrow, newcol)
                frontier += nextpos
                previous[nextpos] = node
            }
        }
        return false
    }

}