#pragma once
#include <string>
#include <string.h>
#include "Alfabeto.h"
#include "TextoPlano.h"
using namespace std;
ref class Cifrador
{
public:
	Cifrador();
	string CifradoTipoCesar(string texto, int desplazamiento, string alfabeto);
	string cifradoTipoTransposicionInversa(string texto);
	string cifradoTipoTransposicionInversaPorGrupos(string texto, int desplazamiento);

};

