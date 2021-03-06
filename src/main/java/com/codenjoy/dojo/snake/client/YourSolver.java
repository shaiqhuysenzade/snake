package com.codenjoy.dojo.snake.client;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.client.Solver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.services.Direction;
import com.codenjoy.dojo.services.RandomDice;
import com.codenjoy.dojo.snake.model.Elements;

/**
 * User: your name
 */
public class YourSolver implements Solver<Board> {

    private Dice dice;
    private Board board;

    public YourSolver(Dice dice) {
        this.dice = dice;
    }

    @Override
    public String get(Board board) {
        MyAlgorithm algorithm = new MyAlgorithm(board);
        Direction direction = algorithm.solve();
        return direction.toString();
//        this.board = board;
//
////        Point point = board.getApples().get(0);
////        point.getX()
////        point.getY()
//
//        char[][] field = board.getField();
////Saiq teesuf ki basim cixmadi :(
//        // cox sagol esas odurki hecolmasa komek lemeye calishdin
//        // alexde hec cavab vermir , kishi cox buraxdi bizi :(((
//        //sen yaz yeqin ki baxar
//        // he yaziram uje 3 4 denen sms dalbadal atgmisham helemde
//        //baxmiyibdir
//        // cox sagol)
//        //ok
//        // found snake
//        int snakeHeadX = -1;
//        int snakeHeadY = -1;
//        for (int x = 0; x < field.length; x++) {
//            for (int y = 0; y < field.length; y++) {
//                char ch = field[x][y];
//                if (ch == Elements.HEAD_DOWN.ch() ||
//                        ch == Elements.HEAD_UP.ch() ||
//                        ch == Elements.HEAD_LEFT.ch() ||
//                        ch == Elements.HEAD_RIGHT.ch())
//                {
//                    snakeHeadX = x;
//                    snakeHeadY = y;
//                    break;
//
//                }
//            }
//            if (snakeHeadX != -1) {
//                break;
//            }
//        }
//
//        // нашли змейку
//        int appleX = -1;
//        int appleY = -1;
//        for (int x = 0; x < field.length; x++) {
//            for (int y = 0; y < field.length; y++) {
//                char ch = field[x][y];
//                if (ch == Elements.GOOD_APPLE.ch()) {
//                    appleX = x;
//                    appleY = y;
//                    break;
//
//                }
//            }
//            if (appleX != -1) {
//                break;
//            }
//        }
//
//        int dx = snakeHeadX - appleX;
//        int dy = snakeHeadY - appleY;
//
//        if (dx < 0) {
//            return Direction.RIGHT.toString();
//        }
//        if (dx > 0) {
//            return Direction.LEFT.toString();
//        }
//        if (dy < 0) {
//            return Direction.DOWN.toString();
//        }

//        return Direction.UP.toString();
    }

    public static void main(String[] args) {
        WebSocketRunner.runClient(
                // paste here board page url from browser after registration
                "http://167.71.44.71/codenjoy-contest/board/player/z6klx8l27bfhhi0h8hig?code=6032155358345256776",
               // "http://codenjoy.com:80/codenjoy-contest/board/player/3edq63tw0bq4w4iem7nb?code=1234567890123456789",
                new YourSolver(new RandomDice()),
                new Board());
    }

}
