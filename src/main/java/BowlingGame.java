public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
        char a[] = bowlingCode.toCharArray();
        int n = a.length, result = 0, m, p= 0;
        for (int i = 0; i < 10; i++) {
            m=0;
            if(a[p]=='X'){
                int j=1;
                while(a[p+j]=='|'){
                    j++;
                }
                char a1=a[p+j];
                j++;
                while(a[p+j]=='|'){
                    j++;
                }
                char a2=a[p+j];
                switch (a1){
                    case 'X':m+=10;break;
                    case '-':break;
                    case '9':m+='9'-'0';break;
                    case '8':m+='8'-'0';break;
                    case '7':m+='7'-'0';break;
                    case '6':m+='6'-'0';break;
                    case '5':m+='5'-'0';break;
                    case '4':m+='4'-'0';break;
                    case '3':m+='3'-'0';break;
                    case '2':m+='2'-'0';break;
                    case '1':m+='1'-'0';break;
                }
                switch (a2){
                    case 'X':m+=10;break;
                    case '-':break;
                    case '/':m=10;break;
                    case '9':m+='9'-'0';break;
                    case '8':m+='8'-'0';break;
                    case '7':m+='7'-'0';break;
                    case '6':m+='6'-'0';break;
                    case '5':m+='5'-'0';break;
                    case '4':m+='4'-'0';break;
                    case '3':m+='3'-'0';break;
                    case '2':m+='2'-'0';break;
                    case '1':m+='1'-'0';break;
                }
                result+=10+m;
                p+=2;
            }else{
                switch (a[p]){
                    case '-':break;
                    case '9':m+='9'-'0';break;
                    case '8':m+='8'-'0';break;
                    case '7':m+='7'-'0';break;
                    case '6':m+='6'-'0';break;
                    case '5':m+='5'-'0';break;
                    case '4':m+='4'-'0';break;
                    case '3':m+='3'-'0';break;
                    case '2':m+='2'-'0';break;
                    case '1':m+='1'-'0';break;
                }
                switch (a[p+1]){
                    case '-':break;
                    case '/':{
                        m=10;
                        int j=2;
                        while(a[p+j]=='|'){
                            j++;
                        }
                        char a1=a[p+j];
                        switch (a1){
                            case 'X':m+=10;break;
                            case '-':break;
                            case '9':m+='9'-'0';break;
                            case '8':m+='8'-'0';break;
                            case '7':m+='7'-'0';break;
                            case '6':m+='6'-'0';break;
                            case '5':m+='5'-'0';break;
                            case '4':m+='4'-'0';break;
                            case '3':m+='3'-'0';break;
                            case '2':m+='2'-'0';break;
                            case '1':m+='1'-'0';break;
                        }
                        break;
                    }
                    case '9':m+='9'-'0';break;
                    case '8':m+='8'-'0';break;
                    case '7':m+='7'-'0';break;
                    case '6':m+='6'-'0';break;
                    case '5':m+='5'-'0';break;
                    case '4':m+='4'-'0';break;
                    case '3':m+='3'-'0';break;
                    case '2':m+='2'-'0';break;
                    case '1':m+='1'-'0';break;
                }
                result+=m;
                p+=3;
            }
        }
        return result;
    }
}
