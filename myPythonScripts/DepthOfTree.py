# Python program to find the maximum depth of tree
 
# A binary tree node
class Node:
 
    # Constructor to create a new node
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
 
# Compute the "maxDepth" of a tree -- the number of nodes 
# along the longest path from the root node down to the 
# farthest leaf node
def maxDepth(node):
    if node is None:
        print ("Return NULL");
        return 0 ; 
 
    else :
 
        # Compute the depth of each subtree
        print ("Before left, Node: %d" %node.data)
        lDepth = maxDepth(node.left)
        print("After Left: %d , Ld :%d" %(node.data,lDepth))
        rDepth = maxDepth(node.right)
        print("After right: %d , Ld :%d , RD:%d" %(node.data,lDepth, rDepth))
        # Use the larger one
        if (lDepth > rDepth):
            print ("LDepth :%d, ldepth %d , rdepth:%d "%(lDepth +1, lDepth, rDepth))
            return lDepth+1
        else:
            print ("RDepth :%d, ldepth %d , rdepth:%d "%(lDepth +1, lDepth, rDepth))
            return rDepth+1
 
 
# Driver program to test above function
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
 
 
print ("Height of tree is %d" %(maxDepth(root)))
 
# This code is contributed by Nikhil Kumar Singh(nickzuck_007)
