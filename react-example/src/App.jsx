import { useState, useEffect } from 'react'
import './App.css'

function App() {

  //subject
  const [temperature, setTemperature] = useState(25)
  

  //register observer
  useEffect(() => {
    // Este código é executado sempre que 'temperature' mudar
    // É equivalente ao método update() no Observer clássico
    console.log('[Display 1] Temperatura atualizada:', temperature + '°C')
  }, [temperature])
  
 
  useEffect(() => {
  
    console.log('[Display 2] Temperatura atualizada:', temperature + '°C')
  }, [temperature]) 
  
  // FUNÇÃO PARA MUDAR O ESTADO (setState = notifyObservers())

  const handleTemperatureChange = () => {

    setTemperature(prev => prev + 5) 

  }
  
  return (
    <div className="App">
      <h1>React - Padrão Observer</h1>
      
      <div className="container">
        <div className="card">
          <h2>Subject: Temperature</h2>
          <p className="value">{temperature}°C</p>
          <button onClick={handleTemperatureChange}>
            Aumentar Temperatura (+5°C)
          </button>
        </div>
      </div>

      <div className="comparison">
        <h3>Comparação com Observer Clássico:</h3>
        <table>
          <thead>
            <tr>
              <th>Observer Clássico</th>
              <th>React</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td><code>Subject</code></td>
              <td><code>useState</code></td>
            </tr>
            <tr>
              <td><code>Observer.attach()</code></td>
              <td><code>useEffect([dep])</code> (array de dependências)</td>
            </tr>
            <tr>
              <td><code>Observer.update()</code></td>
              <td>Corpo do <code>useEffect</code></td>
            </tr>
            <tr>
              <td><code>subject.setState()</code></td>
              <td><code>setState()</code> do hook</td>
            </tr>
            <tr>
              <td><code>subject.notifyObservers()</code></td>
              <td>Re-render automático quando estado muda</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default App

