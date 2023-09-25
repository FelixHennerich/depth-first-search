package de.hennerich.algorithm

import de.hennerich.presentation.Position

class DepthSearch {

    val directions = listOf(
        Position(1,0),
        Position(-1,0),
        Position(0,1),
        Position(0,-1)
    )

    /**
     * DeapthSearch is a search made for small ways with single solution problems
     *
     * @param maze -> labyrinth
     * @param start -> entry
     * @return Boolean -> Exit found or not?
     */
    fun depthSearch(maze: List<MutableList<Char>>, start: Position): Boolean{
        val rows = maze.size
        val cols = maze[0].size

        //Grenzen des Suchgebiets überschritten
        //Hindernis bewusst?
        if(start.row !in(0 until rows) ||
           start.col !in(0 until cols) ||
           maze[start.row][start.col] == 'W' ||
           maze[start.row][start.col] == '.'
        )
            return false
        //Ziel found?
        else if (maze[start.row][start.col] == 'd')
            return true

        //markiere feld als durchsucht...
        maze[start.row][start.col] = '.'

        //Nachbarfelder..
        for(dir in directions){
            val newrow = start.row + dir.row
            val newcol = start.col + dir.col

            //rekursiv weitersuchen
            if(depthSearch(maze, Position(newrow, newcol))){
                //Weg wurde gefunden, markieren
                maze[newrow][newcol] = '*'
                return true
            }
        }
        return false // kein weg möglich
    }
}