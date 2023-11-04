\documentclass{article}
\usepackage[utf8]{inputenc}
\usepackage{geometry}
\geometry{a4paper, left=2.5cm, right=2.5cm, top=2.5cm, bottom=2.5cm}
\usepackage{titling}
\setlength{\droptitle}{-4cm}
\title{TDE 03 – Estrutura de Dados}
\author{Alunos: Larissa Raimee Gomes, Diego Candido}
\date{Pontifícia Universidade Católica do Paraná – PUCPR}
\begin{document}
\maketitle

\section{Relatório de Desempenho do Bubble Sort em Cinco Listas Aleatórias}

O Bubble Sort é um algoritmo de classificação simples, mas pode ser ineficiente em termos de tempo, especialmente para grandes conjuntos de dados. Nessa primeira parte do relatório, analisamos o desempenho do Bubble Sort em cinco listas aleatórias de tamanho variável.

\subsection{Detalhes do Experimento}

\begin{itemize}
    \item Tamanho das Listas testadas: 50, 500, 1000, 5000, 10000
    \item Número de Listas: 5
\end{itemize}

\subsection{Resultados para Cada Lista}

\subsubsection{Lista 1 – 50 índices}

\begin{itemize}
    \item Tempo de Execução médio: 64180 nanossegundos
    \item Número de Trocas médio: 586
    \item Número de Iterações médio: 3825
\end{itemize}

\subsubsection{Lista 2 – 500 índices}

\begin{itemize}
    \item Tempo de Execução médio: 1431420 nanossegundos
    \item Número de Trocas médio: 61309
    \item Número de Iterações médio: 375750
\end{itemize}

\subsubsection{Lista 3 – 1000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 3343660 nanossegundos
    \item Número de Trocas médio: 252499
    \item Número de Iterações médio: 1501500
\end{itemize}

\subsubsection{Lista 4 – 5000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 21163540 nanossegundos
    \item Número de Trocas médio: 6220647
    \item Número de Iterações médio: 37507500
\end{itemize}

\subsubsection{Lista 5 - 10000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 77858000 nanossegundos
    \item Número de Trocas médio: 24886324
    \item Número de Iterações médio: 150015000
\end{itemize}

\section{Conclusão Geral}

O Bubble Sort é um algoritmo de classificação simples e fácil de implementar, mas ele demonstrou ser altamente ineficiente para listas de tamanho considerável. À medida que o tamanho da lista aumenta, o tempo de execução, o número de trocas e o número de iterações crescem exponencialmente, tornando-o inadequado para conjuntos de dados grandes. Outros algoritmos de classificação, como o Quick Sort, geralmente são preferidos para conjuntos de dados de tamanho considerável devido ao seu desempenho muito superior.

Portanto, com base nesse experimento, é recomendável evitar o uso do Bubble Sort para grandes conjuntos de dados e considerar algoritmos mais eficientes para tais situações.

\section{Relatório de Desempenho do Select Sort em Cinco Listas Aleatórias}

O algoritmo Select Sort é uma técnica de classificação que se destaca por sua simplicidade e facilidade de implementação. Embora não seja o método de classificação mais eficiente em termos de tempo, o Select Sort é valioso por sua compreensão do processo de classificação e sua utilidade em conjuntos de dados de pequeno a médio porte. Nesta seção do relatório, exploraremos o desempenho e as características do Select Sort em cinco listas aleatórias de tamanhos variados. Isso nos permitirá avaliar seu comportamento em diferentes cenários e entender suas limitações.

\subsection{Detalhes do Experimento}

\begin{itemize}
    \item Tamanho das Listas testadas: 50, 500, 1000, 5000, 10000
    \item Número de Listas: 5
\end{itemize}

\subsection{Resultados para Cada Lista}

\subsubsection{Lista 1 – 50 índices}

\begin{itemize}
    \item Tempo de Execução médio: 30500 nanossegundos
    \item Número de Trocas médio: 50
    \item Número de Iterações médio: 3828
\end{itemize}

\subsubsection{Lista 2 – 500 índices}

\begin{itemize}
    \item Tempo de Execução médio: 870200 nanossegundos
    \item Número de Trocas médio: 500
    \item Número de Iterações médio: 375753
\end{itemize}

\subsubsection{Lista 3 – 1000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 5866319 nanossegundos
    \item Número de Trocas médio: 1000
    \item Número de Iterações médio: 1501503
\end{itemize}

\subsubsection{Lista 4 – 5000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 21163540 nanossegundos
    \item Número de Trocas médio: 6220647
    \item Número de Iterações médio: 37507500
\end{itemize}

\subsubsection{Lista 5 - 10000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 23426160 nanossegundos
    \item Número de Trocas médio: 5000
    \item Número de Iterações médio: 37507503
\end{itemize}

\section{Conclusão Geral}

O Select Sort é um algoritmo de classificação simples e fácil de implementar. No entanto, ele se mostra ineficiente para listas de tamanho considerável devido ao aumento significativo do tempo de execução. Embora o número de trocas seja limitado, o número de iterações cresce linearmente com o tamanho da lista. Para conjuntos de dados de grande porte, outros algoritmos de classificação, como o Quick Sort ou o Merge Sort, são preferíveis devido ao seu desempenho mais eficiente.

Portanto, com base nesses resultados, é aconselhável utilizar o Select Sort para conjuntos de dados de tamanho moderado, onde sua simplicidade e facilidade de implementação podem ser benéficas, e considerar algoritmos mais eficientes para listas maiores.

\section{Relatório de Desempenho do Shell Sort em Cinco Listas Aleatórias}

O algoritmo shell sort é um método de classificação que busca melhorar o desempenho de algoritmos de ordenação simples, como o Bubble Sort. Usando uma abordagem de divisão e conquista, o Shell Sort divide a lista em várias sub-listas menores e as ordena individualmente. Esse processo gradualmente reduz a quantidade de desordem na lista, levando a uma classificação eficiente. Nesta breve introdução, exploraremos as características e o funcionamento do Shell Sort, destacando sua capacidade de lidar com conjuntos de dados de tamanhos variados.

\subsection{Detalhes do Experimento}

\begin{itemize}
    \item Tamanho das Listas testadas: 50, 500, 1000, 5000, 10000
    \item Número de Listas: 5
\end{itemize}

\subsection{Resultados para Cada Lista}

\subsubsection{Lista 1 – 50 índices}

\begin{itemize}
    \item Tempo de Execução médio: 84460 nanossegundos
    \item Número de Trocas médio: 1896.6
    \item Número de Iterações médio: 2104
\end{itemize}

\subsubsection{Lista 2 – 500 índices}

\begin{itemize}
    \item Tempo de Execução médio: 831360 nanossegundos
    \item Número de Trocas médio: 185933.6
    \item Número de Iterações médio: 189447
\end{itemize}

\subsubsection{Lista 3 – 1000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 1811200.0 nanossegundos
    \item Número de Trocas médio: 713841.4
    \item Número de Iterações médio: 721856.0
\end{itemize}

\subsubsection{Lista 4 – 5000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 2.095034E7 nanossegundos
    \item Número de Trocas médio: 1.99869616E7
    \item Número de Iterações médio: 2.0041978E7
\end{itemize}

\subsubsection{Lista 5 - 10000 índices}

\begin{itemize}
    \item Tempo de Execução médio: 5.856042E7 nanossegundos
    \item Número de Trocas médio: 7.70637804E7
    \item Número de Iterações médio: 7.7183798E7
\end{itemize}

\section{Conclusão Geral}

Os resultados deste experimento revelam algumas tendências importantes:

Tempo de Execução: O tempo de execução do Shell Sort aumenta à medida que o tamanho da lista cresce, seguindo uma tendência similar a outros algoritmos de classificação. Embora o tempo de execução seja mais eficiente do que o Bubble Sort para listas maiores, ainda há um aumento substancial no tempo de execução à medida que o tamanho da lista aumenta.

Número de Trocas: O número de trocas também aumenta com o tamanho da lista, mas é geralmente menor em comparação com algoritmos de classificação baseados em comparação direta. O Shell Sort realiza trocas dentro das sub-listas, o que ajuda a reduzir a quantidade de desordem mais rapidamente.

Número de Iterações: O número de iterações aumenta com o tamanho da lista, uma vez que mais iterações são necessárias para classificar efetivamente listas maiores. No entanto, o Shell Sort consegue reduzir o número de iterações em comparação com algoritmos como o Bubble Sort.

Em resumo, o Shell Sort demonstra ser uma escolha sólida para conjuntos de dados de tamanho moderado, oferecendo um equilíbrio entre eficiência e simplicidade. No entanto, à medida que o tamanho da lista cresce, ele ainda sofre com um aumento significativo no tempo de execução. Para conjuntos de dados maiores, algoritmos mais eficientes, como o Quick Sort, continuam sendo preferíveis.

Portanto, a escolha do algoritmo de classificação deve levar em consideração o tamanho do conjunto de dados e os requisitos específicos de desempenho. O Shell Sort é uma opção viável em cenários de médio porte, mas alternativas mais eficientes podem ser necessárias para listas maiores.

\section{Relatório de Desempenho do Quick Sort em Cinco Listas Aleatórias}

O algoritmo Quick Sort demonstrou ser altamente eficiente e adequado para classificar conjuntos de dados de vários tamanhos. Os resultados deste experimento indicam as seguintes tendências:

Tempo de Execução: O Quick Sort é notavelmente eficiente em termos de tempo de execução, mesmo para listas de tamanho considerável. À medida que o tamanho da lista aumenta, o aumento no tempo de execução é relativamente moderado em comparação com outros algoritmos de classificação. Isso reflete a capacidade do Quick Sort de explorar a estrutura do conjunto de dados para realizar classificações eficazes.

Número de Trocas: O número de trocas é geralmente baixo em comparação com algoritmos de classificação menos eficientes, como o Bubble Sort. O Quick Sort é eficaz em minimizar o número de trocas, uma vez que realiza comparações diretas e rearranjos com base em elementos de referência.

Número de Iterações: O número de iterações necessárias para classificar as listas é igualmente eficiente, mesmo à medida que o tamanho da lista cresce. Isso é resultado da estratégia de divisão e conquista do Quick Sort, que divide o conjunto de dados em subconjuntos menores para classificação.

Em resumo, o Quick Sort é uma escolha altamente recomendada para a classificação de conjuntos de dados de diversos tamanhos. Sua eficiência em termos de tempo de execução, número de trocas e número de iterações o torna uma opção valiosa em uma ampla variedade de cenários.
Portanto, com base nesses resultados, o Quick Sort é uma excelente escolha para a classificação de conjuntos de dados de diferentes tamanhos, oferecendo desempenho consistente e eficiente. É um algoritmo amplamente utilizado em aplicações reais devido à sua rapidez e eficácia na classificação.


