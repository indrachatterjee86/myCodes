#Tower of Hanoi Problem

def TowersOfHanoi(numberOfDisks, startPeg=1, endPeg=3):
    if numberOfDisks:
        TowersOfHanoi(numberOfDisks -1, startPeg, 6-startPeg-endPeg)
        print ("Move Disk %d from Peg %d to Peg %d" %(numberOfDisks, startPeg, endPeg))
        TowersOfHanoi(numberOfDisks -1, 6-startPeg-endPeg, endPeg)


TowersOfHanoi(numberOfDisks =3)
