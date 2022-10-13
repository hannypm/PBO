#include<iostream>
using namespace std;

int main()
{
	int jumlahData;
	int z=0;
	do 
	{
        cout<<"=";
        z++;
    }
    while(z<=40);
    cout<<"\n           Program data dealer mobil        "<<endl;
    cout<<"==========================================="<<endl;
    cout<<"Banyaknya mobil yang ada :  ";
	cin>>jumlahData;
	
	string data[jumlahData][4];
	
	cout<<"Program data dealer mobil :"<<endl;
	for(int a=0;a<jumlahData;a++)
        {
			cout<<""<<endl;
            cout<<"Data mobil ke-"<<a+1<<endl;
            for (int b=0;b<3;b++)
            {
                if (b==0)
                {
                    cout<<"Merk mobil : ";
                }
                else if(b==1)
                {
                    cout<<"Tipe Mobil : ";
                }
                else
                {
                    cout<<"Warna Mobil :";
                }
                cin>>data[a][b];
            }
        }
	cout<<"----------------------------------------"<<endl;
    cout<<"\nProgram data dealer mobil "<<endl;
    cout<<"----------------------------------------"<<endl;
    cout<<"Merk \t\t Tipe \t\t Warna \t"<<endl;
    for(int a=0;a<jumlahData;a++)
    {
        for(int b=0; b<3;b++)
        {
            cout<<data[a][b]<<"\t\t";
        }
        cout<<endl;
    }
    return 0;
}
