
package com.mycompany.balonornegii;

//Node sınıfını dairesel bağlı liste yapmak için kullanacağız
public class NodeClass {
    int data;
    NodeClass sonrakiDügüm;

//int tipinde data ile balonların pozisyonunu tutacağız
/*
Problemi dairesel bağlı liste veri yapısı ile çözeceğimiz için her bir düğümün 
kendisinden sonraki düğümü işaretlemesi gerekiyor. Bu sebeple de sonrakiDügüm 
değişkeni ile de bir sonraki düğümü gösterecek bağ sahasını oluşturmuş olacağız
*/

//Node sınıfı için gerekli constructor metodu
public NodeClass(int data){

this.data= data;
this.sonrakiDügüm= null;
}}