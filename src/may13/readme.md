## Recap 

1. Loops  
while, do while, for loop 



int i = 1;
while(i < 10){

for(){
}

System.out.println(i)
i++;
}

// infinite loop 
for(;;){


}




2. Methods

// static 

public String test(){


return "1";
}


## calling a method
methods ca be called by 
1. create an object of  class 
2. method has be static , then will the class name 



## Class 
blue print of object 
class is collection of variables and methods 


class is a blueprint to create Objects
class is a logical entity
attributes and behaviours


Electronics --- TV
Animal ----> Dog
Computer ----> Laptop


Mobile -- Iphone 


## Object 
physical entity 
state, behaviour, identity



## Excercise 

create a class Animal
1. color
2. weight
3. height

behvaiour - methods
eat, sleep , run, walk

public void eat(){
}

-- AnimalMain 
create 2 objects of Animal class 
Animal dog = new Animal();
dog.color = "black";


## Constructor 

special kind of method 
which is used to initialize the object 

1. same name as class name 
2. it does not have a return type , not even void 
3. default constructor and parameterized Constructor 

Student{

  Student(){
}

}



if a class does not have a constructor 
Java provides a default constructor 

if there is a parameterized constructor and we did not create a default construc tor 
then Java will not provide any default constructor 

// this 
it refers to the current class variables

