class TV{
  int volume;
  int voltagem;
  int polegadas;
  int aumentarVolume(){
    volume++;
  }
  //ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas
  int ligar(){
    return voltagem*polegadas;
  }
  
}
