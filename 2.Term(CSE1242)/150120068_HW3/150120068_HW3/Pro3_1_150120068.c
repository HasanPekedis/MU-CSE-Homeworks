//Hasan Pekedis 150120068

#include <stdio.h>

int bunnyEars2(int index);
int myFor(int i,int variable);


int main() {

    int bunnies = 0;
    printf("Please enter the number of lines (n=):");
    scanf("%d", &bunnies);

    //Prints the result in myFor method
    int i= 1;
    myFor(i,bunnies);
    return 0;
}

//Recursive method to get number of ears
int bunnyEars2(int bunnies){

    //Checks if its 0 otherwise it would run forever
    if (bunnies == 0){
        return 0;
    }

    //Calculates the number of ears using recursion
    if (bunnies % 2 == 0){
        return 3 + bunnyEars2(bunnies - 1);
    }
    else {
        return 2 + bunnyEars2(bunnies - 1);
    }

}

int myFor(int i, int variable){

    if(i<variable+1){
        int ears = bunnyEars2(i);
        printf("bunnyEars2(%d) -> %d\n",i,ears);

        i++;
        myFor(i,variable);
        return 0;
    }
    else{
        return 0;
    }
}