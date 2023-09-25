package de.hennerich

import de.hennerich.algorithm.DepthSearch
import de.hennerich.presentation.MazeBuilder


/**
 * Main method that will be executed
 */
fun main() {
    val mazeBuilder = MazeBuilder()
    val depthSearch = DepthSearch()


    val mazeStr = """
        WWWsWWWWWWWWWWWWW
        W     W W    W  W
        W WWWWW W WWWWW W
        W       W       W
        W W W WWWWW WWWWW
        W W W W   W     W
        W W WWW W WWW WWW
        W W     W       W
        WWWWWWWWWWWWWdWWW
    """.trimIndent()
    val maze = mazeBuilder.buildMaze(mazeStr)
    mazeBuilder.printMaze(maze)
    if(depthSearch.depthSearch(maze, mazeBuilder.findStart(maze)))
        mazeBuilder.printMaze(maze)
    else
        println("Keine Lösung Möglich!")
}