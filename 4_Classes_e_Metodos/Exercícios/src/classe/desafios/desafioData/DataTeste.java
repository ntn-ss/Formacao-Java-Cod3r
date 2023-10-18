package desafioData;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(8, 3, 2023);

        Data d2 = new Data(25, 9, 2007);
        
        Data d3 = new Data(29, 2, 2020);

        Data d4 = new Data();

        Data datas[] = {d1, d2, d3, d4};

        for (int i = 0; i < datas.length; i++) {
            System.out.printf("Data %d: %s.\n", i+1, datas[i].toString());
        }
    }
}