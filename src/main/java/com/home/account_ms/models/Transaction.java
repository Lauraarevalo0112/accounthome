package com.home.account_ms.models;
import org.springframework.data.annotation.Id;
import java.util.Date;
    public class Transaction {
        @Id
        private String id;
        private String usernameOrigin;
        private String producto;
        private Integer cantidad;
        private Date date;
        private Double valor;

        public Transaction(String id, String usernameOrigin, String producto, Integer cantidad, Date date, Double valor) {
            this.id = id;
            this.usernameOrigin = usernameOrigin;
            this.producto = producto;
            this.cantidad = cantidad;
            this.date = date;
            this.valor = valor;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsernameOrigin() {
            return usernameOrigin;
        }

        public void setUsernameOrigin(String usernameOrigin) {
            this.usernameOrigin = usernameOrigin;
        }

        public String getProducto() {
            return producto;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }
    }
