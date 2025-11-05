import {EventEmitter} from 'events';

class TemperatureSensor extends EventEmitter {

    constructor() {
        super();
        this.temperature = 25; // temperatura inicial
    }

    setTemperature(newTemperature) {
        this.temperature = newTemperature;
        this.emit('temperatureChange', this.temperature);
    }
    getTemperature() {
        return this.temperature;
    }

}

console.log('--- Exemplo de Observer com EventEmitter ---');

const sensor = new TemperatureSensor();

console.log('Registrando observers...');

sensor.on('temperatureChange', (temp) => {
    console.log(`[Display 1] Temperatura atualizada: ${temp}°C`);
});

sensor.on('temperatureChange', (temp) => {
    console.log(`[Display 2] Temperatura atualizada: ${temp}°C`);
});

//Simular mudanças (equivalente a subject.setState())
setTimeout(() => {
    console.log("Mudando temperatura para 27°C...");
    sensor.setTemperature(27); 
}, 1000)

setTimeout(() => {
    console.log("\nMudando temperatura para 32°C...");
    sensor.setTemperature(32);
}, 2000); 