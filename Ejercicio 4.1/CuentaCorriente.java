    public class CuentaCorriente extends Cuenta {
        private float sobregiro;

        public CuentaCorriente(float saldo, float tasa) {
            super(saldo, tasa);
            sobregiro = 0;
        }

        @Override
        public void retirar(float cantidad) {
            if (cantidad <= saldo) {
                super.retirar(cantidad);
            } else {
                float diferencia = cantidad - saldo;
                saldo = 0;
                sobregiro += diferencia;
                numeroRetiros++;
            }
        }

        @Override
        public void consignar(float cantidad) {
            if (sobregiro > 0) {
                if (cantidad >= sobregiro) {
                    cantidad -= sobregiro;
                    sobregiro = 0;
                    saldo += cantidad;
                } else {
                    sobregiro -= cantidad;
                }
                numeroConsignaciones++;
            } else {
                super.consignar(cantidad);
            }
        }

        @Override
        public void extractoMensual() {
            super.extractoMensual();
        }

        @Override
        public void imprimir() {
            System.out.println("Saldo = $" + saldo);
            System.out.println("Comision mensual = $" + comisionMensual);
            System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
            System.out.println("Valor de sobregiro = $" + sobregiro);
            System.out.println();
        }
    }
