int circle1X = 250;
int circle2X = 750;
int Lspeed = 1;
int Rspeed = -1;
void setup() {
  noFill();
  size(1000, 500);




}

void draw() {
  background(#FFFFFF);
  //left circle
  int size = 450;
  
  for (int i = 0; i<50; i++) {
    ellipse(circle1X, 250, size, size); 
    size-=10;
   
  }
  circle1X+=Lspeed;
  
//right circle
  size = 450;
for (int i = 0; i<50; i++) {
    ellipse(circle2X, 250, size, size); 
    size-=10;
  }
  
  
circle2X+=Rspeed;
if(circle1X<0+125||circle2X<125){
Rspeed = -Rspeed;
Lspeed = -Lspeed;
}

}