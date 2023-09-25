package de.hennerich.presentation

/**
 * @param row -> Single Row of the maze (Y-Coordinate)
 * @param col -> columns in a row (X-Coordinate)
 *
 * @sample
 * WdWW
 * WsWW
 * WWWW
 *
 * The s is located at (1,1)
 * The d is lacated at (0,1)
 */
data class Position(
    val row: Int,
    val col: Int
)
