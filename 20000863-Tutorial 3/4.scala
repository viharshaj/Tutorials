def price(x:Int):Double={
    x*24.95
}

def discount(a:Double):Double={
    a*0.4
}

def shippingcost(x:Int):Double={
    x*3+(x-50)*0.75
}

@main
def run()={
    println(price(60)-discount(price(60))+shippingcost(60))
}