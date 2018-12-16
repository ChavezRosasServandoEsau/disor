#include "stdafx.h"
#include "Alfabeto.h"
#include <string>
using namespace std;



string caracteres;

Alfabeto::Alfabeto(string letras)
{
	caracteres = letras;
}

int Alfabeto::buscarPosicionLetra(char letra)
{
	for (int i = 0; i < caracteres.length(); i++)
		if (caracteres[i] == letra)
			return i;

	return -1;
}

bool Alfabeto::perteneceAlfabeto(char letra)
{
	for (int i = 0; i < caracteres.length(); i++)
		if (caracteres[i] == letra)
			return true;

	return false;
}