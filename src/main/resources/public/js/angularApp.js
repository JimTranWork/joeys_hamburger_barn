var angularApp = angular.module('angularApp', []);

angularApp
.controller(
		'mainController',
		[
		 '$scope',
		 '$http',
		 '$window',
		 function($scope, $http, $window) {

			 $scope.itemList = [];
			 $scope.itemOrderList = [];
			 $scope.orderTotal = 0;

			 /* download item list from server */
			 $scope.init = function() {
				 $http({
					 method : 'GET',
					 url : '/item/all'
				 }).then(function successCallback(response) {
					 $scope.itemList = response.data;
				 }, function errorCallback(response) {
					 console.log(response);
				 });
			 }

			 $scope.init();
			 /* download item list from server */

			 $scope.selectedItemUpdated = function() {
				 $scope.currentlySelectedItem = JSON
				 .parse($scope.selectedItem);
			 }

			 $scope.addItemToItemOrderList = function() {

				 if ($scope.quantity < 0) {
					 alert('Please input an amount larger than 0');
					 $scope.quantity = 1;
				 } else {
					 var totalCost = $scope.currentlySelectedItem.price
					 * $scope.quantity;
					 var item = {
							 id : $scope.currentlySelectedItem.id,
							 name : $scope.currentlySelectedItem.name,
							 price : $scope.currentlySelectedItem.price,
							 quantity : $scope.quantity,
							 total : totalCost
					 };

					 $scope.itemOrderList = $scope.itemOrderList
					 .concat(item);
					 $scope.orderTotal = $scope.orderTotal
					 + totalCost;
				 }
			 };

			 $scope.removeItemFromItemOrderList = function(item) {
				 var index = $scope.itemOrderList.indexOf(item);
				 $scope.itemOrderList.splice(index, 1);

				 if ($scope.itemOrderList.length == 0) {
					 $scope.orderTotal = 0;
				 } else {
					 $scope.orderTotal = $scope.orderTotal
					 - $scope.itemOrderList[index].total;
				 }
			 }

			 var addOrderDetails = function(order, item) {
				 $http(
						 {
							 method : 'GET',
							 url : '/order/details/add'
								 + '?order_id=' + order.id
								 + '&order_made_by='
								 + order.made_by
								 + '&item_id=' + item.id
								 + '&item_name=' + item.name
								 + '&item_price='
								 + item.price
								 + '&total_quantity='
								 + item.quantity
								 + '&total_amount='
								 + item.total
						 }).then(
								 function successCallback(response) {
									 $scope.getOrderDetailsList();
								 }, function errorCallback(response) {
									 console.log(response);
								 });
			 }

			 $scope.confirmOrder = function() {

				 if ($scope.itemOrderList.length > 0) {
					 $http({
						 method : 'GET',
						 url : '/order/create'
					 })
					 .then(
							 function successCallback(
									 response) {
								 $scope.order = response.data;
								 for (i = 0; i < $scope.itemOrderList.length; i++) {
									 addOrderDetails(
											 $scope.order,
											 $scope.itemOrderList[i]);
								 }

								 $scope.clearOrder();
								 $scope.status = 'Purchase has been made!';

							 },
							 function errorCallback(
									 response) {
								 $scope.status = 'Unable to confirm purchase!';
							 });
				 } else {
					 $scope.status = 'Please add an item to the order first!';
				 }
			 }

			 $scope.clearOrder = function() {
				 $scope.itemOrderList = [];
				 $scope.orderTotal = 0;
			 }

			 $scope.getOrderDetailsList = function() {
				 $scope.allOrdersTotal = 0;

				 $http({
					 method : 'GET',
					 url : '/order/all'
				 })
				 .then(
						 function successCallback(
								 response) {
							 $scope.orderDetailsList = response.data;

							 for (i = 0; i < $scope.orderDetailsList.length; i++) {
								 $scope.allOrdersTotal += $scope.orderDetailsList[i].total_amount;
							 }
						 },
						 function errorCallback(response) {
							 console.log(response);
						 });
			 }

		 } ]);