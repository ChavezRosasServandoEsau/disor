#pragma once
#include <string>
#include <string.h>
using namespace std;


ref class Alfabeto
{	
	public:
		Alfabeto(string letras);
		int buscarPosicionLetra(char letra);
		bool perteneceAlfabeto(char letra);
	
};

