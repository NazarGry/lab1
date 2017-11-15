import java.util.Scanner;
public class inta {
 public static void main(String[] args) {
	 //lab1
	System.out.println(" ");
	String s = "Hello my world";
	System.out.println("Rechennya: " + s);
 
  char[] chars = s.toCharArray();
  

  
  int n=0; //порядковий номер масива slovo
  int ls=1; //Довжина масива slovo
  char prob = ' ';
  char point = '.';
  
  
  
  //Цикл для показу довжини масиву slova
  for(int k=0; k<chars.length; k++ ) {
   if(chars[k]== prob) {
    ls++; //Показує що слів є більше ніж 1
   }
   if(chars[k]== point) {
	    ls++; //Показує що слів є більше ніж 1
	   }
  }
  
  
  
  System.out.println("K-st symvoliv v zadannomy rechenni: " + chars.length);
  System.out.println("K-st sliv: " + ls);
  System.out.println(" ");
  
  
  
  int d[] = new int[ls]; //Створюємо масив з порядкових номерів слова
  //Цей цикл присвоює всім d = 0
  for(int di = 0; di<ls ;di++){
	  d[di] = 0;
  }
  
  
  
  String slovo[] = new String[ls];	//Створюємо новий масив слів
  //Цей цикл додає кожний наступний символ до слова, а як побаче що символ = пробілу, то символи додаються до наступного слова
   for(int i=0; i<chars.length; i++ ) {
	if(chars[i] == prob){ //Якщо наступний символ
     n++;
	 slovo[n] = " "; //Це вказана приставка до кожного слова, відсутність її створить приставку null біля кожного слова
    }
	if(chars[i] != prob){
		if(i==0){
		slovo[n] = " "; //+/-
	}
     for(int e=0; e<1; e++) {
      slovo[n] = slovo[n] + chars[i]; //додавати кожний наступний символ до слова
	  d[n] = d[n] + 1; //Кількість символів тепер більша
     }
    }
   } //Закриваюча циклу
   
   
   
   //Цикл який додає всі довжини слів
   int max;
   max = 0;
   for(int i=0; i<d.length; i++){
	   max = max + d[i];
   }
   System.out.println(max);
   
   //Цикл для виведення слів від найдовшого до найменшого
   for(int j=max; 0<j; j--){
	   for(int k=0; k<d.length; k++){
	   if(j==d[k]){
		   System.out.println(slovo[k]);
	   }
	   }
   }
		
		
  System.out.println("Dyaki za uvagu :D");
}
}
