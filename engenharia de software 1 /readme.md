# Exercício 1

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

## Comentário
Há diferenças entre programar e a engenharia de software, sendo elas baseadas principalmente no tempo, na escala e nos trade-offs, que se relacionam com necessidade de mudança
e decisões complexas, eficiência, estimativas e crescimento do projeto.

# Exercício 2

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

## Comentário 

O texto diferencia programação de engenharia de software, explicando que a programação cria software, enquanto a engenharia de software abrange o desenvolvimento, modificação e manutenção ao longo do tempo. Em resumo, engenharia de software integra a programação com uma visão de longo prazo.

# Exercício 3

# Exemplos de trade-offs com requisitos não funcionais

**Java vs. Python**

    Java
Vantagem: Desempenho. Java tem um desempenho geralmente superior devido à sua compilação para bytecode e execução otimizada na JVM. Isso pode ser crucial para aplicações que exigem alta performance, como sistemas grandes e aplicativos de servidores.
<br>
<br>
Desvantagem: Dificuldade de desenvolvimento. Verbosidade: O código Java é muitas vezes mais verboso, o que pode resultar em um aumento no tempo de desenvolvimento e manutenção do código. A necessidade de escrever mais código pode tornar o processo mais complexo e menos ágil.

    Python
Vantagem: Facilidade de Desenvolvimento. A sintaxe concisa e legível de Python permite uma rápida prototipagem e desenvolvimento. Isso contrasta com a verbosidade de Java, facilitando o desenvolvimento e a manutenção de código. A simplicidade de Python pode acelerar o desenvolvimento e reduzir o tempo de trabalho.
<br>
<br>
Desvantagem: Desempenho. Python pode ter um desempenho inferior em comparação com Java devido à sua natureza interpretada e ao uso de tipos dinâmicos. Isso pode ser uma limitação para aplicações que precisam de alta performance, onde a verbosidade e o desempenho superior de Java podem ser mais vantajosos.

------------------------------------------------------------------------------------------

**Android vs. IOS**

    Android

Vantagem: Flexibilidade e Personalização. Android oferece uma grande flexibilidade em termos de personalização e configuração. Os desenvolvedores podem modificar a interface do usuário, utilizar uma ampla gama de APIs e ter acesso mais profundo ao sistema operacional. Além disso, o Android permite que os usuários personalizem seus dispositivos com diferentes lançadores (launchers), widgets e configurações avançadas.
<br>
<br>
Desvantagem: Fragmentação. A grande variedade de dispositivos e versões do Android pode levar a problemas de fragmentação. Aplicações podem precisar ser testadas em diferentes dispositivos e versões do sistema operacional para garantir compatibilidade e desempenho consistente. Isso pode aumentar o custo e o tempo de desenvolvimento e testes.

    IOS

Vantagem: Consistência e Qualidade. iOS oferece um ambiente mais controlado e uniforme, com uma experiência de usuário consistente em todos os dispositivos Apple. A Apple controla rigorosamente o hardware e o software, o que pode resultar em uma maior estabilidade e qualidade das aplicações. Isso também pode reduzir problemas de compatibilidade e facilitar o desenvolvimento e testes.
<br>
<br>
Desvantagem: Menos Flexibilidade. iOS é menos flexível em termos de personalização e configuração comparado ao Android. Os desenvolvedores têm menos liberdade para modificar a interface do usuário e acessar certas funcionalidades do sistema. Os usuários também têm opções limitadas para personalizar seus dispositivos, o que pode ser uma desvantagem para aqueles que preferem maior controle sobre suas experiências.

------------------------------------------------------------------------------------------

**Windows vs. Linux**

    Windows
    
Vantagem: Suporte e Compatibilidade. Windows tem ampla compatibilidade com uma vasta gama de hardware e software. A maioria dos aplicativos comerciais, jogos e drivers são desenvolvidos principalmente para Windows, o que pode facilitar a integração e o uso de diversos produtos e serviços. Além disso, a Microsoft oferece suporte técnico e atualizações regulares, o que pode ser vantajoso para usuários e empresas.
<br>
<br>
Desvantagem: Custo.  O Windows frequentemente requer licenças pagas, tanto para o sistema operacional em si quanto para muitas de suas atualizações e ferramentas associadas. Esse custo pode ser uma desvantagem significativa, especialmente para usuários ou organizações que buscam opções mais econômicas.

    Linux

Vantagem: Custo e Flexibilidade. Linux é um sistema operacional de código aberto e geralmente gratuito. Isso o torna uma opção atraente para muitos usuários e organizações que buscam minimizar custos. Além disso, Linux oferece uma grande flexibilidade e personalização, permitindo que os usuários e desenvolvedores modifiquem e adaptem o sistema operacional às suas necessidades específicas.
<br>
<br>
Desvantagem: Compatibilidade e Suporte. Embora o Linux esteja ganhando cada vez mais compatibilidade com hardware e software, ainda pode haver limitações em termos de suporte para alguns aplicativos e drivers, especialmente em comparação com o Windows. A falta de suporte oficial para alguns aplicativos e a necessidade de configurações adicionais para compatibilidade podem ser desafios para alguns usuários e empresas.

# Exercício 4

## Analisar o perfil @alexxubyte, escolher 1 aplicação real analisada por ele e comentar sobre os trade-offs

**Netflix**

![WhatsApp Image 2024-08-15 at 11 56 36](https://github.com/user-attachments/assets/4574b7cb-b9f6-4a47-b571-5cfe33ecb863)

    Escalabilidade

Vantagem: A Netflix é projetada para lidar com uma enorme quantidade de usuários e dados. Ela usa uma arquitetura distribuída e microserviços para escalar facilmente à medida que a demanda aumenta, garantindo um bom desempenho e disponibilidade global.
<br>
<br>
Desvantagem: Para atingir essa escalabilidade, a Netflix precisa investir em infraestrutura avançada e tecnologias de ponta, o que pode aumentar os custos e a complexidade da manutenção.

    Complexidade
    
Vantagem: A arquitetura complexa permite à Netflix oferecer uma experiência de usuário personalizada e rica, como recomendações precisas e streaming de alta qualidade. Microserviços também permitem desenvolvimento e implantação mais ágeis.
<br>
<br>
Desvantagem: A complexidade adicionada pode levar a desafios na coordenação e integração dos serviços, problemas de gerenciamento e maior dificuldade para resolver bugs e falhas.
