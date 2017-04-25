#Check if Array is sorted using recursion

def isArraySortedOrder(A):
    if len(A) == 1:
        return True
    print ("A[0]:%d and A[1] :%d" %(A[0], A[1]))
    return A[0] <= A[1] and isArraySortedOrder(A[1:])

A = [1,5,3,4,9,6]
#print("Array :" %A)
print(isArraySortedOrder(A))
