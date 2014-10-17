case class Player(score:Int, swizzle:Int)

def score(player: Player): Int =
  if(player.score > 0)  7 else player.swizzle + 1

