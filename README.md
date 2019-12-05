# Parser Error Checking 

Parser/ErrorChecking branch of the CompilerProject

## Checklist


## Test Cases Used
#### Return Function #1
```java
fonction nombre test(){
    nombre x = 50;
    rappel x;
    }

essentiel{
    nombre lol = appel test();
    imprimer("grade:" + lol);
}
```
#### Return Function #1
```java
fonction decimale grade(){   
    decimale x = 50;
    rappel x;
}

essentiel{
    decimale lol = appel grade();
    impremer("grade" + lol);
}
```
#### Function Parenthesis
```java
fonction vide testOne(nombre i){
    nombre x = 0;
    tandis que(i<5){
        imprimer("Hello " +x);
        i++;
   };
}
essentiel{
    appel testOne(2);
}
```
#### If Statement #1
```java
fonction vide testOne(){
    nombre temp;
    analyse("Enter temperature: ", temp);
    si(temp < 20) {
        imprimer("IT'S COLD!");
    } autre si(temp > 30) {
        imprimer("IT'S HOT!");
    } autre {
        imprimer("COOL CLIMATE");
    };
}
essentiel{
    appel testOne();
}
```
#### If Statement #2
```java
fonction vide testOne(){
    nombre x = 5;
    nombre y = 10;
    si(x<5){
        imprimer("Hello");
    } autre si (y==10){
         imprimer("World");
    } autre {
        imprimer("Hello World");
    };
}
essentiel{
    appel testOne();
}
```
#### Do While Statement
```
fonction vide testOne(){
    nombre x = 0;
    analyse("Input a number: ", x);
    nombre i = 0;
    faire{
        imprimer("Hello " +x);
        i++;
    } tandis que(i<2);
}
essentiel{
    appel testOne();
}
```
#### If Statement #3
```java
fonction vide testOne(){
    nombre x = 5;
    si(x==5){
        imprimer("Hello");
    };
}
essentiel{
    appel testOne();
}
```
#### While Statement
```java
fonction vide testOne(){
    nombre x = 0;
    analyse("Input a number: ", x);

    nombre i = 0
    tandis que(i<5){
        imprimer("Hello " +x);
        i++;
   };
}
essentiel{
    appel testOne();
}
```
#### For Statement

```java
fonction vide testOne(){
    nombre x = 0;
    analyse("Input a number: ", x);

    pour(nombre i; i<10; i+=1){
        imprimer("Hello " +x+);

}
essentiel{
    appel testOne()(x);
}
```
#### Given Test Case #1
```java
fonction nombre myFunction(nombre x){
    nombre add = x + 50 ++ 1;

    rappel nombre;
}

fonction decimale myFunctionFloat(decimale x){
    decimale fTest = (x * 50) + (x * 15));

    rappel fTest * 50 ();
}

essentiel{
    appel myFunction(50);
    appel myFunctionFloat(50.0);
}
```
#### Given Test Case #2
```java
fonction vide testOne(){
    nombre x = 0;
    analyse("Input a number: ", x);

    pour(nombre i; i<10; i+=1){
        imprimer("Hello " +x+);

}
fonction vide testTwo(decimale x){
    si(x = 4){
        imprimer(x);
    };
}

essentiel{
    decimale value = (5 * 1) + (5 * 5 / 1 + 3 + (4 + (5 * 3))) / 2.0 * 8.0;

    appel testOne()(x);
    appel testTwo(123 ++value);
}
```
#### Given Test Case #2
```java
fonction vide test(){
	imprimer("ello");
}

essentiel{
	appel tefdfst();
}
```
#### Given Test Case #3
```java
fonction vide test(){
	impmer("ello");
}

essentiel{
	appel test();
}
```
#### Given Test Case #4
```java
fonction vide sayHelloWorld(){
	impremer(“Hello world”);
}

fonction vide sayHelloWorld(){
	impremer(“Hello world”);
}
```
