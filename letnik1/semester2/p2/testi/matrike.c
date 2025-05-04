#include <stdio.h>
#include <math.h>

#define N 3  // Size of the matrix (N x N+1 for augmented matrix)

// Function to perform Gaussian Elimination
void gaussianElimination(float mat[N][N+1]) {
    int i, j, k;
    float factor, temp;

    // Forward Elimination (Row Echelon Form)
    for (i = 0; i < N; i++) {
        // Partial Pivoting (to avoid division by zero)
        for (k = i + 1; k < N; k++) {
            if (fabs(mat[i][i]) < fabs(mat[k][i])) {
                for (j = 0; j <= N; j++) {
                    temp = mat[i][j];
                    mat[i][j] = mat[k][j];
                    mat[k][j] = temp;
                }
            }
        }

        // Make diagonal elements 1 and eliminate lower entries
        for (j = i + 1; j < N; j++) {
            factor = mat[j][i] / mat[i][i];
            for (k = 0; k <= N; k++) {
                mat[j][k] -= factor * mat[i][k];
            }
        }
    }

    // Back Substitution (to get solutions)
    float x[N];
    for (i = N - 1; i >= 0; i--) {
        x[i] = mat[i][N];
        for (j = i + 1; j < N; j++) {
            x[i] -= mat[i][j] * x[j];
        }
        x[i] /= mat[i][i];
    }

    // Print the solution
    printf("\nSolution:\n");
    for (i = 0; i < N; i++) {
        printf("x[%d] = %.2f\n", i, x[i]);
    }
}

int main() {
    float mat[N][N+1] = {
        {2, 1, -1, 8},    // 2x + y - z = 8
        {-3, -1, 2, -11},  // -3x - y + 2z = -11
        {-2, 1, 2, -3}     // -2x + y + 2z = -3
    };

    printf("Original Augmented Matrix:\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j <= N; j++) {
            printf("%.2f\t", mat[i][j]);
        }
        printf("\n");
    }

    gaussianElimination(mat);

    return 0;
}
