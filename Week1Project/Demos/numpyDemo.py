import numpy as np

arr1 = np.array([1, 2, 3, 4, 5])
print(arr1)
print(type(arr1))

# OUTPUT
# [1, 2, 3, 4, 5]
# <class 'numpy.ndarray'>

a = np.array(42)
b = np.array([1, 2, 3, 4, 5])
c = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
d = np.array([[[1, 2, 3], [4, 5, 6]], [[1, 2, 3], [4, 5, 6]]])
print(a.ndim)
print(b.ndim)
print(c.ndim)
print(d.ndim)

arr2 = np.array([1, 2, 3, 4], ndmin = 5)
print(arr2)
print("number of dimensions: ", arr2.ndim)

arr3 = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])
print(arr3[0, 1, 2]) # Returns 6

arr4 = np.array([1, 2, 3, 4, 5, 6, 7])
print(arr4[1:5])
print(arr4[-3:-1])
print(arr4[1:5:2])

arr5 = np.array([[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]])
print(arr5[1, 1:4])

# Reusing arrays from earlier for this ex; copying as comments here for reference
# a = np.array(42)
# b = np.array([1, 2, 3, 4, 5])
# c = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
# d = np.array([[[1, 2, 3], [4, 5, 6]], [[1, 2, 3], [4, 5, 6]]])
print(a.shape)
print(b.shape)
print(c.shape)
print(d.shape)

arr6 = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
arr7 = arr6.reshape(4, 3)
print(arr7)
arr8 = arr6.reshape(2, 3, 2)
print(arr8)