#include "stdafx.h"
#include "Cifrador.h"

#include <string>
#include <string.h>

#include "Alfabeto.h"
#include "TextoPlano.h"
using namespace std;

Cifrador::Cifrador(){}

string Cifrador::CifradoTipoCesar(string texto, int desplazamiento, string abecedario)
{
	TextoPlano textoPlano(texto);
	Alfabeto alfabeto(abecedario);


	string textoCifrado = "";
	int posicion = 0;

	for (int i = 0; i < texto.length(); i++)
	{
		if (alfabeto.perteneceAlfabeto(texto[i]))
		{
			posicion = alfabeto.buscarPosicionLetra(texto[i]);
			posicion = posicion + desplazamiento;

			if (posicion >abecedario.length())
				posicion = posicion - abecedario.length();

			textoCifrado = textoCifrado + abecedario[posicion];
		}
		else
			textoCifrado = textoCifrado + texto[i];
	}

	return textoCifrado;
}

string Cifrador::cifradoTipoTransposicionInversa(string texto)
{
	TextoPlano textoPlano(texto);
	return textoPlano.invertirTexto();
}

string Cifrador::cifradoTipoTransposicionInversaPorGrupos(string texto, int desplazamiento)
{
	TextoPlano textoPlano(texto);
	return textoPlano.invertirTextoGrupos(desplazamiento);
}


