class Kata {
    public static List CreateList(int number) {
        List list = new ArrayList();
        for (int count = 1; count <= number;) {
            list.add(count);
            count++;
        }
        return list;
    }
}
