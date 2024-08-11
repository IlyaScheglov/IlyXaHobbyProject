var app = angular.module("HOBBY_WEB", []);
app.controller("HOBBY_WEB_HELLO_WORLD", function($scope, $http){

    $scope.helloWorld = "gnngn";

    $scope.GetHelloWorldMessage = function() {
        $http({
            url: 'http://localhost:8081/web-bff/api/v1/get-hello-message',
            method: 'GET'
        }).then(function (response) {
            $scope.helloWorld = response.data.message;
        });
    }

    $scope.GetHelloWorldMessage();

});