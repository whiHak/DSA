def max_subarray_sum(arr, k):


    current_sum = sum(arr[:k])
    max_sum = current_sum


    for end in range(k, len(arr)):

        current_sum += arr[end]

        current_sum -= arr[end - k]

        max_sum = max(max_sum, current_sum)

    return max_sum



def max_avg(arr, k):


    current_sum = sum(arr[:k])

    max_avg = current_sum/k


    for end in range(k, len(arr)):

        current_sum += arr[end]

        current_sum -= arr[end-k]


        max_avg = max(max_avg, current_sum/k)

        return max_avg


def longestSubstring(s):

    left = 0

    longest = 0
    occurance = {}
    for right in range(len(s)):

        if s[right] in occurance and occurance[s[right]] >= left:

            left = occurance[s[right]] + 1
        
        occurance[s[right]] = right
        longest = max(longest, (right - left) + 1)
    return longest   


def minSubArrayLen(target, nums):
        left = 0
        summ = 0
        n = len(nums)
        min_length = n
        
        if sum(nums[:n]) < target:
            return 0  
        for right in range(n):
            summ += nums[right] 

            while summ >= target:
                min_length = min(min_length, (right - left)+1 )
                summ -= nums[left]
                left += 1 
                     
        
        return min_length    


lists = [1, 12, -5,-6,50,3]

s = "abcabcbb"

print(minSubArrayLen(13 ,lists))


