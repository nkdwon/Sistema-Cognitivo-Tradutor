<h1 align="center"> Sistema Cognitivo Tradutor de Texto</h1>

<h4 align="center">Desenvolvido durante as aulas de Trabalho Interdisciplinar 2: BackEnd na faculdade PUC Minas.</h4>

<p align="center">
Um programa para traduzir textos utilizando um Sistema Cognitivo da plataforma Azure da Microsoft. O projeto foi desenvolvido em Java com integração do recuso criado na Azure.
</p>

<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;
</p>

---

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- **Java**
- **Maven**
- **Azure - Sistemas Cognitivos (Tradução de Texto)**
- **Eclipse**
- **Git e Github**

## 📁 Projeto

Para o funcionamento completo do projeto, siga os passos abaixo

### Instalação
1. **Clonar o repositório**:
   
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
  

1. Rodar o projeto:

- Abra o projeto no Eclipse e execute a classe principal.
- **Observação**: Pode ser que o projeto não se conecte com o sistema por não estar mais online no servidor da Azure. Se este for o caso e você tiver interesse em criar o seu sistema, siga as instruções abaixo.

### Instruções para Criação do seu Sistema
- Acesse o [site da Azure](https://azure.microsoft.com/pt-br/free/ai/search/?ef_id=_k_EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE_k_&OCID=AIDcmmzmnb0182_SEM__k_EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE_k_&gad_source=1&gclid=EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE).
- Crie sua conta (a Azure possui diversos planos com preços ótimos). Se for estudante, use o e-mail de sua instituição.
- Após criar a conta, você será redirecionado para o Portal da Azure, onde pode criar diversos recursos. Clique em "Criar um recurso".
- Na aba "Categorias", procure por "Tradução de Texto" e clique em "Criar".
- Copie o "Sample Code" em Java e cole no seu projeto Maven no Eclipse.
- No seu código, substitua a chave e a localização do seu sistema cognitivo (informações disponíveis na aba "Chaves e Ponto de extremidade" em Gerenciamento de Recursos):

```java
private static String key = "<your-translator-key>"; 

// local, também conhecido como região.
// necessário se você estiver usando um recurso regional (não global).
// Pode ser encontrado no portal da Azure na página de Chaves e Ponto de extremidade.
private static String location = "<YOUR-RESOURCE-LOCATION>";
```

- Agora, ajuste o código e a frase que deseja traduzir, além dos idiomas para os quais deseja ver a tradução.

- **Observação**: Não se esqueça de colocar as dependências dos imports no seu arquivo pom.xml.
  
### Instruções adicionais
- **Instalação da JDK**: Se você não possui o JDK (Java Development Kit) instalado, consulte este [vídeo](https://www.youtube.com/watch?v=sNFii-cvNz0) e visite o [site oficial](https://www.oracle.com/br/java/technologies/downloads/) para obter mais informações sobre a instalação.
- **Instalação do Eclipse**: Caso ainda não tenha o Eclipse instalado, siga as instruções deste [vídeo](https://www.youtube.com/watch?v=1-TXv0D5bcg). Para mais informações sobre a IDE, acesse o [site oficial](https://www.eclipse.org/).

### Material de apoio
- Caso tenha mais interesse sobre Inteligência artificial, você pode acessar o [site](https://azure.microsoft.com/pt-br/free/ai/search/?ef_id=_k_EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE_k_&OCID=AIDcmmzmnb0182_SEM__k_EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE_k_&gad_source=1&gclid=EAIaIQobChMIrY39koGWiQMVeRCtBh08HACDEAAYASAAEgJ1oPD_BwE) da Azure e explorar como quiser.

## 📝 Licença

Esse projeto está sob a licença MIT.

---
