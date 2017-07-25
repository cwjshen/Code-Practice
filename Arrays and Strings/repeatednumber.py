def repeatedNumber(A):
    left = []
    right = []
    n =  len(A)
    for i in A:
        if i < float(n) / 2:
            left.append(i)
        else:
            right.append(i)

    left = sorted(left)
    right = sorted(right)
    
    print float(n)/2
    print left
    print right

    if len(left) > len(right):
        for i in range(1, len(left)):
            if left[i] == left[i-1]:
            	print(left[i])
                return left[i]
                
    if len(right) > len(left):
        for i in range(1, len(right)):
            if right[i] == right[i-1]:
            	print(right[i])
                return right[i]

def repeatedNumberRec(A):
    left = []
    right = []
    n = len(A)
    for i in A:
        if i < float(n) / 2:
            left.append(i)
        else:
            right.append(i)

    print left
    print right

    if max(len(left),len(right)) == 2:
        if len(left) == 2:
            print left[0]
            return left[0]
        else:
            print right[0]
            return right[0] 
    else:
        print "Recursing: " 
        repeatedNumberRec(max((len(left),left),(len(right), right))[1])

def main():
	A = [1,2,3,4,2]
	repeatedNumberRec(A)

main()
