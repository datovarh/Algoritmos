#include<stdio.h>
#include<stdlib.h>

void intFibonacci(){
        int auxiliar= 0;
        int primero = 0;
        int segundo = 1;
        int cuenta = 2;
        printf("0 %d\n",primero);
        printf("1 %d\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar + primero;
          printf("%d %d\n",cuenta, segundo);
          cuenta++;
        }
        printf("Para int se produce un overflow para n = " );
        printf("%d",cuenta-1);
        printf("\n");
        return;

};
void shortFibonacci(){
        short auxiliar= 0;
        short primero = 0;
        short segundo = 1;
        short cuenta = 2;
        printf("0 %hi\n",primero);
        printf("1 %hi\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar + primero;
          printf("%hi %hi\n",cuenta, segundo);
          cuenta++;
        }
        printf("Para short se produce un overflow para n = " );
        printf("%hi",cuenta-1);
        printf("\n");
        return;

};
void longFibonacci(){
        long auxiliar= 0;
        long primero = 0;
        long segundo = 1;
        long cuenta = 2;
        printf("0 %ld\n",primero);
        printf("1 %ld\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar + primero;
          printf("%ld %ld\n",cuenta, segundo);
          cuenta++;
        }
        printf("Para long se produce un overflow para n = " );
        printf("%ld",cuenta-1);
        printf("\n");
        return;

};
void longlongFibonacci(){
        long long auxiliar= 0;
        long long primero = 0;
        long long segundo = 1;
        long long cuenta = 2;
        printf("0 %lli\n",primero);
        printf("1 %lli\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar + primero;
          printf("%lli %lli\n",cuenta, segundo);
          cuenta++;
        }
        printf("Para long long se produce un overflow para n = " );
        printf("%lli",cuenta-1);
        printf("\n");
        return;

};


int main(){
    intFibonacci();
    shortFibonacci();
    longFibonacci();
    longlongFibonacci();
    return 0;
};
