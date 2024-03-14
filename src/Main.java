public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(input.txt))){
        StringBuilder nd = new StringBuilder();
        String line;
        while((line = reader.readLine() != null){
            nd.append(line).append("\n");
        }
        reader.close();

        String VungTau = nd.toString().replaceAll("Nha Trang","Vũng Tàu");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(output.txt))){
            writer.write(VungTau);
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    } catch (IOException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }

    }
}
