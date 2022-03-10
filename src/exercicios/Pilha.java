package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pilha {

    static class Solution {

        Integer[] pilha;
        int indexPilha;
        List<Integer> minList;
        Integer min = Integer.MAX_VALUE;

        public Solution() {
            this.pilha = new Integer[10];
            this.indexPilha = -1;
            this.minList = new ArrayList<>();
        }

        public Integer[] getPilha() {
            return pilha;
        }

        public int add(int element) {
            if (this.indexPilha == this.pilha.length-1) {
                this.pilha = Arrays.copyOf(this.pilha, this.pilha.length + 1);
                ++this.indexPilha;
                this.pilha[indexPilha] = element;
            } else {
                ++this.indexPilha;
                this.pilha[indexPilha] = element;
            }

            if (element < this.min) {
                minList.add(element);
                this.min = element;
            }

            return element;
        }

        public Integer remove() {
            //pilha vazia
            if (this.indexPilha == -1) {
                System.exit(-1);
            }
            Integer removed = this.pilha[indexPilha];
            this.pilha[indexPilha] = null;
            --this.indexPilha;

            if (removed.equals(this.min)) {
                this.minList.remove(removed);
                this.min = this.minList.get(this.minList.size()-1);
            }

            return removed;
        }

        public Integer peekMin() {
            //pilha vazia
            if (this.minList.isEmpty()) {
                System.exit(-1);
            }
            return minList.get(minList.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("ADD: " + s.add(10));
        System.out.println("ADD: " + s.add(20));
        System.out.println("ADD: " + s.add(30));
        System.out.println("ADD: " + s.add(40));
        System.out.println("ADD: " + s.add(50));
        System.out.println("ADD: " + s.add(60));
        System.out.println("ADD: " + s.add(70));
        System.out.println("ADD: " + s.add(80));
        System.out.println("ADD: " + s.add(90));
        System.out.println("ADD: " + s.add(100));
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
        System.out.println("ADD: " + s.add(200));
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("REMOVE: " + s.remove());
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("ADD: " + s.add(5));
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
        System.out.println("ADD: " + s.add(4));
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
        System.out.println("REMOVE: " + s.remove());
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
        System.out.println("REMOVE: " + s.remove());
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
        System.out.println("ADD: " + s.add(6));
        System.out.println(Arrays.toString(s.getPilha()));
        System.out.println("MIN: " + s.peekMin());
    }
}
