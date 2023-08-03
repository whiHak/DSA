class NumArray:

    def __init__(self, nums):
        sum = 0
        self.pNums = []

        for i in nums:
            sum += i
            self.pNums.append(sum)
            

        

    def sumRange(self, left, right):
        if left == 0:
            return self.pNums[right]
        return self.pNums[right] - self.pNums[left - 1]
        

lists = [ 1, 2, 3, 4, 5, 6 ]       
obj = NumArray(lists)
print(obj.sumRange(2, 5))