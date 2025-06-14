## Recap 


encapsulation 

fields private 
getters and setters to access data 



## abstraction 

How to achieve abstraction?
1. abstract class  [0-100%]

abstract methods, non abstract methods[concrete methods]


How to create abstract class ?




abstract class Test ()

// declare the method so that we can show 

what to do 
rather than how to do .



  Car    - Parent
-- Brake()   
  |
Tesla      Child 
## Problem statement 
abstract class BankAccount

fields : accountNumber, balance

abstract method : deposit(double amount)
abstract method : withdraw(double amount)

displayBalance(){
}
                        BankAccount
    |                           |                 |
SavingsAccount              ChequingAccount      HighInterestSavingAccount
[add interest]              [zero interest]        [more interest]

print the balance 


## interface
what is an interface? 

100 % abtraction 

its a contract which a class has to implement if its inheriting from a class 

   A  [interface]
   |
   B 
 


## final
variable - it becomes contant 

final int x = 10;
x = 12;  // this will be wrong



class as final 

cannot be inherited 

method as final 
cannot be overriden 

















