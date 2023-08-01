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


lists = [1, 12, -5,-6,50,3]

print(max_avg(lists, 4))
