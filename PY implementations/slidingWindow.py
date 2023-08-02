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
    ans = {}
    for right in range(len(s)):
        if s[right] in ans:
            left = ans[s[right]] + 1
        
        ans[s[right]] = right
        longest = max(longest, (right - left) + 1)
    return longest       

lists = [1, 12, -5,-6,50,3]
s = "abcabcbb"
print(longestSubstring(s))

