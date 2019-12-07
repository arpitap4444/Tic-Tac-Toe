class Board {
    clear()
    clearOutput()
    drawStage(black)
    val cb = canvasBounds
    val board = Picture.image("board.PNG")
    val x = Picture.image("x.PNG")
    val o = Picture.image("o.PNG")
    var change = true
    val data = ArrayBuffer(0, 0, 0, 0, 0, 0, 0, 0, 0)

    //Maming button as picture
    val button0 = Picture {
        setFillColor(ColorMaker.hsla(195, 1.00, 0.50, 0.18))
        setPenColor(cm.rgb(0, 191, 255))
        hop(18)
        forward(160)
        right()
        forward(210)
        right()
        forward(160)
        right()
        forward(210)
    }

    //Copying one constant variable into other constant variables
    val button1, button2, button3, button4, button5, button6, button7, button8 = button0.copy
    val x1, x2, x3, x4, x5, x6, x7, x8 = x.copy
    val o1, o2, o3, o4, o5, o6, o7, o8 = o.copy
    //setting positions
    board.setPosition(-385, -318)
    x.setPosition(0, 0)
    o.setPosition(0, 0)
    button0.setPosition(-370, 125)
    button1.setPosition(-105, 125)
    button2.setPosition(155, 125)
    button3.setPosition(-370, -90)
    button4.setPosition(-106, -90)
    button5.setPosition(156, -90)
    button6.setPosition(-369, -315)
    button7.setPosition(-106, -315)
    button8.setPosition(156, -315)
    // Scalling
    board.scale(3, 2.5)
    x.scale(3, 2.5)
    o.scale(3, 2.5)
    x1.scale(3, 2.5)
    x2.scale(3, 2.5)
    x3.scale(3, 2.5)
    x4.scale(3, 2.5)
    x5.scale(3, 2.5)
    x6.scale(3, 2.5)
    x7.scale(3, 2.5)
    x8.scale(3, 2.5)
    o1.scale(3, 2.5)
    o2.scale(3, 2.5)
    o3.scale(3, 2.5)
    o4.scale(3, 2.5)
    o5.scale(3, 2.5)
    o6.scale(3, 2.5)
    o7.scale(3, 2.5)
    o8.scale(3, 2.5)
    //Drawing all things
    def draw() {
        board.draw()
        button0.draw()
        button1.draw()
        button2.draw()
        button3.draw()
        button4.draw()
        button5.draw()
        button6.draw()
        button7.draw()
        button8.draw()

    }

    def activateMouseHandlers() {
        button0.onMouseClick { (x, y) =>
            if (change == true) {
                button0.invisible()
                b.x.setPosition(-360, 140)
                b.x.draw()
                change = false
                data(0) = 1
            }

            else {
                button0.invisible()
                b.o.setPosition(-360, 140)
                b.o.draw()
                b.o.moveToFront()
                change = true
                data(0) = 2
            }
            check_win()
        }

        button1.onMouseClick { (x, y) =>
            if (change == true) {
                button1.invisible()
                b.x1.draw()
                b.x1.setPosition(-90, 150)
                change = false
                data(1) = 1
            }

            else {
                button1.invisible()
                b.o1.draw()
                b.o1.setPosition(-90, 150)
                b.o1.moveToFront()
                change = true
                data(1) = 2
            }
            check_win()
        }

        button2.onMouseClick { (x, y) =>
            if (change == true) {
                button2.invisible()
                b.x2.draw()
                b.x2.setPosition(155, 150)
                change = false
                data(2) = 1
            }

            else {
                button2.invisible()
                b.o2.draw()
                b.o2.setPosition(155, 150)
                b.o2.moveToFront()
                change = true
                data(2) = 2

            }
            check_win()
        }

        button3.onMouseClick { (x, y) =>
            if (change == true) {
                button3.invisible()
                b.x3.draw()
                b.x3.setPosition(-365, -59)
                change = false
                data(3) = 1
            }

            else {
                button3.invisible()
                b.o3.draw()
                b.o3.setPosition(-365, -59)
                b.o3.moveToFront()
                change = true
                data(3) = 2
            }
            check_win()
        }

        button4.onMouseClick { (x, y) =>
            if (change == true) {
                button4.invisible()
                b.x4.draw()
                b.x4.setPosition(-106, -59)
                change = false
                data(4) = 1
            }

            else {
                button4.invisible()
                b.o4.draw()
                b.o4.setPosition(-106, -59)
                b.o4.moveToFront()
                change = true
                data(4) = 2

            }
            check_win()
        }

        button5.onMouseClick { (x, y) =>
            if (change == true) {
                button5.invisible()
                b.x5.draw()
                b.x5.setPosition(156, -59)
                change = false
                data(5) = 1
            }
            else {
                button5.invisible()
                b.o5.draw()
                b.o5.setPosition(156, -59)
                b.o5.moveToFront()
                change = true
                data(5) = 2

            }
            check_win()
        }

        button6.onMouseClick { (x, y) =>
            if (change == true) {
                button6.invisible()
                b.x6.draw()
                b.x6.setPosition(-360, -300)
                change = false
                data(6) = 1
            }

            else {
                button6.invisible()
                b.o6.draw()
                b.o6.setPosition(-360, -300)
                b.o6.moveToFront()
                change = true
                data(6) = 2

            }
            check_win()
        }

        button7.onMouseClick { (x, y) =>
            if (change == true) {
                button7.invisible()
                b.x7.draw()
                b.x7.setPosition(-106, -300)
                change = false
                data(7) = 1
            }
            else {
                button7.invisible()
                b.o7.draw()
                b.o7.setPosition(-106, -300)
                b.o7.moveToFront()
                change = true
                data(7) = 2

            }
            check_win()
        }

        button8.onMouseClick { (x, y) =>
            if (change == true) {
                button8.invisible()
                b.x8.draw()
                b.x8.setPosition(156, -300)
                change = false
                data(8) = 1
            }
            else {
                button8.invisible()
                b.o8.draw()
                b.o8.setPosition(156, -300)
                b.o8.moveToFront()
                change = true
                data(8) = 2

            }
            check_win()

        }

    }

    def winX = {
        val c1 = (data(0) == 1 &&
            data(4) == 1 &&
            data(8) == 1)

        val c2 = (data(6) == 1 &&
            data(4) == 1 &&
            data(2) == 1)

        val c3 = (data(0) == 1 &&
            data(3) == 1 &&
            data(6) == 1)

        val c4 = (data(1) == 1 &&
            data(4) == 1 &&
            data(7) == 1)

        val c5 = (data(2) == 1 &&
            data(5) == 1 &&
            data(8) == 1)

        val c6 = (data(0) == 1 &&
            data(1) == 1 &&
            data(2) == 1)

        val c7 = (data(3) == 1 &&
            data(4) == 1 &&
            data(5) == 1)

        val c8 = (data(6) == 1 &&
            data(7) == 1 &&
            data(8) == 1)

        c1 || c2 || c3 || c4 || c5 || c6 || c7 || c8

    }

    def winO = {
        val c_1 = (data(0) == 2 &&
            data(4) == 2 &&
            data(8) == 2)

        val c_2 = (data(6) == 2 &&
            data(4) == 2 &&
            data(2) == 2)

        val c_3 = (data(0) == 2 &&
            data(3) == 2 &&
            data(6) == 2)

        val c_4 = (data(1) == 2 &&
            data(4) == 2 &&
            data(7) == 2)

        val c_5 = (data(2) == 2 &&
            data(5) == 2 &&
            data(8) == 2)

        val c_6 = (data(0) == 2 &&
            data(1) == 2 &&
            data(2) == 2)

        val c_7 = (data(3) == 2 &&
            data(4) == 2 &&
            data(5) == 2)

        val c_8 = (data(6) == 2 &&
            data(7) == 2 &&
            data(8) == 2)

        c_1 || c_2 || c_3 || c_4 || c_5 || c_6 || c_7 || c_8
    }

    def check_win() {
        if (winX) {
            drawCenteredMessage("Player X Won!", green, 100)
            button0.invisible()
            button1.invisible()
            button2.invisible()
            button3.invisible()
            button4.invisible()
            button5.invisible()
            button6.invisible()
            button7.invisible()
            button8.invisible()
            activateEditor()

        }
        else if (winO) {

            drawCenteredMessage("Player O Won!", green, 100)
            button0.invisible()
            button1.invisible()
            button2.invisible()
            button3.invisible()
            button4.invisible()
            button5.invisible()
            button6.invisible()
            button7.invisible()
            button8.invisible()
            activateEditor()
        }
    }

    def draw(ab: Seq[Int]) = {
        var ret = true
        repeatFor(ab) { n =>
            if (n >= 0) {
                ret = true
            }
            if (ret == true) {
                drawCenteredMessage("Draw!", green, 100)
            }
        }
        ret
    }

}

val b = new Board
b.draw()
b.activateMouseHandlers()
b.draw(b.data)
