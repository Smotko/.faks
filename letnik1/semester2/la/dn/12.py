import numpy as np

# Bazna vektorja podprostora V
v1 = np.array([2, 0, 2, 0])
v2 = np.array([-1, -1, 1, 2])
a = np.array([2, 2, 2, 1])

# Matrika A sestavljena iz baznih vektorjev kot stolpce
A = np.column_stack((v1, v2))

# Izračun pravokotne projekcije a na V
AtA = A.T @ A
AtA_inv = np.linalg.inv(AtA)
At_a = A.T @ a
v = A @ (AtA_inv @ At_a)

# Izračun razlike v - v' = 2v - a
diff = 2 * v - a

print("Ortogonalna projekcija vektorja a na V (v):")
print(v)
print("\nRazlika v - v':")
print(diff) 