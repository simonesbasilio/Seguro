# language: pt
Funcionalidade: Informar dados para cotar Seguro
  Como um usuario
  Eu quero informar dados meu e do meu veiculo
  Para poder receber valor de cotacao do seguro

  Cenario: Preencher os campos de todas as telas com todas as informacoes necessarias para enviar uma cotacao de seguro
    Dado Que estou na tela inicial Vehice Data
    Quando Seleciono a marca do veiculo no campo Make
    E Seleciono o campo Model
    E Preencho o campo Cylinder Capacity
    E Preencho o campo opcaoEnginePerformance
    E Preencho o campo Date of Manufacture
    E Seleciono o campo Number of Seats
    E Informo qual opcao no campo Right Hand Drive
    E Seleciono novamente o campo Number of Seats
    E Seleciono o campo Fuel Type
    E Preencho o campo Payload
    E Preencho o campo Total Weight
    E Preencho o campo List Price
    E Preencho o campo License Plate Number
    E Preencho o campo Annual Mileage
    E Clico no botao Next para ir para a tela Insurant Data
    E Preencho o primeiro nome do segurado  
    E Preencho o sobrenome do segurado
    E Preencho o Date of Birth  
    E Clico na opcao Gender Female
    E Preencho o campo Street Address
    E Seleciono o campo Country
    E Preencho o campo Zip Code
    E Preencho o campo City
    E Seleciono o campo Occupation
    E Clico na opcao Sky diving no Hobbies
    E Preencho o campo Website    
    E Clico no botao Next para ir para a tela Product Data   
    E Preencho o campo Start Date
    E Seleciono o campo Insurance Sum
    E Seleciono o campo Merit Rating
    E Seleciono o campo Damage Insurance
    E Clico na opcao euro Protection no Optional
    E Seleciono o campo Courtesy Car    
    E Clico no botao Next para ir para a tela Price Option
    E Clico para escolher uma opcao
    E Clico no botao Next para ir para a tela Send Qhote
    E Preencho o campo email
    E Preencho o campo Phone
    E Preencho o campo Username
    E Preencho o campo Password
    E Preencho o campo ConfirmPassword
    E Preencho o campo Comments        
    E Clico no botao Send para enviar a cotacao
    Entao Clico no botao Ok na tela de confirmacao de envio de email
    
    
