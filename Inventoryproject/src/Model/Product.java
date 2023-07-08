package Model;

public class Product {
		private int productId;
		private String productName;
		private int minimumSellQuantity;
		private int prize;
		private int quantity;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getMinimumSellQuantity() {
			return minimumSellQuantity;
		}
		public void setMinimumSellQuantity(int minimumSellQuantity) {
			this.minimumSellQuantity = minimumSellQuantity;
		}
		public int getPrize() {
			return prize;
		}
		public void setPrize(int prize) {
			this.prize = prize;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
