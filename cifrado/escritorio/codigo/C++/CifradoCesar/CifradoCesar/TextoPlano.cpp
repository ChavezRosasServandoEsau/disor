#include "stdafx.h"
#include "TextoPlano.h"
#include <string>
#include <string.h>
using namespace std;

string textoPlano;

TextoPlano::TextoPlano(string texto)
{
	textoPlano = texto;
}

string TextoPlano::invertirTexto()
{
	string textoInvertido = "";
	for (int i = textoPlano.length() - 1; i >= 0; i--)
		textoInvertido = textoInvertido + textoPlano[i];

	return textoInvertido;
}

string TextoPlano::invertirTexto(string textito)
{
	string textoInvertido = "";
	for (int i = textito.length() - 1; i >= 0; i--)
		textoInvertido = textoInvertido + textito[i];

	return textoInvertido;
}

string TextoPlano::invertirTextoGrupos(int grupos)
{
	string textoInvertido = "";
	string textito = "";

	for (int i = 0; i < textoPlano.length(); i++)
	{
		if ((i) % grupos == 0)
		{
			textoInvertido = textoInvertido + invertirTexto(textito);
			textito =  textoPlano[i];
		}
		else
			textito = textito + textoPlano[i];
	}

	return textoInvertido + textito;
}
