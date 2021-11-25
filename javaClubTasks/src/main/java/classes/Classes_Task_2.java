package classes;

public class Classes_Task_2 {
        private int arr [];
        private int width;
        private int length;
        private int height;

        public Classes_Task_2(int[] arr) {
            this.arr = arr;
            this.width = arr[0];
            this.length = arr[1];
            this.height = arr[2];
        }
        public int getWidth() {
            return width;
        }
        public int getLength() {
            return length;
        }
        public int getHeight() {
            return height;
        }
        public int getVolume() {
            int volume = width * length * height;
            return volume;
        }
        public int getSurfaceArea() {
            int surfaceArea = 2*(width * length + width * height + length * height);
            return surfaceArea;
        }
}
