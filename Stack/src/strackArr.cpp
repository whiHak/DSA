#include <iostream>
using namespace std;
const int LIMIT = 10;
static int stack[LIMIT];
int top = -1;

void push(int val){
    if (top+1 < LIMIT){
        top++;
        stack[top] = val;
    }
    else
        cout << "stack over flow";
}

int pop(){
    int delVal;
    if(top != -1 ){
        delVal = stack[top];
        stack[top] = NULL;
        top--;
    }
    else
        cout << "Stack empty!";
}
void reverse (string toBeReversed){
    int length = toBeReversed.size();
    char pStack[length];
    int i =0;
    int topIndx = -1;
    
}

// int main(){
//     char a[10] = "mynameism";
//     char *rev = reverse(a, 10);
//     for(int i = 0; i<10; i++){
//         cout << *rev+1;
//     }
// }
