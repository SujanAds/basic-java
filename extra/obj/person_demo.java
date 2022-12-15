class person{
{
String name;
int age;
void set(String name, int age){
this.name = name;
this.age = age;


}
void show(){

System.out.println(name+" "+age);

}



}
class person_demo{

public static void main(String[] args){
// creating multiple objects

person ob[] = new person[4];


int i;
for(i = 0; i<4; i++)
{

ob[i] = new person();

}

ob[0].set("sujan" ,30);
ob[1].set("saroj", 21);
ob[2].set("sadikshya", 24);
ob[3].set("nimesh", 12);


for(i =0; i<4; i++)
ob[i].show();

}

}



