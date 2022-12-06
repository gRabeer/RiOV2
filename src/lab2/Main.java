package lab2;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Task number: ");
            Scanner scan = new Scanner(System.in);
            int task = scan.nextInt();

            switch (task) {
                case (1): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    String b = console.nextLine();
                    new StringBuilder(b).reverse().toString();
                    if (a.equals(b)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                break;
                case (2): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    a = a.replaceAll("([a-z])\\1", "");
                    System.out.println(a);
                }
                break;
                case (3): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = console.nextLine();
                    int a = str1.length();
                    int b = str2.length();
                    if (a == b) {
                        char[] a1 = str1.toCharArray();
                        char[] a2 = str2.toCharArray();
                        Arrays.sort(a1);
                        Arrays.sort(a2);
                        if (Arrays.equals(a1, a2)) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    } else {
                        System.out.println("false");
                    }
                }
                break;
                case (4): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = console.nextLine();
                    System.out.println(str1.compareTo(str2));
                }
                break;
                case (5): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = console.nextLine();
                    System.out.println(str1.compareToIgnoreCase(str2));
                }
                break;
                case (6): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = "Привет";
                    System.out.println(str2 + " " + str1);
                }
                break;
                case (7): {
                    String str2 = "Grant";
                    //char[] a2 = str2.toCharArray();
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter array length: ");
                    int size = input.nextInt();
                    String array[] = new String[size]; // Создаём массив размером в size
                    System.out.println("Insert array elements:");
                    int i = 0;
                    while (i < size) {
                        array[i] = input.nextLine();
                        i++;
                    }
                    char[] a2 = str2.toCharArray();
                    //Arrays.sort(a2);
                    //Arrays.sort(array);
                    if (array.equals(a2)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                break;
                case (8): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = console.nextLine();
                    if (str1.endsWith(str2)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
                break;
                case (9): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    String str2 = console.nextLine();
                    if (str1.equalsIgnoreCase(str2)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
                break;
                case (10): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    System.out.println(str1.length());
                }
                break;
                case (11): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine().toLowerCase();
                    System.out.println(str1);
                }
                break;
                case (12): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine().toUpperCase();
                    System.out.println(str1);
                }
                break;
                case (13): {
                    Scanner console = new Scanner(System.in);
                    String str1 = console.nextLine();
                    Character ans = null;
                    int first = 0, second = 0;
                    Character firstChar = null, secondChar = null;
                    HashMap<Character, Integer> counter = new HashMap<>();
                    for (char c : str1.toCharArray()) {
                        if (!counter.containsKey(c)) {
                            counter.put(c, 1);
                        } else {
                            counter.put(c, counter.get(c) + 1);
                        }
                    }
                    System.out.println(counter);
                    for (char c : counter.keySet()) {
                        if (counter.get(c) > first) {

                            second = first;
                            secondChar = firstChar;
                            firstChar = c;

                            first = counter.get(c);
                        } else if (counter.get(c) >= second && counter.get(c) <= first) {
                            second = counter.get(c);

                            secondChar = c;
                        }
                    }
                    System.out.println(secondChar);
                }
                break;
                case (14): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    int len;
                    do {
                        len = a.length();
                        a = a.replaceAll("([a-z])\\1", "");
                    }
                    while (len != a.length());
                    System.out.println(a);
                }
                break;
                case (15): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    char[] Arr = a.toCharArray();
                    //String sorted = new String(strAsArray);

                    if (a.length() > 0) {
                        char previousChar = a.charAt(0);
                        int count = 1;
                        for (int i = 1; i < a.length(); i++) {
                            if (a.charAt(i) == previousChar) {
                                count++;
                            } else {
                                if (count == 1) {
                                    //System.out.println(a.charAt(i - 1));
                               // }
                                count = 1;
                                previousChar = a.charAt(i);
                                if (previousChar >= a.charAt(i)){
                                    System.out.println(previousChar);
                                }
                            }
                        }
                       // if (count == 1) {
                         //   System.out.println(a.charAt(a.length()));
                     //   }
                    }
                }
                }
                break;
                case (16): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    Boolean result = true;
                    char[] b = a.toCharArray();
                    char f = b[0];
                    char c = b[1];
                    char d = b[b.length - 2];
                    char e = b[b.length - 1];
                    if ((f == d) && (c == e)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                case (17): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    char[] strAsArray = a.toCharArray();
                    Arrays.sort(strAsArray);
                    String sorted = new String(strAsArray);

                    if (sorted.length() > 0) {
                        char previousChar = a.charAt(0);
                        int count = 1;
                        for (int i = 1; i < sorted.length(); i++) {
                            if (sorted.charAt(i) == previousChar) {
                                count++;
                            } else {
                                if (count >= 3) {
                                    System.out.println(sorted.charAt(i - 1));
                                }
                                count = 1;
                                previousChar = sorted.charAt(i);
                            }
                        }
                        if (count >= 3) {
                           System.out.println(sorted.charAt(sorted.length() - 1));
                        }
                    }
                }
                break;
                case (18): {
                    Scanner console = new Scanner(System.in);
                    String a = console.nextLine();
                    int sum = 0;
                    a = a.replaceAll("([a-z])", "");
                    a = a.replaceAll(" ", "");
                    if(a != null && !a.isEmpty()) {
                        int[] A = Arrays.stream(a.split("")).mapToInt(Integer::parseInt).toArray();
                        for (int i = 0; i < A.length; i++) {
                            sum = sum + A[i];
                        }
                        System.out.println(sum);
                    }
                    else {
                        System.out.println(sum);
                    }
                }
                case (19): {
                    String s1 = new String ("Java");
                    String s2 = new String("java");
                    System.out.println(s1 == s2);
                }
            }
        }
    }
}
