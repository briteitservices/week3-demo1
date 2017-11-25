angular.module('myApp', [])
    .controller('myController', ['$scope', function ($scope) {
        var ret = {};
        $scope.users = [
            {
                id: 1,
                name: "User1"
            },
            {
                id: 2,
                name: "User2"
            }];

        $scope.update = function () {
            $scope.users.push({
                id:3,
                name:"User3"
            });
        };
    }]);