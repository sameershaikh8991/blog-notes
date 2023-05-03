public class Sample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumber = number.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList());

        System.out.println(evenNumber);

    }
}

