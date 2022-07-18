def easyPace(x:Int):Int={
    x*8
}

def tempo(y:Int):Int={
    y*7
}

@main
def run()={
    println(easyPace(2)+tempo(3)+easyPace(2))

}