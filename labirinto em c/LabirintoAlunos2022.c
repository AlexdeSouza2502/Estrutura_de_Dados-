#include <stdio.h>
#include "pilhaEncadeada.h"
#include <stdlib.h>
#define MAX 15

void cria(char l[MAX][MAX]){
     int i,j,x,y;
     srand(time(NULL));
     for(i=0;i<MAX;i++)
        for(j=0;j<MAX;j++){
          if((rand()%5)==1)
             l[i][j]='|';
             else
              l[i][j]='.';
          }
     for(i=0;i<MAX;i++){
           l[0][i]='*';
           l[MAX-1][i]='*';
           l[i][0]='*';
           l[i][MAX-1]='*';
           }// fim for
        x=  rand() % MAX;
        y=  rand() % MAX;
        l[x][y]='Q';
     }// fim funcao cria
     
void mostraLabirinto(char mat[MAX][MAX],int linha,int col){
    int i,j;
     for ( i = 0; i < linha; i++)
    {
     printf("\n");
          for ( j = 0; j < col; j++)
			printf (" %c ",mat[i][j] );
     	}

     } // fim funcao
     
 int funcaoSuperMouse(char lab[MAX][MAX],int i, int j){
  tpilha pilhax;
  inicializa( & pilhax);
  
  tpilha pilhay;
  inicializa( & pilhay);
  
  do {
  	printf("\nPosicao Atual:");
    printf("\n\n i=%d | j=%d", i, j);

    if (lab[i][j] != 'x') {
      lab[i][j] = 'v';
    }

    if (lab[i][j + 1] == 'Q' || lab[i][j - 1] == 'Q' || lab[i + 1][j] == 'Q'|| lab[i - 1][j] == 'Q' ){
      if (lab[i][j + 1] == 'Q') {/*D*/
        printf("\n** Queijo encontrado na posicao %d,%d **", i, j + 1);
      } else if (lab[i][j - 1] == 'Q') {
        printf("\n** Queijo encontrado na posicao %d,%d **", i, j - 1);
      } else if (lab[i - 1][j] == 'Q') {
        printf("\n** Queijo encontrado na posicao %d,%d **", i - 1, j);
      } else if (lab[i + 1][j] == 'Q') {
        printf("\n** Queijo encontrado na posicao %d,%d **", i + 1, j);
      }
    } else if (lab[i][j + 1] == '.') { 
      j++;
      push( & pilhax, i);
      push( & pilhay, j);
    } else if (lab[i + 1][j] == '.') { 
      i++;
      push( & pilhax, i);
      push( & pilhay, j);
    } else if (lab[i - 1][j] == '.') { 
      i--;
      push( & pilhax, i);
      push( & pilhay, j);
    } else if (lab[i][j - 1] == '.') { 
      j--;
      push( & pilhax, i);
      push( & pilhay, j);
    } else {

      lab[i][j] = 'x';
      i = top(pilhax);
      pop( & pilhax);
      j = top(pilhay);
      pop( & pilhay);

    }
	
	printf("\n\nHistorico:");
    printf("\n\n x=");
    mostra(pilhax);
    printf("\n y=");
    mostra(pilhay);

    if (isEmpty(pilhax) == 1 || isEmpty(pilhay) == 1) {
      printf("\n\n**Queijo nao pode ser encontrado**");
      break;
    }

    Sleep(250);
    system("cls");
    mostraLabirinto(lab,MAX,MAX);
  } while (lab[i][j] != 'Q');

} // fim funcao    





int main(){
    char labirinto[MAX][MAX];
    int x,y;
    cria(labirinto);
    mostraLabirinto(labirinto,MAX,MAX);
    printf("\nEntre com a posicao inicial:");
    scanf("%d %d",&x,&y);
    funcaoSuperMouse(labirinto,x,y);
    getch();
    }
    
    
