import React, { Component } from 'react';
import { Text, View } from 'react-native';

class Time extends Component {

  componentDidMount(){
    setInterval(() => (
      this.setState(previousState => (
        { time: this.getFormattedDate() }
      ))
    ), 1);
  }

  //state object
  state = { time: "GO!" };

  getFormattedDate() {
    var date = new Date();
    var str = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate() + " " +  date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + " " + date.getMilliseconds();

    return str;
  }

  render() {
    return (
      <Text>{this.state.time}</Text>
    );
  }
}

export default class TimeApp extends Component {
  render() {
    return (
      <View>
        <Time />
      </View>
    );
  }
}
