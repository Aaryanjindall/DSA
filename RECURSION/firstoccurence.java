public class firstoccurence {
    public static void firstocc(int arr[],int key , int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i);
        }
        return firstocc(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,6,10,2,2,5};
        firstocc(arr, 5, 0);

    }
}


//is q mai dhyaan rakhna ki humne length ko -1 kyu nhi kiya kyunki agr hum -1 kar dete aur agr element last position par hi hota toh bhi voh -1 return karta na ki uski position , hmara main maksad base condition ka yeh hai ki voh sare array ko search karne ke baad agr khin bhi na mile toh -1 return karna ....