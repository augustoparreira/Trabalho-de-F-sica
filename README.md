# Trabalho-de-Fisica

# 🧮 Calculadora Java para sistema de blocos com cordas

Uma calculadora simples desenvolvida em **Java** com interface gráfica (**Swing - JFrame**) para resolver um exercício clássico de **dinâmica**.

Foi projetada para calcular a **aceleração de um sistema com três blocos** conectados por cordas e puxados por uma força horizontal. O programa também determina as **tensões em cada corda** e **verifica se a corda se rompe**, com base em um limite de tensão informado.

![image](https://github.com/user-attachments/assets/50c905a3-be1c-4f9f-88dc-e682a13b0db8)


---

## 🖼️ Preview da Interface

  <strong>Exemplo quando a corda que está entre o bloco 1 e o bloco 2 se rompe:</strong>
  
![image](https://github.com/user-attachments/assets/83ae5341-a482-4650-b8fa-f8ed7f114087)


  <strong>Exemplo quando a corda que está entre o bloco 2 e o bloco 3 se rompe:</strong>

![image](https://github.com/user-attachments/assets/df033225-cf59-4e92-8de8-72635d1ee225)

  <strong>Exemplo quando a corda não se rompe:</strong>
  
![image](https://github.com/user-attachments/assets/619e8ca9-a89e-4a5a-b72e-aee4d188aa98)


---

## 🚀 Funcionalidades

✅ Interface gráfica (Swing)  
✅ Validação dos dados inseridos  
✅ Cálculo da aceleração do sistema  
✅ Cálculo das tensões nas cordas  
✅ Verificação da tensão máxima da corda  
✅ Exibição clara dos resultados  
✅ Mensagens de erro amigáveis

---

## 📐 Fórmulas Aplicadas

- **Aceleração do sistema**:  
  \[
  a = forcaTotal / massa1 + massa2 + massa3
  \]

- **Tensão no bloco 1**:  
  \[
  T₁ = massa₁ * a
  \]

- **Tensão no bloco 2**:  
  \[
  T₂ = massa₂ * a + T₁
  \]

---

