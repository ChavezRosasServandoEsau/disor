#pragma once
#include <string>
#include "Cifrador.h"
namespace CppCLR_WinformsProjekt {

	using namespace System;
	using namespace System::ComponentModel;
	using namespace System::Collections;
	using namespace System::Windows::Forms;
	using namespace System::Data;
	using namespace System::Drawing;
	using namespace std;
	
	string alfabeto = "aábcdeéfghiíjklmnñoópqrstuúvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ";
	
	int desplazamiento = 0;
	
	public ref class Form1 : public System::Windows::Forms::Form
	{
		

	public:
		Form1(void)
		{
			InitializeComponent();
		}

	protected:
		~Form1()
		{
			if (components)
			{
				delete components;
			}
		}
	private: System::Windows::Forms::Label^  label1;
	protected:
	private: System::Windows::Forms::Label^  label2;
	private: System::Windows::Forms::Label^  label3;
	private: System::Windows::Forms::RichTextBox^  textoClaro;

	private: System::Windows::Forms::RichTextBox^  textoCifrado;
	private: System::Windows::Forms::Label^  label4;
	private: System::Windows::Forms::RichTextBox^  textoInverso;

	private: System::Windows::Forms::Label^  label5;
	private: System::Windows::Forms::RichTextBox^  invertidoGrupal;

	private: System::Windows::Forms::NumericUpDown^  numericUpDown1;
	private: System::Windows::Forms::Label^  label6;
	private: System::Windows::Forms::NumericUpDown^  desplazamiento;





	private:
		System::ComponentModel::Container ^components;

#pragma region Windows Form Designer generated code
		/// <summary>
		/// Erforderliche Methode für die Designerunterstützung.
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
		/// </summary>
		void InitializeComponent(void)
		{
			this->label1 = (gcnew System::Windows::Forms::Label());
			this->label2 = (gcnew System::Windows::Forms::Label());
			this->label3 = (gcnew System::Windows::Forms::Label());
			this->textoClaro = (gcnew System::Windows::Forms::RichTextBox());
			this->textoCifrado = (gcnew System::Windows::Forms::RichTextBox());
			this->label4 = (gcnew System::Windows::Forms::Label());
			this->textoInverso = (gcnew System::Windows::Forms::RichTextBox());
			this->label5 = (gcnew System::Windows::Forms::Label());
			this->invertidoGrupal = (gcnew System::Windows::Forms::RichTextBox());
			this->numericUpDown1 = (gcnew System::Windows::Forms::NumericUpDown());
			this->label6 = (gcnew System::Windows::Forms::Label());
			this->desplazamiento = (gcnew System::Windows::Forms::NumericUpDown());
			(cli::safe_cast<System::ComponentModel::ISupportInitialize^>(this->numericUpDown1))->BeginInit();
			(cli::safe_cast<System::ComponentModel::ISupportInitialize^>(this->desplazamiento))->BeginInit();
			this->SuspendLayout();
			// 
			// label1
			// 
			this->label1->AutoSize = true;
			this->label1->Location = System::Drawing::Point(102, 52);
			this->label1->Name = L"label1";
			this->label1->Size = System::Drawing::Size(117, 13);
			this->label1->TabIndex = 0;
			this->label1->Text = L"Ingrese el texto a cifrar:";
			// 
			// label2
			// 
			this->label2->AutoSize = true;
			this->label2->Location = System::Drawing::Point(102, 138);
			this->label2->Name = L"label2";
			this->label2->Size = System::Drawing::Size(132, 13);
			this->label2->TabIndex = 1;
			this->label2->Text = L"Ingrese el desplazamiento:";
			// 
			// label3
			// 
			this->label3->AutoSize = true;
			this->label3->Location = System::Drawing::Point(102, 245);
			this->label3->Name = L"label3";
			this->label3->Size = System::Drawing::Size(80, 13);
			this->label3->TabIndex = 2;
			this->label3->Text = L"El texto cifrado:";
			// 
			// textoClaro
			// 
			this->textoClaro->Enabled = false;
			this->textoClaro->Location = System::Drawing::Point(282, 12);
			this->textoClaro->Name = L"textoClaro";
			this->textoClaro->Size = System::Drawing::Size(339, 96);
			this->textoClaro->TabIndex = 3;
			this->textoClaro->Text = L"";
			this->textoClaro->KeyPress += gcnew System::Windows::Forms::KeyPressEventHandler(this, &Form1::textoClaro_KeyPress);
			// 
			// textoCifrado
			// 
			this->textoCifrado->Enabled = false;
			this->textoCifrado->Location = System::Drawing::Point(21, 283);
			this->textoCifrado->Name = L"textoCifrado";
			this->textoCifrado->Size = System::Drawing::Size(254, 157);
			this->textoCifrado->TabIndex = 5;
			this->textoCifrado->Text = L"";
			this->textoCifrado->KeyPress += gcnew System::Windows::Forms::KeyPressEventHandler(this, &Form1::textoCifrado_KeyPress);
			// 
			// label4
			// 
			this->label4->AutoSize = true;
			this->label4->Location = System::Drawing::Point(421, 245);
			this->label4->Name = L"label4";
			this->label4->Size = System::Drawing::Size(77, 13);
			this->label4->TabIndex = 6;
			this->label4->Text = L"Texto invertido";
			// 
			// textoInverso
			// 
			this->textoInverso->Location = System::Drawing::Point(341, 283);
			this->textoInverso->Name = L"textoInverso";
			this->textoInverso->Size = System::Drawing::Size(235, 157);
			this->textoInverso->TabIndex = 7;
			this->textoInverso->Text = L"";
			// 
			// label5
			// 
			this->label5->AutoSize = true;
			this->label5->Location = System::Drawing::Point(667, 215);
			this->label5->Name = L"label5";
			this->label5->Size = System::Drawing::Size(125, 13);
			this->label5->TabIndex = 8;
			this->label5->Text = L"Texto invertido agrupado";
			// 
			// invertidoGrupal
			// 
			this->invertidoGrupal->Location = System::Drawing::Point(628, 283);
			this->invertidoGrupal->Name = L"invertidoGrupal";
			this->invertidoGrupal->Size = System::Drawing::Size(217, 157);
			this->invertidoGrupal->TabIndex = 9;
			this->invertidoGrupal->Text = L"";
			// 
			// numericUpDown1
			// 
			this->numericUpDown1->Location = System::Drawing::Point(732, 245);
			this->numericUpDown1->Name = L"numericUpDown1";
			this->numericUpDown1->Size = System::Drawing::Size(102, 20);
			this->numericUpDown1->TabIndex = 10;
			// 
			// label6
			// 
			this->label6->AutoSize = true;
			this->label6->Location = System::Drawing::Point(625, 245);
			this->label6->Name = L"label6";
			this->label6->Size = System::Drawing::Size(91, 13);
			this->label6->TabIndex = 11;
			this->label6->Text = L"Tamaño de grupo";
			// 
			// desplazamiento
			// 
			this->desplazamiento->Location = System::Drawing::Point(282, 138);
			this->desplazamiento->Name = L"desplazamiento";
			this->desplazamiento->Size = System::Drawing::Size(120, 20);
			this->desplazamiento->TabIndex = 12;
			this->desplazamiento->ValueChanged += gcnew System::EventHandler(this, &Form1::desplazamiento_ValueChanged);
			// 
			// Form1
			// 
			this->AutoScaleDimensions = System::Drawing::SizeF(6, 13);
			this->AutoScaleMode = System::Windows::Forms::AutoScaleMode::Font;
			this->ClientSize = System::Drawing::Size(857, 502);
			this->Controls->Add(this->desplazamiento);
			this->Controls->Add(this->label6);
			this->Controls->Add(this->numericUpDown1);
			this->Controls->Add(this->invertidoGrupal);
			this->Controls->Add(this->label5);
			this->Controls->Add(this->textoInverso);
			this->Controls->Add(this->label4);
			this->Controls->Add(this->textoCifrado);
			this->Controls->Add(this->textoClaro);
			this->Controls->Add(this->label3);
			this->Controls->Add(this->label2);
			this->Controls->Add(this->label1);
			this->Name = L"Form1";
			this->Text = L"Cifrado Cesar";
			(cli::safe_cast<System::ComponentModel::ISupportInitialize^>(this->numericUpDown1))->EndInit();
			(cli::safe_cast<System::ComponentModel::ISupportInitialize^>(this->desplazamiento))->EndInit();
			this->ResumeLayout(false);
			this->PerformLayout();

		}
#pragma endregion


	/****************************************CIFRADO CESAR************************************************************/


	private: int buscarPosicionLetra(char letra) {
			for (int i = 0; i < alfabeto.length(); i++)
				if (alfabeto[i] == letra)
					return i;

			return -1;
	}

	private: bool perteneceAlfabeto(char letra) {
		for (int i = 0; i < alfabeto.length(); i++)
			if (alfabeto[i] == letra)
				return true;
			
		return false;
	}

	private: string cifrar(string textoParaCifrar, int desplazamiento)
	{
		string cifrado = "";
		string letr = "";
		int posicion = 0;
		for (int i = 0; i < textoParaCifrar.length(); i++)
		{
			

			if (perteneceAlfabeto(textoParaCifrar[i]))
			{
				posicion = buscarPosicionLetra(textoParaCifrar[i]);
				posicion = posicion + desplazamiento;
				if (posicion > alfabeto.length())
					posicion = posicion - alfabeto.length();

				cifrado = cifrado + alfabeto[posicion];
			}
			else
			{
				cifrado = cifrado + textoParaCifrar[i];
			}
		}

		return cifrado;
	
	}


	string MarshalString(System::String^ cadena)
	{
		 std::string os;
		 using namespace System::Runtime::InteropServices;
		 const char* chars = (const char*)(Marshal::StringToHGlobalAnsi(cadena)).ToPointer();
		 os = chars;
		 Marshal::FreeHGlobal(IntPtr((void*)chars));
		 return os;
	}

	private: string  descifrar(string textoParaDescifrar, int desplazamiento)
	{
		string cifrado = "";
		string letr = "";
		int posicion = 0;
		for (int i = 0; i < textoParaDescifrar.length(); i++)
		{
			if (perteneceAlfabeto(textoParaDescifrar[i]))
			{
				posicion = buscarPosicionLetra(textoParaDescifrar[i]);
				posicion = posicion - desplazamiento;
				if (posicion < 0)
					posicion = alfabeto.length() + posicion;

				cifrado = cifrado + alfabeto[posicion];
			}
			else
			{
				cifrado = cifrado + textoParaDescifrar[i];
			}
		}

		return cifrado;

	}

		/*Evento cada que teclea una letra.*/

private: string invertirTexto(string texto)
{
	string textoInvertido = "";
	for (int i = texto.length()-1; i >= 0; i--)
		textoInvertido = textoInvertido + texto[i];

	return textoInvertido;
}

private: string invertirTextoGrupos(string texto, int grupos)
		 {
			 string textoInvertido = "";
			 string textito = "";
			 int tam = 0, pos=0;
		
			 for (int i = 0; i < texto.length(); i++)
			 {
				 if ((i) % grupos == 0)
				 {
					 textoInvertido = textoInvertido + invertirTexto(textito);
					 textito = texto[i];
				 }
				 else
					 textito = textito + texto[i];
			 }

			 return textoInvertido + textito;
		 }

private: System::Void textoClaro_KeyPress(System::Object^  sender, System::Windows::Forms::KeyPressEventArgs^  e) {
	Cifrador cifrador;
	//Obtener el texto a cifrar
	string texto = MarshalString(textoClaro->Text);
	//Obtener el desplazamiento
	int desp = System::Convert::ToInt16(desplazamiento->Text);
	int tanG = System::Convert::ToInt16(numericUpDown1->Text);
	//*************Cifrar texto******************************
	String^ imprime;
	imprime = gcnew String(cifrador.CifradoTipoCesar(texto, desp,alfabeto).c_str());
	
	String^ imprime2;
	imprime2 = gcnew String(cifrador.cifradoTipoTransposicionInversa(texto).c_str());

	String^ imprime3;
	imprime3 = gcnew String(cifrador.cifradoTipoTransposicionInversaPorGrupos(texto,tanG).c_str());


	textoCifrado->Text = imprime;
	textoInverso->Text = imprime2;
	invertidoGrupal->Text = imprime3;
}
private: System::Void textoCifrado_KeyPress(System::Object^  sender, System::Windows::Forms::KeyPressEventArgs^  e) {
	//Obtener el texto a cifrar
	string texto =MarshalString( textoCifrado->Text);
	//Obtener el desplazamiento
	int desp = System::Convert::ToInt16(desplazamiento->Text);
	//*************Cifrar texto******************************
	String^ imprime;
	imprime = gcnew String(descifrar(texto, desp).c_str());


	textoClaro->Text =imprime;
}
private: System::Void desplazamiento_ValueChanged(System::Object^  sender, System::EventArgs^  e) {
	textoClaro->Enabled = true;
	textoCifrado->Enabled = true;
}
};
}
/*https://drive.google.com/open?id=1B0j-ifnRNJiyGuHJQ4euqvg9n-vWm7Wh*/



