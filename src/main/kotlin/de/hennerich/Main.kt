fun main() {
    val mazeBuilder = MazeBuilder()


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
}