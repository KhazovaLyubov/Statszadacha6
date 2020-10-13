package ru.netology.stats;

public class StatsService {
    public int sum(int[] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result;
    }

    public int calculateAverageSum(int[] array) {
        return sum(array) / array.length;
    }

    public int withMax(int[] array) {
        int max = array[0];
        for (int elem : array) {
            if (max < elem) {
                max = elem;
            }
        }
        int monthCount = 1;
        int monthWithMax = 0;
        for (int elem : array) {
            if (elem == max) {
                monthWithMax = monthCount;
            }
            monthCount++;
        }
        return monthWithMax;
    }

    public int withMin(int[] array) {
        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }
        int monthCount = 1;
        int monthWithMin = 0;
        for (int elem : array) {
            if (elem == min) {
                monthWithMin = monthCount;
            }
            monthCount++;
        }
        return monthWithMin;
    }

    public int moreThanAverageSum(int[] array) {
        int averageSum = calculateAverageSum(array);
        int count = 0;
        for (int elem : array) {
            if (elem > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int lessThanAverageSum(int[] array) {
        int averageSum = calculateAverageSum(array);
        int count = 0;
        for (int elem : array) {
            if (elem < averageSum) {
                count++;
            }
        }
        return count;
    }
}

