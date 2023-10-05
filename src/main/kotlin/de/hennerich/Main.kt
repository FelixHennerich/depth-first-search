package de.hennerich

import de.hennerich.algorithm.BreadthSearch
import de.hennerich.algorithm.DepthSearch
import de.hennerich.presentation.MazeBuilder


/**
 * Main method that will be executed
 */
fun main() {
    val mazeBuilder = MazeBuilder()
    val depthSearch = DepthSearch()
    val breadthSearch = BreadthSearch()


    val mazeStr = """
        WWWWWWWWWWWWWWWWWWWWWW
        s       W    W  W    W
        W WWWWW W WWWWW W WWWW
        W       W       W   WW
        W W W WWWWW WWWWW W WW
        W W W W   W     W   WW
        W W WWW W WWW WWW W WW
        W W                 WW
        WWWWWWWWWWWWWWWWdWWWWW
    """.trimIndent()

    val mazeStr2 = """
        WWWWWWWWWWWWWWWWWWWWWW
        W          W         W
        W        WWWWW       W
        W   s    W           W
        W        W           W
        W        W           W
        W      WWW      d    W
        W       W            W
        WWWWWWWWWWWWWWWWWWWWWW
    """.trimIndent()
    /*val maze = mazeBuilder.buildMaze(mazeStr)
    mazeBuilder.printMaze(maze)
    if(depthSearch.depthSearch(maze, mazeBuilder.findStart(maze)))
        mazeBuilder.printMaze(maze)
    else
        println("Keine Lösung Möglich!")*/

    val maze = mazeBuilder.buildMaze(mazeStr2)
    mazeBuilder.printMaze(maze)
    if(breadthSearch.breadthFirstSearch(maze, mazeBuilder.findStart(maze)))
        mazeBuilder.printMaze(maze)
    else
        println("Keine Lösung Möglich!")
}