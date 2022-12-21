//Hasan Pekedis 150120068

#include <stdio.h>
#include <math.h>


int main(int argc, char *argv[]) {
    char array[32][63]={};
    int interations,i,j;
    printf("Enter the number of interations: ");
    scanf("%d",&interations);

    for(i=0;i<32;i++){
        for(j=0;j<63;j++){
            array[i][j]='_';
        }
    }

    for(i=0;i<32;i++){
        for(j=i;j<32;j++){
            array[j][31+i]='1';
            array[j][31-i]='1';
        }
    }
    writeTriangles(array,interations);

    for(i=0;i<32;i++){
        for(j=0;j<63;j++){
            printf("%c",array[i][j]);
        }
        printf("\n");
    }
    return 0;

}

void writeTriangles(char arr[32][63],int inter){
    int rowValue,columnValue,skip,midPoint,loops,i,j,k,l;

    rowValue = 32/pow(2,inter);
    skip = 32/pow(2,inter);
    columnValue=63/2;
    midPoint=63/2;

    if(inter !=0){

        for(k=0;k<pow(2,inter-1);k++){
            midPoint=63/2-skip*k*2;
            for(l=0;l<k+1;l++){
                for(j=0;j<skip;j++){
                    for(i=skip+rowValue-l-j;i>=rowValue;i--){
                        arr[i][midPoint+j]='_';
                        arr[i][midPoint-j]='_';
                    }
                }
                midPoint=midPoint+skip*4;
            }
            rowValue=rowValue+skip*2;

        }
        writeTriangles(arr,inter-1);
    }
    else{
        return;
    }

}
