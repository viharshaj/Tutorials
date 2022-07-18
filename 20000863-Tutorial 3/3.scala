def volume( r:Double):Double={
    4/3*math.Pi*r*r*r
}

@main 
def run()={
    println(volume(5));
}