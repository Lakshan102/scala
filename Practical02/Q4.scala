def Attendies(TPrice:Int)=120 + (15-TPrice)/5*20
def Income(TPrice:Int)=Attendies(TPrice) * TPrice
def Cost(TPrice:Int)=500 + 3*Attendies(TPrice)

def Profit(TPrice:Int)=Income(TPrice) - Cost(TPrice)