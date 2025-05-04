 #include <stdio.h>
 #define N 2
 #define BIAS 8192
 #define offset 4
 void main(){
	 int d[N];
	 float a_f[N];
	 float sum_f = 0.0;
	 float sumsq_f = 0.0, var_f;
	 double a_d[N];
	 double sum_d = 0.0;
	 double sumsq_d = 0.0, var_d;
	 for ( int i=0; i<N; i++) {
		 d[i] = offset*i; //d0 = 0, d1 = 4
		 a_f[i] = BIAS + d[i];
		 sum_f += a_f[i];
		 sumsq_f += a_f[i]*a_f[i];
		 a_d[i] = BIAS + d[i];
		 sum_d += a_d[i];
		 sumsq_d += a_d[i]*a_d[i];
	 }
	    // 'Naiven' način izračuna variance
	 //8192, 8196
	 var_f = (sumsq_f - sum_f*sum_f/N)/(N-1);
	 var_d = (sumsq_d - sum_d*sum_d/N)/(N-1);
	 printf("sum_f: %f, sumsq_f: %f, sum_f*sum_f/N: %f, var_f: %f\n", sum_f, sumsq_f, sum_f*sum_f/N, var_f);
	 printf("sum_d: %lf, sumsq_d: %lf, sum_d*sum_d/N: %lf, var_d: %lf\n", sum_d, sumsq_d, sum_d*sum_d/N, var_d);
 }
