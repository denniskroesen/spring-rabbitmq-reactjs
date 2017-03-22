var React = require('react');
var client = require('./client');

var App = React.createClass({
    getInitialState: function () {
        return ({employees: []});
    },
    componentDidMount: function () {
        client({method: 'GET', path: '/api/work'}).done(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    },
    render: function () {
        return (
            <EmployeeList employees={this.state.employees}/>
        )
    }
})
