def find_min(a):
    n = len(a)
    min = 0
    for i in range(1, n):
        if a[i] < a[min]:
            min = i
    return min

def sort(a):
    result = []
    while a:
        min = find_min(a)
        value = a.pop(min)
        result.append(value)
    return result


d = [2, 4, 5, 1, 3]
print(sort(d))
