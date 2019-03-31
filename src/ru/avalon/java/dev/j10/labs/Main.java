package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     */

		int[] array = new int[20];

	    /*
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     */

		FibonacciInitializer fibonacci = new FibonacciInitializer();
		fibonacci.initialize(array);


		System.out.print("Последовательность Фибоначчи: ");
		for (int i = 0;  i < array.length; i++) {
			System.out.print(array[i] + " ");}
		System.out.println();

	    /*
	     * 2. Найти сумму элементов массива.
	     */

		int sum = 0;
		for (int a = 0; a < array.length; a++){
			sum += array[a];
		}
		System.out.println("Сумма = " + sum);


	    /* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */

		RandomInitializer random = new RandomInitializer(-50, 50);
		random.initialize(array);


	    /* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */

		int[] bubbleArrSort = new int[20];
		random.initialize(bubbleArrSort);

		System.out.println("\n Не отсортированный массив: ");
		for ( int j=0; j<bubbleArrSort.length; j++)
			System.out.print (bubbleArrSort[j] + " ");

		BubbleSort bubble = new BubbleSort();
		bubble.sort(bubbleArrSort);

		System.out.println("\n Отсортированный пузырьком массив: ");
		for (int c: bubbleArrSort){
			System.out.print(c + " ");
		}


	    /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */

		int[] selectArrSort = new int[20];
		random.initialize(selectArrSort);

        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */


		System.out.println("\n \n \n Не отсортированный массив: ");

		for ( int j=0; j<selectArrSort.length; j++)
			System.out.print (selectArrSort[j] + " ");

		SelectionSort select = new SelectionSort();
		select.sort(selectArrSort);

		System.out.println("\n Сортировка выбором: ");
		for (int c: selectArrSort){
			System.out.print(c + " ");
		}


        /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */


		int[] shellArrSort = new int[20];
		random.initialize(shellArrSort);

        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
		System.out.println("\n \n Не отсортированный массив: ");

		for ( int j=0; j<shellArrSort.length; j++)
			System.out.print (shellArrSort[j] + " ");

		ShellSort shell = new ShellSort();
		shell.sort(shellArrSort);

		System.out.println("\n Сортировка Шелла: ");
		for (int c: shellArrSort){
			System.out.print(c + " ");
		}

	}
}
