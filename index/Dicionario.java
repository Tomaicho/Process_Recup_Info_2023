import java.util.ArrayList;
import java.util.HashMap;

public class Dicionario {

    private HashMap<String, ArrayList<Integer>> index; 
    
    // constructor
    public Dicionario (String key, ArrayList<Integer> index) {
        HashMap<String, ArrayList<Integer>> dic = new HashMap<>();
        dic.put(key, index);
        this.index = dic;
    } 
        
    public void add(String key, ArrayList<Integer> postList) {
        this.index.put(key, postList);
        
    }

    public ArrayList<Integer> search(ArrayList<String> termos)    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<String> tmp = new ArrayList<String>();
        for (String termo : termos) {
            if (!index.containsKey(termo)) {
                return result;
            }
            else {
                tmp.add(termo);
            }
        }

        ArrayList<Integer> aux = new ArrayList<Integer>(index.get(tmp.get(0)));

        for (String term : tmp) {
            result.clear();
            System.out.println("aux: " + aux);
            ArrayList<Integer> docs = new ArrayList<Integer>(index.get(term));
            System.out.println("docs: " + docs);
            int c1 = 0;
            int c2 = 0;
            while (c1 < aux.size() && c2 < docs.size()) {
                if (aux.get(c1) == docs.get(c2)) {
                    result.add(aux.get(c1));
                    System.out.println(aux.get(c1) + " added");
                    c1 += 1;
                    c2 += 1;
                }
                else {
                    if (aux.get(c1) < docs.get(c2)) {
                        System.out.println(aux.get(c1) +"-"+ docs.get(c2));
                        c1 += 1;
                    }
                    else {
                        c2 += 1;
                        System.out.println(aux.get(c1) +"-"+ docs.get(c2));
                    }

                }
            }
            System.out.println("result: " + result);
            aux.clear();
            aux = new ArrayList<Integer>(result);
            System.out.println("aux aqui: " + aux);
            /* 
            for (int doc : docs) {
                if (result.contains(doc)) {
                    continue;
                }
                else {
                    result.remove(Integer. valueOf(doc));
                }
            }*/
            
        }
        
        return(result);
    }

    @Override
    public String toString() {
        String dict = new String("Dicionário:\n");
        for (HashMap.Entry<String, ArrayList<Integer>> entry : index.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> docs = entry.getValue();
            System.out.println("Entry added: " + key + docs);
            dict = (dict + key + ":" + docs + "\n");
        } 
        return dict;
    }

    

}