class Controller {
  constructor() {
    console.log('New Custom Class created');
    this._name = '';
  }

  display() {
    /**
     * Here if we just write this.name, then it can be said that
     * property name does not exits in type controller.
     *
     * This can be fixed by adding name in constructor initialization
     */
    console.log('Displaying Name :', this._name);
  }

  set name(newName) {
    this._name = newName;
  }
}
module.exports = Controller;
