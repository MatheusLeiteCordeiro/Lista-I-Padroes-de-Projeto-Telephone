# Registro de uso de IA — Questão 2


## Prompt inicial
"Apenas mandei o enunciado da questão, visto que as orientações já foram dadas no primeiro prompt da primeira questão"

## Plano recebido
1. Criar interface de observador.
2. Alterar o PhoneModel para notificar observadores.
3. Alterar a Screen para criar dois observadores.
4. Testar.

## Ajustes manuais previstos
- O PhoneModel não pode conhecer a Screen nem imprimir nada.
- O observador 2 só imprime quando o número está completo (12 dígitos).
- Somente a UI pode imprimir a saída do telefone.
- A saída do KeyPad deve ser "Pressionando:" (o código base tem "Pressing:").