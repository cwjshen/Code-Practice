#include <stdio.h>
typedef struct 
{
	int numerator;
	int denominator;
} fraction;

fraction add (fraction f1, fraction f2) {
	int cd = f1.denominator * f2.denominator;
	f1.numerator = f1.numerator * f2.denominator;
	f2.numerator = f2.numerator * f1.denominator;

	fraction sum;
	sum.numerator = f1.numerator + f2.numerator;
	sum.denominator = cd;

	return sum;
}

int gcd(int a, int b){
	if (a == b){
		return a;
	}

	if (a > b){
		return gcd(a-b, b);
	}
	else if (a < b){
		return gcd(a, b-a);
	}
}

fraction simplify(fraction f) {
	int common_denominator = gcd(f.numerator, f.denominator);
	f.numerator =  f.numerator / common_denominator;
	f.denominator = f.denominator / common_denominator;

	return f;
}

int main(){
	fraction a;
	fraction b;

	a.numerator = 3;
	a.denominator = 5;

	b.numerator = 1;
	b.denominator = 4;

	fraction sum = add(a,b);

	printf("Numerator: %d\n", sum.numerator);
	printf("Denominator: %d\n", sum.denominator);
	
	sum = simplify(sum);

	printf("Numerator: %d\n", sum.numerator);
	printf("Denominator: %d\n", sum.denominator);

	return 0;
}