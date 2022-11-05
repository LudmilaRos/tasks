public class HomeWork {

    public int rangeSum(int start, int finish) {
        int result = 0;
        int i = start;

        if (start <= finish) {
            for (i = start; i <= finish; i++) {
                result = i + result;

                System.out.println(result);
            }
        }

//        if (start >= finish)
        else if (start >= finish )
        {
            for (i = start; i >= finish; i--) {
                result = i + result;
                System.out.println(result);
            }
        }return result;
    }

    public int rangeEvenCount(int start, int finish) {
        int result = 0;
        int i = 0;
        if (start < finish) {
            for (i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even numbers:" + i);

                }
            }
        } else if (start > finish) {
            for (i = start; i >= finish; i--) {

                if (i % 2 == 0) {
                    System.out.println("Even numbers:" + i);
                }
            }
        }

        return i;

    }

}


//        return sum;{int start1;int finish1;
//            {
//            int sum1 = 0;
//            int count1 = 1;
//            while (sum1 > count1); {
//                out.println(count1);
//                sum1 = count1 + sum1;
//                count1++;
//                out.println("sum is " + sum1);
//            }
//        }
//        }
//    }

//public int rangeEvenCount(int start, int finish) {
//        int count = 0;
//        int sum = 0;
//        if (start>finish){
//            for(int i = 2; i>=0; i++ )
//                if (i % 2 == 0);
//                out.println(rangeSum(1, 10));}
//
//    return count; }
//}





//    public int rangeSum(int start, int finish) {
//
//        if (start <= finish) {
//            int[] range = IntStream.range(start, finish).toArray();
//            int sum = IntStream.of(range).sum() + start;
//            System.out.println(sum);
//            {
//                return sum;
//            }
//        }
//        if (start >= finish) {
//            int[] range = IntStream.range(finish, start).toArray();
//            int sum = IntStream.of(range).sum() + finish;
//            System.out.println(sum);
//            {
//                return sum;
//            }
//        }
//        return rangeSum(start, finish);
//    }
//}






//    public int rangeEvenCount(int start, int finish) {
//        int min = start; // your minimum value
//        int max = finish; // your maximum value
//        int countOfEven = (max - min) / 2;
//        if(min % 2 == 0) {
//            countOfEven += 1;
//            System.out.println("Number of even numbers is" + countOfEven);
//        }
//        return countOfEven;
//
//    }
//}







//    public int[] rangeSum(int start, int finish) {
//        if (start > finish) {
//        Временно заменяем старт и финиш местами
//        int tmpFinish = finish;

//            finish =  start;
//            start = tmpFinish;
//        }

//        int[] range = IntStream.range(start, finish).toArray();
//        int sum = IntStream.of(range).sum();


//        System.out.println(sum);
//        return range;
//    }

//}


